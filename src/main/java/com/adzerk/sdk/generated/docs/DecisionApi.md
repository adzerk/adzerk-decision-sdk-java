# DecisionApi

All URIs are relative to *https://e-23.adzerk.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDecisions**](DecisionApi.md#getDecisions) | **POST** /api/v2 | 


<a name="getDecisions"></a>
# **getDecisions**
> DecisionResponse getDecisions(decisionRequest)



Request Decision(s)

### Example
```java
// Import classes:
import com.adzerk.sdk.generated.ApiClient;
import com.adzerk.sdk.generated.ApiException;
import com.adzerk.sdk.generated.Configuration;
import com.adzerk.sdk.generated.models.*;
import com.adzerk.sdk.generated.api.DecisionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://e-23.adzerk.net");

    DecisionApi apiInstance = new DecisionApi(defaultClient);
    DecisionRequest decisionRequest = new DecisionRequest(); // DecisionRequest | 
    try {
      DecisionResponse result = apiInstance.getDecisions(decisionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DecisionApi#getDecisions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionRequest** | [**DecisionRequest**](DecisionRequest.md)|  | [optional]

### Return type

[**DecisionResponse**](DecisionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Bad Request |  -  |
**200** | Successful decision request |  -  |

