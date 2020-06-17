# \EntityupsRoutingCodeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityUpsRoutingCodeByIdGET**](EntityupsRoutingCodeApi.md#EntityUpsRoutingCodeByIdGET) | **Get** /entity/ups_routing_code/{id} | EntityUpsRoutingCodeById_GET
[**EntityUpsRoutingCodeDescribeGET**](EntityupsRoutingCodeApi.md#EntityUpsRoutingCodeDescribeGET) | **Get** /entity/ups_routing_code/describe | EntityUpsRoutingCodeDescribe_GET
[**EntityUpsRoutingCodeGET**](EntityupsRoutingCodeApi.md#EntityUpsRoutingCodeGET) | **Get** /entity/ups_routing_code | EntityUpsRoutingCode_GET


# **EntityUpsRoutingCodeByIdGET**
> interface{} EntityUpsRoutingCodeByIdGET(ctx, id, optional)
EntityUpsRoutingCodeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityupsRoutingCodeApiEntityUpsRoutingCodeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityupsRoutingCodeApiEntityUpsRoutingCodeByIdGETOpts struct

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

# **EntityUpsRoutingCodeDescribeGET**
> interface{} EntityUpsRoutingCodeDescribeGET(ctx, )
EntityUpsRoutingCodeDescribe_GET



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

# **EntityUpsRoutingCodeGET**
> interface{} EntityUpsRoutingCodeGET(ctx, optional)
EntityUpsRoutingCode_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityupsRoutingCodeApiEntityUpsRoutingCodeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityupsRoutingCodeApiEntityUpsRoutingCodeGETOpts struct

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

