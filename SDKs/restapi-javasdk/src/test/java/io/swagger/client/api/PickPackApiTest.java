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
 * API tests for PickPackApi
 */
@Ignore
public class PickPackApiTest {

    private final PickPackApi api = new PickPackApi();

    
    /**
     * PickPackCloseLpn_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pickPackCloseLpnPOSTTest() throws ApiException {
        String toContainerNbr = null;
        Boolean asyncFlg = null;
        String closeContainerStatus = null;
        BigDecimal companyId = null;
        String companyIdCode = null;
        BigDecimal facilityId = null;
        String facilityIdCode = null;
        String reasonCode = null;
        Boolean shortOnCloseFlg = null;
        Boolean updateInventoryOnShortFlg = null;
        String toContainerCode = null;
        Object response = api.pickPackCloseLpnPOST(toContainerNbr, asyncFlg, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, reasonCode, shortOnCloseFlg, updateInventoryOnShortFlg, toContainerCode);

        // TODO: test validations
    }
    
    /**
     * PickPackPickConfirm_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pickPackPickConfirmPOSTTest() throws ApiException {
        Boolean asyncFlg = null;
        Boolean mheModeFlg = null;
        String orderNbr = null;
        String waveNbr = null;
        String allocationUom = null;
        String batchNbr = null;
        String closeContainerStatus = null;
        BigDecimal companyId = null;
        String companyIdCode = null;
        BigDecimal facilityId = null;
        String facilityIdCode = null;
        String fromContainerNbr = null;
        String itemAlternateCode = null;
        String itemBarcode = null;
        String mheSystemCode = null;
        String pickLocation = null;
        BigDecimal qty = null;
        String reasonCode = null;
        Boolean shortFlg = null;
        Boolean shortOnCloseFlg = null;
        String toContainerNbr = null;
        String uomQty = null;
        Boolean updateInventoryOnShortFlg = null;
        Object response = api.pickPackPickConfirmPOST(asyncFlg, mheModeFlg, orderNbr, waveNbr, allocationUom, batchNbr, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, fromContainerNbr, itemAlternateCode, itemBarcode, mheSystemCode, pickLocation, qty, reasonCode, shortFlg, shortOnCloseFlg, toContainerNbr, uomQty, updateInventoryOnShortFlg);

        // TODO: test validations
    }
    
    /**
     * PickPackWaveComplete_POST
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pickPackWaveCompletePOSTTest() throws ApiException {
        String waveNbr = null;
        Boolean asyncFlg = null;
        String closeContainerStatus = null;
        BigDecimal companyId = null;
        String companyIdCode = null;
        BigDecimal facilityId = null;
        String facilityIdCode = null;
        String mheSystemCode = null;
        String reasonCode = null;
        Boolean updateInventoryOnShortFlg = null;
        Object response = api.pickPackWaveCompletePOST(waveNbr, asyncFlg, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, mheSystemCode, reasonCode, updateInventoryOnShortFlg);

        // TODO: test validations
    }
    
}