# \EntitycontainerVasStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityContainerVasStatusByIdGET**](EntitycontainerVasStatusApi.md#EntityContainerVasStatusByIdGET) | **Get** /entity/container_vas_status/{id} | EntityContainerVasStatusById_GET
[**EntityContainerVasStatusDescribeGET**](EntitycontainerVasStatusApi.md#EntityContainerVasStatusDescribeGET) | **Get** /entity/container_vas_status/describe | EntityContainerVasStatusDescribe_GET
[**EntityContainerVasStatusGET**](EntitycontainerVasStatusApi.md#EntityContainerVasStatusGET) | **Get** /entity/container_vas_status | EntityContainerVasStatus_GET


# **EntityContainerVasStatusByIdGET**
> interface{} EntityContainerVasStatusByIdGET(ctx, id, optional)
EntityContainerVasStatusById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitycontainerVasStatusApiEntityContainerVasStatusByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitycontainerVasStatusApiEntityContainerVasStatusByIdGETOpts struct

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

# **EntityContainerVasStatusDescribeGET**
> interface{} EntityContainerVasStatusDescribeGET(ctx, )
EntityContainerVasStatusDescribe_GET



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

# **EntityContainerVasStatusGET**
> interface{} EntityContainerVasStatusGET(ctx, optional)
EntityContainerVasStatus_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitycontainerVasStatusApiEntityContainerVasStatusGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitycontainerVasStatusApiEntityContainerVasStatusGETOpts struct

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

