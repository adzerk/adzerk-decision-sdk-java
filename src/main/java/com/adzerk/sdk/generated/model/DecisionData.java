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
import java.net.URI;
import java.io.Serializable;

/**
 * DecisionData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-04T09:29:07.265-05:00[America/New_York]")
public class DecisionData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_IMAGE_U_R_L = "imageURL";
  @SerializedName(SERIALIZED_NAME_IMAGE_U_R_L)
  private URI imageURL;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_CUSTOM_DATA = "customData";
  @SerializedName(SERIALIZED_NAME_CUSTOM_DATA)
  private Object customData;


  public DecisionData imageURL(URI imageURL) {
    
    this.imageURL = imageURL;
    return this;
  }

   /**
   * Get imageURL
   * @return imageURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getImageURL() {
    return imageURL;
  }


  public void setImageURL(URI imageURL) {
    this.imageURL = imageURL;
  }


  public DecisionData title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public DecisionData width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWidth() {
    return width;
  }


  public void setWidth(Integer width) {
    this.width = width;
  }


  public DecisionData height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public DecisionData customData(Object customData) {
    
    this.customData = customData;
    return this;
  }

   /**
   * Get customData
   * @return customData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCustomData() {
    return customData;
  }


  public void setCustomData(Object customData) {
    this.customData = customData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionData decisionData = (DecisionData) o;
    return Objects.equals(this.imageURL, decisionData.imageURL) &&
        Objects.equals(this.title, decisionData.title) &&
        Objects.equals(this.width, decisionData.width) &&
        Objects.equals(this.height, decisionData.height) &&
        Objects.equals(this.customData, decisionData.customData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageURL, title, width, height, customData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionData {\n");
    sb.append("    imageURL: ").append(toIndentedString(imageURL)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    customData: ").append(toIndentedString(customData)).append("\n");
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

