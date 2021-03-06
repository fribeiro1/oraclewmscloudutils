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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.math.BigDecimal;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPackApi {
    private ApiClient apiClient;

    public PickPackApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PickPackApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for pickPackCloseLpnPOST
     * @param toContainerNbr  (required)
     * @param asyncFlg  (optional)
     * @param closeContainerStatus  (optional)
     * @param companyId  (optional)
     * @param companyIdCode  (optional)
     * @param facilityId  (optional)
     * @param facilityIdCode  (optional)
     * @param reasonCode  (optional)
     * @param shortOnCloseFlg  (optional)
     * @param updateInventoryOnShortFlg  (optional)
     * @param toContainerCode  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call pickPackCloseLpnPOSTCall(String toContainerNbr, Boolean asyncFlg, String closeContainerStatus, BigDecimal companyId, String companyIdCode, BigDecimal facilityId, String facilityIdCode, String reasonCode, Boolean shortOnCloseFlg, Boolean updateInventoryOnShortFlg, String toContainerCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pick_pack/close_lpn";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (asyncFlg != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("async_flg", asyncFlg));
        if (closeContainerStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("close_container_status", closeContainerStatus));
        if (companyId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("company_id", companyId));
        if (companyIdCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("company_id__code", companyIdCode));
        if (facilityId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("facility_id", facilityId));
        if (facilityIdCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("facility_id__code", facilityIdCode));
        if (reasonCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("reason_code", reasonCode));
        if (shortOnCloseFlg != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("short_on_close_flg", shortOnCloseFlg));
        if (toContainerNbr != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("to_container_nbr", toContainerNbr));
        if (updateInventoryOnShortFlg != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("update_inventory_on_short_flg", updateInventoryOnShortFlg));
        if (toContainerCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("to_container__code", toContainerCode));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic", "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call pickPackCloseLpnPOSTValidateBeforeCall(String toContainerNbr, Boolean asyncFlg, String closeContainerStatus, BigDecimal companyId, String companyIdCode, BigDecimal facilityId, String facilityIdCode, String reasonCode, Boolean shortOnCloseFlg, Boolean updateInventoryOnShortFlg, String toContainerCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'toContainerNbr' is set
        if (toContainerNbr == null) {
            throw new ApiException("Missing the required parameter 'toContainerNbr' when calling pickPackCloseLpnPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = pickPackCloseLpnPOSTCall(toContainerNbr, asyncFlg, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, reasonCode, shortOnCloseFlg, updateInventoryOnShortFlg, toContainerCode, progressListener, progressRequestListener);
        return call;

    }

    /**
     * PickPackCloseLpn_POST
     * 
     * @param toContainerNbr  (required)
     * @param asyncFlg  (optional)
     * @param closeContainerStatus  (optional)
     * @param companyId  (optional)
     * @param companyIdCode  (optional)
     * @param facilityId  (optional)
     * @param facilityIdCode  (optional)
     * @param reasonCode  (optional)
     * @param shortOnCloseFlg  (optional)
     * @param updateInventoryOnShortFlg  (optional)
     * @param toContainerCode  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object pickPackCloseLpnPOST(String toContainerNbr, Boolean asyncFlg, String closeContainerStatus, BigDecimal companyId, String companyIdCode, BigDecimal facilityId, String facilityIdCode, String reasonCode, Boolean shortOnCloseFlg, Boolean updateInventoryOnShortFlg, String toContainerCode) throws ApiException {
        ApiResponse<Object> resp = pickPackCloseLpnPOSTWithHttpInfo(toContainerNbr, asyncFlg, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, reasonCode, shortOnCloseFlg, updateInventoryOnShortFlg, toContainerCode);
        return resp.getData();
    }

    /**
     * PickPackCloseLpn_POST
     * 
     * @param toContainerNbr  (required)
     * @param asyncFlg  (optional)
     * @param closeContainerStatus  (optional)
     * @param companyId  (optional)
     * @param companyIdCode  (optional)
     * @param facilityId  (optional)
     * @param facilityIdCode  (optional)
     * @param reasonCode  (optional)
     * @param shortOnCloseFlg  (optional)
     * @param updateInventoryOnShortFlg  (optional)
     * @param toContainerCode  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> pickPackCloseLpnPOSTWithHttpInfo(String toContainerNbr, Boolean asyncFlg, String closeContainerStatus, BigDecimal companyId, String companyIdCode, BigDecimal facilityId, String facilityIdCode, String reasonCode, Boolean shortOnCloseFlg, Boolean updateInventoryOnShortFlg, String toContainerCode) throws ApiException {
        com.squareup.okhttp.Call call = pickPackCloseLpnPOSTValidateBeforeCall(toContainerNbr, asyncFlg, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, reasonCode, shortOnCloseFlg, updateInventoryOnShortFlg, toContainerCode, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PickPackCloseLpn_POST (asynchronously)
     * 
     * @param toContainerNbr  (required)
     * @param asyncFlg  (optional)
     * @param closeContainerStatus  (optional)
     * @param companyId  (optional)
     * @param companyIdCode  (optional)
     * @param facilityId  (optional)
     * @param facilityIdCode  (optional)
     * @param reasonCode  (optional)
     * @param shortOnCloseFlg  (optional)
     * @param updateInventoryOnShortFlg  (optional)
     * @param toContainerCode  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call pickPackCloseLpnPOSTAsync(String toContainerNbr, Boolean asyncFlg, String closeContainerStatus, BigDecimal companyId, String companyIdCode, BigDecimal facilityId, String facilityIdCode, String reasonCode, Boolean shortOnCloseFlg, Boolean updateInventoryOnShortFlg, String toContainerCode, final ApiCallback<Object> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = pickPackCloseLpnPOSTValidateBeforeCall(toContainerNbr, asyncFlg, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, reasonCode, shortOnCloseFlg, updateInventoryOnShortFlg, toContainerCode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for pickPackPickConfirmPOST
     * @param asyncFlg  (required)
     * @param mheModeFlg  (required)
     * @param orderNbr  (required)
     * @param waveNbr  (required)
     * @param allocationUom  (optional)
     * @param batchNbr  (optional)
     * @param closeContainerStatus  (optional)
     * @param companyId  (optional)
     * @param companyIdCode  (optional)
     * @param facilityId  (optional)
     * @param facilityIdCode  (optional)
     * @param fromContainerNbr  (optional)
     * @param itemAlternateCode  (optional)
     * @param itemBarcode  (optional)
     * @param mheSystemCode  (optional)
     * @param pickLocation  (optional)
     * @param qty  (optional)
     * @param reasonCode  (optional)
     * @param shortFlg  (optional)
     * @param shortOnCloseFlg  (optional)
     * @param toContainerNbr  (optional)
     * @param uomQty  (optional)
     * @param updateInventoryOnShortFlg  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call pickPackPickConfirmPOSTCall(Boolean asyncFlg, Boolean mheModeFlg, String orderNbr, String waveNbr, String allocationUom, String batchNbr, String closeContainerStatus, BigDecimal companyId, String companyIdCode, BigDecimal facilityId, String facilityIdCode, String fromContainerNbr, String itemAlternateCode, String itemBarcode, String mheSystemCode, String pickLocation, BigDecimal qty, String reasonCode, Boolean shortFlg, Boolean shortOnCloseFlg, String toContainerNbr, String uomQty, Boolean updateInventoryOnShortFlg, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pick_pack/pick_confirm";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (allocationUom != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("allocation_uom", allocationUom));
        if (asyncFlg != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("async_flg", asyncFlg));
        if (batchNbr != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("batch_nbr", batchNbr));
        if (closeContainerStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("close_container_status", closeContainerStatus));
        if (companyId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("company_id", companyId));
        if (companyIdCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("company_id__code", companyIdCode));
        if (facilityId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("facility_id", facilityId));
        if (facilityIdCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("facility_id__code", facilityIdCode));
        if (fromContainerNbr != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("from_container_nbr", fromContainerNbr));
        if (itemAlternateCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("item_alternate_code", itemAlternateCode));
        if (itemBarcode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("item_barcode", itemBarcode));
        if (mheModeFlg != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("mhe_mode_flg", mheModeFlg));
        if (mheSystemCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("mhe_system_code", mheSystemCode));
        if (orderNbr != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order_nbr", orderNbr));
        if (pickLocation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pick_location", pickLocation));
        if (qty != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("qty", qty));
        if (reasonCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("reason_code", reasonCode));
        if (shortFlg != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("short_flg", shortFlg));
        if (shortOnCloseFlg != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("short_on_close_flg", shortOnCloseFlg));
        if (toContainerNbr != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("to_container_nbr", toContainerNbr));
        if (uomQty != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("uom_qty", uomQty));
        if (updateInventoryOnShortFlg != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("update_inventory_on_short_flg", updateInventoryOnShortFlg));
        if (waveNbr != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("wave_nbr", waveNbr));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic", "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call pickPackPickConfirmPOSTValidateBeforeCall(Boolean asyncFlg, Boolean mheModeFlg, String orderNbr, String waveNbr, String allocationUom, String batchNbr, String closeContainerStatus, BigDecimal companyId, String companyIdCode, BigDecimal facilityId, String facilityIdCode, String fromContainerNbr, String itemAlternateCode, String itemBarcode, String mheSystemCode, String pickLocation, BigDecimal qty, String reasonCode, Boolean shortFlg, Boolean shortOnCloseFlg, String toContainerNbr, String uomQty, Boolean updateInventoryOnShortFlg, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'asyncFlg' is set
        if (asyncFlg == null) {
            throw new ApiException("Missing the required parameter 'asyncFlg' when calling pickPackPickConfirmPOST(Async)");
        }
        
        // verify the required parameter 'mheModeFlg' is set
        if (mheModeFlg == null) {
            throw new ApiException("Missing the required parameter 'mheModeFlg' when calling pickPackPickConfirmPOST(Async)");
        }
        
        // verify the required parameter 'orderNbr' is set
        if (orderNbr == null) {
            throw new ApiException("Missing the required parameter 'orderNbr' when calling pickPackPickConfirmPOST(Async)");
        }
        
        // verify the required parameter 'waveNbr' is set
        if (waveNbr == null) {
            throw new ApiException("Missing the required parameter 'waveNbr' when calling pickPackPickConfirmPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = pickPackPickConfirmPOSTCall(asyncFlg, mheModeFlg, orderNbr, waveNbr, allocationUom, batchNbr, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, fromContainerNbr, itemAlternateCode, itemBarcode, mheSystemCode, pickLocation, qty, reasonCode, shortFlg, shortOnCloseFlg, toContainerNbr, uomQty, updateInventoryOnShortFlg, progressListener, progressRequestListener);
        return call;

    }

    /**
     * PickPackPickConfirm_POST
     * 
     * @param asyncFlg  (required)
     * @param mheModeFlg  (required)
     * @param orderNbr  (required)
     * @param waveNbr  (required)
     * @param allocationUom  (optional)
     * @param batchNbr  (optional)
     * @param closeContainerStatus  (optional)
     * @param companyId  (optional)
     * @param companyIdCode  (optional)
     * @param facilityId  (optional)
     * @param facilityIdCode  (optional)
     * @param fromContainerNbr  (optional)
     * @param itemAlternateCode  (optional)
     * @param itemBarcode  (optional)
     * @param mheSystemCode  (optional)
     * @param pickLocation  (optional)
     * @param qty  (optional)
     * @param reasonCode  (optional)
     * @param shortFlg  (optional)
     * @param shortOnCloseFlg  (optional)
     * @param toContainerNbr  (optional)
     * @param uomQty  (optional)
     * @param updateInventoryOnShortFlg  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object pickPackPickConfirmPOST(Boolean asyncFlg, Boolean mheModeFlg, String orderNbr, String waveNbr, String allocationUom, String batchNbr, String closeContainerStatus, BigDecimal companyId, String companyIdCode, BigDecimal facilityId, String facilityIdCode, String fromContainerNbr, String itemAlternateCode, String itemBarcode, String mheSystemCode, String pickLocation, BigDecimal qty, String reasonCode, Boolean shortFlg, Boolean shortOnCloseFlg, String toContainerNbr, String uomQty, Boolean updateInventoryOnShortFlg) throws ApiException {
        ApiResponse<Object> resp = pickPackPickConfirmPOSTWithHttpInfo(asyncFlg, mheModeFlg, orderNbr, waveNbr, allocationUom, batchNbr, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, fromContainerNbr, itemAlternateCode, itemBarcode, mheSystemCode, pickLocation, qty, reasonCode, shortFlg, shortOnCloseFlg, toContainerNbr, uomQty, updateInventoryOnShortFlg);
        return resp.getData();
    }

    /**
     * PickPackPickConfirm_POST
     * 
     * @param asyncFlg  (required)
     * @param mheModeFlg  (required)
     * @param orderNbr  (required)
     * @param waveNbr  (required)
     * @param allocationUom  (optional)
     * @param batchNbr  (optional)
     * @param closeContainerStatus  (optional)
     * @param companyId  (optional)
     * @param companyIdCode  (optional)
     * @param facilityId  (optional)
     * @param facilityIdCode  (optional)
     * @param fromContainerNbr  (optional)
     * @param itemAlternateCode  (optional)
     * @param itemBarcode  (optional)
     * @param mheSystemCode  (optional)
     * @param pickLocation  (optional)
     * @param qty  (optional)
     * @param reasonCode  (optional)
     * @param shortFlg  (optional)
     * @param shortOnCloseFlg  (optional)
     * @param toContainerNbr  (optional)
     * @param uomQty  (optional)
     * @param updateInventoryOnShortFlg  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> pickPackPickConfirmPOSTWithHttpInfo(Boolean asyncFlg, Boolean mheModeFlg, String orderNbr, String waveNbr, String allocationUom, String batchNbr, String closeContainerStatus, BigDecimal companyId, String companyIdCode, BigDecimal facilityId, String facilityIdCode, String fromContainerNbr, String itemAlternateCode, String itemBarcode, String mheSystemCode, String pickLocation, BigDecimal qty, String reasonCode, Boolean shortFlg, Boolean shortOnCloseFlg, String toContainerNbr, String uomQty, Boolean updateInventoryOnShortFlg) throws ApiException {
        com.squareup.okhttp.Call call = pickPackPickConfirmPOSTValidateBeforeCall(asyncFlg, mheModeFlg, orderNbr, waveNbr, allocationUom, batchNbr, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, fromContainerNbr, itemAlternateCode, itemBarcode, mheSystemCode, pickLocation, qty, reasonCode, shortFlg, shortOnCloseFlg, toContainerNbr, uomQty, updateInventoryOnShortFlg, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PickPackPickConfirm_POST (asynchronously)
     * 
     * @param asyncFlg  (required)
     * @param mheModeFlg  (required)
     * @param orderNbr  (required)
     * @param waveNbr  (required)
     * @param allocationUom  (optional)
     * @param batchNbr  (optional)
     * @param closeContainerStatus  (optional)
     * @param companyId  (optional)
     * @param companyIdCode  (optional)
     * @param facilityId  (optional)
     * @param facilityIdCode  (optional)
     * @param fromContainerNbr  (optional)
     * @param itemAlternateCode  (optional)
     * @param itemBarcode  (optional)
     * @param mheSystemCode  (optional)
     * @param pickLocation  (optional)
     * @param qty  (optional)
     * @param reasonCode  (optional)
     * @param shortFlg  (optional)
     * @param shortOnCloseFlg  (optional)
     * @param toContainerNbr  (optional)
     * @param uomQty  (optional)
     * @param updateInventoryOnShortFlg  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call pickPackPickConfirmPOSTAsync(Boolean asyncFlg, Boolean mheModeFlg, String orderNbr, String waveNbr, String allocationUom, String batchNbr, String closeContainerStatus, BigDecimal companyId, String companyIdCode, BigDecimal facilityId, String facilityIdCode, String fromContainerNbr, String itemAlternateCode, String itemBarcode, String mheSystemCode, String pickLocation, BigDecimal qty, String reasonCode, Boolean shortFlg, Boolean shortOnCloseFlg, String toContainerNbr, String uomQty, Boolean updateInventoryOnShortFlg, final ApiCallback<Object> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = pickPackPickConfirmPOSTValidateBeforeCall(asyncFlg, mheModeFlg, orderNbr, waveNbr, allocationUom, batchNbr, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, fromContainerNbr, itemAlternateCode, itemBarcode, mheSystemCode, pickLocation, qty, reasonCode, shortFlg, shortOnCloseFlg, toContainerNbr, uomQty, updateInventoryOnShortFlg, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for pickPackWaveCompletePOST
     * @param waveNbr  (required)
     * @param asyncFlg  (optional)
     * @param closeContainerStatus  (optional)
     * @param companyId  (optional)
     * @param companyIdCode  (optional)
     * @param facilityId  (optional)
     * @param facilityIdCode  (optional)
     * @param mheSystemCode  (optional)
     * @param reasonCode  (optional)
     * @param updateInventoryOnShortFlg  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call pickPackWaveCompletePOSTCall(String waveNbr, Boolean asyncFlg, String closeContainerStatus, BigDecimal companyId, String companyIdCode, BigDecimal facilityId, String facilityIdCode, String mheSystemCode, String reasonCode, Boolean updateInventoryOnShortFlg, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pick_pack/wave_complete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (asyncFlg != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("async_flg", asyncFlg));
        if (closeContainerStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("close_container_status", closeContainerStatus));
        if (companyId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("company_id", companyId));
        if (companyIdCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("company_id__code", companyIdCode));
        if (facilityId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("facility_id", facilityId));
        if (facilityIdCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("facility_id__code", facilityIdCode));
        if (mheSystemCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("mhe_system_code", mheSystemCode));
        if (reasonCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("reason_code", reasonCode));
        if (updateInventoryOnShortFlg != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("update_inventory_on_short_flg", updateInventoryOnShortFlg));
        if (waveNbr != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("wave_nbr", waveNbr));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic", "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call pickPackWaveCompletePOSTValidateBeforeCall(String waveNbr, Boolean asyncFlg, String closeContainerStatus, BigDecimal companyId, String companyIdCode, BigDecimal facilityId, String facilityIdCode, String mheSystemCode, String reasonCode, Boolean updateInventoryOnShortFlg, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'waveNbr' is set
        if (waveNbr == null) {
            throw new ApiException("Missing the required parameter 'waveNbr' when calling pickPackWaveCompletePOST(Async)");
        }
        

        com.squareup.okhttp.Call call = pickPackWaveCompletePOSTCall(waveNbr, asyncFlg, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, mheSystemCode, reasonCode, updateInventoryOnShortFlg, progressListener, progressRequestListener);
        return call;

    }

    /**
     * PickPackWaveComplete_POST
     * 
     * @param waveNbr  (required)
     * @param asyncFlg  (optional)
     * @param closeContainerStatus  (optional)
     * @param companyId  (optional)
     * @param companyIdCode  (optional)
     * @param facilityId  (optional)
     * @param facilityIdCode  (optional)
     * @param mheSystemCode  (optional)
     * @param reasonCode  (optional)
     * @param updateInventoryOnShortFlg  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object pickPackWaveCompletePOST(String waveNbr, Boolean asyncFlg, String closeContainerStatus, BigDecimal companyId, String companyIdCode, BigDecimal facilityId, String facilityIdCode, String mheSystemCode, String reasonCode, Boolean updateInventoryOnShortFlg) throws ApiException {
        ApiResponse<Object> resp = pickPackWaveCompletePOSTWithHttpInfo(waveNbr, asyncFlg, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, mheSystemCode, reasonCode, updateInventoryOnShortFlg);
        return resp.getData();
    }

    /**
     * PickPackWaveComplete_POST
     * 
     * @param waveNbr  (required)
     * @param asyncFlg  (optional)
     * @param closeContainerStatus  (optional)
     * @param companyId  (optional)
     * @param companyIdCode  (optional)
     * @param facilityId  (optional)
     * @param facilityIdCode  (optional)
     * @param mheSystemCode  (optional)
     * @param reasonCode  (optional)
     * @param updateInventoryOnShortFlg  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> pickPackWaveCompletePOSTWithHttpInfo(String waveNbr, Boolean asyncFlg, String closeContainerStatus, BigDecimal companyId, String companyIdCode, BigDecimal facilityId, String facilityIdCode, String mheSystemCode, String reasonCode, Boolean updateInventoryOnShortFlg) throws ApiException {
        com.squareup.okhttp.Call call = pickPackWaveCompletePOSTValidateBeforeCall(waveNbr, asyncFlg, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, mheSystemCode, reasonCode, updateInventoryOnShortFlg, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PickPackWaveComplete_POST (asynchronously)
     * 
     * @param waveNbr  (required)
     * @param asyncFlg  (optional)
     * @param closeContainerStatus  (optional)
     * @param companyId  (optional)
     * @param companyIdCode  (optional)
     * @param facilityId  (optional)
     * @param facilityIdCode  (optional)
     * @param mheSystemCode  (optional)
     * @param reasonCode  (optional)
     * @param updateInventoryOnShortFlg  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call pickPackWaveCompletePOSTAsync(String waveNbr, Boolean asyncFlg, String closeContainerStatus, BigDecimal companyId, String companyIdCode, BigDecimal facilityId, String facilityIdCode, String mheSystemCode, String reasonCode, Boolean updateInventoryOnShortFlg, final ApiCallback<Object> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = pickPackWaveCompletePOSTValidateBeforeCall(waveNbr, asyncFlg, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, mheSystemCode, reasonCode, updateInventoryOnShortFlg, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
