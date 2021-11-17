package com.adzerk.sdk;

import java.util.List;
import java.util.Map;

public class AdditionalOptions {
  private String userAgent;
  private Boolean includeExplanation;
  private String apiKey;
  private List<String> desiredAds;
  private Map<String, List<Integer>> desiredAdMap; 

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

  public AdditionalOptions desiredAds(List<String> desiredAds) {
    this.desiredAds = desiredAds;
    return this;
  }

  public List<String> getDesiredAds() {
    return desiredAds;
  }

  public void setDesiredAds(List<String> desiredAds) {
    this.desiredAds = desiredAds;
  }

  public AdditionalOptions desiredAdMap(Map<String, List<Integer>> desiredAdMap) {
    this.desiredAdMap = desiredAdMap;
    return this;
  }

  public Map<String, List<Integer>> getDesiredAdMap() {
    return desiredAdMap;
  }

  public void setDesiredAdMap(Map<String, List<Integer>> desiredAdMap) {
    this.desiredAdMap = desiredAdMap;
  }

  public Boolean hasValues() {
    return (this.includeExplanation != null && this.includeExplanation) || this.userAgent != null;
  }
}