# \EntityoblpnPrintingValidationApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityOblpnPrintingValidationByIdGET**](EntityoblpnPrintingValidationApi.md#EntityOblpnPrintingValidationByIdGET) | **Get** /entity/oblpn_printing_validation/{id} | EntityOblpnPrintingValidationById_GET
[**EntityOblpnPrintingValidationDescribeGET**](EntityoblpnPrintingValidationApi.md#EntityOblpnPrintingValidationDescribeGET) | **Get** /entity/oblpn_printing_validation/describe | EntityOblpnPrintingValidationDescribe_GET
[**EntityOblpnPrintingValidationGET**](EntityoblpnPrintingValidationApi.md#EntityOblpnPrintingValidationGET) | **Get** /entity/oblpn_printing_validation | EntityOblpnPrintingValidation_GET


# **EntityOblpnPrintingValidationByIdGET**
> interface{} EntityOblpnPrintingValidationByIdGET(ctx, id, optional)
EntityOblpnPrintingValidationById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityoblpnPrintingValidationApiEntityOblpnPrintingValidationByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityoblpnPrintingValidationApiEntityOblpnPrintingValidationByIdGETOpts struct

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

# **EntityOblpnPrintingValidationDescribeGET**
> interface{} EntityOblpnPrintingValidationDescribeGET(ctx, )
EntityOblpnPrintingValidationDescribe_GET



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

# **EntityOblpnPrintingValidationGET**
> interface{} EntityOblpnPrintingValidationGET(ctx, optional)
EntityOblpnPrintingValidation_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityoblpnPrintingValidationApiEntityOblpnPrintingValidationGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityoblpnPrintingValidationApiEntityOblpnPrintingValidationGETOpts struct

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

