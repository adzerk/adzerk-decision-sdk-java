# UserdbApi

All URIs are relative to *https://e-23.adzerk.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCustomProperties**](UserdbApi.md#addCustomProperties) | **POST** /udb/{networkId}/custom | 
[**addInterests**](UserdbApi.md#addInterests) | **GET** /udb/{networkId}/interest/i.gif | 
[**addRetargetingSegment**](UserdbApi.md#addRetargetingSegment) | **GET** /udb/{networkId}/rt/{advertiserId}/{retargetingSegmentId}/i.gif | 
[**forget**](UserdbApi.md#forget) | **DELETE** /udb/{networkId} | 
[**gdprConsent**](UserdbApi.md#gdprConsent) | **POST** /udb/{networkId}/consent | 
[**ipOverride**](UserdbApi.md#ipOverride) | **GET** /udb/{networkId}/ip/i.gif | 
[**matchUser**](UserdbApi.md#matchUser) | **GET** /udb/{networkId}/sync/i.gif | 
[**optOut**](UserdbApi.md#optOut) | **GET** /udb/{networkId}/optout/i.gif | 
[**read**](UserdbApi.md#read) | **GET** /udb/{networkId}/read | 
[**setUserCookie**](UserdbApi.md#setUserCookie) | **GET** /udb/{networkId}/set/i.gif | 


<a name="addCustomProperties"></a>
# **addCustomProperties**
> addCustomProperties(azk, networkId, body)



Add Custom Properties to a User

### Example
```java
// Import classes:
import com.adzerk.sdk.generated.ApiClient;
import com.adzerk.sdk.generated.ApiException;
import com.adzerk.sdk.generated.Configuration;
import com.adzerk.sdk.generated.auth.*;
import com.adzerk.sdk.generated.models.*;
import com.adzerk.sdk.generated.api.UserdbApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://e-23.adzerk.net");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    UserdbApi apiInstance = new UserdbApi(defaultClient);
    String azk = "azk_example"; // String | The User's UserDB Key
    Integer networkId = 56; // Integer | Your Network Id
    Object body = null; // Object | 
    try {
      apiInstance.addCustomProperties(azk, networkId, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserdbApi#addCustomProperties");
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
 **azk** | **String**| The User&#39;s UserDB Key |
 **networkId** | **Integer**| Your Network Id |
 **body** | **Object**|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="addInterests"></a>
# **addInterests**
> addInterests(networkId, userKey, interest)



Add Interests to a User

### Example
```java
// Import classes:
import com.adzerk.sdk.generated.ApiClient;
import com.adzerk.sdk.generated.ApiException;
import com.adzerk.sdk.generated.Configuration;
import com.adzerk.sdk.generated.models.*;
import com.adzerk.sdk.generated.api.UserdbApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://e-23.adzerk.net");

    UserdbApi apiInstance = new UserdbApi(defaultClient);
    Integer networkId = 56; // Integer | Your Network Id
    String userKey = "userKey_example"; // String | The User's UserDB Key
    String interest = "interest_example"; // String | Comma Seperated list of interests
    try {
      apiInstance.addInterests(networkId, userKey, interest);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserdbApi#addInterests");
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
 **networkId** | **Integer**| Your Network Id |
 **userKey** | **String**| The User&#39;s UserDB Key |
 **interest** | **String**| Comma Seperated list of interests |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="addRetargetingSegment"></a>
# **addRetargetingSegment**
> addRetargetingSegment(azk, networkId, advertiserId, retargetingSegmentId)



Add User to a Retargeting Segment

### Example
```java
// Import classes:
import com.adzerk.sdk.generated.ApiClient;
import com.adzerk.sdk.generated.ApiException;
import com.adzerk.sdk.generated.Configuration;
import com.adzerk.sdk.generated.models.*;
import com.adzerk.sdk.generated.api.UserdbApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://e-23.adzerk.net");

    UserdbApi apiInstance = new UserdbApi(defaultClient);
    String azk = "azk_example"; // String | The User's UserDB Key
    Integer networkId = 56; // Integer | Your Network Id
    Integer advertiserId = 56; // Integer | The Advertiser's ID
    Integer retargetingSegmentId = 56; // Integer | The Segment's ID
    try {
      apiInstance.addRetargetingSegment(azk, networkId, advertiserId, retargetingSegmentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserdbApi#addRetargetingSegment");
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
 **azk** | **String**| The User&#39;s UserDB Key |
 **networkId** | **Integer**| Your Network Id |
 **advertiserId** | **Integer**| The Advertiser&#39;s ID |
 **retargetingSegmentId** | **Integer**| The Segment&#39;s ID |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="forget"></a>
# **forget**
> forget(networkId, userKey)



Forget User

### Example
```java
// Import classes:
import com.adzerk.sdk.generated.ApiClient;
import com.adzerk.sdk.generated.ApiException;
import com.adzerk.sdk.generated.Configuration;
import com.adzerk.sdk.generated.auth.*;
import com.adzerk.sdk.generated.models.*;
import com.adzerk.sdk.generated.api.UserdbApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://e-23.adzerk.net");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    UserdbApi apiInstance = new UserdbApi(defaultClient);
    Integer networkId = 56; // Integer | Your Network Id
    String userKey = "userKey_example"; // String | The User's UserDB Key
    try {
      apiInstance.forget(networkId, userKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserdbApi#forget");
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
 **networkId** | **Integer**| Your Network Id |
 **userKey** | **String**| The User&#39;s UserDB Key |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="gdprConsent"></a>
# **gdprConsent**
> gdprConsent(networkId, gdprConsent)



GDPR Consent

### Example
```java
// Import classes:
import com.adzerk.sdk.generated.ApiClient;
import com.adzerk.sdk.generated.ApiException;
import com.adzerk.sdk.generated.Configuration;
import com.adzerk.sdk.generated.auth.*;
import com.adzerk.sdk.generated.models.*;
import com.adzerk.sdk.generated.api.UserdbApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://e-23.adzerk.net");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    UserdbApi apiInstance = new UserdbApi(defaultClient);
    Integer networkId = 56; // Integer | Your Network Id
    GdprConsent gdprConsent = new GdprConsent(); // GdprConsent | 
    try {
      apiInstance.gdprConsent(networkId, gdprConsent);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserdbApi#gdprConsent");
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
 **networkId** | **Integer**| Your Network Id |
 **gdprConsent** | [**GdprConsent**](GdprConsent.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="ipOverride"></a>
# **ipOverride**
> Object ipOverride(networkId, azk, ip)



IP Address Override

### Example
```java
// Import classes:
import com.adzerk.sdk.generated.ApiClient;
import com.adzerk.sdk.generated.ApiException;
import com.adzerk.sdk.generated.Configuration;
import com.adzerk.sdk.generated.models.*;
import com.adzerk.sdk.generated.api.UserdbApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://e-23.adzerk.net");

    UserdbApi apiInstance = new UserdbApi(defaultClient);
    Integer networkId = 56; // Integer | Your Network Id
    String azk = "azk_example"; // String | The User's UserDB Key
    String ip = "ip_example"; // String | This is the IP to exclude
    try {
      Object result = apiInstance.ipOverride(networkId, azk, ip);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserdbApi#ipOverride");
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
 **networkId** | **Integer**| Your Network Id |
 **azk** | **String**| The User&#39;s UserDB Key |
 **ip** | **String**| This is the IP to exclude |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The updated UserDB record |  -  |

<a name="matchUser"></a>
# **matchUser**
> matchUser(azk, networkId, partnerId, userId)



User Matching

### Example
```java
// Import classes:
import com.adzerk.sdk.generated.ApiClient;
import com.adzerk.sdk.generated.ApiException;
import com.adzerk.sdk.generated.Configuration;
import com.adzerk.sdk.generated.models.*;
import com.adzerk.sdk.generated.api.UserdbApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://e-23.adzerk.net");

    UserdbApi apiInstance = new UserdbApi(defaultClient);
    String azk = "azk_example"; // String | The User's UserDB Key
    Integer networkId = 56; // Integer | Your Network Id
    Integer partnerId = 56; // Integer | The ID of the RTB provider in Adzerk. Contact Support if you don't have the ID.
    Integer userId = 56; // Integer | This is the UserID the individual RTB provider has of the user. This is NOT the UserDB userkey.
    try {
      apiInstance.matchUser(azk, networkId, partnerId, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserdbApi#matchUser");
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
 **azk** | **String**| The User&#39;s UserDB Key |
 **networkId** | **Integer**| Your Network Id |
 **partnerId** | **Integer**| The ID of the RTB provider in Adzerk. Contact Support if you don&#39;t have the ID. |
 **userId** | **Integer**| This is the UserID the individual RTB provider has of the user. This is NOT the UserDB userkey. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="optOut"></a>
# **optOut**
> optOut(azk, networkId)



Opt-Out a User

### Example
```java
// Import classes:
import com.adzerk.sdk.generated.ApiClient;
import com.adzerk.sdk.generated.ApiException;
import com.adzerk.sdk.generated.Configuration;
import com.adzerk.sdk.generated.models.*;
import com.adzerk.sdk.generated.api.UserdbApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://e-23.adzerk.net");

    UserdbApi apiInstance = new UserdbApi(defaultClient);
    String azk = "azk_example"; // String | The User's UserDB Key
    Integer networkId = 56; // Integer | Your Network Id
    try {
      apiInstance.optOut(azk, networkId);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserdbApi#optOut");
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
 **azk** | **String**| The User&#39;s UserDB Key |
 **networkId** | **Integer**| Your Network Id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Sucess |  -  |

<a name="read"></a>
# **read**
> Object read(azk, networkId)



Read a User&#39;s UserDB Record

### Example
```java
// Import classes:
import com.adzerk.sdk.generated.ApiClient;
import com.adzerk.sdk.generated.ApiException;
import com.adzerk.sdk.generated.Configuration;
import com.adzerk.sdk.generated.models.*;
import com.adzerk.sdk.generated.api.UserdbApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://e-23.adzerk.net");

    UserdbApi apiInstance = new UserdbApi(defaultClient);
    String azk = "azk_example"; // String | The User's UserDB Key
    Integer networkId = 56; // Integer | Your Network Id
    try {
      Object result = apiInstance.read(azk, networkId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserdbApi#read");
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
 **azk** | **String**| The User&#39;s UserDB Key |
 **networkId** | **Integer**| Your Network Id |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The UserDB record |  -  |

<a name="setUserCookie"></a>
# **setUserCookie**
> setUserCookie(networkId, userKey)



Set User Cookie

### Example
```java
// Import classes:
import com.adzerk.sdk.generated.ApiClient;
import com.adzerk.sdk.generated.ApiException;
import com.adzerk.sdk.generated.Configuration;
import com.adzerk.sdk.generated.models.*;
import com.adzerk.sdk.generated.api.UserdbApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://e-23.adzerk.net");

    UserdbApi apiInstance = new UserdbApi(defaultClient);
    Integer networkId = 56; // Integer | Your Network Id
    String userKey = "userKey_example"; // String | UserDB Id for the user
    try {
      apiInstance.setUserCookie(networkId, userKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserdbApi#setUserCookie");
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
 **networkId** | **Integer**| Your Network Id |
 **userKey** | **String**| UserDB Id for the user |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

