package com.adzerk.sdk;

public class ClientParameters {
  private Integer networkId;
  private String protocol;
  private String host;
  private String path;
  private String apiKey;

  public ClientParameters(Integer networkId) {
    this.networkId = networkId;
  }

  public Integer getNetworkId() {
    return networkId;
  }

  public void setNetworkId(Integer networkId) {
    this.networkId = networkId;
  }

  public ClientParameters networkId(Integer networkId) {
    this.setNetworkId(networkId);
    return this;
  }

  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public ClientParameters protocol(String protocol) {
    this.setProtocol(protocol);
    return this;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public ClientParameters host(String host) {
    this.setHost(host);
    return this;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ClientParameters path(String path) {
    this.setPath(path);
    return this;
  }

  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public ClientParameters apiKey(String apiKey) {
    this.setApiKey(apiKey);
    return this;
  }
}