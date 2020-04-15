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
> File addCustomProperties(networkId, userKey, body)



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
    Integer networkId = 56; // Integer | Your Network Id
    String userKey = "userKey_example"; // String | The User's UserDB Key
    Object body = null; // Object | 
    try {
      File result = apiInstance.addCustomProperties(networkId, userKey, body);
      System.out.println(result);
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
 **networkId** | **Integer**| Your Network Id |
 **userKey** | **String**| The User&#39;s UserDB Key |
 **body** | **Object**|  | [optional]

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: image/gif

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="addInterests"></a>
# **addInterests**
> File addInterests(networkId, userKey, interest)



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
      File result = apiInstance.addInterests(networkId, userKey, interest);
      System.out.println(result);
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

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/gif

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="addRetargetingSegment"></a>
# **addRetargetingSegment**
> File addRetargetingSegment(networkId, advertiserId, retargetingSegmentId, userKey)



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
    Integer networkId = 56; // Integer | Your Network Id
    Integer advertiserId = 56; // Integer | The Advertiser's ID
    Integer retargetingSegmentId = 56; // Integer | The Segment's ID
    String userKey = "userKey_example"; // String | The User's UserDB Key
    try {
      File result = apiInstance.addRetargetingSegment(networkId, advertiserId, retargetingSegmentId, userKey);
      System.out.println(result);
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
 **networkId** | **Integer**| Your Network Id |
 **advertiserId** | **Integer**| The Advertiser&#39;s ID |
 **retargetingSegmentId** | **Integer**| The Segment&#39;s ID |
 **userKey** | **String**| The User&#39;s UserDB Key |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/gif

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
> File gdprConsent(networkId, consentRequest)



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
    ConsentRequest consentRequest = new ConsentRequest(); // ConsentRequest | 
    try {
      File result = apiInstance.gdprConsent(networkId, consentRequest);
      System.out.println(result);
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
 **consentRequest** | [**ConsentRequest**](ConsentRequest.md)|  | [optional]

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: image/gif

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="ipOverride"></a>
# **ipOverride**
> File ipOverride(networkId, userKey, ip)



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
    String userKey = "userKey_example"; // String | The User's UserDB Key
    String ip = "ip_example"; // String | This is the IP to exclude
    try {
      File result = apiInstance.ipOverride(networkId, userKey, ip);
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
 **userKey** | **String**| The User&#39;s UserDB Key |
 **ip** | **String**| This is the IP to exclude |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/gif

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The updated UserDB record |  -  |

<a name="matchUser"></a>
# **matchUser**
> File matchUser(networkId, userKey, partnerId, userId)



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
    Integer networkId = 56; // Integer | Your Network Id
    String userKey = "userKey_example"; // String | The User's UserDB Key
    Integer partnerId = 56; // Integer | The ID of the RTB provider in Adzerk. Contact Support if you don't have the ID.
    Integer userId = 56; // Integer | This is the UserID the individual RTB provider has of the user. This is NOT the UserDB userkey.
    try {
      File result = apiInstance.matchUser(networkId, userKey, partnerId, userId);
      System.out.println(result);
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
 **networkId** | **Integer**| Your Network Id |
 **userKey** | **String**| The User&#39;s UserDB Key |
 **partnerId** | **Integer**| The ID of the RTB provider in Adzerk. Contact Support if you don&#39;t have the ID. |
 **userId** | **Integer**| This is the UserID the individual RTB provider has of the user. This is NOT the UserDB userkey. |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/gif

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="optOut"></a>
# **optOut**
> File optOut(networkId, userKey)



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
    Integer networkId = 56; // Integer | Your Network Id
    String userKey = "userKey_example"; // String | The User's UserDB Key
    try {
      File result = apiInstance.optOut(networkId, userKey);
      System.out.println(result);
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
 **networkId** | **Integer**| Your Network Id |
 **userKey** | **String**| The User&#39;s UserDB Key |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/gif

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Sucess |  -  |

<a name="read"></a>
# **read**
> Object read(networkId, userKey)



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
    Integer networkId = 56; // Integer | Your Network Id
    String userKey = "userKey_example"; // String | The User's UserDB Key
    try {
      Object result = apiInstance.read(networkId, userKey);
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
 **networkId** | **Integer**| Your Network Id |
 **userKey** | **String**| The User&#39;s UserDB Key |

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
> File setUserCookie(networkId, userKey)



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
      File result = apiInstance.setUserCookie(networkId, userKey);
      System.out.println(result);
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

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/gif

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

