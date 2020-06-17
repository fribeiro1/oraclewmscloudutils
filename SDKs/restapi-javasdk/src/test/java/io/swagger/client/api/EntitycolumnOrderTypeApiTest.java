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
 * API tests for EntitycolumnOrderTypeApi
 */
@Ignore
public class EntitycolumnOrderTypeApiTest {

    private final EntitycolumnOrderTypeApi api = new EntitycolumnOrderTypeApi();

    
    /**
     * EntityColumnOrderTypeById_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityColumnOrderTypeByIdGETTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityColumnOrderTypeByIdGET(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityColumnOrderTypeDescribe_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityColumnOrderTypeDescribeGETTest() throws ApiException {
        Object response = api.entityColumnOrderTypeDescribeGET();

        // TODO: test validations
    }
    
    /**
     * EntityColumnOrderType_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityColumnOrderTypeGETTest() throws ApiException {
        String fields = null;
        String ordering = null;
        String pageMode = null;
        Object response = api.entityColumnOrderTypeGET(fields, ordering, pageMode);

        // TODO: test validations
    }
    
}