# \EntitylocationApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityLocationByIdGET**](EntitylocationApi.md#EntityLocationByIdGET) | **Get** /entity/location/{id} | EntityLocationById_GET
[**EntityLocationByIdPATCH**](EntitylocationApi.md#EntityLocationByIdPATCH) | **Patch** /entity/location/{id} | EntityLocationById_PATCH
[**EntityLocationDescribeGET**](EntitylocationApi.md#EntityLocationDescribeGET) | **Get** /entity/location/describe | EntityLocationDescribe_GET
[**EntityLocationGET**](EntitylocationApi.md#EntityLocationGET) | **Get** /entity/location | EntityLocation_GET
[**EntityLocationUpdateActiveInventoryByIdPOST**](EntitylocationApi.md#EntityLocationUpdateActiveInventoryByIdPOST) | **Post** /entity/location/{id}/update_active_inventory | EntityLocationUpdateActiveInventoryById_POST
[**EntityLocationUpdateActiveInventoryPOST**](EntitylocationApi.md#EntityLocationUpdateActiveInventoryPOST) | **Post** /entity/location/update_active_inventory | EntityLocationUpdateActiveInventory_POST
[**EntityLocationYearFirstAvailableGET**](EntitylocationApi.md#EntityLocationYearFirstAvailableGET) | **Get** /entity/location/yard/first_available | EntityLocationYearFirstAvailable_GET


# **EntityLocationByIdGET**
> interface{} EntityLocationByIdGET(ctx, id, optional)
EntityLocationById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitylocationApiEntityLocationByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitylocationApiEntityLocationByIdGETOpts struct

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

# **EntityLocationByIdPATCH**
> interface{} EntityLocationByIdPATCH(ctx, id, optional)
EntityLocationById_PATCH



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitylocationApiEntityLocationByIdPATCHOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitylocationApiEntityLocationByIdPATCHOpts struct

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

# **EntityLocationDescribeGET**
> interface{} EntityLocationDescribeGET(ctx, )
EntityLocationDescribe_GET



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

# **EntityLocationGET**
> interface{} EntityLocationGET(ctx, optional)
EntityLocation_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitylocationApiEntityLocationGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitylocationApiEntityLocationGETOpts struct

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

# **EntityLocationUpdateActiveInventoryByIdPOST**
> interface{} EntityLocationUpdateActiveInventoryByIdPOST(ctx, id)
EntityLocationUpdateActiveInventoryById_POST



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EntityLocationUpdateActiveInventoryPOST**
> interface{} EntityLocationUpdateActiveInventoryPOST(ctx, )
EntityLocationUpdateActiveInventory_POST



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

# **EntityLocationYearFirstAvailableGET**
> interface{} EntityLocationYearFirstAvailableGET(ctx, optional)
EntityLocationYearFirstAvailable_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitylocationApiEntityLocationYearFirstAvailableGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitylocationApiEntityLocationYearFirstAvailableGETOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **facilityId** | **optional.String**|  | 
 **facilityIdCode** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

