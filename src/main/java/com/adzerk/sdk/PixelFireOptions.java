package com.adzerk.sdk;

import java.math.BigDecimal;

public class PixelFireOptions {
  private String url;
  private BigDecimal revenueOverride;
  private BigDecimal additionalRevenue;

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PixelFireOptions url(String url) {
    this.url = url;
    return this;
  }

  public BigDecimal getRevenueOverride() {
    return this.revenueOverride;
  }

  public void setRevenueOverride(BigDecimal revenueOverride) {
    this.revenueOverride = revenueOverride;
  }

  public PixelFireOptions revenueOverride(BigDecimal revenueOverride) {
    this.revenueOverride = revenueOverride;
    return this;
  }

  public BigDecimal getAdditionalRevenue() {
    return this.additionalRevenue;
  }

  public void setAdditionalRevenue(BigDecimal additionalRevenue) {
    this.additionalRevenue = additionalRevenue;
  }

  public PixelFireOptions additionalRevenue(BigDecimal additionalRevenue) {
    this.additionalRevenue = additionalRevenue;
    return this;
  }
}