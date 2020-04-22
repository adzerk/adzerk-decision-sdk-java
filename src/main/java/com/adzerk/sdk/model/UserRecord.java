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

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private Map<String, ?> custom;

  public UserRecord custom(Map<String, ?> custom) {
    this.custom = custom;
    return this;
  }

  public Map<String, ?> getCustom() {
    return custom;
  }

  public void setCustom(Map<String, ?> custom) {
    this.custom = custom;
  }

  public static final String SERIALIZED_NAME_CONSENT = "consent";
  @SerializedName(SERIALIZED_NAME_CONSENT)
  private Map<String, Boolean> consent;

  public UserRecord consent(Map<String, Boolean> consent) {
    this.consent = consent;
    return this;
  }

  public Map<String, Boolean> getConsent() {
    return consent;
  }

  public void setConsent(Map<String, Boolean> consent) {
    this.consent = consent;
  }

  public static final String SERIALIZED_NAME_OPT_OUT = "optOut";
  @SerializedName(SERIALIZED_NAME_OPT_OUT)
  private boolean optOut;

  public UserRecord optOut(boolean optOut) {
    this.optOut = optOut;
    return this;
  }

  public boolean getOptOut() {
    return optOut;
  }

  public void setOptOut(boolean optOut) {
    this.optOut = optOut;
  }

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public UserRecord ip(String ip) {
    this.ip = ip;
    return this;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }
}