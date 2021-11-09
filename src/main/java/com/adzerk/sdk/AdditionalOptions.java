package com.adzerk.sdk;

public class AdditionalOptions {
  private String userAgent;
  private Boolean includeExplanation;
  private String apiKey;
  private String desiredAds[];
  private Object desiredAdMap; 

  public String getUserAgent() {
    return this.userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public AdditionalOptions userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  public Boolean getIncludeExplanation() {
    return this.includeExplanation;
  }

  public void setIncludeExplanation(Boolean includeExplanation) {
    this.includeExplanation = includeExplanation;
  }

  public AdditionalOptions includeExplanation(Boolean includeExplanation) {
    this.includeExplanation = includeExplanation;
    return this;
  }

  public String getApiKey() {
    return this.apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public AdditionalOptions apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  public String[] getDesiredAds() {
    return this.desiredAds;
  }

  public AdditionalOptions desiredAds(String desiredAds[]) {
    this.desiredAds = desiredAds;
    return this;
  }

  public Object getDesiredAdMap() {
    return this.desiredAdMap;
  }

  public AdditionalOptions desiredAdMap(Object desiredAdMap) {
    this.desiredAdMap = desiredAdMap;
    return this;
  }

  public Boolean hasValues() {
    return (this.includeExplanation != null && this.includeExplanation) || this.userAgent != null;
  }
}