# \EntityibShipmentSerialNbrApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityIbShipmentSerialNbrByIdGET**](EntityibShipmentSerialNbrApi.md#EntityIbShipmentSerialNbrByIdGET) | **Get** /entity/ib_shipment_serial_nbr/{id} | EntityIbShipmentSerialNbrById_GET
[**EntityIbShipmentSerialNbrDescribeGET**](EntityibShipmentSerialNbrApi.md#EntityIbShipmentSerialNbrDescribeGET) | **Get** /entity/ib_shipment_serial_nbr/describe | EntityIbShipmentSerialNbrDescribe_GET
[**EntityIbShipmentSerialNbrGET**](EntityibShipmentSerialNbrApi.md#EntityIbShipmentSerialNbrGET) | **Get** /entity/ib_shipment_serial_nbr | EntityIbShipmentSerialNbr_GET


# **EntityIbShipmentSerialNbrByIdGET**
> interface{} EntityIbShipmentSerialNbrByIdGET(ctx, id, optional)
EntityIbShipmentSerialNbrById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityibShipmentSerialNbrApiEntityIbShipmentSerialNbrByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityibShipmentSerialNbrApiEntityIbShipmentSerialNbrByIdGETOpts struct

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

# **EntityIbShipmentSerialNbrDescribeGET**
> interface{} EntityIbShipmentSerialNbrDescribeGET(ctx, )
EntityIbShipmentSerialNbrDescribe_GET



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

# **EntityIbShipmentSerialNbrGET**
> interface{} EntityIbShipmentSerialNbrGET(ctx, optional)
EntityIbShipmentSerialNbr_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityibShipmentSerialNbrApiEntityIbShipmentSerialNbrGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityibShipmentSerialNbrApiEntityIbShipmentSerialNbrGETOpts struct

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

