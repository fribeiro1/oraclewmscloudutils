# \EntityibShipmentStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityIbShipmentStatusByIdGET**](EntityibShipmentStatusApi.md#EntityIbShipmentStatusByIdGET) | **Get** /entity/ib_shipment_status/{id} | EntityIbShipmentStatusById_GET
[**EntityIbShipmentStatusDescribeGET**](EntityibShipmentStatusApi.md#EntityIbShipmentStatusDescribeGET) | **Get** /entity/ib_shipment_status/describe | EntityIbShipmentStatusDescribe_GET
[**EntityIbShipmentStatusGET**](EntityibShipmentStatusApi.md#EntityIbShipmentStatusGET) | **Get** /entity/ib_shipment_status | EntityIbShipmentStatus_GET


# **EntityIbShipmentStatusByIdGET**
> interface{} EntityIbShipmentStatusByIdGET(ctx, id, optional)
EntityIbShipmentStatusById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityibShipmentStatusApiEntityIbShipmentStatusByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityibShipmentStatusApiEntityIbShipmentStatusByIdGETOpts struct

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

# **EntityIbShipmentStatusDescribeGET**
> interface{} EntityIbShipmentStatusDescribeGET(ctx, )
EntityIbShipmentStatusDescribe_GET



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

# **EntityIbShipmentStatusGET**
> interface{} EntityIbShipmentStatusGET(ctx, optional)
EntityIbShipmentStatus_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityibShipmentStatusApiEntityIbShipmentStatusGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityibShipmentStatusApiEntityIbShipmentStatusGETOpts struct

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

