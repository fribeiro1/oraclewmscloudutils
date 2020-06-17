# \PrintApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PrintLabelIbContainerGET**](PrintApi.md#PrintLabelIbContainerGET) | **Get** /print/label/ib_container | PrintLabelIbContainer_GET
[**PrintLabelIbContainerPOST**](PrintApi.md#PrintLabelIbContainerPOST) | **Post** /print/label/ib_container | PrintLabelIbContainer_POST
[**PrintLabelPalletGET**](PrintApi.md#PrintLabelPalletGET) | **Get** /print/label/pallet | PrintLabelPallet_GET
[**PrintLabelPalletPOST**](PrintApi.md#PrintLabelPalletPOST) | **Post** /print/label/pallet | PrintLabelPallet_POST
[**PrintLabelShippingGET**](PrintApi.md#PrintLabelShippingGET) | **Get** /print/label/shipping | PrintLabelShipping_GET
[**PrintLabelShippingPOST**](PrintApi.md#PrintLabelShippingPOST) | **Post** /print/label/shipping | PrintLabelShipping_POST


# **PrintLabelIbContainerGET**
> interface{} PrintLabelIbContainerGET(ctx, companyId, containerNbr, facilityId, id, labelDesignerCode)
PrintLabelIbContainer_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **companyId** | **float32**|  | 
  **containerNbr** | **string**|  | 
  **facilityId** | **float32**|  | 
  **id** | **float32**|  | 
  **labelDesignerCode** | **string**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrintLabelIbContainerPOST**
> interface{} PrintLabelIbContainerPOST(ctx, companyId, containerNbr, facilityId, id, labelDesignerCode)
PrintLabelIbContainer_POST



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **companyId** | **float32**|  | 
  **containerNbr** | **string**|  | 
  **facilityId** | **float32**|  | 
  **id** | **float32**|  | 
  **labelDesignerCode** | **string**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrintLabelPalletGET**
> interface{} PrintLabelPalletGET(ctx, companyId, containerNbr, facilityId, id, labelDesignerCode)
PrintLabelPallet_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **companyId** | **float32**|  | 
  **containerNbr** | **string**|  | 
  **facilityId** | **float32**|  | 
  **id** | **float32**|  | 
  **labelDesignerCode** | **string**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrintLabelPalletPOST**
> interface{} PrintLabelPalletPOST(ctx, companyId, containerNbr, facilityId, id, labelDesignerCode)
PrintLabelPallet_POST



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **companyId** | **float32**|  | 
  **containerNbr** | **string**|  | 
  **facilityId** | **float32**|  | 
  **id** | **float32**|  | 
  **labelDesignerCode** | **string**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrintLabelShippingGET**
> interface{} PrintLabelShippingGET(ctx, companyId, containerNbr, facilityId, id, labelDesignerCode)
PrintLabelShipping_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **companyId** | **float32**|  | 
  **containerNbr** | **string**|  | 
  **facilityId** | **float32**|  | 
  **id** | **float32**|  | 
  **labelDesignerCode** | **string**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrintLabelShippingPOST**
> interface{} PrintLabelShippingPOST(ctx, companyId, containerNbr, facilityId, id, labelDesignerCode)
PrintLabelShipping_POST



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **companyId** | **float32**|  | 
  **containerNbr** | **string**|  | 
  **facilityId** | **float32**|  | 
  **id** | **float32**|  | 
  **labelDesignerCode** | **string**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

