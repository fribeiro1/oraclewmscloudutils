# \EntitywmsActivityCodeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityWmsActivityCodeByIdGET**](EntitywmsActivityCodeApi.md#EntityWmsActivityCodeByIdGET) | **Get** /entity/wms_activity_code/{id} | EntityWmsActivityCodeById_GET
[**EntityWmsActivityCodeDescribeGET**](EntitywmsActivityCodeApi.md#EntityWmsActivityCodeDescribeGET) | **Get** /entity/wms_activity_code/describe | EntityWmsActivityCodeDescribe_GET
[**EntityWmsActivityCodeGET**](EntitywmsActivityCodeApi.md#EntityWmsActivityCodeGET) | **Get** /entity/wms_activity_code | EntityWmsActivityCode_GET


# **EntityWmsActivityCodeByIdGET**
> interface{} EntityWmsActivityCodeByIdGET(ctx, id, optional)
EntityWmsActivityCodeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitywmsActivityCodeApiEntityWmsActivityCodeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitywmsActivityCodeApiEntityWmsActivityCodeByIdGETOpts struct

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

# **EntityWmsActivityCodeDescribeGET**
> interface{} EntityWmsActivityCodeDescribeGET(ctx, )
EntityWmsActivityCodeDescribe_GET



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

# **EntityWmsActivityCodeGET**
> interface{} EntityWmsActivityCodeGET(ctx, optional)
EntityWmsActivityCode_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitywmsActivityCodeApiEntityWmsActivityCodeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitywmsActivityCodeApiEntityWmsActivityCodeGETOpts struct

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

