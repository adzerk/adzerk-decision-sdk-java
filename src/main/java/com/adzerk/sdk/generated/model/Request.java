/*
 * Adzerk Decision API
 * Adzerk Decision API
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adzerk.sdk.generated.model;

import java.util.Objects;
import java.util.Arrays;
import com.adzerk.sdk.generated.model.Placement;
import com.adzerk.sdk.generated.model.RequestConsent;
import com.adzerk.sdk.generated.model.User;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-04T09:29:07.265-05:00[America/New_York]")
public class Request implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PLACEMENTS = "placements";
  @SerializedName(SERIALIZED_NAME_PLACEMENTS)
  private List<Placement> placements = new ArrayList<Placement>();

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User user;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_REFERRER = "referrer";
  @SerializedName(SERIALIZED_NAME_REFERRER)
  private String referrer;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_BLOCKED_CREATIVES = "blockedCreatives";
  @SerializedName(SERIALIZED_NAME_BLOCKED_CREATIVES)
  private List<Integer> blockedCreatives = null;

  public static final String SERIALIZED_NAME_IS_MOBILE = "isMobile";
  @SerializedName(SERIALIZED_NAME_IS_MOBILE)
  private Boolean isMobile;

  public static final String SERIALIZED_NAME_INCLUDE_PRICING_DATA = "includePricingData";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PRICING_DATA)
  private Boolean includePricingData;

  public static final String SERIALIZED_NAME_NOTRACK = "notrack";
  @SerializedName(SERIALIZED_NAME_NOTRACK)
  private Boolean notrack;

  public static final String SERIALIZED_NAME_ENABLE_BOT_FILTERING = "enableBotFiltering";
  @SerializedName(SERIALIZED_NAME_ENABLE_BOT_FILTERING)
  private Boolean enableBotFiltering;

  public static final String SERIALIZED_NAME_ENABLE_USER_D_B_I_P = "enableUserDBIP";
  @SerializedName(SERIALIZED_NAME_ENABLE_USER_D_B_I_P)
  private Boolean enableUserDBIP;

  public static final String SERIALIZED_NAME_CONSENT = "consent";
  @SerializedName(SERIALIZED_NAME_CONSENT)
  private RequestConsent consent;

  public static final String SERIALIZED_NAME_DEVICE_I_D = "deviceID";
  @SerializedName(SERIALIZED_NAME_DEVICE_I_D)
  private String deviceID;


  public Request placements(List<Placement> placements) {
    
    this.placements = placements;
    return this;
  }

  public Request addPlacementsItem(Placement placementsItem) {
    this.placements.add(placementsItem);
    return this;
  }

   /**
   * One or more Placement objects
   * @return placements
  **/
  @ApiModelProperty(required = true, value = "One or more Placement objects")

  public List<Placement> getPlacements() {
    return placements;
  }


  public void setPlacements(List<Placement> placements) {
    this.placements = placements;
  }


  public Request user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    this.user = user;
  }


  public Request keywords(List<String> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public Request addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<String>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Keywords for keyword Targeting. Such as &#x60;\&quot;keywords\&quot;: [\&quot;foo\&quot;, \&quot;bar\&quot;, \&quot;baz\&quot;]&#x60;.
   * @return keywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Keywords for keyword Targeting. Such as `\"keywords\": [\"foo\", \"bar\", \"baz\"]`.")

  public List<String> getKeywords() {
    return keywords;
  }


  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public Request url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The current page URL
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current page URL")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public Request referrer(String referrer) {
    
    this.referrer = referrer;
    return this;
  }

   /**
   * The referrer URL
   * @return referrer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The referrer URL")

  public String getReferrer() {
    return referrer;
  }


  public void setReferrer(String referrer) {
    this.referrer = referrer;
  }


  public Request ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * The IP address. Required for [Geo-Targeting](https://dev.adzerk.com/docs/geo-location)
   * @return ip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IP address. Required for [Geo-Targeting](https://dev.adzerk.com/docs/geo-location)")

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }


  public Request blockedCreatives(List<Integer> blockedCreatives) {
    
    this.blockedCreatives = blockedCreatives;
    return this;
  }

  public Request addBlockedCreativesItem(Integer blockedCreativesItem) {
    if (this.blockedCreatives == null) {
      this.blockedCreatives = new ArrayList<Integer>();
    }
    this.blockedCreatives.add(blockedCreativesItem);
    return this;
  }

   /**
   * Numeric creative ids to disregard for ad selection
   * @return blockedCreatives
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Numeric creative ids to disregard for ad selection")

  public List<Integer> getBlockedCreatives() {
    return blockedCreatives;
  }


  public void setBlockedCreatives(List<Integer> blockedCreatives) {
    this.blockedCreatives = blockedCreatives;
  }


  public Request isMobile(Boolean isMobile) {
    
    this.isMobile = isMobile;
    return this;
  }

   /**
   * If true, only ads containing a single image will be returned
   * @return isMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, only ads containing a single image will be returned")

  public Boolean getIsMobile() {
    return isMobile;
  }


  public void setIsMobile(Boolean isMobile) {
    this.isMobile = isMobile;
  }


  public Request includePricingData(Boolean includePricingData) {
    
    this.includePricingData = includePricingData;
    return this;
  }

   /**
   * If true, return pricing data for the decision in the response
   * @return includePricingData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, return pricing data for the decision in the response")

  public Boolean getIncludePricingData() {
    return includePricingData;
  }


  public void setIncludePricingData(Boolean includePricingData) {
    this.includePricingData = includePricingData;
  }


  public Request notrack(Boolean notrack) {
    
    this.notrack = notrack;
    return this;
  }

   /**
   * If true, only return ads that are set to honor Do Not Track
   * @return notrack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, only return ads that are set to honor Do Not Track")

  public Boolean getNotrack() {
    return notrack;
  }


  public void setNotrack(Boolean notrack) {
    this.notrack = notrack;
  }


  public Request enableBotFiltering(Boolean enableBotFiltering) {
    
    this.enableBotFiltering = enableBotFiltering;
    return this;
  }

   /**
   * If making a client-side request, set to true. Defaults to false to ensure a server isn&#39;t seen as a bot. See [here](https://dev.adzerk.com/docs/tracking-overview#section-bot-filtering) for more info
   * @return enableBotFiltering
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If making a client-side request, set to true. Defaults to false to ensure a server isn't seen as a bot. See [here](https://dev.adzerk.com/docs/tracking-overview#section-bot-filtering) for more info")

  public Boolean getEnableBotFiltering() {
    return enableBotFiltering;
  }


  public void setEnableBotFiltering(Boolean enableBotFiltering) {
    this.enableBotFiltering = enableBotFiltering;
  }


  public Request enableUserDBIP(Boolean enableUserDBIP) {
    
    this.enableUserDBIP = enableUserDBIP;
    return this;
  }

   /**
   * If true, override the IP address of the request with the IP address supplied on the UserKey. If no IP address is found on the UserKey, this will fall back to the IP address on the request. Requires UserDB
   * @return enableUserDBIP
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, override the IP address of the request with the IP address supplied on the UserKey. If no IP address is found on the UserKey, this will fall back to the IP address on the request. Requires UserDB")

  public Boolean getEnableUserDBIP() {
    return enableUserDBIP;
  }


  public void setEnableUserDBIP(Boolean enableUserDBIP) {
    this.enableUserDBIP = enableUserDBIP;
  }


  public Request consent(RequestConsent consent) {
    
    this.consent = consent;
    return this;
  }

   /**
   * Get consent
   * @return consent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RequestConsent getConsent() {
    return consent;
  }


  public void setConsent(RequestConsent consent) {
    this.consent = consent;
  }


  public Request deviceID(String deviceID) {
    
    this.deviceID = deviceID;
    return this;
  }

   /**
   * RTB requests only - sets an Identifier for Advertisers (IFA or IDFA)
   * @return deviceID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RTB requests only - sets an Identifier for Advertisers (IFA or IDFA)")

  public String getDeviceID() {
    return deviceID;
  }


  public void setDeviceID(String deviceID) {
    this.deviceID = deviceID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Request request = (Request) o;
    return Objects.equals(this.placements, request.placements) &&
        Objects.equals(this.user, request.user) &&
        Objects.equals(this.keywords, request.keywords) &&
        Objects.equals(this.url, request.url) &&
        Objects.equals(this.referrer, request.referrer) &&
        Objects.equals(this.ip, request.ip) &&
        Objects.equals(this.blockedCreatives, request.blockedCreatives) &&
        Objects.equals(this.isMobile, request.isMobile) &&
        Objects.equals(this.includePricingData, request.includePricingData) &&
        Objects.equals(this.notrack, request.notrack) &&
        Objects.equals(this.enableBotFiltering, request.enableBotFiltering) &&
        Objects.equals(this.enableUserDBIP, request.enableUserDBIP) &&
        Objects.equals(this.consent, request.consent) &&
        Objects.equals(this.deviceID, request.deviceID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placements, user, keywords, url, referrer, ip, blockedCreatives, isMobile, includePricingData, notrack, enableBotFiltering, enableUserDBIP, consent, deviceID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Request {\n");
    sb.append("    placements: ").append(toIndentedString(placements)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    blockedCreatives: ").append(toIndentedString(blockedCreatives)).append("\n");
    sb.append("    isMobile: ").append(toIndentedString(isMobile)).append("\n");
    sb.append("    includePricingData: ").append(toIndentedString(includePricingData)).append("\n");
    sb.append("    notrack: ").append(toIndentedString(notrack)).append("\n");
    sb.append("    enableBotFiltering: ").append(toIndentedString(enableBotFiltering)).append("\n");
    sb.append("    enableUserDBIP: ").append(toIndentedString(enableUserDBIP)).append("\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
    sb.append("    deviceID: ").append(toIndentedString(deviceID)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

