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

public class EntitytaskApi {
    private ApiClient apiClient;

    public EntitytaskApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EntitytaskApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for entityTaskByIdGET
     * @param id  (required)
     * @param fields  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call entityTaskByIdGETCall(BigDecimal id, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/entity/task/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call entityTaskByIdGETValidateBeforeCall(BigDecimal id, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling entityTaskByIdGET(Async)");
        }
        

        com.squareup.okhttp.Call call = entityTaskByIdGETCall(id, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * EntityTaskById_GET
     * 
     * @param id  (required)
     * @param fields  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object entityTaskByIdGET(BigDecimal id, String fields) throws ApiException {
        ApiResponse<Object> resp = entityTaskByIdGETWithHttpInfo(id, fields);
        return resp.getData();
    }

    /**
     * EntityTaskById_GET
     * 
     * @param id  (required)
     * @param fields  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> entityTaskByIdGETWithHttpInfo(BigDecimal id, String fields) throws ApiException {
        com.squareup.okhttp.Call call = entityTaskByIdGETValidateBeforeCall(id, fields, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * EntityTaskById_GET (asynchronously)
     * 
     * @param id  (required)
     * @param fields  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call entityTaskByIdGETAsync(BigDecimal id, String fields, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = entityTaskByIdGETValidateBeforeCall(id, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for entityTaskDescribeGET
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call entityTaskDescribeGETCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/entity/task/describe";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call entityTaskDescribeGETValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = entityTaskDescribeGETCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * EntityTaskDescribe_GET
     * 
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object entityTaskDescribeGET() throws ApiException {
        ApiResponse<Object> resp = entityTaskDescribeGETWithHttpInfo();
        return resp.getData();
    }

    /**
     * EntityTaskDescribe_GET
     * 
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> entityTaskDescribeGETWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = entityTaskDescribeGETValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * EntityTaskDescribe_GET (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call entityTaskDescribeGETAsync(final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = entityTaskDescribeGETValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for entityTaskGET
     * @param fields  (optional)
     * @param ordering  (optional)
     * @param pageMode  (optional, default to paged)
     * @param facilityId  (optional)
     * @param facilityIdCode  (optional)
     * @param locationBarcode  (optional)
     * @param taskType  (optional)
     * @param orderingRule  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call entityTaskGETCall(String fields, String ordering, String pageMode, Integer facilityId, String facilityIdCode, String locationBarcode, String taskType, String orderingRule, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/entity/task";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));
        if (ordering != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ordering", ordering));
        if (pageMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_mode", pageMode));
        if (facilityId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("facility_id", facilityId));
        if (facilityIdCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("facility_id__code", facilityIdCode));
        if (locationBarcode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("location_barcode", locationBarcode));
        if (taskType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("task_type", taskType));
        if (orderingRule != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ordering_rule", orderingRule));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call entityTaskGETValidateBeforeCall(String fields, String ordering, String pageMode, Integer facilityId, String facilityIdCode, String locationBarcode, String taskType, String orderingRule, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = entityTaskGETCall(fields, ordering, pageMode, facilityId, facilityIdCode, locationBarcode, taskType, orderingRule, progressListener, progressRequestListener);
        return call;

    }

    /**
     * EntityTask_GET
     * 
     * @param fields  (optional)
     * @param ordering  (optional)
     * @param pageMode  (optional, default to paged)
     * @param facilityId  (optional)
     * @param facilityIdCode  (optional)
     * @param locationBarcode  (optional)
     * @param taskType  (optional)
     * @param orderingRule  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object entityTaskGET(String fields, String ordering, String pageMode, Integer facilityId, String facilityIdCode, String locationBarcode, String taskType, String orderingRule) throws ApiException {
        ApiResponse<Object> resp = entityTaskGETWithHttpInfo(fields, ordering, pageMode, facilityId, facilityIdCode, locationBarcode, taskType, orderingRule);
        return resp.getData();
    }

    /**
     * EntityTask_GET
     * 
     * @param fields  (optional)
     * @param ordering  (optional)
     * @param pageMode  (optional, default to paged)
     * @param facilityId  (optional)
     * @param facilityIdCode  (optional)
     * @param locationBarcode  (optional)
     * @param taskType  (optional)
     * @param orderingRule  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> entityTaskGETWithHttpInfo(String fields, String ordering, String pageMode, Integer facilityId, String facilityIdCode, String locationBarcode, String taskType, String orderingRule) throws ApiException {
        com.squareup.okhttp.Call call = entityTaskGETValidateBeforeCall(fields, ordering, pageMode, facilityId, facilityIdCode, locationBarcode, taskType, orderingRule, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * EntityTask_GET (asynchronously)
     * 
     * @param fields  (optional)
     * @param ordering  (optional)
     * @param pageMode  (optional, default to paged)
     * @param facilityId  (optional)
     * @param facilityIdCode  (optional)
     * @param locationBarcode  (optional)
     * @param taskType  (optional)
     * @param orderingRule  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call entityTaskGETAsync(String fields, String ordering, String pageMode, Integer facilityId, String facilityIdCode, String locationBarcode, String taskType, String orderingRule, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = entityTaskGETValidateBeforeCall(fields, ordering, pageMode, facilityId, facilityIdCode, locationBarcode, taskType, orderingRule, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for entityTaskNextTaskGET
     * @param facilityId  (required)
     * @param facilityIdCode  (required)
     * @param locationBarcode  (required)
     * @param orderingRule  (required)
     * @param taskType  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call entityTaskNextTaskGETCall(BigDecimal facilityId, String facilityIdCode, String locationBarcode, String orderingRule, String taskType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/entity/task/next_task";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (facilityId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("facility_id", facilityId));
        if (facilityIdCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("facility_id__code", facilityIdCode));
        if (locationBarcode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("location_barcode", locationBarcode));
        if (orderingRule != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ordering_rule", orderingRule));
        if (taskType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("task_type", taskType));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call entityTaskNextTaskGETValidateBeforeCall(BigDecimal facilityId, String facilityIdCode, String locationBarcode, String orderingRule, String taskType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'facilityId' is set
        if (facilityId == null) {
            throw new ApiException("Missing the required parameter 'facilityId' when calling entityTaskNextTaskGET(Async)");
        }
        
        // verify the required parameter 'facilityIdCode' is set
        if (facilityIdCode == null) {
            throw new ApiException("Missing the required parameter 'facilityIdCode' when calling entityTaskNextTaskGET(Async)");
        }
        
        // verify the required parameter 'locationBarcode' is set
        if (locationBarcode == null) {
            throw new ApiException("Missing the required parameter 'locationBarcode' when calling entityTaskNextTaskGET(Async)");
        }
        
        // verify the required parameter 'orderingRule' is set
        if (orderingRule == null) {
            throw new ApiException("Missing the required parameter 'orderingRule' when calling entityTaskNextTaskGET(Async)");
        }
        
        // verify the required parameter 'taskType' is set
        if (taskType == null) {
            throw new ApiException("Missing the required parameter 'taskType' when calling entityTaskNextTaskGET(Async)");
        }
        

        com.squareup.okhttp.Call call = entityTaskNextTaskGETCall(facilityId, facilityIdCode, locationBarcode, orderingRule, taskType, progressListener, progressRequestListener);
        return call;

    }

    /**
     * EntityTaskNextTask_GET
     * 
     * @param facilityId  (required)
     * @param facilityIdCode  (required)
     * @param locationBarcode  (required)
     * @param orderingRule  (required)
     * @param taskType  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object entityTaskNextTaskGET(BigDecimal facilityId, String facilityIdCode, String locationBarcode, String orderingRule, String taskType) throws ApiException {
        ApiResponse<Object> resp = entityTaskNextTaskGETWithHttpInfo(facilityId, facilityIdCode, locationBarcode, orderingRule, taskType);
        return resp.getData();
    }

    /**
     * EntityTaskNextTask_GET
     * 
     * @param facilityId  (required)
     * @param facilityIdCode  (required)
     * @param locationBarcode  (required)
     * @param orderingRule  (required)
     * @param taskType  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> entityTaskNextTaskGETWithHttpInfo(BigDecimal facilityId, String facilityIdCode, String locationBarcode, String orderingRule, String taskType) throws ApiException {
        com.squareup.okhttp.Call call = entityTaskNextTaskGETValidateBeforeCall(facilityId, facilityIdCode, locationBarcode, orderingRule, taskType, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * EntityTaskNextTask_GET (asynchronously)
     * 
     * @param facilityId  (required)
     * @param facilityIdCode  (required)
     * @param locationBarcode  (required)
     * @param orderingRule  (required)
     * @param taskType  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call entityTaskNextTaskGETAsync(BigDecimal facilityId, String facilityIdCode, String locationBarcode, String orderingRule, String taskType, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = entityTaskNextTaskGETValidateBeforeCall(facilityId, facilityIdCode, locationBarcode, orderingRule, taskType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
