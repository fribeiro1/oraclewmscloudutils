# \EntityallocationDistributionModeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityAllocationDistributionModeByIdGET**](EntityallocationDistributionModeApi.md#EntityAllocationDistributionModeByIdGET) | **Get** /entity/allocation_distribution_mode/{id} | EntityAllocationDistributionModeById_GET
[**EntityAllocationDistributionModeDescribeGET**](EntityallocationDistributionModeApi.md#EntityAllocationDistributionModeDescribeGET) | **Get** /entity/allocation_distribution_mode/describe | EntityAllocationDistributionModeDescribe_GET
[**EntityAllocationDistributionModeGET**](EntityallocationDistributionModeApi.md#EntityAllocationDistributionModeGET) | **Get** /entity/allocation_distribution_mode | EntityAllocationDistributionMode_GET


# **EntityAllocationDistributionModeByIdGET**
> interface{} EntityAllocationDistributionModeByIdGET(ctx, id, optional)
EntityAllocationDistributionModeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityallocationDistributionModeApiEntityAllocationDistributionModeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityallocationDistributionModeApiEntityAllocationDistributionModeByIdGETOpts struct

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

# **EntityAllocationDistributionModeDescribeGET**
> interface{} EntityAllocationDistributionModeDescribeGET(ctx, )
EntityAllocationDistributionModeDescribe_GET



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

# **EntityAllocationDistributionModeGET**
> interface{} EntityAllocationDistributionModeGET(ctx, optional)
EntityAllocationDistributionMode_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityallocationDistributionModeApiEntityAllocationDistributionModeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityallocationDistributionModeApiEntityAllocationDistributionModeGETOpts struct

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

