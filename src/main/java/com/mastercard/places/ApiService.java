package com.mastercard.places;

import com.mastercard.developer.interceptors.OkHttp2OAuth1Interceptor;
import com.mastercard.developer.utils.AuthenticationUtils;
import com.squareup.okhttp.Interceptor;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.MerchantCategoryCodesApi;
import org.openapitools.client.api.MerchantIndustryCodesApi;
import org.openapitools.client.api.PlacesApi;
import org.openapitools.client.model.MerchantCategoryCode;
import org.openapitools.client.model.MerchantIndustryCode;
import org.openapitools.client.model.PagedMerchantCategoryCode;
import org.openapitools.client.model.PagedMerchantIndustryCode;
import org.openapitools.client.model.PagedPlaceInfo;
import org.openapitools.client.model.PlaceInfo;
import org.openapitools.client.model.PlaceSearchRequest;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.List;

public class ApiService {
    private static final String API_BASE_PATH = "https://sandbox.api.mastercard.com/location-intelligence/places-locator";

    //Below properties will be required for authentication of API calls.
    private static final String CONSUMER_KEY = "Your consumer key"; // This refers to your consumer key. Copy it from "Keys" section on your project page in [Mastercard Developers](https://developer.mastercard.com/dashboard)
    private static final String SIGNING_KEY_ALIAS = "your key alias"; // This is the default value of key alias. If it is modified, use the updated one from keys section in [Mastercard Developers](https://developer.mastercard.com/dashboard).
    private static final String SIGNING_KEY_FILE_PATH = "path to your.p12 private key file"; // This refers to .p12 file found in the signing key. Please place .p12 file at src\main\resources in the project folder and add classpath for .p12 file.
    private static final String SIGNING_KEY_PASSWORD = "your password"; // This is the default value of key alias. If it is modified, use the updated one from keys section in [Mastercard Developers](https://developer.mastercard.com/dashboard).


    private final MerchantCategoryCodesApi merchantCategoryCodesApi;
    private final MerchantIndustryCodesApi merchantIndustryCodesApi;
    private final PlacesApi placesApi;

    public ApiService() throws CertificateException, UnrecoverableKeyException, NoSuchAlgorithmException, IOException, KeyStoreException, NoSuchProviderException {

        ApiClient client = new ApiClient();
        client.setBasePath(API_BASE_PATH); //If you use any other sandbox url then please add sbde/metrics-api as an extension
        client.setDebugging(true);

        PrivateKey signingKey = AuthenticationUtils.loadSigningKey(SIGNING_KEY_FILE_PATH, SIGNING_KEY_ALIAS, SIGNING_KEY_PASSWORD);

        List<Interceptor> interceptors = client.getHttpClient().networkInterceptors();
        interceptors.add(new Main.ForceJsonResponseInterceptor());
        interceptors.add(new OkHttp2OAuth1Interceptor(CONSUMER_KEY, signingKey));

        // Merchant Category Code API
        merchantCategoryCodesApi = new MerchantCategoryCodesApi(client);
        // Merchant Industry Code API
        merchantIndustryCodesApi = new MerchantIndustryCodesApi(client);
        // Places API
        placesApi = new PlacesApi(client);
    }

    public ApiService(
            MerchantCategoryCodesApi merchantCategoryCodesApi,
            MerchantIndustryCodesApi merchantIndustryCodesApi,
            PlacesApi placesApi
    ){
        this.merchantCategoryCodesApi = merchantCategoryCodesApi;
        this.merchantIndustryCodesApi = merchantIndustryCodesApi;
        this.placesApi = placesApi;
    }

    public PagedMerchantCategoryCode getPagedMerchantCategoryCodes(Integer limit, Integer offset, String sort) throws ApiException {
        return merchantCategoryCodesApi.getAllMerchantCategoryCodesUsingGet(limit, offset, sort);
    }

    public MerchantCategoryCode getMerchantCategoryCodeByCode(String merchantCategoryCode) throws ApiException {
        return merchantCategoryCodesApi.getByMccCodeUsingGET(merchantCategoryCode);
    }

    public PagedMerchantIndustryCode getPagedMerchantIndustryCodes(Integer limit, Integer offset, String sort) throws ApiException {
        return merchantIndustryCodesApi.getAllIndustryCodesUsingGET(limit, offset, sort);
    }

    public MerchantIndustryCode getMerchantIndustryCodeByCode(String industryCode) throws ApiException {
        return merchantIndustryCodesApi.getByIndustryUsingGET(industryCode);
    }

    public PlaceInfo getPlaceByLocationId (Long locationId) throws ApiException {
        return placesApi.getPlaceByLocationIdUsingGET(locationId);
    }

    public PagedPlaceInfo searchPlaces(PlaceSearchRequest request, Integer limit, Integer offset) throws ApiException{
        return placesApi.searchPlacesUsingPOST(request, limit, offset);
    }
}
