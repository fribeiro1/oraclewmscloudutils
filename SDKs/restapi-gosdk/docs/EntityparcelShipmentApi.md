# \EntityparcelShipmentApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityParcelShipmentByIdGET**](EntityparcelShipmentApi.md#EntityParcelShipmentByIdGET) | **Get** /entity/parcel_shipment/{id} | EntityParcelShipmentById_GET
[**EntityParcelShipmentDescribeGET**](EntityparcelShipmentApi.md#EntityParcelShipmentDescribeGET) | **Get** /entity/parcel_shipment/describe | EntityParcelShipmentDescribe_GET
[**EntityParcelShipmentGET**](EntityparcelShipmentApi.md#EntityParcelShipmentGET) | **Get** /entity/parcel_shipment | EntityParcelShipment_GET


# **EntityParcelShipmentByIdGET**
> interface{} EntityParcelShipmentByIdGET(ctx, id, optional)
EntityParcelShipmentById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityparcelShipmentApiEntityParcelShipmentByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityparcelShipmentApiEntityParcelShipmentByIdGETOpts struct

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

# **EntityParcelShipmentDescribeGET**
> interface{} EntityParcelShipmentDescribeGET(ctx, )
EntityParcelShipmentDescribe_GET



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

# **EntityParcelShipmentGET**
> interface{} EntityParcelShipmentGET(ctx, optional)
EntityParcelShipment_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityparcelShipmentApiEntityParcelShipmentGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityparcelShipmentApiEntityParcelShipmentGETOpts struct

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

