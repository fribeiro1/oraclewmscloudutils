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
 * API tests for EntityorderHdrApi
 */
@Ignore
public class EntityorderHdrApiTest {

    private final EntityorderHdrApi api = new EntityorderHdrApi();

    
    /**
     * EntityOrderHdrBulkLock_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityOrderHdrBulkLockPOSTTest() throws ApiException {
        Object response = api.entityOrderHdrBulkLockPOST();

        // TODO: test validations
    }
    
    /**
     * EntityOrderHdrBulkUnlock_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityOrderHdrBulkUnlockPOSTTest() throws ApiException {
        Object response = api.entityOrderHdrBulkUnlockPOST();

        // TODO: test validations
    }
    
    /**
     * EntityOrderHdrById_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityOrderHdrByIdGETTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityOrderHdrByIdGET(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityOrderHdrById_PATCH
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityOrderHdrByIdPATCHTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityOrderHdrByIdPATCH(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityOrderHdrDescribe_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityOrderHdrDescribeGETTest() throws ApiException {
        Object response = api.entityOrderHdrDescribeGET();

        // TODO: test validations
    }
    
    /**
     * EntityOrderHdr_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityOrderHdrGETTest() throws ApiException {
        String fields = null;
        String ordering = null;
        String pageMode = null;
        Object response = api.entityOrderHdrGET(fields, ordering, pageMode);

        // TODO: test validations
    }
    
    /**
     * EntityOrderHdrIblpnsById_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityOrderHdrIblpnsByIdPOSTTest() throws ApiException {
        BigDecimal id = null;
        Object response = api.entityOrderHdrIblpnsByIdPOST(id);

        // TODO: test validations
    }
    
    /**
     * EntityOrderHdrOblpnsById_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityOrderHdrOblpnsByIdPOSTTest() throws ApiException {
        BigDecimal id = null;
        Object response = api.entityOrderHdrOblpnsByIdPOST(id);

        // TODO: test validations
    }
    
}
