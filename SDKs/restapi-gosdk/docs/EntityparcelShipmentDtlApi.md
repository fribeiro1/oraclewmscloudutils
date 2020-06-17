# \EntityparcelShipmentDtlApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityParcelShipmentDtlByIdGET**](EntityparcelShipmentDtlApi.md#EntityParcelShipmentDtlByIdGET) | **Get** /entity/parcel_shipment_dtl/{id} | EntityParcelShipmentDtlById_GET
[**EntityParcelShipmentDtlDescribeGET**](EntityparcelShipmentDtlApi.md#EntityParcelShipmentDtlDescribeGET) | **Get** /entity/parcel_shipment_dtl/describe | EntityParcelShipmentDtlDescribe_GET
[**EntityParcelShipmentDtlGET**](EntityparcelShipmentDtlApi.md#EntityParcelShipmentDtlGET) | **Get** /entity/parcel_shipment_dtl | EntityParcelShipmentDtl_GET


# **EntityParcelShipmentDtlByIdGET**
> interface{} EntityParcelShipmentDtlByIdGET(ctx, id, optional)
EntityParcelShipmentDtlById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityparcelShipmentDtlApiEntityParcelShipmentDtlByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityparcelShipmentDtlApiEntityParcelShipmentDtlByIdGETOpts struct

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

# **EntityParcelShipmentDtlDescribeGET**
> interface{} EntityParcelShipmentDtlDescribeGET(ctx, )
EntityParcelShipmentDtlDescribe_GET



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

# **EntityParcelShipmentDtlGET**
> interface{} EntityParcelShipmentDtlGET(ctx, optional)
EntityParcelShipmentDtl_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityparcelShipmentDtlApiEntityParcelShipmentDtlGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityparcelShipmentDtlApiEntityParcelShipmentDtlGETOpts struct

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

