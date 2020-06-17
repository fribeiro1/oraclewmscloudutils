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
 * API tests for EntitytimeFormatApi
 */
@Ignore
public class EntitytimeFormatApiTest {

    private final EntitytimeFormatApi api = new EntitytimeFormatApi();

    
    /**
     * EntityTimeFormatById_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityTimeFormatByIdGETTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityTimeFormatByIdGET(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityTimeFormatDescribe_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityTimeFormatDescribeGETTest() throws ApiException {
        Object response = api.entityTimeFormatDescribeGET();

        // TODO: test validations
    }
    
    /**
     * EntityTimeFormat_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityTimeFormatGETTest() throws ApiException {
        String fields = null;
        String ordering = null;
        String pageMode = null;
        Object response = api.entityTimeFormatGET(fields, ordering, pageMode);

        // TODO: test validations
    }
    
}
