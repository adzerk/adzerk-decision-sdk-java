package com.adzerk.sdk;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import com.adzerk.sdk.generated.ApiClient;
import com.adzerk.sdk.generated.ApiException;
import com.adzerk.sdk.generated.api.DecisionApi;
import com.adzerk.sdk.generated.api.UserdbApi;
import com.adzerk.sdk.generated.model.ConsentRequest;
import com.adzerk.sdk.generated.model.DecisionRequest;
import com.adzerk.sdk.generated.model.Placement;
import com.adzerk.sdk.model.DecisionResponse;
import com.adzerk.sdk.model.UserRecord;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Request.Builder;
import okio.Buffer;

public class Client {
  public class DecisionClient {
    private String path;
    private OkHttpClient httpClient;
    private Logger logger;
    private ApiClient apiClient;
    private DecisionApi decisionApi;
    private Integer networkId;
    private Integer siteId;

    private DecisionClient(String path, OkHttpClient httpClient, Logger logger, int networkId, Integer siteId) {
      this.path = path;
      this.httpClient = httpClient;
      this.logger = logger;
      this.apiClient = new ApiClient().setBasePath(path).setHttpClient(httpClient);
      this.decisionApi = new DecisionApi(this.apiClient);
      this.networkId = networkId;
      this.siteId = siteId;
    }

    public DecisionResponse get(DecisionRequest request) throws ApiException {
      return this.get(request, new AdditionalOptions());
    }

    public DecisionResponse get(DecisionRequest request, final AdditionalOptions opts) throws ApiException {
      Gson gson = new Gson();
      Type t = new TypeToken<DecisionResponse>(){}.getType();

      List<Placement> placements = request.getPlacements();

      if (placements.size() == 0) {
        throw new ApiException("At least one placement is required for a Decision Request");
      }

      for (int i = 0; i < placements.size(); i++) {
        Placement p = placements.get(i);
        if (p.getDivName() == null) { p.setDivName(String.format("div%s", i)); }
        if (p.getNetworkId() == null) { p.setNetworkId(this.networkId); }
        if (p.getSiteId() == null) { p.setSiteId(this.siteId); }
      }

      this.logger.info("Fetching decisions from adzerk API");
      this.logger.info("Using additional parameters: {}", gson.toJson(opts));
      this.logger.info("Processing request: {}", gson.toJson(request));

      DecisionApi api = this.decisionApi;

      if (opts != null && opts.hasValues()) {
        DecisionClient that = this;
        this.logger.info("Found additional options. Building...");
        Interceptor optsInterceptor = new Interceptor() {
          public okhttp3.Response intercept(Interceptor.Chain chain) throws IOException {
            Builder builder = chain.request().newBuilder();
            String userAgent = opts.getUserAgent();
            if (userAgent != null) {
              that.logger.info("Setting User-Agent to: {}", userAgent);
              builder.addHeader("User-Agent", userAgent);
            }
            if (opts.getIncludeExplanation()) {
              that.logger.info("Setting X-Adzerk-Explain.");
              builder.addHeader("X-Adzerk-Explain", opts.getApiKey());
            }
            Request request = builder.build();
            return chain.proceed(request);
          }
        };

        if (opts.getIncludeExplanation()) {
          this.logger.info("--------------------------------------------------------------");
          this.logger.info("              !!! WARNING - WARNING - WARNING !!!             ");
          this.logger.info("");
          this.logger.info("You have opted to include explainer details with this request!");
          this.logger.info("This will cause performance degradation and should not be done");
          this.logger.info("in production environments.");
          this.logger.info("--------------------------------------------------------------");
        }

        OkHttpClient httpClient = this.httpClient.newBuilder().addInterceptor(optsInterceptor).build();
        ApiClient apiClient = new ApiClient().setBasePath(this.path).setHttpClient(httpClient);
        api = new DecisionApi(apiClient);
      }

      this.logger.info("Fetching decisions from Adzerk API");
      this.logger.info("Processing request: {}", gson.toJson(request));

      Object response = api.getDecisions(request);
      this.logger.info("Received response: {}", gson.toJson(response));
      return gson.fromJson(gson.toJson(response), t);
    }
  }

  public class UserDbClient {
    private UserdbApi userDbApi;
    private Integer networkId;

    private UserDbClient(String path, OkHttpClient httpClient, Logger logger, String apiKey, Integer networkId) {
      ApiClient apiClient = new ApiClient().setBasePath(path).setHttpClient(httpClient);
      apiClient.setApiKey(apiKey);
      this.userDbApi = new UserdbApi(apiClient);
      this.networkId = networkId;
    }

    public void setUserCookie(String userKey) throws ApiException {
      this.setUserCookie(this.networkId, userKey);
    }

    public void setUserCookie(int networkId, String userKey) throws ApiException {
      this.userDbApi.setUserCookie(networkId, userKey);
    }

    public void setCustomProperties(String userKey, Object properties) throws ApiException {
      this.setCustomProperties(this.networkId, userKey, properties);
    }

    public void setCustomProperties(int networkId, String userKey, Object properties) throws ApiException {
      this.userDbApi.addCustomProperties(networkId, userKey, properties);
    }

    public void addInterest(String userKey, String interest) throws ApiException {
      this.addInterest(this.networkId, userKey, interest);
    }

