# \EntitywmsActivityStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityWmsActivityStatusByIdGET**](EntitywmsActivityStatusApi.md#EntityWmsActivityStatusByIdGET) | **Get** /entity/wms_activity_status/{id} | EntityWmsActivityStatusById_GET
[**EntityWmsActivityStatusDescribeGET**](EntitywmsActivityStatusApi.md#EntityWmsActivityStatusDescribeGET) | **Get** /entity/wms_activity_status/describe | EntityWmsActivityStatusDescribe_GET
[**EntityWmsActivityStatusGET**](EntitywmsActivityStatusApi.md#EntityWmsActivityStatusGET) | **Get** /entity/wms_activity_status | EntityWmsActivityStatus_GET


# **EntityWmsActivityStatusByIdGET**
> interface{} EntityWmsActivityStatusByIdGET(ctx, id, optional)
EntityWmsActivityStatusById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitywmsActivityStatusApiEntityWmsActivityStatusByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitywmsActivityStatusApiEntityWmsActivityStatusByIdGETOpts struct

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

# **EntityWmsActivityStatusDescribeGET**
> interface{} EntityWmsActivityStatusDescribeGET(ctx, )
EntityWmsActivityStatusDescribe_GET



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

# **EntityWmsActivityStatusGET**
> interface{} EntityWmsActivityStatusGET(ctx, optional)
EntityWmsActivityStatus_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitywmsActivityStatusApiEntityWmsActivityStatusGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitywmsActivityStatusApiEntityWmsActivityStatusGETOpts struct

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

