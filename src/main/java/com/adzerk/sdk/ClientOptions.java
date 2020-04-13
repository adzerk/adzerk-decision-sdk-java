package com.adzerk.sdk;

public class ClientOptions {
  private Integer networkId;
  private Integer siteId;
  private String protocol;
  private String host;
  private String path;
  private String apiKey;

  public ClientOptions(Integer networkId) {
    this.networkId = networkId;
  }

  public Integer getNetworkId() {
    return networkId;
  }

  public void setNetworkId(Integer networkId) {
    this.networkId = networkId;
  }

  public ClientOptions networkId(Integer networkId) {
    this.setNetworkId(networkId);
    return this;
  }

  public Integer getSiteId() {
    return siteId;
  }

  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }

  public ClientOptions siteId(Integer siteId) {
    this.siteId = siteId;
    return this;
  }

  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public ClientOptions protocol(String protocol) {
    this.setProtocol(protocol);
    return this;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public ClientOptions host(String host) {
    this.setHost(host);
    return this;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ClientOptions path(String path) {
    this.setPath(path);
    return this;
  }

  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public ClientOptions apiKey(String apiKey) {
    this.setApiKey(apiKey);
    return this;
  }
}