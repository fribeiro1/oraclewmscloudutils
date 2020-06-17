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
 * API tests for EntityfacilityApi
 */
@Ignore
public class EntityfacilityApiTest {

    private final EntityfacilityApi api = new EntityfacilityApi();

    
    /**
     * EntityFacilityById_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityFacilityByIdGETTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityFacilityByIdGET(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityFacilityById_PATCH
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityFacilityByIdPATCHTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityFacilityByIdPATCH(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityFacilityDescribe_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityFacilityDescribeGETTest() throws ApiException {
        Object response = api.entityFacilityDescribeGET();

        // TODO: test validations
    }
    
    /**
     * EntityFacility_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityFacilityGETTest() throws ApiException {
        String fields = null;
        String ordering = null;
        String pageMode = null;
        Object response = api.entityFacilityGET(fields, ordering, pageMode);

        // TODO: test validations
    }
    
}
