# RestApi.PrintApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**printLabelIbContainerGET**](PrintApi.md#printLabelIbContainerGET) | **GET** /print/label/ib_container | PrintLabelIbContainer_GET
[**printLabelIbContainerPOST**](PrintApi.md#printLabelIbContainerPOST) | **POST** /print/label/ib_container | PrintLabelIbContainer_POST
[**printLabelPalletGET**](PrintApi.md#printLabelPalletGET) | **GET** /print/label/pallet | PrintLabelPallet_GET
[**printLabelPalletPOST**](PrintApi.md#printLabelPalletPOST) | **POST** /print/label/pallet | PrintLabelPallet_POST
[**printLabelShippingGET**](PrintApi.md#printLabelShippingGET) | **GET** /print/label/shipping | PrintLabelShipping_GET
[**printLabelShippingPOST**](PrintApi.md#printLabelShippingPOST) | **POST** /print/label/shipping | PrintLabelShipping_POST


<a name="printLabelIbContainerGET"></a>
# **printLabelIbContainerGET**
> Object printLabelIbContainerGET(companyId, containerNbr, facilityId, id, labelDesignerCode)

PrintLabelIbContainer_GET



### Example
```javascript
var RestApi = require('rest_api');
var defaultClient = RestApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new RestApi.PrintApi();

var companyId = 8.14; // Number | 

var containerNbr = "containerNbr_example"; // String | 

var facilityId = 8.14; // Number | 

var id = 8.14; // Number | 

var labelDesignerCode = "labelDesignerCode_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.printLabelIbContainerGET(companyId, containerNbr, facilityId, id, labelDesignerCode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Number**|  | 
 **containerNbr** | **String**|  | 
 **facilityId** | **Number**|  | 
 **id** | **Number**|  | 
 **labelDesignerCode** | **String**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="printLabelIbContainerPOST"></a>
# **printLabelIbContainerPOST**
> Object printLabelIbContainerPOST(companyId, containerNbr, facilityId, id, labelDesignerCode)

PrintLabelIbContainer_POST



### Example
```javascript
var RestApi = require('rest_api');
var defaultClient = RestApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new RestApi.PrintApi();

var companyId = 8.14; // Number | 

var containerNbr = "containerNbr_example"; // String | 

var facilityId = 8.14; // Number | 

var id = 8.14; // Number | 

var labelDesignerCode = "labelDesignerCode_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.printLabelIbContainerPOST(companyId, containerNbr, facilityId, id, labelDesignerCode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Number**|  | 
 **containerNbr** | **String**|  | 
 **facilityId** | **Number**|  | 
 **id** | **Number**|  | 
 **labelDesignerCode** | **String**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="printLabelPalletGET"></a>
# **printLabelPalletGET**
> Object printLabelPalletGET(companyId, containerNbr, facilityId, id, labelDesignerCode)

PrintLabelPallet_GET



### Example
```javascript
var RestApi = require('rest_api');
var defaultClient = RestApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new RestApi.PrintApi();

var companyId = 8.14; // Number | 

var containerNbr = "containerNbr_example"; // String | 

var facilityId = 8.14; // Number | 

var id = 8.14; // Number | 

var labelDesignerCode = "labelDesignerCode_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.printLabelPalletGET(companyId, containerNbr, facilityId, id, labelDesignerCode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Number**|  | 
 **containerNbr** | **String**|  | 
 **facilityId** | **Number**|  | 
 **id** | **Number**|  | 
 **labelDesignerCode** | **String**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="printLabelPalletPOST"></a>
# **printLabelPalletPOST**
> Object printLabelPalletPOST(companyId, containerNbr, facilityId, id, labelDesignerCode)

PrintLabelPallet_POST



### Example
```javascript
var RestApi = require('rest_api');
var defaultClient = RestApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new RestApi.PrintApi();

var companyId = 8.14; // Number | 

var containerNbr = "containerNbr_example"; // String | 

var facilityId = 8.14; // Number | 

var id = 8.14; // Number | 

var labelDesignerCode = "labelDesignerCode_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.printLabelPalletPOST(companyId, containerNbr, facilityId, id, labelDesignerCode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Number**|  | 
 **containerNbr** | **String**|  | 
 **facilityId** | **Number**|  | 
 **id** | **Number**|  | 
 **labelDesignerCode** | **String**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="printLabelShippingGET"></a>
# **printLabelShippingGET**
> Object printLabelShippingGET(companyId, containerNbr, facilityId, id, labelDesignerCode)

PrintLabelShipping_GET



### Example
```javascript
var RestApi = require('rest_api');
var defaultClient = RestApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new RestApi.PrintApi();

var companyId = 8.14; // Number | 

var containerNbr = "containerNbr_example"; // String | 

var facilityId = 8.14; // Number | 

var id = 8.14; // Number | 

var labelDesignerCode = "labelDesignerCode_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.printLabelShippingGET(companyId, containerNbr, facilityId, id, labelDesignerCode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Number**|  | 
 **containerNbr** | **String**|  | 
 **facilityId** | **Number**|  | 
 **id** | **Number**|  | 
 **labelDesignerCode** | **String**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="printLabelShippingPOST"></a>
# **printLabelShippingPOST**
> Object printLabelShippingPOST(companyId, containerNbr, facilityId, id, labelDesignerCode)

PrintLabelShipping_POST



### Example
```javascript
var RestApi = require('rest_api');
var defaultClient = RestApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new RestApi.PrintApi();

var companyId = 8.14; // Number | 

var containerNbr = "containerNbr_example"; // String | 

var facilityId = 8.14; // Number | 

var id = 8.14; // Number | 

var labelDesignerCode = "labelDesignerCode_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.printLabelShippingPOST(companyId, containerNbr, facilityId, id, labelDesignerCode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Number**|  | 
 **containerNbr** | **String**|  | 
 **facilityId** | **Number**|  | 
 **id** | **Number**|  | 
 **labelDesignerCode** | **String**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

