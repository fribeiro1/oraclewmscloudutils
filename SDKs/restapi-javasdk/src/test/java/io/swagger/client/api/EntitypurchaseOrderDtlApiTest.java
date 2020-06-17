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
 * API tests for EntitypurchaseOrderDtlApi
 */
@Ignore
public class EntitypurchaseOrderDtlApiTest {

    private final EntitypurchaseOrderDtlApi api = new EntitypurchaseOrderDtlApi();

    
    /**
     * EntityPurchaseOrderDtlById_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityPurchaseOrderDtlByIdGETTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityPurchaseOrderDtlByIdGET(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityPurchaseOrderDtlById_PATCH
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityPurchaseOrderDtlByIdPATCHTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityPurchaseOrderDtlByIdPATCH(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityPurchaseOrderDtlDescribe_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityPurchaseOrderDtlDescribeGETTest() throws ApiException {
        Object response = api.entityPurchaseOrderDtlDescribeGET();

        // TODO: test validations
    }
    
    /**
     * EntityPurchaseOrderDtl_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityPurchaseOrderDtlGETTest() throws ApiException {
        String fields = null;
        String ordering = null;
        String pageMode = null;
        Object response = api.entityPurchaseOrderDtlGET(fields, ordering, pageMode);

        // TODO: test validations
    }
    
}
