# \EntitycarrierWebserviceLabelTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityCarrierWebserviceLabelTypeByIdGET**](EntitycarrierWebserviceLabelTypeApi.md#EntityCarrierWebserviceLabelTypeByIdGET) | **Get** /entity/carrier_webservice_label_type/{id} | EntityCarrierWebserviceLabelTypeById_GET
[**EntityCarrierWebserviceLabelTypeDescribeGET**](EntitycarrierWebserviceLabelTypeApi.md#EntityCarrierWebserviceLabelTypeDescribeGET) | **Get** /entity/carrier_webservice_label_type/describe | EntityCarrierWebserviceLabelTypeDescribe_GET
[**EntityCarrierWebserviceLabelTypeGET**](EntitycarrierWebserviceLabelTypeApi.md#EntityCarrierWebserviceLabelTypeGET) | **Get** /entity/carrier_webservice_label_type | EntityCarrierWebserviceLabelType_GET


# **EntityCarrierWebserviceLabelTypeByIdGET**
> interface{} EntityCarrierWebserviceLabelTypeByIdGET(ctx, id, optional)
EntityCarrierWebserviceLabelTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitycarrierWebserviceLabelTypeApiEntityCarrierWebserviceLabelTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitycarrierWebserviceLabelTypeApiEntityCarrierWebserviceLabelTypeByIdGETOpts struct

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

# **EntityCarrierWebserviceLabelTypeDescribeGET**
> interface{} EntityCarrierWebserviceLabelTypeDescribeGET(ctx, )
EntityCarrierWebserviceLabelTypeDescribe_GET



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

# **EntityCarrierWebserviceLabelTypeGET**
> interface{} EntityCarrierWebserviceLabelTypeGET(ctx, optional)
EntityCarrierWebserviceLabelType_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitycarrierWebserviceLabelTypeApiEntityCarrierWebserviceLabelTypeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitycarrierWebserviceLabelTypeApiEntityCarrierWebserviceLabelTypeGETOpts struct

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

