# MerchantCategoryCodesApi

All URIs are relative to *https://api.mastercard.com/location-intelligence/places-locator*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllMerchantCategoryCodesUsingGet**](MerchantCategoryCodesApi.md#getAllMerchantCategoryCodesUsingGet) | **GET** /merchant-category-codes | Get all active merchant category codes
[**getByMccCodeUsingGET**](MerchantCategoryCodesApi.md#getByMccCodeUsingGET) | **GET** /merchant-category-codes/mcc-codes/{mcc_code} | Get merchant category code by code


<a name="getAllMerchantCategoryCodesUsingGet"></a>
# **getAllMerchantCategoryCodesUsingGet**
> PagedMerchantCategoryCode getAllMerchantCategoryCodesUsingGet(limit, offset, sort)

Get all active merchant category codes

Returns a list of Merchant Category Codes ordered by Merchant Category Code or Merchant Category Name, depending on user input. The list will be ordered by Merchant Category Name by default.

### Example
```java
// Import classes:
import com.mastercard.api.places.ApiClient;
import com.mastercard.api.places.ApiException;
import com.mastercard.api.places.Configuration;
import com.mastercard.api.places.models.*;
import com.mastercard.api.places.client.MerchantCategoryCodesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/location-intelligence/places-locator");

    MerchantCategoryCodesApi apiInstance = new MerchantCategoryCodesApi(defaultClient);
    Integer limit = 25; // Integer | Maximum number of items to return.
    Integer offset = 0; // Integer | Number of items to skip before returning the results.
    String sort = "+merchantCategoryName"; // String | Sort order for the metrics. Use -field for sort by field descending and +field for sorting by field ascending. Multiple field are separated by ','.
    try {
      PagedMerchantCategoryCode result = apiInstance.getAllMerchantCategoryCodesUsingGet(limit, offset, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantCategoryCodesApi#getAllMerchantCategoryCodesUsingGet");
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
 **sort** | **String**| Sort order for the metrics. Use -field for sort by field descending and +field for sorting by field ascending. Multiple field are separated by &#39;,&#39;. | [optional] [default to +merchantCategoryName]

### Return type

[**PagedMerchantCategoryCode**](PagedMerchantCategoryCode.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved merchant category codes |  -  |
**400** | Something was wrong with the request. |  -  |
**401** | Authentication information was missing or invalid. |  -  |
**403** | Insufficient permissions for interacting with the resource. |  -  |

<a name="getByMccCodeUsingGET"></a>
# **getByMccCodeUsingGET**
> MerchantCategoryCode getByMccCodeUsingGET(mccCode)

Get merchant category code by code

Get merchant category code by code

### Example
```java
// Import classes:
import com.mastercard.api.places.ApiClient;
import com.mastercard.api.places.ApiException;
import com.mastercard.api.places.Configuration;
import com.mastercard.api.places.models.*;
import com.mastercard.api.places.client.MerchantCategoryCodesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/location-intelligence/places-locator");

    MerchantCategoryCodesApi apiInstance = new MerchantCategoryCodesApi(defaultClient);
    String mccCode = "0004"; // String | mcc_code
    try {
      MerchantCategoryCode result = apiInstance.getByMccCodeUsingGET(mccCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantCategoryCodesApi#getByMccCodeUsingGET");
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
 **mccCode** | **String**| mcc_code |

### Return type

[**MerchantCategoryCode**](MerchantCategoryCode.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | This code represents the category that a merchant location may be under and is supported by most payment providers |  -  |
**401** | Authentication information was missing or invalid. |  -  |
**403** | Insufficient permissions for interacting with the resource. |  -  |
**404** | URI didn&#39;t match an existing resource. |  -  |

