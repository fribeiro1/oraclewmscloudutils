# \EntityfacilityTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityFacilityTypeByIdGET**](EntityfacilityTypeApi.md#EntityFacilityTypeByIdGET) | **Get** /entity/facility_type/{id} | EntityFacilityTypeById_GET
[**EntityFacilityTypeDescribeGET**](EntityfacilityTypeApi.md#EntityFacilityTypeDescribeGET) | **Get** /entity/facility_type/describe | EntityFacilityTypeDescribe_GET
[**EntityFacilityTypeGET**](EntityfacilityTypeApi.md#EntityFacilityTypeGET) | **Get** /entity/facility_type | EntityFacilityType_GET


# **EntityFacilityTypeByIdGET**
> interface{} EntityFacilityTypeByIdGET(ctx, id, optional)
EntityFacilityTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityfacilityTypeApiEntityFacilityTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityfacilityTypeApiEntityFacilityTypeByIdGETOpts struct

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

# **EntityFacilityTypeDescribeGET**
> interface{} EntityFacilityTypeDescribeGET(ctx, )
EntityFacilityTypeDescribe_GET



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

# **EntityFacilityTypeGET**
> interface{} EntityFacilityTypeGET(ctx, optional)
EntityFacilityType_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityfacilityTypeApiEntityFacilityTypeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityfacilityTypeApiEntityFacilityTypeGETOpts struct

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

