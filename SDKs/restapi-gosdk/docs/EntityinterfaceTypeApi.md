# \EntityinterfaceTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityInterfaceTypeByIdGET**](EntityinterfaceTypeApi.md#EntityInterfaceTypeByIdGET) | **Get** /entity/interface_type/{id} | EntityInterfaceTypeById_GET
[**EntityInterfaceTypeDescribeGET**](EntityinterfaceTypeApi.md#EntityInterfaceTypeDescribeGET) | **Get** /entity/interface_type/describe | EntityInterfaceTypeDescribe_GET
[**EntityInterfaceTypeGET**](EntityinterfaceTypeApi.md#EntityInterfaceTypeGET) | **Get** /entity/interface_type | EntityInterfaceType_GET


# **EntityInterfaceTypeByIdGET**
> interface{} EntityInterfaceTypeByIdGET(ctx, id, optional)
EntityInterfaceTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityinterfaceTypeApiEntityInterfaceTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityinterfaceTypeApiEntityInterfaceTypeByIdGETOpts struct

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

# **EntityInterfaceTypeDescribeGET**
> interface{} EntityInterfaceTypeDescribeGET(ctx, )
EntityInterfaceTypeDescribe_GET



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

# **EntityInterfaceTypeGET**
> interface{} EntityInterfaceTypeGET(ctx, optional)
EntityInterfaceType_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityinterfaceTypeApiEntityInterfaceTypeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityinterfaceTypeApiEntityInterfaceTypeGETOpts struct

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

