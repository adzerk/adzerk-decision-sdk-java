package com.adzerk.sdk;

import java.io.IOException;
import java.lang.reflect.Type;

import com.adzerk.sdk.generated.ApiClient;
import com.adzerk.sdk.generated.ApiException;
import com.adzerk.sdk.generated.Configuration;
import com.adzerk.sdk.generated.api.DecisionApi;
import com.adzerk.sdk.generated.model.Request;
import com.adzerk.sdk.generated.model.Response;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okio.Buffer;

public class Client {
  private DecisionApi api;
  private String path;
  private Logger logger;
  private Interceptor requestInterceptor;

  public Client(ClientParameters params) {
    this.logger = LoggerFactory.getLogger(Client.class);

    String protocol = StringUtils.isNotBlank(params.getProtocol()) ? params.getProtocol() : "https";
    String host = StringUtils.isNotBlank(params.getHost()) ? params.getHost() : String.format("e-%s.adzerk.net", params.getNetworkId());
    this.path = String.format("%s://%s", protocol, host);

    this.requestInterceptor = new Interceptor() {
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

    okhttp3.OkHttpClient httpClient = new okhttp3.OkHttpClient.Builder().addInterceptor(this.requestInterceptor).build();
    ApiClient apiClient = new ApiClient().setBasePath(this.path).setHttpClient(httpClient);
    this.api = new DecisionApi(apiClient);

  }

  public com.adzerk.sdk.model.Response getDecisions(Request request) throws ApiException {
    Gson gson = new Gson();
    Type t = new TypeToken<com.adzerk.sdk.model.Response>(){}.getType();

    this.logger.info("Fetching decisions from Adzerk API");
    this.logger.info("Processing request: {}", gson.toJson(request));

    Object response = this.api.getDecisions(request);

    this.logger.info("Received response: {}", gson.toJson(response));

    return gson.fromJson(gson.toJson(response), t);
  }
}