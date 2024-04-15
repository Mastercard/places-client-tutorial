# MerchantIndustryCodesApi

All URIs are relative to *https://api.mastercard.com/location-intelligence/places-locator*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllIndustryCodesUsingGET**](MerchantIndustryCodesApi.md#getAllIndustryCodesUsingGET) | **GET** /merchant-industry-codes | Get all active merchant industry codes
[**getByIndustryUsingGET**](MerchantIndustryCodesApi.md#getByIndustryUsingGET) | **GET** /merchant-industry-codes/industries/{industry} | Get merchant industry code details by industry code


<a name="getAllIndustryCodesUsingGET"></a>
# **getAllIndustryCodesUsingGET**
> PagedMerchantIndustryCode getAllIndustryCodesUsingGET(limit, offset, sort)

Get all active merchant industry codes

Returns a list of Merchant Industries ordered by Merchant Industry Codes or Merchant Industry Name depending on user input. The list will be ordered by Merchant Industry Name by default.

### Example
```java
// Import classes:
import com.mastercard.api.places.ApiClient;
import com.mastercard.api.places.ApiException;
import com.mastercard.api.places.Configuration;
import com.mastercard.api.places.models.*;
import com.mastercard.api.places.client.MerchantIndustryCodesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/location-intelligence/places-locator");

    MerchantIndustryCodesApi apiInstance = new MerchantIndustryCodesApi(defaultClient);
    Integer limit = 25; // Integer | Maximum number of items to return.
    Integer offset = 0; // Integer | Number of items to skip before returning the results.
    String sort = "+industryName"; // String | Sort order for the metrics. Use -field for sort by field descending and +field for sorting by field ascending. Multiple field are separated by ','.
    try {
      PagedMerchantIndustryCode result = apiInstance.getAllIndustryCodesUsingGET(limit, offset, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantIndustryCodesApi#getAllIndustryCodesUsingGET");
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
 **limit** | **Integer**| Maximum number of items to return. | [optional] [default to 25]
 **offset** | **Integer**| Number of items to skip before returning the results. | [optional] [default to 0]
 **sort** | **String**| Sort order for the metrics. Use -field for sort by field descending and +field for sorting by field ascending. Multiple field are separated by &#39;,&#39;. | [optional] [default to +industryName]

### Return type

[**PagedMerchantIndustryCode**](PagedMerchantIndustryCode.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved merchant industry codes |  -  |
**400** | Something was wrong with the request. |  -  |
**401** | Authentication information was missing or invalid. |  -  |
**403** | Insufficient permissions for interacting with the resource. |  -  |

<a name="getByIndustryUsingGET"></a>
# **getByIndustryUsingGET**
> MerchantIndustryCode getByIndustryUsingGET(industry)

Get merchant industry code details by industry code

Returns Merchant Industry code details by  Industry code

### Example
```java
// Import classes:
import com.mastercard.api.places.ApiClient;
import com.mastercard.api.places.ApiException;
import com.mastercard.api.places.Configuration;
import com.mastercard.api.places.models.*;
import com.mastercard.api.places.client.MerchantIndustryCodesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/location-intelligence/places-locator");

    MerchantIndustryCodesApi apiInstance = new MerchantIndustryCodesApi(defaultClient);
    String industry = "ACC"; // String | industry
    try {
      MerchantIndustryCode result = apiInstance.getByIndustryUsingGET(industry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantIndustryCodesApi#getByIndustryUsingGET");
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
 **industry** | **String**| industry |

### Return type

[**MerchantIndustryCode**](MerchantIndustryCode.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved merchant industry code details by industry code |  -  |
**400** | Something was wrong with the request. |  -  |
**401** | Authentication information was missing or invalid. |  -  |
**403** | Insufficient permissions for interacting with the resource. |  -  |
**404** | URI didn&#39;t match an existing resource. |  -  |

