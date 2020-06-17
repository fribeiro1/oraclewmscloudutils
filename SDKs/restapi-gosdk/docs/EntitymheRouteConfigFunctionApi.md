# \EntitymheRouteConfigFunctionApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityMheRouteConfigFunctionByIdGET**](EntitymheRouteConfigFunctionApi.md#EntityMheRouteConfigFunctionByIdGET) | **Get** /entity/mhe_route_config_function/{id} | EntityMheRouteConfigFunctionById_GET
[**EntityMheRouteConfigFunctionDescribeGET**](EntitymheRouteConfigFunctionApi.md#EntityMheRouteConfigFunctionDescribeGET) | **Get** /entity/mhe_route_config_function/describe | EntityMheRouteConfigFunctionDescribe_GET
[**EntityMheRouteConfigFunctionGET**](EntitymheRouteConfigFunctionApi.md#EntityMheRouteConfigFunctionGET) | **Get** /entity/mhe_route_config_function | EntityMheRouteConfigFunction_GET


# **EntityMheRouteConfigFunctionByIdGET**
> interface{} EntityMheRouteConfigFunctionByIdGET(ctx, id, optional)
EntityMheRouteConfigFunctionById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitymheRouteConfigFunctionApiEntityMheRouteConfigFunctionByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitymheRouteConfigFunctionApiEntityMheRouteConfigFunctionByIdGETOpts struct

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

# **EntityMheRouteConfigFunctionDescribeGET**
> interface{} EntityMheRouteConfigFunctionDescribeGET(ctx, )
EntityMheRouteConfigFunctionDescribe_GET



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

# **EntityMheRouteConfigFunctionGET**
> interface{} EntityMheRouteConfigFunctionGET(ctx, optional)
EntityMheRouteConfigFunction_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitymheRouteConfigFunctionApiEntityMheRouteConfigFunctionGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitymheRouteConfigFunctionApiEntityMheRouteConfigFunctionGETOpts struct

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

