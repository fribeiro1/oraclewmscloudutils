# \EntityworkOrderComponentApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityWorkOrderComponentByIdGET**](EntityworkOrderComponentApi.md#EntityWorkOrderComponentByIdGET) | **Get** /entity/work_order_component/{id} | EntityWorkOrderComponentById_GET
[**EntityWorkOrderComponentDescribeGET**](EntityworkOrderComponentApi.md#EntityWorkOrderComponentDescribeGET) | **Get** /entity/work_order_component/describe | EntityWorkOrderComponentDescribe_GET
[**EntityWorkOrderComponentGET**](EntityworkOrderComponentApi.md#EntityWorkOrderComponentGET) | **Get** /entity/work_order_component | EntityWorkOrderComponent_GET


# **EntityWorkOrderComponentByIdGET**
> interface{} EntityWorkOrderComponentByIdGET(ctx, id, optional)
EntityWorkOrderComponentById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityworkOrderComponentApiEntityWorkOrderComponentByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityworkOrderComponentApiEntityWorkOrderComponentByIdGETOpts struct

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

# **EntityWorkOrderComponentDescribeGET**
> interface{} EntityWorkOrderComponentDescribeGET(ctx, )
EntityWorkOrderComponentDescribe_GET



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

# **EntityWorkOrderComponentGET**
> interface{} EntityWorkOrderComponentGET(ctx, optional)
EntityWorkOrderComponent_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityworkOrderComponentApiEntityWorkOrderComponentGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityworkOrderComponentApiEntityWorkOrderComponentGETOpts struct

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