    public void addInterest(int networkId, String userKey, String interest) throws ApiException {
      this.userDbApi.addInterests(networkId, userKey, interest);
    }

    public void addRetargetingSegment(String userKey, int advertiserId, int retargetingSegmentId) throws ApiException {
      this.addRetargetingSegment(this.networkId, userKey, advertiserId, retargetingSegmentId);
    }

    public void addRetargetingSegment(int networkId, String userKey, int advertiserId, int retargetingSegmentId) throws ApiException {
      this.userDbApi.addRetargetingSegment(networkId, advertiserId, retargetingSegmentId, userKey);
    }

    public void forget(String userKey) throws ApiException {
      this.forget(this.networkId, userKey);
    }

    public void forget(int networkId, String userKey) throws ApiException {
      this.userDbApi.forget(networkId, userKey);
    }

    public void gdprConsent(ConsentRequest consentRequest) throws ApiException {
      this.gdprConsent(this.networkId, consentRequest);
    }

    public void gdprConsent(int networkId, ConsentRequest consentRequest) throws ApiException {
      this.userDbApi.gdprConsent(networkId, consentRequest);
    }

    public void ipOverride(String userKey, String ip) throws ApiException {
      this.ipOverride(this.networkId, userKey, ip);
    }

    public void ipOverride(int networkId, String userKey, String ip) throws ApiException {
      this.userDbApi.ipOverride(networkId, userKey, ip);
    }

    public void matchUser(String userKey, int partnerId, int userId) throws ApiException {
      this.matchUser(this.networkId, userKey, partnerId, userId);
    }

    public void matchUser(int networkId, String userKey, int partnerId, int userId) throws ApiException {
      this.userDbApi.matchUser(networkId, userKey, partnerId, userId);
    }

    public void optOut(String userKey) throws ApiException {
      this.optOut(this.networkId, userKey);
    }

    public void optOut(int networkId, String userKey) throws ApiException {
      this.userDbApi.optOut(networkId, userKey);
    }

    public UserRecord read(String userKey) throws ApiException {
      return this.read(this.networkId, userKey);
    }

    public UserRecord read(int networkId, String userKey) throws ApiException {
      Gson gson = new Gson();
      Object user = this.userDbApi.read(networkId, userKey);
      Type t = new TypeToken<UserRecord>(){}.getType();
      return gson.fromJson(gson.toJson(user), t);
    }
  }

  public class PixelClient {
    private OkHttpClient httpClient;

    public PixelClient(OkHttpClient httpClient) {
      this.httpClient = httpClient;
    }

    public PixelFireResponse fire(PixelFireOptions opts) throws IOException {
      return this.fire(opts, new AdditionalOptions());
    }

    public PixelFireResponse fire(PixelFireOptions opts, AdditionalOptions additionalOpts) throws IOException {
      HttpUrl.Builder urlBuilder = HttpUrl.parse(opts.getUrl()).newBuilder();
      if (opts.getRevenueOverride() != null) {
        urlBuilder.addQueryParameter("override", opts.getRevenueOverride().toString());
      }
      if (opts.getAdditionalRevenue() != null) {
        urlBuilder.addQueryParameter("additional", opts.getAdditionalRevenue().toString());
      }

      HttpUrl url = urlBuilder.build();
      Request request = new okhttp3.Request.Builder()
        .url(url)
        .header("User-Agent", (additionalOpts.getUserAgent() == null ? "OpenAPI-Generator/1.0/java" : additionalOpts.getUserAgent()))
        .build();

      Response response = httpClient.newCall(request).execute();

      return new PixelFireResponse().statusCode(response.code()).location(response.headers().get("location"));
    }
  }

  private Logger logger;
  private DecisionClient decisionClient;
  private UserDbClient userDbClient;
  private PixelClient pixelClient;

  public DecisionClient decisions() {
    return this.decisionClient;
  }

  public UserDbClient userDb() {
    return this.userDbClient;
  }

  public PixelClient pixels() {
    return this.pixelClient;
  }

  public Client(ClientOptions params) {
    this.logger = LoggerFactory.getLogger(Client.class);

    String protocol = StringUtils.isNotBlank(params.getProtocol()) ? params.getProtocol() : "https";
    String host = StringUtils.isNotBlank(params.getHost()) ? params.getHost() : String.format("e-%s.adzerk.net", params.getNetworkId());
    String path = String.format("%s://%s", protocol, host);

    Interceptor requestInterceptor = new Interceptor() {
      public okhttp3.Response intercept(Interceptor.Chain chain) throws IOException {
        okhttp3.Request request = chain.request();
        okhttp3.Request.Builder builder = request.newBuilder().addHeader("X-Adzerk-Sdk-Version", "adzerk-decision-sdk-java:v1");

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

    OkHttpClient httpClient = new okhttp3
      .OkHttpClient
      .Builder()
      .followRedirects(false)
      .addInterceptor(requestInterceptor)
      .build();

    this.decisionClient = new DecisionClient(path, httpClient, logger, params.getNetworkId(), params.getSiteId());
    this.userDbClient = new UserDbClient(path, httpClient, logger, params.getApiKey(), params.getNetworkId());
    this.pixelClient = new PixelClient(httpClient);
  }
}