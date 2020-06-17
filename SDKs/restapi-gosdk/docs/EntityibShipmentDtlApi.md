# \EntityibShipmentDtlApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityIbShipmentDtlByIdGET**](EntityibShipmentDtlApi.md#EntityIbShipmentDtlByIdGET) | **Get** /entity/ib_shipment_dtl/{id} | EntityIbShipmentDtlById_GET
[**EntityIbShipmentDtlByIdPATCH**](EntityibShipmentDtlApi.md#EntityIbShipmentDtlByIdPATCH) | **Patch** /entity/ib_shipment_dtl/{id} | EntityIbShipmentDtlById_PATCH
[**EntityIbShipmentDtlDescribeGET**](EntityibShipmentDtlApi.md#EntityIbShipmentDtlDescribeGET) | **Get** /entity/ib_shipment_dtl/describe | EntityIbShipmentDtlDescribe_GET
[**EntityIbShipmentDtlGET**](EntityibShipmentDtlApi.md#EntityIbShipmentDtlGET) | **Get** /entity/ib_shipment_dtl | EntityIbShipmentDtl_GET


# **EntityIbShipmentDtlByIdGET**
> interface{} EntityIbShipmentDtlByIdGET(ctx, id, optional)
EntityIbShipmentDtlById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityibShipmentDtlApiEntityIbShipmentDtlByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityibShipmentDtlApiEntityIbShipmentDtlByIdGETOpts struct

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

# **EntityIbShipmentDtlByIdPATCH**
> interface{} EntityIbShipmentDtlByIdPATCH(ctx, id, optional)
EntityIbShipmentDtlById_PATCH



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityibShipmentDtlApiEntityIbShipmentDtlByIdPATCHOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityibShipmentDtlApiEntityIbShipmentDtlByIdPATCHOpts struct

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

# **EntityIbShipmentDtlDescribeGET**
> interface{} EntityIbShipmentDtlDescribeGET(ctx, )
EntityIbShipmentDtlDescribe_GET



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

# **EntityIbShipmentDtlGET**
> interface{} EntityIbShipmentDtlGET(ctx, optional)
EntityIbShipmentDtl_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityibShipmentDtlApiEntityIbShipmentDtlGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityibShipmentDtlApiEntityIbShipmentDtlGETOpts struct

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

