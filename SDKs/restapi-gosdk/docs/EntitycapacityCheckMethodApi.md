# \EntitycapacityCheckMethodApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityCapacityCheckMethodByIdGET**](EntitycapacityCheckMethodApi.md#EntityCapacityCheckMethodByIdGET) | **Get** /entity/capacity_check_method/{id} | EntityCapacityCheckMethodById_GET
[**EntityCapacityCheckMethodDescribeGET**](EntitycapacityCheckMethodApi.md#EntityCapacityCheckMethodDescribeGET) | **Get** /entity/capacity_check_method/describe | EntityCapacityCheckMethodDescribe_GET
[**EntityCapacityCheckMethodGET**](EntitycapacityCheckMethodApi.md#EntityCapacityCheckMethodGET) | **Get** /entity/capacity_check_method | EntityCapacityCheckMethod_GET


# **EntityCapacityCheckMethodByIdGET**
> interface{} EntityCapacityCheckMethodByIdGET(ctx, id, optional)
EntityCapacityCheckMethodById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitycapacityCheckMethodApiEntityCapacityCheckMethodByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitycapacityCheckMethodApiEntityCapacityCheckMethodByIdGETOpts struct

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

# **EntityCapacityCheckMethodDescribeGET**
> interface{} EntityCapacityCheckMethodDescribeGET(ctx, )
EntityCapacityCheckMethodDescribe_GET



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

# **EntityCapacityCheckMethodGET**
> interface{} EntityCapacityCheckMethodGET(ctx, optional)
EntityCapacityCheckMethod_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitycapacityCheckMethodApiEntityCapacityCheckMethodGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitycapacityCheckMethodApiEntityCapacityCheckMethodGETOpts struct

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

