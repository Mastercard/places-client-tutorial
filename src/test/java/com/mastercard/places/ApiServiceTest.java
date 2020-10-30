package com.mastercard.places;


import org.junit.Before;
import org.junit.Test;
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

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.when;

public class ApiServiceTest {

    private MerchantCategoryCodesApi merchantCategoryCodesApi = mock(MerchantCategoryCodesApi.class);
    private MerchantIndustryCodesApi merchantIndustryCodesApi = mock(MerchantIndustryCodesApi.class);
    private PlacesApi placesApi = mock(PlacesApi.class);

    private ApiService apiService = new ApiService(
            merchantCategoryCodesApi,
            merchantIndustryCodesApi,
            placesApi
    );

    @Before
    public void setUp() {
        reset(
                merchantCategoryCodesApi,
                merchantIndustryCodesApi,
                placesApi
        );
    }

    @Test
    public void testGetPagedMerchantCategoryCodes() throws ApiException {
        // arrange
        PagedMerchantCategoryCode expected = new PagedMerchantCategoryCode();
        List<MerchantCategoryCode> expectedMerchantCategoryCodes = new ArrayList<>();
        expectedMerchantCategoryCodes.add(new MerchantCategoryCode().merchantCategoryCode("0001").merchantCategoryName("Test Merchant Code"));
        expected.setLimit(25);
        expected.setOffset(0);
        expected.setItems(expectedMerchantCategoryCodes);


        when(merchantCategoryCodesApi.getAllMerchantCategoryCodesUsingGet(25, 0, "+merchantCategoryCode"))
                .thenReturn(expected);

        // act
        PagedMerchantCategoryCode result = apiService.getPagedMerchantCategoryCodes(25, 0, "+merchantCategoryCode");

        // assert
        assertEquals(expected, result);
    }

    @Test
    public void testGetMerchantCategoryCodeByCode() throws ApiException {

        // arrange
        MerchantCategoryCode expected = new MerchantCategoryCode().merchantCategoryCode("0001").merchantCategoryName("Test Merchant Code");


        when(merchantCategoryCodesApi.getByMccCodeUsingGET("0001"))
                .thenReturn(expected);

        // act
        MerchantCategoryCode result = apiService.getMerchantCategoryCodeByCode("0001");

        // assert
        assertEquals(expected, result);
    }

    @Test
    public void testGetPagedMerchantIndustryCodes() throws ApiException {
        // arrange
        PagedMerchantIndustryCode expected = new PagedMerchantIndustryCode();
        List<MerchantIndustryCode> expectedMerchantIndustryCodes = new ArrayList<>();
        expectedMerchantIndustryCodes.add(new MerchantIndustryCode().industry("TST").industryName("Test Industry Code"));
        expected.setLimit(25);
        expected.setOffset(0);
        expected.setItems(expectedMerchantIndustryCodes);


        when(merchantIndustryCodesApi.getAllIndustryCodesUsingGET(25, 0, "+industry"))
                .thenReturn(expected);

        // act
        PagedMerchantIndustryCode result = apiService.getPagedMerchantIndustryCodes(25, 0, "+industry");

        // assert
        assertEquals(expected, result);
    }

    @Test
    public void testGetMerchantIndustryCodeByCode() throws ApiException {
        // arrange
        MerchantIndustryCode expected = new MerchantIndustryCode().industry("TST").industryName("Test Industry Code");


        when(merchantIndustryCodesApi.getByIndustryUsingGET("TST"))
                .thenReturn(expected);

        // act
        MerchantIndustryCode result = apiService.getMerchantIndustryCodeByCode("TST");

        // assert
        assertEquals(expected, result);
    }

    @Test
    public void testGetPlaceByLocationId() throws ApiException {
        // arrange
        Long locationId = 1L;
        PlaceInfo expected = new PlaceInfo().locationId(locationId).merchantName("Test Merchant");
        when(placesApi.getPlaceByLocationIdUsingGET(locationId)).thenReturn(expected);

        // act
        PlaceInfo result = apiService.getPlaceByLocationId(locationId);

        // assert
        assertEquals(expected, result);
    }

    @Test
    public void testSearchPlaces() throws ApiException {
        // arrange
        PagedPlaceInfo expected = new PagedPlaceInfo();
        List<PlaceInfo> expectedPlaces = new ArrayList<>();
        expectedPlaces.add(new PlaceInfo().merchantName("Test Merchant"));
        expected.setLimit(25);
        expected.setOffset(0);
        expected.setItems(expectedPlaces);

        PlaceSearchRequest searchRequest = new PlaceSearchRequest();
        searchRequest.setRadiusSearch(false);

        when(placesApi.searchPlacesUsingPOST(searchRequest, 25, 0))
                .thenReturn(expected);

        // act
        PagedPlaceInfo result = apiService.searchPlaces(searchRequest, 25, 0);

        // assert
        assertEquals(expected, result);

    }

}
