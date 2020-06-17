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
 * API tests for EntityinventoryLockApi
 */
@Ignore
public class EntityinventoryLockApiTest {

    private final EntityinventoryLockApi api = new EntityinventoryLockApi();

    
    /**
     * EntityInventoryLockById_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityInventoryLockByIdGETTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityInventoryLockByIdGET(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityInventoryLockDescribe_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityInventoryLockDescribeGETTest() throws ApiException {
        Object response = api.entityInventoryLockDescribeGET();

        // TODO: test validations
    }
    
    /**
     * EntityInventoryLock_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityInventoryLockGETTest() throws ApiException {
        String fields = null;
        String ordering = null;
        String pageMode = null;
        Object response = api.entityInventoryLockGET(fields, ordering, pageMode);

        // TODO: test validations
    }
    
    /**
     * EntityInventoryLock_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityInventoryLockPOSTTest() throws ApiException {
        String fields = null;
        String ordering = null;
        String pageMode = null;
        Object response = api.entityInventoryLockPOST(fields, ordering, pageMode);

        // TODO: test validations
    }
    
}
