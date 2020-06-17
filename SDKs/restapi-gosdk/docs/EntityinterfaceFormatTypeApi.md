# \EntityinterfaceFormatTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityInterfaceFormatTypeByIdGET**](EntityinterfaceFormatTypeApi.md#EntityInterfaceFormatTypeByIdGET) | **Get** /entity/interface_format_type/{id} | EntityInterfaceFormatTypeById_GET
[**EntityInterfaceFormatTypeDescribeGET**](EntityinterfaceFormatTypeApi.md#EntityInterfaceFormatTypeDescribeGET) | **Get** /entity/interface_format_type/describe | EntityInterfaceFormatTypeDescribe_GET
[**EntityInterfaceFormatTypeGET**](EntityinterfaceFormatTypeApi.md#EntityInterfaceFormatTypeGET) | **Get** /entity/interface_format_type | EntityInterfaceFormatType_GET


# **EntityInterfaceFormatTypeByIdGET**
> interface{} EntityInterfaceFormatTypeByIdGET(ctx, id, optional)
EntityInterfaceFormatTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityinterfaceFormatTypeApiEntityInterfaceFormatTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityinterfaceFormatTypeApiEntityInterfaceFormatTypeByIdGETOpts struct

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

# **EntityInterfaceFormatTypeDescribeGET**
> interface{} EntityInterfaceFormatTypeDescribeGET(ctx, )
EntityInterfaceFormatTypeDescribe_GET



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

# **EntityInterfaceFormatTypeGET**
> interface{} EntityInterfaceFormatTypeGET(ctx, optional)
EntityInterfaceFormatType_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityinterfaceFormatTypeApiEntityInterfaceFormatTypeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityinterfaceFormatTypeApiEntityInterfaceFormatTypeGETOpts struct

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

