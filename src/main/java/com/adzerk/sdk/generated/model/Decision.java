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
import com.adzerk.sdk.generated.model.Content;
import com.adzerk.sdk.generated.model.Event;
import com.adzerk.sdk.generated.model.PricingData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Decision
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-16T10:23:38.741-04:00[America/New_York]")
public class Decision implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AD_ID = "adId";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Integer adId;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creativeId";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private Integer creativeId;

  public static final String SERIALIZED_NAME_FLIGHT_ID = "flightId";
  @SerializedName(SERIALIZED_NAME_FLIGHT_ID)
  private Integer flightId;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;

  public static final String SERIALIZED_NAME_PRIORITY_ID = "priorityId";
  @SerializedName(SERIALIZED_NAME_PRIORITY_ID)
  private Integer priorityId;

  public static final String SERIALIZED_NAME_CLICK_URL = "clickUrl";
  @SerializedName(SERIALIZED_NAME_CLICK_URL)
  private URI clickUrl;

  public static final String SERIALIZED_NAME_CONTENTS = "contents";
  @SerializedName(SERIALIZED_NAME_CONTENTS)
  private List<Content> contents = null;

  public static final String SERIALIZED_NAME_IMPRESSION_URL = "impressionUrl";
  @SerializedName(SERIALIZED_NAME_IMPRESSION_URL)
  private URI impressionUrl;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<Event> events = null;

  public static final String SERIALIZED_NAME_PRICING = "pricing";
  @SerializedName(SERIALIZED_NAME_PRICING)
  private PricingData pricing;


  public Decision adId(Integer adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * Get adId
   * @return adId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAdId() {
    return adId;
  }


  public void setAdId(Integer adId) {
    this.adId = adId;
  }


  public Decision creativeId(Integer creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * Get creativeId
   * @return creativeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(Integer creativeId) {
    this.creativeId = creativeId;
  }


  public Decision flightId(Integer flightId) {
    
    this.flightId = flightId;
    return this;
  }

   /**
   * Get flightId
   * @return flightId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFlightId() {
    return flightId;
  }


  public void setFlightId(Integer flightId) {
    this.flightId = flightId;
  }


  public Decision campaignId(Integer campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }


  public Decision priorityId(Integer priorityId) {
    
    this.priorityId = priorityId;
    return this;
  }

   /**
   * Get priorityId
   * @return priorityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPriorityId() {
    return priorityId;
  }


  public void setPriorityId(Integer priorityId) {
    this.priorityId = priorityId;
  }


  public Decision clickUrl(URI clickUrl) {
    
    this.clickUrl = clickUrl;
    return this;
  }

   /**
   * Get clickUrl
   * @return clickUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getClickUrl() {
    return clickUrl;
  }


  public void setClickUrl(URI clickUrl) {
    this.clickUrl = clickUrl;
  }


  public Decision contents(List<Content> contents) {
    
    this.contents = contents;
    return this;
  }

  public Decision addContentsItem(Content contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<Content>();
    }
    this.contents.add(contentsItem);
    return this;
  }

   /**
   * Get contents
   * @return contents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Content> getContents() {
    return contents;
  }


  public void setContents(List<Content> contents) {
    this.contents = contents;
  }


  public Decision impressionUrl(URI impressionUrl) {
    
    this.impressionUrl = impressionUrl;
    return this;
  }

   /**
   * Get impressionUrl
   * @return impressionUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getImpressionUrl() {
    return impressionUrl;
  }


  public void setImpressionUrl(URI impressionUrl) {
    this.impressionUrl = impressionUrl;
  }


  public Decision events(List<Event> events) {
    
    this.events = events;
    return this;
  }

  public Decision addEventsItem(Event eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<Event>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Event> getEvents() {
    return events;
  }


  public void setEvents(List<Event> events) {
    this.events = events;
  }


  public Decision pricing(PricingData pricing) {
    
    this.pricing = pricing;
    return this;
  }

   /**
   * Get pricing
   * @return pricing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PricingData getPricing() {
    return pricing;
  }


  public void setPricing(PricingData pricing) {
    this.pricing = pricing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Decision decision = (Decision) o;
    return Objects.equals(this.adId, decision.adId) &&
        Objects.equals(this.creativeId, decision.creativeId) &&
        Objects.equals(this.flightId, decision.flightId) &&
        Objects.equals(this.campaignId, decision.campaignId) &&
        Objects.equals(this.priorityId, decision.priorityId) &&
        Objects.equals(this.clickUrl, decision.clickUrl) &&
        Objects.equals(this.contents, decision.contents) &&
        Objects.equals(this.impressionUrl, decision.impressionUrl) &&
        Objects.equals(this.events, decision.events) &&
        Objects.equals(this.pricing, decision.pricing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, creativeId, flightId, campaignId, priorityId, clickUrl, contents, impressionUrl, events, pricing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Decision {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    flightId: ").append(toIndentedString(flightId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    priorityId: ").append(toIndentedString(priorityId)).append("\n");
    sb.append("    clickUrl: ").append(toIndentedString(clickUrl)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    impressionUrl: ").append(toIndentedString(impressionUrl)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
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

