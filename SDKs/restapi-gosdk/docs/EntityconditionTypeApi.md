# \EntityconditionTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityConditionTypeByIdGET**](EntityconditionTypeApi.md#EntityConditionTypeByIdGET) | **Get** /entity/condition_type/{id} | EntityConditionTypeById_GET
[**EntityConditionTypeDescribeGET**](EntityconditionTypeApi.md#EntityConditionTypeDescribeGET) | **Get** /entity/condition_type/describe | EntityConditionTypeDescribe_GET
[**EntityConditionTypeGET**](EntityconditionTypeApi.md#EntityConditionTypeGET) | **Get** /entity/condition_type | EntityConditionType_GET


# **EntityConditionTypeByIdGET**
> interface{} EntityConditionTypeByIdGET(ctx, id, optional)
EntityConditionTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityconditionTypeApiEntityConditionTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityconditionTypeApiEntityConditionTypeByIdGETOpts struct

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

# **EntityConditionTypeDescribeGET**
> interface{} EntityConditionTypeDescribeGET(ctx, )
EntityConditionTypeDescribe_GET



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

# **EntityConditionTypeGET**
> interface{} EntityConditionTypeGET(ctx, optional)
EntityConditionType_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityconditionTypeApiEntityConditionTypeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityconditionTypeApiEntityConditionTypeGETOpts struct

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

