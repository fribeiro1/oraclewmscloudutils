# \EntityshippingBlockedSelectionCriteriaApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityShippingBlockedSelectionCriteriaDescribeGET**](EntityshippingBlockedSelectionCriteriaApi.md#EntityShippingBlockedSelectionCriteriaDescribeGET) | **Get** /entity/shipping_blocked_selection_criteria/describe | EntityShippingBlockedSelectionCriteriaDescribe_GET
[**EntityShippingBlockedSelectionCriteriaGET**](EntityshippingBlockedSelectionCriteriaApi.md#EntityShippingBlockedSelectionCriteriaGET) | **Get** /entity/shipping_blocked_selection_criteria | EntityShippingBlockedSelectionCriteria_GET
[**GetEntityShippingBlockedSelectionCriteriaGET**](EntityshippingBlockedSelectionCriteriaApi.md#GetEntityShippingBlockedSelectionCriteriaGET) | **Get** /entity/shipping_blocked_selection_criteria/{id} | EntityShippingBlockedSelectionCriteria_GET


# **EntityShippingBlockedSelectionCriteriaDescribeGET**
> interface{} EntityShippingBlockedSelectionCriteriaDescribeGET(ctx, )
EntityShippingBlockedSelectionCriteriaDescribe_GET



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

# **EntityShippingBlockedSelectionCriteriaGET**
> interface{} EntityShippingBlockedSelectionCriteriaGET(ctx, optional)
EntityShippingBlockedSelectionCriteria_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityshippingBlockedSelectionCriteriaApiEntityShippingBlockedSelectionCriteriaGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityshippingBlockedSelectionCriteriaApiEntityShippingBlockedSelectionCriteriaGETOpts struct

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

# **GetEntityShippingBlockedSelectionCriteriaGET**
> interface{} GetEntityShippingBlockedSelectionCriteriaGET(ctx, id, optional)
EntityShippingBlockedSelectionCriteria_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityshippingBlockedSelectionCriteriaApiGetEntityShippingBlockedSelectionCriteriaGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityshippingBlockedSelectionCriteriaApiGetEntityShippingBlockedSelectionCriteriaGETOpts struct

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

