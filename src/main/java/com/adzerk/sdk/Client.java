package com.adzerk.sdk;

import java.io.IOException;
import java.lang.reflect.Type;

import com.adzerk.sdk.generated.ApiClient;
import com.adzerk.sdk.generated.ApiException;
import com.adzerk.sdk.generated.api.DecisionApi;
import com.adzerk.sdk.generated.api.UserdbApi;
import com.adzerk.sdk.generated.model.GdprConsent;
import com.adzerk.sdk.generated.model.Request;
import com.adzerk.sdk.model.UserRecord;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okio.Buffer;

public class Client {
  public class DecisionClient {
    private String path;
    private OkHttpClient httpClient;
    private Logger logger;
    private ApiClient apiClient;
    private DecisionApi decisionApi;

    private DecisionClient(String path, OkHttpClient httpClient, Logger logger) {
      this.path = path;
      this.httpClient = httpClient;
      this.logger = logger;
      this.apiClient = new ApiClient().setBasePath(path).setHttpClient(httpClient);
      this.decisionApi = new DecisionApi(this.apiClient);
    }

    public com.adzerk.sdk.model.Response get(Request request) throws ApiException {
      Gson gson = new Gson();
      Type t = new TypeToken<com.adzerk.sdk.model.Response>(){}.getType();

      this.logger.info("Fetching decisions from Adzerk API");
      this.logger.info("Processing request: {}", gson.toJson(request));

      Object response = this.decisionApi.getDecisions(request);

      this.logger.info("Received response: {}", gson.toJson(response));

      return gson.fromJson(gson.toJson(response), t);
    }

    public com.adzerk.sdk.model.Response getWithExplanation(Request request, String apiKey) throws ApiException {
      Gson gson = new Gson();
      Type t = new TypeToken<com.adzerk.sdk.model.Response>(){}.getType();

      Interceptor keyInterceptor = new Interceptor() {
        public okhttp3.Response intercept(Interceptor.Chain chain) throws IOException {
          okhttp3.Request request = chain.request().newBuilder().addHeader("X-Adzerk-Explain", apiKey).build();
          return chain.proceed(request);
        }
      };

      OkHttpClient httpClient = this.httpClient.newBuilder().addInterceptor(keyInterceptor).build();
      ApiClient apiClient = new ApiClient().setBasePath(this.path).setHttpClient(httpClient);
      DecisionApi api = new DecisionApi(apiClient);

      this.logger.info("Fetching decisions from Adzerk API");
      this.logger.info("Processing request: {}", gson.toJson(request));

      Object response = api.getDecisions(request);

      this.logger.info("Received response: {}", gson.toJson(response));

      return gson.fromJson(gson.toJson(response), t);
    }
  }

  public class UserDbClient {
    private UserdbApi userDbApi;

    private UserDbClient(String path, OkHttpClient httpClient, Logger logger, String apiKey) {
      ApiClient apiClient = new ApiClient().setBasePath(path).setHttpClient(httpClient);
      apiClient.setApiKey(apiKey);
      this.userDbApi = new UserdbApi(apiClient);
    }

    public void setUserCookie(int networkId, String userKey) throws ApiException {
      this.userDbApi.setUserCookie(networkId, userKey);
    }

    public void addCustomProperties(int networkId, String userKey, Object properties) throws ApiException {
      this.userDbApi.addCustomProperties(networkId, userKey, properties);
    }

    public void addInterest(int networkId, String userKey, String interest) throws ApiException {
      this.userDbApi.addInterests(networkId, userKey, interest);
    }

    public void addRetargetingSegment(int networkId, String userKey, int advertiserId, int retargetingSegmentId) throws ApiException {
      this.userDbApi.addRetargetingSegment(networkId, advertiserId, retargetingSegmentId, userKey);
    }

    public void forget(int networkId, String userKey) throws ApiException {
      this.userDbApi.forget(networkId, userKey);
    }

    public void gdprConsent(int networkId, GdprConsent gdprConsent) throws ApiException {
      this.userDbApi.gdprConsent(networkId, gdprConsent);
    }

    public void ipOverride(int networkId, String userKey, String ip) throws ApiException {
      this.userDbApi.ipOverride(networkId, userKey, ip);
    }

    public void matchUser(int networkId, String userKey, int partnerId, int userId) throws ApiException {
      this.userDbApi.matchUser(networkId, userKey, partnerId, userId);
    }

    public void optOut(int networkId, String userKey) throws ApiException {
      this.userDbApi.optOut(networkId, userKey);
    }

    public UserRecord read(int networkId, String userKey) throws ApiException {
      Gson gson = new Gson();
      Object user = this.userDbApi.read(networkId, userKey);
      Type t = new TypeToken<UserRecord>(){}.getType();
      return gson.fromJson(gson.toJson(user), t);
    }
  }

  private Logger logger;
  private DecisionClient decisionClient;
  private UserDbClient userDbClient;

  public DecisionClient decisions() {
    return this.decisionClient;
  }

  public UserDbClient userDb() {
    return this.userDbClient;
  }

  public Client(ClientParameters params) {
    this.logger = LoggerFactory.getLogger(Client.class);

    String protocol = StringUtils.isNotBlank(params.getProtocol()) ? params.getProtocol() : "https";
    String host = StringUtils.isNotBlank(params.getHost()) ? params.getHost() : String.format("e-%s.adzerk.net", params.getNetworkId());
    String path = String.format("%s://%s", protocol, host);

    Interceptor requestInterceptor = new Interceptor() {
      public okhttp3.Response intercept(Interceptor.Chain chain) throws IOException {
        okhttp3.Request request = chain.request();
        // okhttp3.Request.Builder builder = request.newBuilder().addHeader("X-Adzerk-Sdk-Version", "adzerk-decision-sdk-java:v1");

        System.out.println("Getting ready to check content type");
        System.out.println(request.header("content-type"));
        System.out.println(request.header("content-encoding"));

        if (request.header("content-type").equals("application/json; charset=utf-8")) {
          System.out.println("Replacing content-type...");
          builder.removeHeader("content-type");
          builder.addHeader("content-type", "application/json");
        }

        okhttp3.Request newRequest = builder.build();

        long t1 = System.nanoTime();
        RequestBody body = request.body();

        logger.info("Request URL: {}", newRequest.url());
        logger.info("Request Headers: {}", newRequest.headers());

        if (body != null) {
          Buffer buffer = new Buffer();
          body.writeTo(buffer);
          logger.info("Request Body: {}", buffer.readUtf8());
        }

        okhttp3.Response response = chain.proceed(newRequest);

        long t2 = System.nanoTime();
        logger.info(String.format("Received response for %s in %.1fms%n",
            response.request().url(), (t2 - t1) / 1e6d));

        logger.info("Response Code: {}", response.code());
        logger.info("Response Status Text: {}", response.message());

        return response;
      }
    };

    OkHttpClient httpClient = new okhttp3.OkHttpClient.Builder().addInterceptor(requestInterceptor).build();
    this.decisionClient = new DecisionClient(path, httpClient, logger);
    this.userDbClient = new UserDbClient(path, httpClient, logger, params.getApiKey());
  }
}