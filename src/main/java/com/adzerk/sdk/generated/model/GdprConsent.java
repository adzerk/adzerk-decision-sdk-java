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
import com.adzerk.sdk.generated.model.Consent;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * GdprConsent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-04T09:29:07.265-05:00[America/New_York]")
public class GdprConsent implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_USER_KEY = "userKey";
  @SerializedName(SERIALIZED_NAME_USER_KEY)
  private String userKey;

  public static final String SERIALIZED_NAME_CONSENT = "consent";
  @SerializedName(SERIALIZED_NAME_CONSENT)
  private Consent consent;


  public GdprConsent userKey(String userKey) {
    
    this.userKey = userKey;
    return this;
  }

   /**
   * Get userKey
   * @return userKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserKey() {
    return userKey;
  }


  public void setUserKey(String userKey) {
    this.userKey = userKey;
  }


  public GdprConsent consent(Consent consent) {
    
    this.consent = consent;
    return this;
  }

   /**
   * Get consent
   * @return consent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Consent getConsent() {
    return consent;
  }


  public void setConsent(Consent consent) {
    this.consent = consent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GdprConsent gdprConsent = (GdprConsent) o;
    return Objects.equals(this.userKey, gdprConsent.userKey) &&
        Objects.equals(this.consent, gdprConsent.consent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userKey, consent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GdprConsent {\n");
    sb.append("    userKey: ").append(toIndentedString(userKey)).append("\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
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

