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
 * API tests for EntitypurchaseOrderHdrApi
 */
@Ignore
public class EntitypurchaseOrderHdrApiTest {

    private final EntitypurchaseOrderHdrApi api = new EntitypurchaseOrderHdrApi();

    
    /**
     * EntityPurchaseOrderHdrById_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityPurchaseOrderHdrByIdGETTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityPurchaseOrderHdrByIdGET(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityPurchaseOrderHdrById_PATCH
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityPurchaseOrderHdrByIdPATCHTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityPurchaseOrderHdrByIdPATCH(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityPurchaseOrderHdrDescribe_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityPurchaseOrderHdrDescribeGETTest() throws ApiException {
        Object response = api.entityPurchaseOrderHdrDescribeGET();

        // TODO: test validations
    }
    
    /**
     * EntityPurchaseOrderHdr_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityPurchaseOrderHdrGETTest() throws ApiException {
        String fields = null;
        String ordering = null;
        String pageMode = null;
        Object response = api.entityPurchaseOrderHdrGET(fields, ordering, pageMode);

        // TODO: test validations
    }
    
}
