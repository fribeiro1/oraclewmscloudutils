# \EntityccAdjustmentStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityCcAdjustmentStatusByIdGET**](EntityccAdjustmentStatusApi.md#EntityCcAdjustmentStatusByIdGET) | **Get** /entity/cc_adjustment_status/{id} | EntityCcAdjustmentStatusById_GET
[**EntityCcAdjustmentStatusDescribeGET**](EntityccAdjustmentStatusApi.md#EntityCcAdjustmentStatusDescribeGET) | **Get** /entity/cc_adjustment_status/describe | EntityCcAdjustmentStatusDescribe_GET
[**EntityCcAdjustmentStatusGET**](EntityccAdjustmentStatusApi.md#EntityCcAdjustmentStatusGET) | **Get** /entity/cc_adjustment_status | EntityCcAdjustmentStatus_GET


# **EntityCcAdjustmentStatusByIdGET**
> interface{} EntityCcAdjustmentStatusByIdGET(ctx, id, optional)
EntityCcAdjustmentStatusById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityccAdjustmentStatusApiEntityCcAdjustmentStatusByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityccAdjustmentStatusApiEntityCcAdjustmentStatusByIdGETOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **fields** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EntityCcAdjustmentStatusDescribeGET**
> interface{} EntityCcAdjustmentStatusDescribeGET(ctx, )
EntityCcAdjustmentStatusDescribe_GET



### Required Parameters
This endpoint does not need any parameter.

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EntityCcAdjustmentStatusGET**
> interface{} EntityCcAdjustmentStatusGET(ctx, optional)
EntityCcAdjustmentStatus_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityccAdjustmentStatusApiEntityCcAdjustmentStatusGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityccAdjustmentStatusApiEntityCcAdjustmentStatusGETOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **optional.String**|  | 
 **ordering** | **optional.String**|  | 
 **pageMode** | **optional.String**|  | [default to paged]

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

