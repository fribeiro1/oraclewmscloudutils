# \EntitymheDestinationCodeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityMheDestinationCodeByIdGET**](EntitymheDestinationCodeApi.md#EntityMheDestinationCodeByIdGET) | **Get** /entity/mhe_destination_code/{id} | EntityMheDestinationCodeById_GET
[**EntityMheDestinationCodeDescribeGET**](EntitymheDestinationCodeApi.md#EntityMheDestinationCodeDescribeGET) | **Get** /entity/mhe_destination_code/describe | EntityMheDestinationCodeDescribe_GET
[**EntityMheDestinationCodeGET**](EntitymheDestinationCodeApi.md#EntityMheDestinationCodeGET) | **Get** /entity/mhe_destination_code | EntityMheDestinationCode_GET


# **EntityMheDestinationCodeByIdGET**
> interface{} EntityMheDestinationCodeByIdGET(ctx, id, optional)
EntityMheDestinationCodeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitymheDestinationCodeApiEntityMheDestinationCodeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitymheDestinationCodeApiEntityMheDestinationCodeByIdGETOpts struct

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

# **EntityMheDestinationCodeDescribeGET**
> interface{} EntityMheDestinationCodeDescribeGET(ctx, )
EntityMheDestinationCodeDescribe_GET



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

# **EntityMheDestinationCodeGET**
> interface{} EntityMheDestinationCodeGET(ctx, optional)
EntityMheDestinationCode_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitymheDestinationCodeApiEntityMheDestinationCodeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitymheDestinationCodeApiEntityMheDestinationCodeGETOpts struct

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

