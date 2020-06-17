# \PickPackApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PickPackCloseLpnPOST**](PickPackApi.md#PickPackCloseLpnPOST) | **Post** /pick_pack/close_lpn | PickPackCloseLpn_POST
[**PickPackPickConfirmPOST**](PickPackApi.md#PickPackPickConfirmPOST) | **Post** /pick_pack/pick_confirm | PickPackPickConfirm_POST
[**PickPackWaveCompletePOST**](PickPackApi.md#PickPackWaveCompletePOST) | **Post** /pick_pack/wave_complete | PickPackWaveComplete_POST


# **PickPackCloseLpnPOST**
> interface{} PickPackCloseLpnPOST(ctx, toContainerNbr, optional)
PickPackCloseLpn_POST



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **toContainerNbr** | **string**|  | 
 **optional** | ***PickPackApiPickPackCloseLpnPOSTOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PickPackApiPickPackCloseLpnPOSTOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **asyncFlg** | **optional.Bool**|  | 
 **closeContainerStatus** | **optional.String**|  | 
 **companyId** | **optional.Float32**|  | 
 **companyIdCode** | **optional.String**|  | 
 **facilityId** | **optional.Float32**|  | 
 **facilityIdCode** | **optional.String**|  | 
 **reasonCode** | **optional.String**|  | 
 **shortOnCloseFlg** | **optional.Bool**|  | 
 **updateInventoryOnShortFlg** | **optional.Bool**|  | 
 **toContainerCode** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PickPackPickConfirmPOST**
> interface{} PickPackPickConfirmPOST(ctx, asyncFlg, mheModeFlg, orderNbr, waveNbr, optional)
PickPackPickConfirm_POST



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **asyncFlg** | **bool**|  | 
  **mheModeFlg** | **bool**|  | 
  **orderNbr** | **string**|  | 
  **waveNbr** | **string**|  | 
 **optional** | ***PickPackApiPickPackPickConfirmPOSTOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PickPackApiPickPackPickConfirmPOSTOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




 **allocationUom** | **optional.String**|  | 
 **batchNbr** | **optional.String**|  | 
 **closeContainerStatus** | **optional.String**|  | 
 **companyId** | **optional.Float32**|  | 
 **companyIdCode** | **optional.String**|  | 
 **facilityId** | **optional.Float32**|  | 
 **facilityIdCode** | **optional.String**|  | 
 **fromContainerNbr** | **optional.String**|  | 
 **itemAlternateCode** | **optional.String**|  | 
 **itemBarcode** | **optional.String**|  | 
 **mheSystemCode** | **optional.String**|  | 
 **pickLocation** | **optional.String**|  | 
 **qty** | **optional.Float32**|  | 
 **reasonCode** | **optional.String**|  | 
 **shortFlg** | **optional.Bool**|  | 
 **shortOnCloseFlg** | **optional.Bool**|  | 
 **toContainerNbr** | **optional.String**|  | 
 **uomQty** | **optional.String**|  | 
 **updateInventoryOnShortFlg** | **optional.Bool**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PickPackWaveCompletePOST**
> interface{} PickPackWaveCompletePOST(ctx, waveNbr, optional)
PickPackWaveComplete_POST



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **waveNbr** | **string**|  | 
 **optional** | ***PickPackApiPickPackWaveCompletePOSTOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PickPackApiPickPackWaveCompletePOSTOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **asyncFlg** | **optional.Bool**|  | 
 **closeContainerStatus** | **optional.String**|  | 
 **companyId** | **optional.Float32**|  | 
 **companyIdCode** | **optional.String**|  | 
 **facilityId** | **optional.Float32**|  | 
 **facilityIdCode** | **optional.String**|  | 
 **mheSystemCode** | **optional.String**|  | 
 **reasonCode** | **optional.String**|  | 
 **updateInventoryOnShortFlg** | **optional.Bool**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

