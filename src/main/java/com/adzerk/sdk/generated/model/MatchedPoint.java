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
 * MatchedPoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-22T11:29:51.483-04:00[America/New_York]")
public class MatchedPoint implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LAT = "lat";
  @SerializedName(SERIALIZED_NAME_LAT)
  private String lat;

  public static final String SERIALIZED_NAME_LONG = "long";
  @SerializedName(SERIALIZED_NAME_LONG)
  private String _long;


  public MatchedPoint lat(String lat) {
    
    this.lat = lat;
    return this;
  }

   /**
   * Get lat
   * @return lat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLat() {
    return lat;
  }


  public void setLat(String lat) {
    this.lat = lat;
  }


  public MatchedPoint _long(String _long) {
    
    this._long = _long;
    return this;
  }

   /**
   * Get _long
   * @return _long
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLong() {
    return _long;
  }


  public void setLong(String _long) {
    this._long = _long;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchedPoint matchedPoint = (MatchedPoint) o;
    return Objects.equals(this.lat, matchedPoint.lat) &&
        Objects.equals(this._long, matchedPoint._long);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, _long);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchedPoint {\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
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

