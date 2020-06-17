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
 * API tests for EntityparcelTransactionStatusApi
 */
@Ignore
public class EntityparcelTransactionStatusApiTest {

    private final EntityparcelTransactionStatusApi api = new EntityparcelTransactionStatusApi();

    
    /**
     * EntityParcelTransactionStatusById_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityParcelTransactionStatusByIdGETTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityParcelTransactionStatusByIdGET(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityParcelTransactionStatusDescribe_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityParcelTransactionStatusDescribeGETTest() throws ApiException {
        Object response = api.entityParcelTransactionStatusDescribeGET();

        // TODO: test validations
    }
    
    /**
     * EntityParcelTransactionStatus_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityParcelTransactionStatusGETTest() throws ApiException {
        String fields = null;
        String ordering = null;
        String pageMode = null;
        Object response = api.entityParcelTransactionStatusGET(fields, ordering, pageMode);

        // TODO: test validations
    }
    
}
