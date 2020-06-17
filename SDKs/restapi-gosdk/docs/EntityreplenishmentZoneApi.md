# \EntityreplenishmentZoneApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityReplenishmentZoneByIdGET**](EntityreplenishmentZoneApi.md#EntityReplenishmentZoneByIdGET) | **Get** /entity/replenishment_zone/{id} | EntityReplenishmentZoneById_GET
[**EntityReplenishmentZoneGET**](EntityreplenishmentZoneApi.md#EntityReplenishmentZoneGET) | **Get** /entity/replenishment_zone | EntityReplenishmentZone_GET
[**EntityReplenishmentZonePOST**](EntityreplenishmentZoneApi.md#EntityReplenishmentZonePOST) | **Post** /entity/replenishment_zone | EntityReplenishmentZone_POST


# **EntityReplenishmentZoneByIdGET**
> interface{} EntityReplenishmentZoneByIdGET(ctx, id, optional)
EntityReplenishmentZoneById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityreplenishmentZoneApiEntityReplenishmentZoneByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityreplenishmentZoneApiEntityReplenishmentZoneByIdGETOpts struct

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

# **EntityReplenishmentZoneGET**
> interface{} EntityReplenishmentZoneGET(ctx, )
EntityReplenishmentZone_GET



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

# **EntityReplenishmentZonePOST**
> interface{} EntityReplenishmentZonePOST(ctx, )
EntityReplenishmentZone_POST



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

