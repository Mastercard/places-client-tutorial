# Places API Client
[![](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/Mastercard/loyalty-user-management-reference/blob/master/LICENSE)


## Overview <a name="overview"/>
This project showcases the use case of retrieving location data and related information using the Places API [here](https://developer.mastercard.com/places/documentation/)

### Compatibility <a name="compatibility"></a>
* [Java 11](https://www.oracle.com/java/technologies/downloads/#java11) or later

### References <a name="references"></a>
* [Mastercard’s OAuth Signer library](https://github.com/Mastercard/oauth1-signer-java)
* [Using OAuth 1.0a to Access Mastercard APIs](https://developer.mastercard.com/platform/documentation/using-oauth-1a-to-access-mastercard-apis/)

### Tutorial <a name="tutorial"></a>
A tutorial can be found [here](https://developer.mastercard.com/places/documentation/tutorials-and-guides/tutorials/places-api-client-tutorial/) for setting up and using this service.

## Frameworks <a name="frameworks"></a>
- OpenAPI Generator
- [Java 11+](https://www.oracle.com/java/technologies/downloads/#java11)
- [Maven](https://maven.apache.org/download.cgi)

## Setup <a name="setup"></a>

### Prerequisites <a name="prerequisites"></a>

* [Mastercard Developers Account](https://developer.mastercard.com/dashboard)
* A text editor or IDE
* [Java 11+](https://www.oracle.com/java/technologies/downloads/#java11)
* [Apache Maven 3.3+](https://maven.apache.org/download.cgi)
* Set up the `JAVA_HOME` environment variable to match the location of your Java installation.

### Application Configuration <a name="configuration"> </a>
1. Create an account at [Mastercard Developers](https://developer.mastercard.com).
2. Copy the [Places API Spec](https://developer.mastercard.com/places/documentation/api-reference/) (`places-api-spec.yaml`) to `/src/main/resources`.
3. Create a new project and add the 'Places' API to your project.
4. Take note of the given **consumer key, keyalias, and keystore password** given upon the project creation.
5. Copy the downloaded `.p12` file to `/src/main/resources`.
6. Update the properties found in `src/main/java/com/mastercard/api/places/Main.java`.

```java
    private static final String BASE_URL = "https://sandbox.api.mastercard.com/location-intelligence/places-locator";

    //Below properties will be required for authentication of API calls.
    private static final String CONSUMER_KEY = "Your consumer key"; // This refers to your consumer key. Copy it from "Keys" section on your project page in [Mastercard Developers](https://developer.mastercard.com/dashboard)
    private static final String SIGNING_KEY_ALIAS = "your key alias"; // This is the default value of key alias. If it is modified, use the updated one from keys section in [Mastercard Developers](https://developer.mastercard.com/dashboard).
    private static final String SIGNING_KEY_FILE_PATH = "path to your.p12 private key file"; // This refers to .p12 file found in the signing key. Please place .p12 file at src\main\resources in the project folder and add classpath for .p12 file.
    private static final String SIGNING_KEY_PASSWORD = "your password"; // This is the default value of key alias. If it is modified, use the updated one from keys section in [Mastercard Developers](https://developer.mastercard.com/dashboard).
```

7. run `mvn compile exec:java` to run the project.



## Documentation for API Endpoints

All URIs are relative to *https://api.mastercard.com/location-intelligence/places-locator*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MerchantCategoryCodesApi* | [**getAllMerchantCategoryCodesUsingGet**](docs/MerchantCategoryCodesApi.md#getAllMerchantCategoryCodesUsingGet) | **GET** /merchant-category-codes | Get all active merchant category codes
*MerchantCategoryCodesApi* | [**getByMccCodeUsingGET**](docs/MerchantCategoryCodesApi.md#getByMccCodeUsingGET) | **GET** /merchant-category-codes/mcc-codes/{mcc_code} | Get merchant category code by code
*MerchantIndustryCodesApi* | [**getAllIndustryCodesUsingGET**](docs/MerchantIndustryCodesApi.md#getAllIndustryCodesUsingGET) | **GET** /merchant-industry-codes | Get all active merchant industry codes
*MerchantIndustryCodesApi* | [**getByIndustryUsingGET**](docs/MerchantIndustryCodesApi.md#getByIndustryUsingGET) | **GET** /merchant-industry-codes/industries/{industry} | Get merchant industry code details by industry code
*PlacesApi* | [**getPlaceByLocationIdUsingGET**](docs/PlacesApi.md#getPlaceByLocationIdUsingGET) | **GET** /places/{location_id} | Get the location details by using location id
*PlacesApi* | [**searchPlacesUsingPOST**](docs/PlacesApi.md#searchPlacesUsingPOST) | **POST** /places/searches | Search for places 


## Documentation for Models

 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [ErrorResponseErrors](docs/ErrorResponseErrors.md)
 - [MerchantCategoryCode](docs/MerchantCategoryCode.md)
 - [MerchantIndustryCode](docs/MerchantIndustryCode.md)
 - [PageResponse](docs/PageResponse.md)
 - [PagedMerchantCategoryCode](docs/PagedMerchantCategoryCode.md)
 - [PagedMerchantCategoryCodeAllOf](docs/PagedMerchantCategoryCodeAllOf.md)
 - [PagedMerchantIndustryCode](docs/PagedMerchantIndustryCode.md)
 - [PagedMerchantIndustryCodeAllOf](docs/PagedMerchantIndustryCodeAllOf.md)
 - [PagedPlaceInfo](docs/PagedPlaceInfo.md)
 - [PagedPlaceInfoAllOf](docs/PagedPlaceInfoAllOf.md)
 - [PlaceFilter](docs/PlaceFilter.md)
 - [PlaceInfo](docs/PlaceInfo.md)
 - [PlaceSearchRequest](docs/PlaceSearchRequest.md)


## Support <a name="support"></a>
If you would like further information, please send an email to apisupport@mastercard.com

## API Usage
Places provides transaction-based location insights to consumers to improve decisions about seasonal businesses, daily store openings, top rated restaurants, and local favorites.

The endpoints `/places/{location_id}` and `/places/searches` provide place details for the information you provide.

The `/merchant-category-codes`, `/merchant-category-codes/mcc-codes/{mccCode}`, `/merchant-industry-codes` and `/merchant-industry-codes/industries/{industryCode}` endpoints will retrieve places related information for you to use in the places search endpoint as a search criteria.

## License
[Apache 2 License](https://apache.org/licenses/LICENSE-2.0)

**Copyright © 1994-2020, All Right Reserved by Mastercard.**

