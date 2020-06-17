# \EntitypaymentMethodApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityPaymentMethodByIdGET**](EntitypaymentMethodApi.md#EntityPaymentMethodByIdGET) | **Get** /entity/payment_method/{id} | EntityPaymentMethodById_GET
[**EntityPaymentMethodDescribeGET**](EntitypaymentMethodApi.md#EntityPaymentMethodDescribeGET) | **Get** /entity/payment_method/describe | EntityPaymentMethodDescribe_GET
[**EntityPaymentMethodGET**](EntitypaymentMethodApi.md#EntityPaymentMethodGET) | **Get** /entity/payment_method | EntityPaymentMethod_GET


# **EntityPaymentMethodByIdGET**
> interface{} EntityPaymentMethodByIdGET(ctx, id, optional)
EntityPaymentMethodById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitypaymentMethodApiEntityPaymentMethodByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitypaymentMethodApiEntityPaymentMethodByIdGETOpts struct

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

# **EntityPaymentMethodDescribeGET**
> interface{} EntityPaymentMethodDescribeGET(ctx, )
EntityPaymentMethodDescribe_GET



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

# **EntityPaymentMethodGET**
> interface{} EntityPaymentMethodGET(ctx, optional)
EntityPaymentMethod_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitypaymentMethodApiEntityPaymentMethodGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitypaymentMethodApiEntityPaymentMethodGETOpts struct

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

