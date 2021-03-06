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
 * API tests for EntitycontainerApi
 */
@Ignore
public class EntitycontainerApiTest {

    private final EntitycontainerApi api = new EntitycontainerApi();

    
    /**
     * EntityContainerBulkLock_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityContainerBulkLockPOSTTest() throws ApiException {
        Object response = api.entityContainerBulkLockPOST();

        // TODO: test validations
    }
    
    /**
     * EntityContainerBulkUnlock_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityContainerBulkUnlockPOSTTest() throws ApiException {
        Object response = api.entityContainerBulkUnlockPOST();

        // TODO: test validations
    }
    
    /**
     * EntityContainerById_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityContainerByIdGETTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityContainerByIdGET(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityContainerById_PATCH
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityContainerByIdPATCHTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityContainerByIdPATCH(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityContainerDepalletizeById_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityContainerDepalletizeByIdPOSTTest() throws ApiException {
        BigDecimal id = null;
        Object response = api.entityContainerDepalletizeByIdPOST(id);

        // TODO: test validations
    }
    
    /**
     * EntityContainerDepalletize_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityContainerDepalletizePOSTTest() throws ApiException {
        Object response = api.entityContainerDepalletizePOST();

        // TODO: test validations
    }
    
    /**
     * EntityContainerDescribe_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityContainerDescribeGETTest() throws ApiException {
        Object response = api.entityContainerDescribeGET();

        // TODO: test validations
    }
    
    /**
     * EntityContainer_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityContainerGETTest() throws ApiException {
        String fields = null;
        String ordering = null;
        String pageMode = null;
        Object response = api.entityContainerGET(fields, ordering, pageMode);

        // TODO: test validations
    }
    
    /**
     * EntityContainerLockById_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityContainerLockByIdPOSTTest() throws ApiException {
        BigDecimal id = null;
        Object response = api.entityContainerLockByIdPOST(id);

        // TODO: test validations
    }
    
    /**
     * EntityContainerOrdersById_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityContainerOrdersByIdGETTest() throws ApiException {
        BigDecimal id = null;
        Object response = api.entityContainerOrdersByIdGET(id);

        // TODO: test validations
    }
    
    /**
     * EntityContainerPalletizeById_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityContainerPalletizeByIdPOSTTest() throws ApiException {
        BigDecimal id = null;
        Object response = api.entityContainerPalletizeByIdPOST(id);

        // TODO: test validations
    }
    
    /**
     * EntityContainerUnlockById_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityContainerUnlockByIdPOSTTest() throws ApiException {
        BigDecimal id = null;
        Object response = api.entityContainerUnlockByIdPOST(id);

        // TODO: test validations
    }
    
}
