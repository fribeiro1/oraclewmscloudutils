# \EntityworkAreaActivityTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityWorkAreaActivityTypeByIdGET**](EntityworkAreaActivityTypeApi.md#EntityWorkAreaActivityTypeByIdGET) | **Get** /entity/work_area_activity_type/{id} | EntityWorkAreaActivityTypeById_GET
[**EntityWorkAreaActivityTypeDescribeGET**](EntityworkAreaActivityTypeApi.md#EntityWorkAreaActivityTypeDescribeGET) | **Get** /entity/work_area_activity_type/describe | EntityWorkAreaActivityTypeDescribe_GET
[**EntityWorkAreaActivityTypeGET**](EntityworkAreaActivityTypeApi.md#EntityWorkAreaActivityTypeGET) | **Get** /entity/work_area_activity_type | EntityWorkAreaActivityType_GET


# **EntityWorkAreaActivityTypeByIdGET**
> interface{} EntityWorkAreaActivityTypeByIdGET(ctx, id, optional)
EntityWorkAreaActivityTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityworkAreaActivityTypeApiEntityWorkAreaActivityTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityworkAreaActivityTypeApiEntityWorkAreaActivityTypeByIdGETOpts struct

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

# **EntityWorkAreaActivityTypeDescribeGET**
> interface{} EntityWorkAreaActivityTypeDescribeGET(ctx, )
EntityWorkAreaActivityTypeDescribe_GET



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

# **EntityWorkAreaActivityTypeGET**
> interface{} EntityWorkAreaActivityTypeGET(ctx, optional)
EntityWorkAreaActivityType_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityworkAreaActivityTypeApiEntityWorkAreaActivityTypeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityworkAreaActivityTypeApiEntityWorkAreaActivityTypeGETOpts struct

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

