/*
 * REST API
 * This is a sample definition of the Oracle WMS Cloud REST API.  The views expressed here are my own and do not necessarily reflect the views of Oracle.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import java.math.BigDecimal;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EntitylocationApi
 */
@Ignore
public class EntitylocationApiTest {

    private final EntitylocationApi api = new EntitylocationApi();

    
    /**
     * EntityLocationById_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityLocationByIdGETTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityLocationByIdGET(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityLocationById_PATCH
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityLocationByIdPATCHTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityLocationByIdPATCH(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityLocationDescribe_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityLocationDescribeGETTest() throws ApiException {
        Object response = api.entityLocationDescribeGET();

        // TODO: test validations
    }
    
    /**
     * EntityLocation_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityLocationGETTest() throws ApiException {
        String fields = null;
        String ordering = null;
        String pageMode = null;
        Object response = api.entityLocationGET(fields, ordering, pageMode);

        // TODO: test validations
    }
    
    /**
     * EntityLocationUpdateActiveInventoryById_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityLocationUpdateActiveInventoryByIdPOSTTest() throws ApiException {
        BigDecimal id = null;
        Object response = api.entityLocationUpdateActiveInventoryByIdPOST(id);

        // TODO: test validations
    }
    
    /**
     * EntityLocationUpdateActiveInventory_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityLocationUpdateActiveInventoryPOSTTest() throws ApiException {
        Object response = api.entityLocationUpdateActiveInventoryPOST();

        // TODO: test validations
    }
    
    /**
     * EntityLocationYearFirstAvailable_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityLocationYearFirstAvailableGETTest() throws ApiException {
        String facilityId = null;
        String facilityIdCode = null;
        Object response = api.entityLocationYearFirstAvailableGET(facilityId, facilityIdCode);

        // TODO: test validations
    }
    
}
