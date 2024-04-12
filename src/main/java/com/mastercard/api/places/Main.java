package com.mastercard.api.places;


import com.mastercard.api.places.client.MerchantCategoryCodesApi;
import com.mastercard.api.places.client.MerchantIndustryCodesApi;
import com.mastercard.api.places.client.PlacesApi;
import com.mastercard.api.places.model.MerchantCategoryCode;
import com.mastercard.api.places.model.MerchantIndustryCode;
import com.mastercard.api.places.model.PagedMerchantCategoryCode;
import com.mastercard.api.places.model.PagedMerchantIndustryCode;
import com.mastercard.api.places.model.PagedPlaceInfo;
import com.mastercard.api.places.model.PlaceFilter;
import com.mastercard.api.places.model.PlaceInfo;
import com.mastercard.api.places.model.PlaceSearchRequest;
import com.mastercard.developer.interceptors.OkHttpOAuth1Interceptor;
import com.mastercard.developer.utils.AuthenticationUtils;

import java.security.PrivateKey;

public class Main {

    private static final String BASE_URL = "https://sandbox.api.mastercard.com/locations/merchants";
    private static final String CONSUMER_KEY = "yourconsumerkeystring";
    private static final String PKCS_12_KEY_FILE_PATH = "./path/to/your/signing-key.p12";
    private static final String SIGNIN_KEY_ALIAS = "yourkeyalias";
    private static final String SIGNIN_KEY_PASSWORD = "yourpassword";

    public static void main(String[] args) throws Exception  {

        try {

            PrivateKey signingKey = AuthenticationUtils.loadSigningKey(PKCS_12_KEY_FILE_PATH, SIGNIN_KEY_ALIAS, SIGNIN_KEY_PASSWORD);

            ApiClient client = new ApiClient();
            client.setBasePath(BASE_URL);
            client.setConnectTimeout(60);
            client.setDebugging(false);
            client.setHttpClient(client
                    .getHttpClient()
                    .newBuilder()
                    .addInterceptor(new OkHttpOAuth1Interceptor(CONSUMER_KEY, signingKey))
                    .build()
            );

            System.out.println("-------------------------------------------------------------- " );
            System.out.println("Test #1 : Get all Merchant Category Codes" );
            MerchantCategoryCodesApi apiMerchantCategoryCodesInstance = new MerchantCategoryCodesApi(client);
            PagedMerchantCategoryCode merchantCategoryCodesResponse = apiMerchantCategoryCodesInstance.getAllMerchantCategoryCodesUsingGet(null, null, null);
            System.out.println("Test #1 : Result structure: ");
            System.out.println(merchantCategoryCodesResponse);

            System.out.println("-------------------------------------------------------------- " );
            System.out.println("Test #2 : Get a specific Merchant Category Code" );
            MerchantCategoryCode merchantCategoryCode  = apiMerchantCategoryCodesInstance.getByMccCodeUsingGET("0004");
            System.out.println("Test #2 : Result structure: ");
            System.out.println(merchantCategoryCode);

            System.out.println("-------------------------------------------------------------- " );
            System.out.println("Test #3 : Get all Merchant Industry Codes" );
            MerchantIndustryCodesApi apiMerchantIndustryCodesInstance = new MerchantIndustryCodesApi(client);
            PagedMerchantIndustryCode merchantIndustryCodesResponse = apiMerchantIndustryCodesInstance.getAllIndustryCodesUsingGET(null, null, null);
            System.out.println("Test #3 : Result structure: ");
            System.out.println(merchantIndustryCodesResponse);

            System.out.println("-------------------------------------------------------------- " );
            System.out.println("Test #4 : Get a specific Merchant Industry Code" );
            MerchantIndustryCode merchantIndustryCode  = apiMerchantIndustryCodesInstance.getByIndustryUsingGET("ACC");
            System.out.println("Test #4 : Result structure: ");
            System.out.println(merchantIndustryCode);

            System.out.println("-------------------------------------------------------------- " );
            System.out.println("Test #5 : Get Place detail" );
            PlacesApi apiPlacesApiInstance = new PlacesApi(client);
            PlaceInfo placeInfoResponse = apiPlacesApiInstance.getPlaceByLocationIdUsingGET(300945305L);
            System.out.println("Test #5 : Result structure: ");
            System.out.println(placeInfoResponse);


            System.out.println("-------------------------------------------------------------- " );
            System.out.println("Test #6 : Places Search by geo code.  ie... Latitude/Longitude" );
            PlaceSearchRequest placeSearchRequest = new PlaceSearchRequest();
            placeSearchRequest.setRadiusSearch(true);
            placeSearchRequest.setDistance(15L);
            placeSearchRequest.setUnit(PlaceSearchRequest.UnitEnum.MILE);
            PlaceFilter placeFilter = new PlaceFilter();
            placeFilter.setCountryCode("US");
            placeFilter.setLatitude("38.7468239");
            placeFilter.setLongitude("-90.7460708");
            placeSearchRequest.setPlace(placeFilter);
            PagedPlaceInfo pagedPlaceInfoResponse = apiPlacesApiInstance.searchPlacesUsingPOST(placeSearchRequest, 10, 0);
            System.out.println("Test #6 : Result structure: ");
            System.out.println(pagedPlaceInfoResponse);

            System.out.println("-------------------------------------------------------------- " );
            System.out.println("Test #7 : Places Search to retrieve restaurants in area");
            PlaceSearchRequest placeSearchRequestRestaurant = new PlaceSearchRequest();
            placeSearchRequestRestaurant.setRadiusSearch(false);
            placeSearchRequestRestaurant.setDistance(15L);
            placeSearchRequestRestaurant.setUnit(PlaceSearchRequest.UnitEnum.MILE);
            PlaceFilter placeFilterRest = new PlaceFilter();
            placeFilterRest.setCountryCode("US");
            placeFilterRest.setCityName("O FALLON");
            placeFilterRest.setStateProvinceCode("MO");
            placeFilterRest.setIndustry("EAP");
            placeSearchRequestRestaurant.setPlace(placeFilterRest);
            PagedPlaceInfo pagedPlaceInfoRestResponse = apiPlacesApiInstance.searchPlacesUsingPOST(placeSearchRequestRestaurant, 10, 0);
            System.out.println("Test #7 : Result structure: ");
            System.out.println(pagedPlaceInfoRestResponse);

        } catch (ApiException e) {
            System.err.println("Exception when calling Apis");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }

}