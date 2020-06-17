# \EntitycarrierIntegrationTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityCarrierIntegrationTypeByIdGET**](EntitycarrierIntegrationTypeApi.md#EntityCarrierIntegrationTypeByIdGET) | **Get** /entity/carrier_integration_type/{id} | EntityCarrierIntegrationTypeById_GET
[**EntityCarrierIntegrationTypeDescribeGET**](EntitycarrierIntegrationTypeApi.md#EntityCarrierIntegrationTypeDescribeGET) | **Get** /entity/carrier_integration_type/describe | EntityCarrierIntegrationTypeDescribe_GET
[**EntityCarrierIntegrationTypeGET**](EntitycarrierIntegrationTypeApi.md#EntityCarrierIntegrationTypeGET) | **Get** /entity/carrier_integration_type | EntityCarrierIntegrationType_GET


# **EntityCarrierIntegrationTypeByIdGET**
> interface{} EntityCarrierIntegrationTypeByIdGET(ctx, id, optional)
EntityCarrierIntegrationTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitycarrierIntegrationTypeApiEntityCarrierIntegrationTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitycarrierIntegrationTypeApiEntityCarrierIntegrationTypeByIdGETOpts struct

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

# **EntityCarrierIntegrationTypeDescribeGET**
> interface{} EntityCarrierIntegrationTypeDescribeGET(ctx, )
EntityCarrierIntegrationTypeDescribe_GET



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

# **EntityCarrierIntegrationTypeGET**
> interface{} EntityCarrierIntegrationTypeGET(ctx, optional)
EntityCarrierIntegrationType_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitycarrierIntegrationTypeApiEntityCarrierIntegrationTypeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitycarrierIntegrationTypeApiEntityCarrierIntegrationTypeGETOpts struct

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

