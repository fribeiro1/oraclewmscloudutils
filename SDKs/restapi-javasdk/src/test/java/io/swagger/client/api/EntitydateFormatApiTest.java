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
 * API tests for EntitydateFormatApi
 */
@Ignore
public class EntitydateFormatApiTest {

    private final EntitydateFormatApi api = new EntitydateFormatApi();

    
    /**
     * EntityDateFormatById_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityDateFormatByIdGETTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityDateFormatByIdGET(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityDateFormatDescribe_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityDateFormatDescribeGETTest() throws ApiException {
        Object response = api.entityDateFormatDescribeGET();

        // TODO: test validations
    }
    
    /**
     * EntityDateFormat_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityDateFormatGETTest() throws ApiException {
        String fields = null;
        String ordering = null;
        String pageMode = null;
        Object response = api.entityDateFormatGET(fields, ordering, pageMode);

        // TODO: test validations
    }
    
}
