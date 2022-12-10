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
 * PricingData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-10T07:56:36.651701-06:00[America/Chicago]")
public class PricingData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Float price;

  public static final String SERIALIZED_NAME_CLEAR_PRICE = "clearPrice";
  @SerializedName(SERIALIZED_NAME_CLEAR_PRICE)
  private Float clearPrice;

  public static final String SERIALIZED_NAME_REVENUE = "revenue";
  @SerializedName(SERIALIZED_NAME_REVENUE)
  private Float revenue;

  public static final String SERIALIZED_NAME_RATE_TYPE = "rateType";
  @SerializedName(SERIALIZED_NAME_RATE_TYPE)
  private Integer rateType;

  public static final String SERIALIZED_NAME_E_C_P_M = "eCPM";
  @SerializedName(SERIALIZED_NAME_E_C_P_M)
  private Float eCPM;


  public PricingData price(Float price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getPrice() {
    return price;
  }


  public void setPrice(Float price) {
    this.price = price;
  }


  public PricingData clearPrice(Float clearPrice) {
    
    this.clearPrice = clearPrice;
    return this;
  }

   /**
   * Get clearPrice
   * @return clearPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getClearPrice() {
    return clearPrice;
  }


  public void setClearPrice(Float clearPrice) {
    this.clearPrice = clearPrice;
  }


  public PricingData revenue(Float revenue) {
    
    this.revenue = revenue;
    return this;
  }

   /**
   * Get revenue
   * @return revenue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getRevenue() {
    return revenue;
  }


  public void setRevenue(Float revenue) {
    this.revenue = revenue;
  }


  public PricingData rateType(Integer rateType) {
    
    this.rateType = rateType;
    return this;
  }

   /**
   * Get rateType
   * @return rateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRateType() {
    return rateType;
  }


  public void setRateType(Integer rateType) {
    this.rateType = rateType;
  }


  public PricingData eCPM(Float eCPM) {
    
    this.eCPM = eCPM;
    return this;
  }

   /**
   * Get eCPM
   * @return eCPM
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float geteCPM() {
    return eCPM;
  }


  public void seteCPM(Float eCPM) {
    this.eCPM = eCPM;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingData pricingData = (PricingData) o;
    return Objects.equals(this.price, pricingData.price) &&
        Objects.equals(this.clearPrice, pricingData.clearPrice) &&
        Objects.equals(this.revenue, pricingData.revenue) &&
        Objects.equals(this.rateType, pricingData.rateType) &&
        Objects.equals(this.eCPM, pricingData.eCPM);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, clearPrice, revenue, rateType, eCPM);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingData {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    clearPrice: ").append(toIndentedString(clearPrice)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
    sb.append("    eCPM: ").append(toIndentedString(eCPM)).append("\n");
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

