package com.adzerk.sdk;

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

public class Client {
  private DecisionApi api;
  private String path;

  public Client(ClientParameters params) {
    String protocol = StringUtils.isNotBlank(params.getProtocol()) ? params.getProtocol() : "https";
    String host = StringUtils.isNotBlank(params.getHost()) ? params.getHost() : String.format("e-%s.adzerk.net", params.getNetworkId());
    this.path = String.format("%s://%s", protocol, host);

    ApiClient client = new ApiClient().setBasePath(this.path);
    this.api = new DecisionApi(client);
  }

  public com.adzerk.sdk.model.Response getDecisions(Request request) throws ApiException {
    Gson gson = new Gson();
    Type t = new TypeToken<com.adzerk.sdk.model.Response>(){}.getType();
    Object response = this.api.getDecisions(request);

    return gson.fromJson(gson.toJson(response), t);
  }
}