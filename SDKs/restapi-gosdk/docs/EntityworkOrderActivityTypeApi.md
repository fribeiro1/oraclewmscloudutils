# \EntityworkOrderActivityTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityWorkOrderActivityTypeByIdGET**](EntityworkOrderActivityTypeApi.md#EntityWorkOrderActivityTypeByIdGET) | **Get** /entity/work_order_activity_type/{id} | EntityWorkOrderActivityTypeById_GET
[**EntityWorkOrderActivityTypeDescribeGET**](EntityworkOrderActivityTypeApi.md#EntityWorkOrderActivityTypeDescribeGET) | **Get** /entity/work_order_activity_type/describe | EntityWorkOrderActivityTypeDescribe_GET
[**EntityWorkOrderActivityTypeGET**](EntityworkOrderActivityTypeApi.md#EntityWorkOrderActivityTypeGET) | **Get** /entity/work_order_activity_type | EntityWorkOrderActivityType_GET


# **EntityWorkOrderActivityTypeByIdGET**
> interface{} EntityWorkOrderActivityTypeByIdGET(ctx, id, optional)
EntityWorkOrderActivityTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityworkOrderActivityTypeApiEntityWorkOrderActivityTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityworkOrderActivityTypeApiEntityWorkOrderActivityTypeByIdGETOpts struct

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

# **EntityWorkOrderActivityTypeDescribeGET**
> interface{} EntityWorkOrderActivityTypeDescribeGET(ctx, )
EntityWorkOrderActivityTypeDescribe_GET



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

# **EntityWorkOrderActivityTypeGET**
> interface{} EntityWorkOrderActivityTypeGET(ctx, optional)
EntityWorkOrderActivityType_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityworkOrderActivityTypeApiEntityWorkOrderActivityTypeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityworkOrderActivityTypeApiEntityWorkOrderActivityTypeGETOpts struct

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

