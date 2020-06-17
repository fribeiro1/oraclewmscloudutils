# \EntityserialNbrActionCodeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntitySerialNbrActionCodeByIdGET**](EntityserialNbrActionCodeApi.md#EntitySerialNbrActionCodeByIdGET) | **Get** /entity/serial_nbr_action_code/{id} | EntitySerialNbrActionCodeById_GET
[**EntitySerialNbrActionCodeDescribeGET**](EntityserialNbrActionCodeApi.md#EntitySerialNbrActionCodeDescribeGET) | **Get** /entity/serial_nbr_action_code/describe | EntitySerialNbrActionCodeDescribe_GET
[**EntitySerialNbrActionCodeGET**](EntityserialNbrActionCodeApi.md#EntitySerialNbrActionCodeGET) | **Get** /entity/serial_nbr_action_code | EntitySerialNbrActionCode_GET


# **EntitySerialNbrActionCodeByIdGET**
> interface{} EntitySerialNbrActionCodeByIdGET(ctx, id, optional)
EntitySerialNbrActionCodeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityserialNbrActionCodeApiEntitySerialNbrActionCodeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityserialNbrActionCodeApiEntitySerialNbrActionCodeByIdGETOpts struct

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

# **EntitySerialNbrActionCodeDescribeGET**
> interface{} EntitySerialNbrActionCodeDescribeGET(ctx, )
EntitySerialNbrActionCodeDescribe_GET



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

# **EntitySerialNbrActionCodeGET**
> interface{} EntitySerialNbrActionCodeGET(ctx, optional)
EntitySerialNbrActionCode_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityserialNbrActionCodeApiEntitySerialNbrActionCodeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityserialNbrActionCodeApiEntitySerialNbrActionCodeGETOpts struct

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

