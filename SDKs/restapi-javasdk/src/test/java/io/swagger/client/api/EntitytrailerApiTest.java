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
 * API tests for EntitytrailerApi
 */
@Ignore
public class EntitytrailerApiTest {

    private final EntitytrailerApi api = new EntitytrailerApi();

    
    /**
     * EntityTrailerById_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityTrailerByIdGETTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityTrailerByIdGET(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityTrailerDescribe_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityTrailerDescribeGETTest() throws ApiException {
        Object response = api.entityTrailerDescribeGET();

        // TODO: test validations
    }
    
    /**
     * EntityTrailer_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityTrailerGETTest() throws ApiException {
        String fields = null;
        String ordering = null;
        String pageMode = null;
        Object response = api.entityTrailerGET(fields, ordering, pageMode);

        // TODO: test validations
    }
    
    /**
     * EntityTrailerLocateToYardById_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityTrailerLocateToYardByIdPOSTTest() throws ApiException {
        BigDecimal id = null;
        Object response = api.entityTrailerLocateToYardByIdPOST(id);

        // TODO: test validations
    }
    
    /**
     * EntityTrailerLocateToYard_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityTrailerLocateToYardPOSTTest() throws ApiException {
        Object response = api.entityTrailerLocateToYardPOST();

        // TODO: test validations
    }
    
    /**
     * EntityTrailer_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityTrailerPOSTTest() throws ApiException {
        String fields = null;
        String ordering = null;
        String pageMode = null;
        Object response = api.entityTrailerPOST(fields, ordering, pageMode);

        // TODO: test validations
    }
    
    /**
     * EntityTrailerRemoveFromYardById_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityTrailerRemoveFromYardByIdPOSTTest() throws ApiException {
        BigDecimal id = null;
        Object response = api.entityTrailerRemoveFromYardByIdPOST(id);

        // TODO: test validations
    }
    
    /**
     * EntityTrailerRemoveFromYard_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityTrailerRemoveFromYardPOSTTest() throws ApiException {
        Object response = api.entityTrailerRemoveFromYardPOST();

        // TODO: test validations
    }
    
}
