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
 * API tests for EntitystopStatusApi
 */
@Ignore
public class EntitystopStatusApiTest {

    private final EntitystopStatusApi api = new EntitystopStatusApi();

    
    /**
     * EntityStopStatusById_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityStopStatusByIdGETTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityStopStatusByIdGET(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityStopStatusDescribe_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityStopStatusDescribeGETTest() throws ApiException {
        Object response = api.entityStopStatusDescribeGET();

        // TODO: test validations
    }
    
    /**
     * EntityStopStatus_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityStopStatusGETTest() throws ApiException {
        String fields = null;
        String ordering = null;
        String pageMode = null;
        Object response = api.entityStopStatusGET(fields, ordering, pageMode);

        // TODO: test validations
    }
    
}
