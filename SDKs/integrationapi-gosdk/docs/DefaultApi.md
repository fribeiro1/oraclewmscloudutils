# \DefaultApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AssignOBLPNtoLoad**](DefaultApi.md#AssignOBLPNtoLoad) | **Post** /assign_oblpn_to_load/ | Assign OBLPN to Load
[**AssignandLoadLPN**](DefaultApi.md#AssignandLoadLPN) | **Post** /assign_and_load_oblpn/ | Assign and Load LPN
[**CreateLPN**](DefaultApi.md#CreateLPN) | **Post** /create_lpn/ | Create LPN
[**DivertConfirm**](DefaultApi.md#DivertConfirm) | **Post** /divert_confirm/ | Divert Confirm
[**EntityUpdate**](DefaultApi.md#EntityUpdate) | **Patch** /entity/{entity_name}/{key}/{sequence_number}/ | Entity Update
[**ExtendedProperty**](DefaultApi.md#ExtendedProperty) | **Get** /extended_property/{entity_name}/{key}/{extended_property}/ | Extended Property
[**FromMHEDistributionPack**](DefaultApi.md#FromMHEDistributionPack) | **Post** /from_mhe_distribution_pack/ | From MHE Distribution Pack
[**FromMHEDistributionShort**](DefaultApi.md#FromMHEDistributionShort) | **Post** /from_mhe_distribution_short/ | From MHE Distribution Short
[**GetNextNumbers**](DefaultApi.md#GetNextNumbers) | **Post** /get_next_numbers/ | Get Next Numbers
[**GetStatus**](DefaultApi.md#GetStatus) | **Post** /get_status/ | Get Status
[**InductLPN**](DefaultApi.md#InductLPN) | **Post** /induct_lpn/ | Induct LPN
[**InitStageInterface**](DefaultApi.md#InitStageInterface) | **Post** /init_stage_interface/ | Init Stage Interface
[**LockUnlockLPN**](DefaultApi.md#LockUnlockLPN) | **Post** /lock_unlock_lpn/ | Lock/Unlock LPN
[**ObjectInquiry**](DefaultApi.md#ObjectInquiry) | **Get** /entity/{entity}/{key}/ | Object Inquiry
[**PickConfirm**](DefaultApi.md#PickConfirm) | **Post** /pick_confirm/ | Pick Confirm
[**ReceiveLPN**](DefaultApi.md#ReceiveLPN) | **Post** /receive_lpn/ | Receive LPN
[**RunMHEStageInterface**](DefaultApi.md#RunMHEStageInterface) | **Post** /run_mhe_stage_interface/ | Run MHE Stage Interface
[**RunStageInterface**](DefaultApi.md#RunStageInterface) | **Post** /run_stage_interface/ | Run Stage Interface
[**ShipOBLPN**](DefaultApi.md#ShipOBLPN) | **Post** /ship_oblpn | Ship OBLPN
[**UpdateActiveInventory**](DefaultApi.md#UpdateActiveInventory) | **Patch** /entity/active_inventory/{location_barcode}/ | Update Active Inventory
[**UpdateCarrierLPNLabel**](DefaultApi.md#UpdateCarrierLPNLabel) | **Post** /update_carrier_lpn_label/ | Update Carrier LPN Label
[**UpdateOBLPNDimensions**](DefaultApi.md#UpdateOBLPNDimensions) | **Post** /update_oblpn_dims/ | Update OBLPN Dimensions
[**UpdateOBLPNTrackingNumber**](DefaultApi.md#UpdateOBLPNTrackingNumber) | **Post** /update_oblpn_tracing_nbr/ | Update OBLPN Tracking Number
[**UpdateOutputInterface**](DefaultApi.md#UpdateOutputInterface) | **Post** /update_output_interface/ | Update Output Interface


# **AssignOBLPNtoLoad**
> interface{} AssignOBLPNtoLoad(ctx, loadNbr, oblpnNbr, optional)
Assign OBLPN to Load



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **loadNbr** | **string**|  | 
  **oblpnNbr** | **string**|  | 
 **optional** | ***DefaultApiAssignOBLPNtoLoadOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiAssignOBLPNtoLoadOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **carrierCode** | **optional.String**|  | 
 **companyCode** | **optional.String**|  | 
 **delimiter** | **optional.String**|  | 
 **facilityCode** | **optional.String**|  | 
 **reassignLoadFlg** | **optional.Bool**|  | 
 **requireSpecificOblpnStatus** | **optional.Int32**|  | 
 **trailerNbr** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssignandLoadLPN**
> interface{} AssignandLoadLPN(ctx, loadNbr, oblpnNbr, optional)
Assign and Load LPN



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **loadNbr** | **string**|  | 
  **oblpnNbr** | **string**|  | 
 **optional** | ***DefaultApiAssignandLoadLPNOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiAssignandLoadLPNOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **companyCode** | **optional.String**|  | 
 **dockDoorNbr** | **optional.String**|  | 
 **facilityCode** | **optional.String**|  | 
 **oblpnWeight** | **optional.Float32**|  | 
 **palletNbr** | **optional.String**|  | 
 **trailerNbr** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CreateLPN**
> interface{} CreateLPN(ctx, lpnNbr, qty, optional)
Create LPN



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **lpnNbr** | **string**|  | 
  **qty** | **int32**|  | 
 **optional** | ***DefaultApiCreateLPNOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiCreateLPNOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **batchNumber** | **optional.String**|  | 
 **companyCode** | **optional.String**|  | 
 **destFacilityCode** | **optional.String**|  | 
 **dropLocnBarcode** | **optional.String**|  | 
 **expiryDate** | **optional.String**|  | 
 **facilityCode** | **optional.String**|  | 
 **itemAlternateCode** | **optional.String**|  | 
 **itemBarcode** | **optional.String**|  | 
 **lockCode** | **optional.String**|  | 
 **lpnWeight** | **optional.Float32**|  | 
 **orderType** | **optional.String**|  | 
 **xdockLpnFlg** | **optional.Bool**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DivertConfirm**
> interface{} DivertConfirm(ctx, optional)
Divert Confirm



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DefaultApiDivertConfirmOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiDivertConfirmOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flatData** | **optional.String**|  | 
 **xmlData** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EntityUpdate**
> interface{} EntityUpdate(ctx, entityName, key, sequenceNumber)
Entity Update



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **entityName** | **string**|  | 
  **key** | **string**|  | 
  **sequenceNumber** | **string**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExtendedProperty**
> interface{} ExtendedProperty(ctx, entityName, extendedProperty, key, optional)
Extended Property



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **entityName** | **string**|  | 
  **extendedProperty** | **string**|  | 
  **key** | **string**|  | 
 **optional** | ***DefaultApiExtendedPropertyOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiExtendedPropertyOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **companyCode** | **optional.String**|  | 
 **facilityCode** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FromMHEDistributionPack**
> interface{} FromMHEDistributionPack(ctx, optional)
From MHE Distribution Pack



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DefaultApiFromMHEDistributionPackOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiFromMHEDistributionPackOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xmlData** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FromMHEDistributionShort**
> interface{} FromMHEDistributionShort(ctx, optional)
From MHE Distribution Short



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DefaultApiFromMHEDistributionShortOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiFromMHEDistributionShortOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flatData** | **optional.String**|  | 
 **xmlData** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetNextNumbers**
> interface{} GetNextNumbers(ctx, counterCode, optional)
Get Next Numbers



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **counterCode** | **string**|  | 
 **optional** | ***DefaultApiGetNextNumbersOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiGetNextNumbersOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **companyCode** | **optional.String**|  | 
 **count** | **optional.Int32**|  | 
 **facilityCode** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetStatus**
> interface{} GetStatus(ctx, entity, key, optional)
Get Status



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **entity** | **string**|  | 
  **key** | **string**|  | 
 **optional** | ***DefaultApiGetStatusOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiGetStatusOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **companyCode** | **optional.String**|  | 
 **facilityCode** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InductLPN**
> interface{} InductLPN(ctx, optional)
Induct LPN



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DefaultApiInductLPNOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiInductLPNOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flatData** | **optional.String**|  | 
 **xmlData** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InitStageInterface**
> interface{} InitStageInterface(ctx, optional)
Init Stage Interface



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DefaultApiInitStageInterfaceOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiInitStageInterfaceOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **async** | **optional.Bool**|  | 
 **entity** | **optional.String**|  | 
 **flatData** | **optional.String**|  | 
 **validateXml** | **optional.Bool**|  | 
 **xmlData** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LockUnlockLPN**
> interface{} LockUnlockLPN(ctx, optional)
Lock/Unlock LPN



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DefaultApiLockUnlockLPNOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiLockUnlockLPNOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **optional.String**|  | 
 **companyCode** | **optional.String**|  | 
 **facilityCode** | **optional.String**|  | 
 **lockCode** | **optional.String**|  | 
 **lpnNbr** | **optional.String**|  | 
 **removeLockFromShipmentDtlFlg** | **optional.Bool**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ObjectInquiry**
> interface{} ObjectInquiry(ctx, entity, key, companyCode, facilityCode, optional)
Object Inquiry



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **entity** | **string**|  | 
  **key** | **string**|  | 
  **companyCode** | **string**|  | 
  **facilityCode** | **string**|  | 
 **optional** | ***DefaultApiObjectInquiryOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiObjectInquiryOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




 **minimize** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PickConfirm**
> interface{} PickConfirm(ctx, optional)
Pick Confirm



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DefaultApiPickConfirmOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiPickConfirmOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flatData** | **optional.String**|  | 
 **xmlData** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReceiveLPN**
> interface{} ReceiveLPN(ctx, lpnNbr, optional)
Receive LPN



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **lpnNbr** | **string**|  | 
 **optional** | ***DefaultApiReceiveLPNOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiReceiveLPNOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **companyCode** | **optional.String**|  | 
 **facilityCode** | **optional.String**|  | 
 **rcvdTrailerNbr** | **optional.String**|  | 
 **receivedTs** | **optional.String**|  | 
 **receivingLocation** | **optional.String**|  | 
 **xdockLpnFlg** | **optional.Bool**|  | 
 **xmlData** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RunMHEStageInterface**
> interface{} RunMHEStageInterface(ctx, companyCode, entity, facilityCode, mheVendorCode, optional)
Run MHE Stage Interface



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **companyCode** | **string**|  | 
  **entity** | **string**|  | 
  **facilityCode** | **string**|  | 
  **mheVendorCode** | **string**|  | 
 **optional** | ***DefaultApiRunMHEStageInterfaceOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiRunMHEStageInterfaceOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




 **pythonFunction** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RunStageInterface**
> interface{} RunStageInterface(ctx, companyCode, entity, facilityCode, fileGroupNbr, optional)
Run Stage Interface



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **companyCode** | **string**|  | 
  **entity** | **string**|  | 
  **facilityCode** | **string**|  | 
  **fileGroupNbr** | **string**|  | 
 **optional** | ***DefaultApiRunStageInterfaceOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiRunStageInterfaceOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




 **async** | **optional.Bool**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ShipOBLPN**
> interface{} ShipOBLPN(ctx, companyCode, facilityCode, locnBarcode, oblpnNbr, optional)
Ship OBLPN



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **companyCode** | **string**|  | 
  **facilityCode** | **string**|  | 
  **locnBarcode** | **string**|  | 
  **oblpnNbr** | **string**|  | 
 **optional** | ***DefaultApiShipOBLPNOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiShipOBLPNOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




 **outputFileToGenerate** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateActiveInventory**
> interface{} UpdateActiveInventory(ctx, locationBarcode, reasonCode, optional)
Update Active Inventory



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **locationBarcode** | **string**|  | 
  **reasonCode** | **string**|  | 
 **optional** | ***DefaultApiUpdateActiveInventoryOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiUpdateActiveInventoryOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **actualQty** | **optional.Float32**|  | 
 **adjustmentQty** | **optional.Float32**|  | 
 **batchNumber** | **optional.String**|  | 
 **companyCode** | **optional.String**|  | 
 **expiryData** | **optional.String**|  | 
 **facilityCode** | **optional.String**|  | 
 **invnAttrA** | **optional.String**|  | 
 **invnAttrB** | **optional.String**|  | 
 **invnAttrC** | **optional.String**|  | 
 **invnAttrD** | **optional.String**|  | 
 **invnAttrE** | **optional.String**|  | 
 **invnAttrF** | **optional.String**|  | 
 **invnAttrG** | **optional.String**|  | 
 **itemAlternateCode** | **optional.String**|  | 
 **itemBarcode** | **optional.String**|  | 
 **itemCode** | **optional.String**|  | 
 **locnCapacityCheckFlg** | **optional.Bool**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateCarrierLPNLabel**
> interface{} UpdateCarrierLPNLabel(ctx, label, oblpnNbr, optional)
Update Carrier LPN Label



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **label** | **string**|  | 
  **oblpnNbr** | **string**|  | 
 **optional** | ***DefaultApiUpdateCarrierLPNLabelOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiUpdateCarrierLPNLabelOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **companyCode** | **optional.String**|  | 
 **facilityCode** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateOBLPNDimensions**
> interface{} UpdateOBLPNDimensions(ctx, calcVolFlg, companyCode, facilityCode, height, length, oblpnNbr, width, optional)
Update OBLPN Dimensions



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **calcVolFlg** | **bool**|  | 
  **companyCode** | **string**|  | 
  **facilityCode** | **string**|  | 
  **height** | **float32**|  | 
  **length** | **float32**|  | 
  **oblpnNbr** | **string**|  | 
  **width** | **float32**|  | 
 **optional** | ***DefaultApiUpdateOBLPNDimensionsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiUpdateOBLPNDimensionsOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------







 **shipOblpn** | **optional.Bool**|  | 
 **shippingLocation** | **optional.String**|  | 
 **volume** | **optional.Float32**|  | 
 **weight** | **optional.Float32**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateOBLPNTrackingNumber**
> interface{} UpdateOBLPNTrackingNumber(ctx, companyCode, facilityCode, oblpnNbr, trackingNbr, optional)
Update OBLPN Tracking Number



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **companyCode** | **string**|  | 
  **facilityCode** | **string**|  | 
  **oblpnNbr** | **string**|  | 
  **trackingNbr** | **string**|  | 
 **optional** | ***DefaultApiUpdateOBLPNTrackingNumberOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiUpdateOBLPNTrackingNumberOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




 **dryIceWeight** | **optional.Float32**|  | 
 **estimatedDeliveryTime** | **optional.String**|  | 
 **masterTrackingNbr** | **optional.String**|  | 
 **rate** | **optional.String**|  | 
 **shipViaCode** | **optional.String**|  | 
 **weight** | **optional.Float32**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateOutputInterface**
> interface{} UpdateOutputInterface(ctx, optional)
Update Output Interface



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DefaultApiUpdateOutputInterfaceOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiUpdateOutputInterfaceOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyCode** | **optional.String**|  | 
 **custIntlCode** | **optional.String**|  | 
 **facilityCode** | **optional.String**|  | 
 **filename** | **optional.String**|  | 
 **interfaceTypeCode** | **optional.String**|  | 
 **message** | **optional.String**|  | 
 **runOutputInterfaceFlg** | **optional.Bool**|  | 
 **statusId** | **optional.Int32**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

