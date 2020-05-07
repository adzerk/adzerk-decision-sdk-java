package com.adzerk.sdk;

public class PixelFireResponse {
  private int statusCode;
  private String location;

  public int getStatusCode() {
    return this.statusCode;
  }

  public void setStatusCode(int statusCode) {
    this.statusCode = statusCode;
  }

  public PixelFireResponse statusCode(int statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  public String getLocation() {
    return this.location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public PixelFireResponse location(String location) {
    this.location = location;
    return this;
  }
}