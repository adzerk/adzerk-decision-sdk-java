package com.adzerk.sdk.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class UserRecord implements Serializable {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public UserRecord key(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public static final String SERIALIZED_NAME_IS_NEW = "isNew";
  @SerializedName(SERIALIZED_NAME_IS_NEW)
  private boolean isNew;

  public UserRecord isNew(boolean isNew) {
    this.isNew = isNew;
    return this;
  }

  public boolean getIsNew() {
    return isNew;
  }

  public void setIsNew(boolean isNew) {
    this.isNew = isNew;
  }

  public static final String SERIALIZED_NAME_INTERESTS = "interests";
  @SerializedName(SERIALIZED_NAME_INTERESTS)
  private List<String> interests;

  public UserRecord interests(List<String> interests) {
    this.interests = interests;
    return this;
  }

  public List<String> getInterests() {
    return interests;
  }

  public void setInterests(List<String> interests) {
    this.interests = interests;
  }

  public static final String SERIALIZED_NAME_BLOCKED_ITEMS = "blockedItems";
  @SerializedName(SERIALIZED_NAME_BLOCKED_ITEMS)
  private Map<String, List<Integer>> blockedItems;

  public UserRecord blockedItems(Map<String, List<Integer>> blockedItems) {
    this.blockedItems = blockedItems;
    return this;
  }

  public Map<String, List<Integer>> getBlockedItems() {
    return blockedItems;
  }

  public void setBlockedItems(Map<String, List<Integer>> blockedItems) {
    this.blockedItems = blockedItems;
  }

  public static final String SERIALIZED_NAME_FLIGHT_VIEW_TIMES = "flightViewTimes";
  @SerializedName(SERIALIZED_NAME_FLIGHT_VIEW_TIMES)
  private Map<String, List<String>> flightViewTimes;

  public UserRecord flightViewTimes(Map<String, List<String>> flightViewTimes) {
    this.flightViewTimes = flightViewTimes;
    return this;
  }

  public Map<String, List<String>> getFlightViewTimes() {
    return flightViewTimes;
  }

  public void setFlightViewTimes(Map<String, List<String>> flightViewTimes) {
    this.flightViewTimes = flightViewTimes;
  }

  public static final String SERIALIZED_NAME_PARTNER_USER_IDS = "partnerUserIds";
  @SerializedName(SERIALIZED_NAME_PARTNER_USER_IDS)
  private Map<String, List<String>> partnerUserIds;

  public UserRecord partnerUserIds(Map<String, List<String>> partnerUserIds) {
    this.partnerUserIds = partnerUserIds;
    return this;
  }

  public Map<String, List<String>> getPartnerUserIds() {
    return partnerUserIds;
  }

  public void setPartnerUserIds(Map<String, List<String>> partnerUserIds) {
    this.partnerUserIds = partnerUserIds;
  }

  public static final String SERIALIZED_NAME_RETARGETING_SEGMENTS = "retargetingSegments";
  @SerializedName(SERIALIZED_NAME_RETARGETING_SEGMENTS)
  private Map<String, List<Integer>> retargetingSegments;

  public UserRecord retargetingSegments(Map<String, List<Integer>> retargetingSegments) {
    this.retargetingSegments = retargetingSegments;
    return this;
  }

  public Map<String, List<Integer>> getRetargetingSegments() {
    return retargetingSegments;
  }

  public void setRetargetingSegments(Map<String, List<Integer>> retargetingSegments) {
    this.retargetingSegments = retargetingSegments;
  }
}