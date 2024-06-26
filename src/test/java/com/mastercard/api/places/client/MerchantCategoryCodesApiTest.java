/*
 * Places API
 * Places API
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.api.places.client;

import com.mastercard.api.places.ApiException;
import com.mastercard.api.places.model.ErrorResponse;
import com.mastercard.api.places.model.MerchantCategoryCode;
import com.mastercard.api.places.model.PagedMerchantCategoryCode;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MerchantCategoryCodesApi
 */
@Ignore
public class MerchantCategoryCodesApiTest {

    private final MerchantCategoryCodesApi api = new MerchantCategoryCodesApi();

    
    /**
     * Get all active merchant category codes
     *
     * Returns a list of Merchant Category Codes ordered by Merchant Category Code or Merchant Category Name, depending on user input. The list will be ordered by Merchant Category Name by default.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllMerchantCategoryCodesUsingGetTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String sort = null;
                PagedMerchantCategoryCode response = api.getAllMerchantCategoryCodesUsingGet(limit, offset, sort);
        // TODO: test validations
    }
    
    /**
     * Get merchant category code by code
     *
     * Get merchant category code by code
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByMccCodeUsingGETTest() throws ApiException {
        String mccCode = null;
                MerchantCategoryCode response = api.getByMccCodeUsingGET(mccCode);
        // TODO: test validations
    }
    
}
