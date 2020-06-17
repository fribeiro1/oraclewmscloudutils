# \EntitycolumnOrderTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityColumnOrderTypeByIdGET**](EntitycolumnOrderTypeApi.md#EntityColumnOrderTypeByIdGET) | **Get** /entity/column_order_type/{id} | EntityColumnOrderTypeById_GET
[**EntityColumnOrderTypeDescribeGET**](EntitycolumnOrderTypeApi.md#EntityColumnOrderTypeDescribeGET) | **Get** /entity/column_order_type/describe | EntityColumnOrderTypeDescribe_GET
[**EntityColumnOrderTypeGET**](EntitycolumnOrderTypeApi.md#EntityColumnOrderTypeGET) | **Get** /entity/column_order_type | EntityColumnOrderType_GET


# **EntityColumnOrderTypeByIdGET**
> interface{} EntityColumnOrderTypeByIdGET(ctx, id, optional)
EntityColumnOrderTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitycolumnOrderTypeApiEntityColumnOrderTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitycolumnOrderTypeApiEntityColumnOrderTypeByIdGETOpts struct

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

# **EntityColumnOrderTypeDescribeGET**
> interface{} EntityColumnOrderTypeDescribeGET(ctx, )
EntityColumnOrderTypeDescribe_GET



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

# **EntityColumnOrderTypeGET**
> interface{} EntityColumnOrderTypeGET(ctx, optional)
EntityColumnOrderType_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitycolumnOrderTypeApiEntityColumnOrderTypeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitycolumnOrderTypeApiEntityColumnOrderTypeGETOpts struct

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

