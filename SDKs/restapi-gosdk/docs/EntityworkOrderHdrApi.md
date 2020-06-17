# \EntityworkOrderHdrApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityWorkOrderHdrByIdGET**](EntityworkOrderHdrApi.md#EntityWorkOrderHdrByIdGET) | **Get** /entity/work_order_hdr/{id} | EntityWorkOrderHdrById_GET
[**EntityWorkOrderHdrByIdPATCH**](EntityworkOrderHdrApi.md#EntityWorkOrderHdrByIdPATCH) | **Patch** /entity/work_order_hdr/{id} | EntityWorkOrderHdrById_PATCH
[**EntityWorkOrderHdrDescribeGET**](EntityworkOrderHdrApi.md#EntityWorkOrderHdrDescribeGET) | **Get** /entity/work_order_hdr/describe | EntityWorkOrderHdrDescribe_GET
[**EntityWorkOrderHdrGET**](EntityworkOrderHdrApi.md#EntityWorkOrderHdrGET) | **Get** /entity/work_order_hdr | EntityWorkOrderHdr_GET


# **EntityWorkOrderHdrByIdGET**
> interface{} EntityWorkOrderHdrByIdGET(ctx, id, optional)
EntityWorkOrderHdrById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityworkOrderHdrApiEntityWorkOrderHdrByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityworkOrderHdrApiEntityWorkOrderHdrByIdGETOpts struct

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

# **EntityWorkOrderHdrByIdPATCH**
> interface{} EntityWorkOrderHdrByIdPATCH(ctx, id, optional)
EntityWorkOrderHdrById_PATCH



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityworkOrderHdrApiEntityWorkOrderHdrByIdPATCHOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityworkOrderHdrApiEntityWorkOrderHdrByIdPATCHOpts struct

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

# **EntityWorkOrderHdrDescribeGET**
> interface{} EntityWorkOrderHdrDescribeGET(ctx, )
EntityWorkOrderHdrDescribe_GET



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

# **EntityWorkOrderHdrGET**
> interface{} EntityWorkOrderHdrGET(ctx, optional)
EntityWorkOrderHdr_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityworkOrderHdrApiEntityWorkOrderHdrGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityworkOrderHdrApiEntityWorkOrderHdrGETOpts struct

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

