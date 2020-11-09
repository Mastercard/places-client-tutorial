package com.mastercard.places;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.openapitools.client.model.MerchantCategoryCode;
import org.openapitools.client.model.MerchantIndustryCode;
import org.openapitools.client.model.PagedMerchantCategoryCode;
import org.openapitools.client.model.PagedMerchantIndustryCode;
import org.openapitools.client.model.PagedPlaceInfo;
import org.openapitools.client.model.PlaceFilter;
import org.openapitools.client.model.PlaceInfo;
import org.openapitools.client.model.PlaceSearchRequest;

import java.io.IOException;

public class Main {
    private static ApiService apiService;

    protected static void setApiService(ApiService apiService) {
        Main.apiService = apiService;
    }

    public static void main(String[] args) throws Exception {

        if (apiService == null) {
            apiService = new ApiService();
        }

        // Places API's
        // Get Places based on search criteria

        // Prepare search request object
        PlaceSearchRequest placeSearchRequest = new PlaceSearchRequest();
        PlaceFilter placeFilter = new PlaceFilter();
        placeFilter.setCountryCode("US");
        placeFilter.setCityName("O Fallon");

        placeSearchRequest.setPlace(placeFilter);
        placeSearchRequest.setRadiusSearch(false);

        PagedPlaceInfo pagedPlaceInfo = apiService.searchPlaces(placeSearchRequest, 10, 0);
        System.out.println(pagedPlaceInfo.toString());

        // Get the Place Info by Location Id
        PlaceInfo placeInfo = apiService.getPlaceByLocationId(300945305L);
        System.out.println(placeInfo.toString());

        // Merchant Category Code API's

        // Get Merchant Category Codes
        PagedMerchantCategoryCode pagedMerchantCategoryCode = apiService.getPagedMerchantCategoryCodes(
                25,
                0,
                "-merchantCategoryCode"
        );
        System.out.println(pagedMerchantCategoryCode.toString());

        // Get Merchant Category Code by Code
        MerchantCategoryCode merchantCategoryCode = apiService.getMerchantCategoryCodeByCode("0004");
        System.out.println(merchantCategoryCode);

        // Merchant Industry Code API's

        // Get Merchant Industry Codes
        PagedMerchantIndustryCode pagedMerchantIndustryCode = apiService.getPagedMerchantIndustryCodes(
                25,
                0,
                "+industry"
        );
        System.out.println(pagedMerchantIndustryCode.toString());


        // Get Merchant Industry Codes
        MerchantIndustryCode merchantIndustryCode = apiService.getMerchantIndustryCodeByCode("ACC");
        System.out.println(merchantIndustryCode);
    }

    protected static class ForceJsonResponseInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request originalRequest = chain.request();
            System.out.println("===========" + originalRequest + "\n");

            String withJsonFormatUrl = withJsonFormat(originalRequest.uri().toString());
            Request newRequest = originalRequest.newBuilder().url(withJsonFormatUrl).build();
            return chain.proceed(newRequest);
        }

        private String withJsonFormat(String uri) {
            StringBuilder newUri = new StringBuilder(uri);
            newUri.append(uri.contains("?") ? "&" : "?");
            newUri.append("Format=JSON");
            return newUri.toString();
        }
    }
}
