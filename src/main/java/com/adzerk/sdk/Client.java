package com.adzerk.sdk;

import java.io.IOException;
import java.lang.reflect.Type;

import com.adzerk.sdk.generated.ApiClient;
import com.adzerk.sdk.generated.ApiException;
import com.adzerk.sdk.generated.api.DecisionApi;
import com.adzerk.sdk.generated.model.Request;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okio.Buffer;

public class Client {
  private String path;
  private Logger logger;
  private OkHttpClient httpClient;

  public Client(ClientParameters params) {
    this.logger = LoggerFactory.getLogger(Client.class);

    String protocol = StringUtils.isNotBlank(params.getProtocol()) ? params.getProtocol() : "https";
    String host = StringUtils.isNotBlank(params.getHost()) ? params.getHost() : String.format("e-%s.adzerk.net", params.getNetworkId());
    this.path = String.format("%s://%s", protocol, host);

    Interceptor requestInterceptor = new Interceptor() {
      public okhttp3.Response intercept(Interceptor.Chain chain) throws IOException {
        okhttp3.Request request = chain.request();
        okhttp3.Request newRequest = request.newBuilder().addHeader("X-Adzerk-Sdk-Version", "adzerk-decision-sdk-java:v1").build();

        long t1 = System.nanoTime();
        Buffer buffer = new Buffer();
        request.body().writeTo(buffer);

        logger.info("Request URL: {}", newRequest.url());
        logger.info("Request Headers: {}", newRequest.headers());
        logger.info("Request Body: {}", buffer.readUtf8());

        okhttp3.Response response = chain.proceed(newRequest);

        long t2 = System.nanoTime();
        logger.info(String.format("Received response for %s in %.1fms%n",
            response.request().url(), (t2 - t1) / 1e6d));

        logger.info("Response Code: {}", response.code());
        logger.info("Response Status Text: {}", response.message());

        return response;
      }
    };

    this.httpClient = new okhttp3.OkHttpClient.Builder().addInterceptor(requestInterceptor).build();
  }

  public com.adzerk.sdk.model.Response getDecisions(Request request) throws ApiException {
    Gson gson = new Gson();
    Type t = new TypeToken<com.adzerk.sdk.model.Response>(){}.getType();
    ApiClient apiClient = new ApiClient().setBasePath(this.path).setHttpClient(this.httpClient);
    DecisionApi api = new DecisionApi(apiClient);

    this.logger.info("Fetching decisions from Adzerk API");
    this.logger.info("Processing request: {}", gson.toJson(request));

    Object response = api.getDecisions(request);

    this.logger.info("Received response: {}", gson.toJson(response));

    return gson.fromJson(gson.toJson(response), t);
  }

  public com.adzerk.sdk.model.Response getDecisionsWithExplanation(Request request, String apiKey) throws ApiException {
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