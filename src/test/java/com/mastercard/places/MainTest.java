package com.mastercard.places;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.junit.Before;
import org.junit.Test;
import org.openapitools.client.ApiException;
import org.openapitools.client.model.MerchantCategoryCode;
import org.openapitools.client.model.MerchantIndustryCode;
import org.openapitools.client.model.PagedMerchantCategoryCode;
import org.openapitools.client.model.PagedMerchantIndustryCode;
import org.openapitools.client.model.PagedPlaceInfo;
import org.openapitools.client.model.PlaceInfo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;

public class MainTest {

    private static ApiService apiService = mock(ApiService.class);

    @Before
    public void before() {
        reset(apiService);
        Main.setApiService(apiService);
    }

    @Test
    public void mainTest_HappyEndingTest() throws Exception {
        // arrange
        doReturn(new PagedMerchantCategoryCode())
                .when(apiService)
                .getPagedMerchantCategoryCodes(any(), any(), any());

        doReturn(new PagedMerchantIndustryCode())
                .when(apiService)
                .getPagedMerchantIndustryCodes(any(), any(), any());

        doReturn(new PagedPlaceInfo())
                .when(apiService)
                .searchPlaces(any(), any(), any());

        doReturn(new MerchantCategoryCode())
                .when(apiService)
                .getMerchantCategoryCodeByCode(any());

        doReturn(new MerchantIndustryCode())
                .when(apiService)
                .getMerchantIndustryCodeByCode(any());

        doReturn(new PlaceInfo())
                .when(apiService)
                .getPlaceByLocationId(anyLong());

        // act
        try {
            Main.main(new String[]{});
        } catch (Exception e) {
            fail("There should be no error");
        }
    }

    @Test(expected = ApiException.class)
    public void placesSearch_Exception() throws Exception {
        // arrange
        doThrow(new ApiException("message"))
                .when(apiService)
                .searchPlaces(any(), any(), any());

        // act
        Main.main(new String[]{});
    }

    @Test(expected = ApiException.class)
    public void findPlaceById_Exception() throws Exception {
        // arrange
        doReturn(new PagedPlaceInfo())
                .when(apiService)
                .searchPlaces(any(), any(), any());

        doThrow(new ApiException("message"))
                .when(apiService)
                .getPlaceByLocationId(anyLong());

        // act
        Main.main(new String[]{});
    }

    @Test(expected = ApiException.class)
    public void merchantCategoryCodes_Exception() throws Exception {
        // arrange
        doReturn(new PagedPlaceInfo())
                .when(apiService)
                .searchPlaces(any(), any(), any());

        doReturn(new PlaceInfo())
                .when(apiService)
                .getPlaceByLocationId(anyLong());

        doThrow(new ApiException("message"))
                .when(apiService)
                .getPagedMerchantCategoryCodes(any(), any(), any());

        // act
        Main.main(new String[]{});
    }

    @Test(expected = ApiException.class)
    public void merchantCategoryCodeByCode_Exception() throws Exception {
        // arrange
        doReturn(new PagedPlaceInfo())
                .when(apiService)
                .searchPlaces(any(), any(), any());

        doReturn(new PlaceInfo())
                .when(apiService)
                .getPlaceByLocationId(anyLong());

        doReturn(new PagedMerchantCategoryCode())
                .when(apiService)
                .getPagedMerchantCategoryCodes(any(), any(), any());

        doThrow(new ApiException("message"))
                .when(apiService)
                .getMerchantCategoryCodeByCode(any());

        // act
        Main.main(new String[]{});
    }

    @Test
    public void forceJsonResponseInterceptor() throws Exception {
        // arrange
        Main.ForceJsonResponseInterceptor forceJsonResponseInterceptor = new Main.ForceJsonResponseInterceptor();
        Interceptor.Chain chain = mock(Interceptor.Chain.class);
        Request request = new Request.Builder().url("http://localhost/my-test").build();
        Response expected = new Response.Builder()
                .request(request)
                .protocol(Protocol.HTTP_1_1)
                .code(200)
                .build();

        doReturn(request)
                .when(chain)
                .request();

        doReturn(expected)
                .when(chain)
                .proceed(any());

        // act
        Response result = forceJsonResponseInterceptor.intercept(chain);

        // assert
        assertNotNull(result);
        assertEquals(expected, result);
    }

}
