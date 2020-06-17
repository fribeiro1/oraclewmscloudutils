# PickPackApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pickPackCloseLpnPOST**](PickPackApi.md#pickPackCloseLpnPOST) | **POST** /pick_pack/close_lpn | PickPackCloseLpn_POST
[**pickPackPickConfirmPOST**](PickPackApi.md#pickPackPickConfirmPOST) | **POST** /pick_pack/pick_confirm | PickPackPickConfirm_POST
[**pickPackWaveCompletePOST**](PickPackApi.md#pickPackWaveCompletePOST) | **POST** /pick_pack/wave_complete | PickPackWaveComplete_POST


<a name="pickPackCloseLpnPOST"></a>
# **pickPackCloseLpnPOST**
> Object pickPackCloseLpnPOST(toContainerNbr, asyncFlg, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, reasonCode, shortOnCloseFlg, updateInventoryOnShortFlg, toContainerCode)

PickPackCloseLpn_POST



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PickPackApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PickPackApi apiInstance = new PickPackApi();
String toContainerNbr = "toContainerNbr_example"; // String | 
Boolean asyncFlg = true; // Boolean | 
String closeContainerStatus = "closeContainerStatus_example"; // String | 
BigDecimal companyId = new BigDecimal(); // BigDecimal | 
String companyIdCode = "companyIdCode_example"; // String | 
BigDecimal facilityId = new BigDecimal(); // BigDecimal | 
String facilityIdCode = "facilityIdCode_example"; // String | 
String reasonCode = "reasonCode_example"; // String | 
Boolean shortOnCloseFlg = true; // Boolean | 
Boolean updateInventoryOnShortFlg = true; // Boolean | 
String toContainerCode = "toContainerCode_example"; // String | 
try {
    Object result = apiInstance.pickPackCloseLpnPOST(toContainerNbr, asyncFlg, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, reasonCode, shortOnCloseFlg, updateInventoryOnShortFlg, toContainerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PickPackApi#pickPackCloseLpnPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toContainerNbr** | **String**|  |
 **asyncFlg** | **Boolean**|  | [optional]
 **closeContainerStatus** | **String**|  | [optional]
 **companyId** | **BigDecimal**|  | [optional]
 **companyIdCode** | **String**|  | [optional]
 **facilityId** | **BigDecimal**|  | [optional]
 **facilityIdCode** | **String**|  | [optional]
 **reasonCode** | **String**|  | [optional]
 **shortOnCloseFlg** | **Boolean**|  | [optional]
 **updateInventoryOnShortFlg** | **Boolean**|  | [optional]
 **toContainerCode** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="pickPackPickConfirmPOST"></a>
# **pickPackPickConfirmPOST**
> Object pickPackPickConfirmPOST(asyncFlg, mheModeFlg, orderNbr, waveNbr, allocationUom, batchNbr, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, fromContainerNbr, itemAlternateCode, itemBarcode, mheSystemCode, pickLocation, qty, reasonCode, shortFlg, shortOnCloseFlg, toContainerNbr, uomQty, updateInventoryOnShortFlg)

PickPackPickConfirm_POST



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PickPackApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PickPackApi apiInstance = new PickPackApi();
Boolean asyncFlg = true; // Boolean | 
Boolean mheModeFlg = true; // Boolean | 
String orderNbr = "orderNbr_example"; // String | 
String waveNbr = "waveNbr_example"; // String | 
String allocationUom = "allocationUom_example"; // String | 
String batchNbr = "batchNbr_example"; // String | 
String closeContainerStatus = "closeContainerStatus_example"; // String | 
BigDecimal companyId = new BigDecimal(); // BigDecimal | 
String companyIdCode = "companyIdCode_example"; // String | 
BigDecimal facilityId = new BigDecimal(); // BigDecimal | 
String facilityIdCode = "facilityIdCode_example"; // String | 
String fromContainerNbr = "fromContainerNbr_example"; // String | 
String itemAlternateCode = "itemAlternateCode_example"; // String | 
String itemBarcode = "itemBarcode_example"; // String | 
String mheSystemCode = "mheSystemCode_example"; // String | 
String pickLocation = "pickLocation_example"; // String | 
BigDecimal qty = new BigDecimal(); // BigDecimal | 
String reasonCode = "reasonCode_example"; // String | 
Boolean shortFlg = true; // Boolean | 
Boolean shortOnCloseFlg = true; // Boolean | 
String toContainerNbr = "toContainerNbr_example"; // String | 
String uomQty = "uomQty_example"; // String | 
Boolean updateInventoryOnShortFlg = true; // Boolean | 
try {
    Object result = apiInstance.pickPackPickConfirmPOST(asyncFlg, mheModeFlg, orderNbr, waveNbr, allocationUom, batchNbr, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, fromContainerNbr, itemAlternateCode, itemBarcode, mheSystemCode, pickLocation, qty, reasonCode, shortFlg, shortOnCloseFlg, toContainerNbr, uomQty, updateInventoryOnShortFlg);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PickPackApi#pickPackPickConfirmPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asyncFlg** | **Boolean**|  |
 **mheModeFlg** | **Boolean**|  |
 **orderNbr** | **String**|  |
 **waveNbr** | **String**|  |
 **allocationUom** | **String**|  | [optional]
 **batchNbr** | **String**|  | [optional]
 **closeContainerStatus** | **String**|  | [optional]
 **companyId** | **BigDecimal**|  | [optional]
 **companyIdCode** | **String**|  | [optional]
 **facilityId** | **BigDecimal**|  | [optional]
 **facilityIdCode** | **String**|  | [optional]
 **fromContainerNbr** | **String**|  | [optional]
 **itemAlternateCode** | **String**|  | [optional]
 **itemBarcode** | **String**|  | [optional]
 **mheSystemCode** | **String**|  | [optional]
 **pickLocation** | **String**|  | [optional]
 **qty** | **BigDecimal**|  | [optional]
 **reasonCode** | **String**|  | [optional]
 **shortFlg** | **Boolean**|  | [optional]
 **shortOnCloseFlg** | **Boolean**|  | [optional]
 **toContainerNbr** | **String**|  | [optional]
 **uomQty** | **String**|  | [optional]
 **updateInventoryOnShortFlg** | **Boolean**|  | [optional]

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="pickPackWaveCompletePOST"></a>
# **pickPackWaveCompletePOST**
> Object pickPackWaveCompletePOST(waveNbr, asyncFlg, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, mheSystemCode, reasonCode, updateInventoryOnShortFlg)

PickPackWaveComplete_POST



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PickPackApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PickPackApi apiInstance = new PickPackApi();
String waveNbr = "waveNbr_example"; // String | 
Boolean asyncFlg = true; // Boolean | 
String closeContainerStatus = "closeContainerStatus_example"; // String | 
BigDecimal companyId = new BigDecimal(); // BigDecimal | 
String companyIdCode = "companyIdCode_example"; // String | 
BigDecimal facilityId = new BigDecimal(); // BigDecimal | 
String facilityIdCode = "facilityIdCode_example"; // String | 
String mheSystemCode = "mheSystemCode_example"; // String | 
String reasonCode = "reasonCode_example"; // String | 
Boolean updateInventoryOnShortFlg = true; // Boolean | 
try {
    Object result = apiInstance.pickPackWaveCompletePOST(waveNbr, asyncFlg, closeContainerStatus, companyId, companyIdCode, facilityId, facilityIdCode, mheSystemCode, reasonCode, updateInventoryOnShortFlg);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PickPackApi#pickPackWaveCompletePOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **waveNbr** | **String**|  |
 **asyncFlg** | **Boolean**|  | [optional]
 **closeContainerStatus** | **String**|  | [optional]
 **companyId** | **BigDecimal**|  | [optional]
 **companyIdCode** | **String**|  | [optional]
 **facilityId** | **BigDecimal**|  | [optional]
 **facilityIdCode** | **String**|  | [optional]
 **mheSystemCode** | **String**|  | [optional]
 **reasonCode** | **String**|  | [optional]
 **updateInventoryOnShortFlg** | **Boolean**|  | [optional]

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

