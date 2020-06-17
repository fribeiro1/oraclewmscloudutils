# \EntityshipmentVerifOrderdtlCancelModeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityShipmentVerifOrderdtlCancelModeDescribeGET**](EntityshipmentVerifOrderdtlCancelModeApi.md#EntityShipmentVerifOrderdtlCancelModeDescribeGET) | **Get** /entity/shipment_verif_orderdtl_cancel_mode/describe | EntityShipmentVerifOrderdtlCancelModeDescribe_GET
[**EntityShipmentVerifOrderdtlCancelModeGET**](EntityshipmentVerifOrderdtlCancelModeApi.md#EntityShipmentVerifOrderdtlCancelModeGET) | **Get** /entity/shipment_verif_orderdtl_cancel_mode | EntityShipmentVerifOrderdtlCancelMode_GET
[**GetEntityShipmentVerifOrderdtlCancelModeGET**](EntityshipmentVerifOrderdtlCancelModeApi.md#GetEntityShipmentVerifOrderdtlCancelModeGET) | **Get** /entity/shipment_verif_orderdtl_cancel_mode/{id} | EntityShipmentVerifOrderdtlCancelMode_GET


# **EntityShipmentVerifOrderdtlCancelModeDescribeGET**
> interface{} EntityShipmentVerifOrderdtlCancelModeDescribeGET(ctx, )
EntityShipmentVerifOrderdtlCancelModeDescribe_GET



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

# **EntityShipmentVerifOrderdtlCancelModeGET**
> interface{} EntityShipmentVerifOrderdtlCancelModeGET(ctx, optional)
EntityShipmentVerifOrderdtlCancelMode_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityshipmentVerifOrderdtlCancelModeApiEntityShipmentVerifOrderdtlCancelModeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityshipmentVerifOrderdtlCancelModeApiEntityShipmentVerifOrderdtlCancelModeGETOpts struct

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

# **GetEntityShipmentVerifOrderdtlCancelModeGET**
> interface{} GetEntityShipmentVerifOrderdtlCancelModeGET(ctx, id, optional)
EntityShipmentVerifOrderdtlCancelMode_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityshipmentVerifOrderdtlCancelModeApiGetEntityShipmentVerifOrderdtlCancelModeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityshipmentVerifOrderdtlCancelModeApiGetEntityShipmentVerifOrderdtlCancelModeGETOpts struct

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

