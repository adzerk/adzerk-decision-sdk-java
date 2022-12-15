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
import com.adzerk.sdk.generated.model.User;
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
 * DecisionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-10T07:56:36.651701-06:00[America/Chicago]")
public class DecisionResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User user;

  public static final String SERIALIZED_NAME_DECISIONS = "decisions";
  @SerializedName(SERIALIZED_NAME_DECISIONS)
  private Object decisions;

  public static final String SERIALIZED_NAME_EXPLAIN = "explain";
  @SerializedName(SERIALIZED_NAME_EXPLAIN)
  private Object explain;


  public DecisionResponse user(User user) {
    
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


  public DecisionResponse decisions(Object decisions) {
    
    this.decisions = decisions;
    return this;
  }

   /**
   * Get decisions
   * @return decisions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDecisions() {
    return decisions;
  }


  public void setDecisions(Object decisions) {
    this.decisions = decisions;
  }


  public DecisionResponse explain(Object explain) {
    
    this.explain = explain;
    return this;
  }

   /**
   * Get explain
   * @return explain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getExplain() {
    return explain;
  }


  public void setExplain(Object explain) {
    this.explain = explain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionResponse decisionResponse = (DecisionResponse) o;
    return Objects.equals(this.user, decisionResponse.user) &&
        Objects.equals(this.decisions, decisionResponse.decisions) &&
        Objects.equals(this.explain, decisionResponse.explain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, decisions, explain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionResponse {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    decisions: ").append(toIndentedString(decisions)).append("\n");
    sb.append("    explain: ").append(toIndentedString(explain)).append("\n");
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

