package com.adzerk.sdk.model;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.adzerk.sdk.generated.model.Decision;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;

import io.swagger.annotations.ApiModelProperty;

public class DecisionResponse extends com.adzerk.sdk.generated.model.DecisionResponse {
  private static final long serialVersionUID = 1;

  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Map<String, ?> getExplain() {
    LinkedTreeMap<?, ?> explanation = (LinkedTreeMap<?, ?>) super.getExplain();

    if (explanation == null) { return null; }

    return (Map<String, ?>) explanation;
  }
}
