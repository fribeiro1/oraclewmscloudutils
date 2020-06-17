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
 * API tests for EntityoblpnApi
 */
@Ignore
public class EntityoblpnApiTest {

    private final EntityoblpnApi api = new EntityoblpnApi();

    
    /**
     * EntityOblpnById_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityOblpnByIdGETTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityOblpnByIdGET(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityOblpnById_PATCH
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityOblpnByIdPATCHTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityOblpnByIdPATCH(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityOblpnCreateFromIblpn_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityOblpnCreateFromIblpnPOSTTest() throws ApiException {
        Object response = api.entityOblpnCreateFromIblpnPOST();

        // TODO: test validations
    }
    
    /**
     * EntityOblpnDescribe_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityOblpnDescribeGETTest() throws ApiException {
        Object response = api.entityOblpnDescribeGET();

        // TODO: test validations
    }
    
    /**
     * EntityOblpn_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityOblpnGETTest() throws ApiException {
        String fields = null;
        String ordering = null;
        String pageMode = null;
        Object response = api.entityOblpnGET(fields, ordering, pageMode);

        // TODO: test validations
    }
    
    /**
     * EntityOblpnLinkAssetById_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityOblpnLinkAssetByIdPOSTTest() throws ApiException {
        BigDecimal id = null;
        Object response = api.entityOblpnLinkAssetByIdPOST(id);

        // TODO: test validations
    }
    
}