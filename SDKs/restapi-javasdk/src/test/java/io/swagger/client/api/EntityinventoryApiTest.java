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
 * API tests for EntityinventoryApi
 */
@Ignore
public class EntityinventoryApiTest {

    private final EntityinventoryApi api = new EntityinventoryApi();

    
    /**
     * EntityInventoryBulkUpdateInventoryAttributes_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityInventoryBulkUpdateInventoryAttributesPOSTTest() throws ApiException {
        Object response = api.entityInventoryBulkUpdateInventoryAttributesPOST();

        // TODO: test validations
    }
    
    /**
     * EntityInventoryById_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityInventoryByIdGETTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityInventoryByIdGET(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityInventoryDescribe_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityInventoryDescribeGETTest() throws ApiException {
        Object response = api.entityInventoryDescribeGET();

        // TODO: test validations
    }
    
    /**
     * EntityInventory_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityInventoryGETTest() throws ApiException {
        String fields = null;
        String ordering = null;
        String pageMode = null;
        Object response = api.entityInventoryGET(fields, ordering, pageMode);

        // TODO: test validations
    }
    
    /**
     * EntityInventoryLinkSerialNbrsById_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityInventoryLinkSerialNbrsByIdPOSTTest() throws ApiException {
        BigDecimal id = null;
        Object response = api.entityInventoryLinkSerialNbrsByIdPOST(id);

        // TODO: test validations
    }
    
    /**
     * EntityInventory_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityInventoryPOSTTest() throws ApiException {
        String fields = null;
        String ordering = null;
        String pageMode = null;
        Object response = api.entityInventoryPOST(fields, ordering, pageMode);

        // TODO: test validations
    }
    
}
