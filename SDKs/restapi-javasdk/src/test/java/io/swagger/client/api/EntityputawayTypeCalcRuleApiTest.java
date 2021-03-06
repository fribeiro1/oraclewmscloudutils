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
 * API tests for EntityputawayTypeCalcRuleApi
 */
@Ignore
public class EntityputawayTypeCalcRuleApiTest {

    private final EntityputawayTypeCalcRuleApi api = new EntityputawayTypeCalcRuleApi();

    
    /**
     * EntityPutawayTypeCalcRuleById_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityPutawayTypeCalcRuleByIdGETTest() throws ApiException {
        BigDecimal id = null;
        String fields = null;
        Object response = api.entityPutawayTypeCalcRuleByIdGET(id, fields);

        // TODO: test validations
    }
    
    /**
     * EntityPutawayTypeCalcRule_GET
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityPutawayTypeCalcRuleGETTest() throws ApiException {
        Object response = api.entityPutawayTypeCalcRuleGET();

        // TODO: test validations
    }
    
    /**
     * EntityPutawayTypeCalcRule_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityPutawayTypeCalcRulePOSTTest() throws ApiException {
        Object response = api.entityPutawayTypeCalcRulePOST();

        // TODO: test validations
    }
    
}
