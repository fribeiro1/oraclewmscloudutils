# \EntityqcStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityQcStatusByIdGET**](EntityqcStatusApi.md#EntityQcStatusByIdGET) | **Get** /entity/qc_status/{id} | EntityQcStatusById_GET
[**EntityQcStatusDescribeGET**](EntityqcStatusApi.md#EntityQcStatusDescribeGET) | **Get** /entity/qc_status/describe | EntityQcStatusDescribe_GET
[**EntityQcStatusGET**](EntityqcStatusApi.md#EntityQcStatusGET) | **Get** /entity/qc_status | EntityQcStatus_GET


# **EntityQcStatusByIdGET**
> interface{} EntityQcStatusByIdGET(ctx, id, optional)
EntityQcStatusById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityqcStatusApiEntityQcStatusByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityqcStatusApiEntityQcStatusByIdGETOpts struct

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

# **EntityQcStatusDescribeGET**
> interface{} EntityQcStatusDescribeGET(ctx, )
EntityQcStatusDescribe_GET



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

# **EntityQcStatusGET**
> interface{} EntityQcStatusGET(ctx, optional)
EntityQcStatus_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityqcStatusApiEntityQcStatusGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityqcStatusApiEntityQcStatusGETOpts struct

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

