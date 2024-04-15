# PlacesApi

All URIs are relative to *https://api.mastercard.com/location-intelligence/places-locator*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPlaceByLocationIdUsingGET**](PlacesApi.md#getPlaceByLocationIdUsingGET) | **GET** /places/{location_id} | Get the location details by using location id
[**searchPlacesUsingPOST**](PlacesApi.md#searchPlacesUsingPOST) | **POST** /places/searches | Search for places 


<a name="getPlaceByLocationIdUsingGET"></a>
# **getPlaceByLocationIdUsingGET**
> PlaceInfo getPlaceByLocationIdUsingGET(locationId)

Get the location details by using location id

Returns detailed information on merchants based on the provided, query parameter, locationId

### Example
```java
// Import classes:
import com.mastercard.api.places.ApiClient;
import com.mastercard.api.places.ApiException;
import com.mastercard.api.places.Configuration;
import com.mastercard.api.places.models.*;
import com.mastercard.api.places.client.PlacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/location-intelligence/places-locator");

    PlacesApi apiInstance = new PlacesApi(defaultClient);
    Long locationId = 300945305L; // Long | location_id
    try {
      PlaceInfo result = apiInstance.getPlaceByLocationIdUsingGET(locationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacesApi#getPlaceByLocationIdUsingGET");
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
 **locationId** | **Long**| location_id |

### Return type

[**PlaceInfo**](PlaceInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved detailed information on merchants based on the provided path parameter, locationId |  -  |
**400** | Something was wrong with the request. |  -  |
**401** | Authentication information was missing or invalid. |  -  |
**403** | Insufficient permissions for interacting with the resource. |  -  |
**404** | URI didn&#39;t match an existing resource. |  -  |

<a name="searchPlacesUsingPOST"></a>
# **searchPlacesUsingPOST**
> PagedPlaceInfo searchPlacesUsingPOST(placeSearchRequest, limit, offset)

Search for places 

Returns detailed information on merchants based on the provided, query parameter

### Example
```java
// Import classes:
import com.mastercard.api.places.ApiClient;
import com.mastercard.api.places.ApiException;
import com.mastercard.api.places.Configuration;
import com.mastercard.api.places.models.*;
import com.mastercard.api.places.client.PlacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/location-intelligence/places-locator");

    PlacesApi apiInstance = new PlacesApi(defaultClient);
    PlaceSearchRequest placeSearchRequest = new PlaceSearchRequest(); // PlaceSearchRequest | placeSearchRequest
    Integer limit = 25; // Integer | Maximum number of items to return.
    Integer offset = 0; // Integer | Number of items to skip before returning the results.
    try {
      PagedPlaceInfo result = apiInstance.searchPlacesUsingPOST(placeSearchRequest, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacesApi#searchPlacesUsingPOST");
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
 **placeSearchRequest** | [**PlaceSearchRequest**](PlaceSearchRequest.md)| placeSearchRequest |
 **limit** | **Integer**| Maximum number of items to return. | [optional] [default to 25]
 **offset** | **Integer**| Number of items to skip before returning the results. | [optional] [default to 0]

### Return type

[**PagedPlaceInfo**](PagedPlaceInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved search results |  -  |
**400** | Something was wrong with the request. |  -  |
**401** | Authentication information was missing or invalid. |  -  |
**403** | Insufficient permissions for interacting with the resource. |  -  |

