# Places API Tutorial Client
[![](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/Mastercard/loyalty-user-management-reference/blob/master/LICENSE)

## Table of Contents

- [Overview](#overview)
    * [Compatibility](#compatibility)
    * [References](#references)
    * [Tutorial](#tutorial)
    * [Frameworks](#frameworks)
- [Setup](#setup)
    * [Prerequisites](#prerequisites)
    * [Application Configuration](#configuration)
    * [Build and Execute](#build-and-execute)
    * [Reference Application Usage](#client-application-usage)
    * [Integrating with OpenAPI Generator](#integrating-with-openapi-generator)
- [Use Cases](#use-cases)
    * [Parameters](#parameters)
    * [MCC Codes](#mcc-codes)
    * [Industry Codes](#industry-codes)
    * [Places](#places)
- [API Reference](#api-reference)
- [Authentication](#authentication)
    * [Mastercard's OAuth Library](#oauth-library)
- [Glossary](#glossary)
- [Support](#support)
- [License](#license)

## Overview <a name="overview"/>
This project showcases the use case of retrieving places and related information using the Places API [here](https://developer.mastercard.com/places/documentation/)

### Compatibility <a name="compatibility"></a>
 * [Java 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) or later
 
### References <a name="references"></a>
* [Mastercard’s OAuth Signer library](https://github.com/Mastercard/oauth1-signer-java)
* [Using OAuth 1.0a to Access Mastercard APIs](https://developer.mastercard.com/platform/documentation/using-oauth-1a-to-access-mastercard-apis/)

### Tutorial <a name="tutorial"></a>
A tutorial can be found [here](https://developer.mastercard.com/places-v2/documentation/tutorials-and-guides/tutorials/places-api-client-tutorial/) for setting up and using this service.

## Frameworks <a name="frameworks"></a>
- OpenAPI Generator
- [Java 8+](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)

## Setup <a name="setup"></a>

### Prerequisites <a name="prerequisites"></a>

* [Mastercard Developers Account](https://developer.mastercard.com/dashboard)
* A text editor or IDE
* [Java 8+](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
* [Apache Maven 3.3+](https://maven.apache.org/download.cgi)
* Set up the `JAVA_HOME` environment variable to match the location of your Java installation.

### Application Configuration <a name="configuration"> </a>
1. Create an account at [Mastercard Developers](https://developer.mastercard.com).
2. Create a new project and add the `Places` API to your project.
    * A zip file will be downloaded automatically with your keys.
3. Take note of the given **consumer key, keyalias, and keystore password** given upon the project creation.
4. Copy the downloaded `.p12` file to `/src/main/resources`.
5. Update the properties found in `src/main/java/com/mastercard/places/ApiService.java`.

```java
    private static final String API_BASE_PATH = "https://sandbox.api.mastercard.com/location-intelligence/places-locator";

    //Below properties will be required for authentication of API calls.
    private static final String CONSUMER_KEY = "Your consumer key"; // This refers to your consumer key. Copy it from "Keys" section on your project page in [Mastercard Developers](https://developer.mastercard.com/dashboard)
    private static final String SIGNING_KEY_ALIAS = "your key alias"; // This is the default value of key alias. If it is modified, use the updated one from keys section in [Mastercard Developers](https://developer.mastercard.com/dashboard).
    private static final String SIGNING_KEY_FILE_PATH = "path to your.p12 private key file"; // This refers to .p12 file found in the signing key. Please place .p12 file at src\main\resources in the project folder and add classpath for .p12 file.
    private static final String SIGNING_KEY_PASSWORD = "your password"; // This is the default value of key alias. If it is modified, use the updated one from keys section in [Mastercard Developers](https://developer.mastercard.com/dashboard).

```
6. Run `mvn clean compile` from the root of the project directory.
    * When compile is run, the [OpenAPI Generator plugin](#integrating-with-openapi-generator) will generate the sources for connecting to the Places API.
7. run `mvn exec:java -Dexec.mainClass="com.mastercard.places.Main"` to run the project.

## Client Application Usage <a name="clinet-application-usage"></a>
You make the API call by calling getAllMerchantCategoryCodesUsingGet, getByMccCodeUsingGET, getAllIndustryCodesUsingGET, getByIndustryUsingGET, getPlaceByLocationIdUsingGET, searchPlacesUsingPOST and then store the response in a response object. 
Once you have the response stored, you have a couple of options, but for this client app you can simply use toString to print the body.

### Integrating with OpenAPI Generator <a name="integrating-with-openapi-generator"></a>
[OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator) generates API client libraries from [OpenAPI Specs](https://github.com/OAI/OpenAPI-Specification). 
It provides generators and library templates for supporting multiple languages and frameworks.

See also:
* [OpenAPI Generator (maven Plugin)](https://mvnrepository.com/artifact/org.openapitools/openapi-generator-maven-plugin)
* [OpenAPI Generator (executable)](https://mvnrepository.com/artifact/org.openapitools/openapi-generator-cli)
* [CONFIG OPTIONS for java](https://github.com/OpenAPITools/openapi-generator/blob/master/docs/generators/java.md)

#### OpenAPI Generator Plugin Configuration
```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.openapitools</groupId>
            <artifactId>openapi-generator-maven-plugin</artifactId>
            <version>3.3.4</version>
            <executions>
                <execution>
                    <id>Location Intelligence Places REST Client</id>
                    <goals>
                        <goal>generate</goal>
                    </goals>
                    <configuration>
                        <inputSpec>${project.basedir}/src/main/resources/places-api-spec.yaml</inputSpec>
                        <generatorName>java</generatorName>
                        <!-- No "library" element here means the plugin will use the default library template ("okhttp-gson") -->
                        <configOptions>
                            <sourceFolder>src/gen/java/main</sourceFolder>
                            <dateLibrary>java8</dateLibrary>
                        </configOptions>
                    </configuration>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```

## Use Cases <a name="use-cases"></a>

#### Parameters <a name="parameters"></a>
These are the parameters used for the Places API. All parameters are optional.

| Name      | Type      | Default Value      | Purpose       |
|-----------|-----------|--------------------|---------------|
| offset    | int       | 0                  | For Pagination; offset is used to offset the start of the list.        |
| limit     | int       | 25                 | For Pagination; limit is used to limit the number of entities returned |
| sort      | string    | +merchantCategoryCode **or** +industryName                 | Sorts the results + for ascending, - for descending and any property from the result. |

### MCC Codes <a name="mcc-codes"></a>
> Get a paginated list of all Merchant Category Codes. 

| URL       | Method        | Parameters        | Request Model | Response model|
|-----------|---------------|-------------------|---------------|---------------|
|/merchant-category-codes| GET | offset, limit, sort | -        | PageResponseMerchantCategoryCode |

> Get information on a specific Merchant Category code. 

| URL       | Method        | Parameters        | Request Model | Response model|
|-----------|---------------|-------------------|---------------|---------------|
|/merchant-category-codes/mcc-codes/{mccCode}   | GET | -    | int             | MerchantCategoryCode |

### Industry Codes <a name="industry-codes"></a>
> Get a paginated list of all Industry Codes. 

| URL       | Method        | Parameters        | Request Model | Response model|
|-----------|---------------|-------------------|---------------|---------------|
|/merchant-industry-codes| GET | offset, limit, sort | -        | PageResponseMerchantIndustryCode |

> Get information on a specific Industry code. 

| URL       | Method        | Parameters        | Request Model | Response model|
|-----------|---------------|-------------------|---------------|---------------|
|/merchant-industry-codes/industries/{industryCode}| GET | -    | string             | MerchantIndustryCode |

### Places <a name="places"></a>
> Get a paginated list of places that fit the search criteria. 

| URL       | Method        | Parameters        | Request Model | Response model|
|-----------|---------------|-------------------|---------------|---------------|
|/places/searches| POST     | offset, limit     | PlaceSearchRequest    | PageResponsePlaceInfo |

> Get information on a specific Industry code. 

| URL       | Method        | Parameters        | Request Model | Response model|
|-----------|---------------|-------------------|---------------|---------------|
|/places/{location_id}| GET | -    | int                          | placeInfo |

## API Reference <a name="api-reference"></a>

See the [API Reference](https://developer.mastercard.com/places/documentation/api-reference/) page in the documentation. 

| API Endpoint                  | Description                                                       |
| ----------------------------- | ----------------------------------------------------------------- |
| [Places Search](https://developer.mastercard.com/places/documentation/api-reference#api)                 | Search for locations around specific coordinates or using a large set of filterable fields |
| [Get Places Details](https://developer.mastercard.com/places/documentation/api-reference#api)            | List all details for a location based on location id              |
| [Get Merchant Category Codes](https://developer.mastercard.com/places/documentation/api-reference#api)   | List all known Merchant Category Codes (mcc)                      |
| [Merchant Category Code Search](https://developer.mastercard.com/places/documentation/api-reference#api) | Lists details about Category Code                                 |
| [Get Industry codes](https://developer.mastercard.com/places/documentation/api-reference#api)            | Lists all known Industry Codes                                    |
| [Industry Codes Search](https://developer.mastercard.com/places/documentation/api-reference#api)         | Lists details about Industry Code                                 |

## Authentication <a name="authentication"></a>

### Mastercard oauth1 Signer Library <a name="oauth-library"></a>
This dependency is required to properly call the API.
```xml
<dependency>
    <groupId>com.mastercard.developer</groupId>
    <artifactId>oauth1-signer</artifactId>
    <version>1.2.3</version>
</dependency>
```
[Link to the oauth1 library's Github](https://github.com/Mastercard/oauth1-signer-java)

[Looking for other languages?](https://github.com/Mastercard?q=oauth&type=&language=)

See the code used in this application to utilize the library.

``` Java
public ApiClient signRequest() {
    ApiClient client = new ApiClient();
    client.setBasePath(basePath);
    client.setHttpClient(
        client.getHttpClient()
              .newBuilder()
              .addInterceptor(new OkHttpOAuth1Interceptor(consumerKey, getSigningKey()))
              .build()
        ); 
    return client;
}
```

## Glossary <a name="glossary"></a>
|Acronym    | Meaning   |
|----------|-----------|
|mcc    | Merchant Category Codes

## Support <a name="support"></a>
If you would like further information, please send an email to apisupport@mastercard.com

## License <a name="license"></a>
Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 
       http://www.apache.org/licenses/LICENSE-2.0
 
Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

## API Usage
Places provides transaction-based location insights to consumers to improve decisions about seasonal businesses, daily store openings, top rated restaurants, and local favorites. 

The endpoints `/places/{location_id}` and `/places/searches` provide place details for the information you provide.

The `/merchant-category-codes`, `/merchant-category-codes/mcc-codes/{mccCode}`, `/merchant-industry-codes` and `/merchant-industry-codes/industries/{industryCode}` endpoints will retrieve places related information for you to use in the places search endpoint as a search criteria.

## License
[Apache 2 License](https://apache.org/licenses/LICENSE-2.0)

**Copyright © 1994-2020, All Right Reserved by Mastercard.**
