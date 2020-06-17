# RestApi.EntityoblpnPrintingValidationApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityOblpnPrintingValidationByIdGET**](EntityoblpnPrintingValidationApi.md#entityOblpnPrintingValidationByIdGET) | **GET** /entity/oblpn_printing_validation/{id} | EntityOblpnPrintingValidationById_GET
[**entityOblpnPrintingValidationDescribeGET**](EntityoblpnPrintingValidationApi.md#entityOblpnPrintingValidationDescribeGET) | **GET** /entity/oblpn_printing_validation/describe | EntityOblpnPrintingValidationDescribe_GET
[**entityOblpnPrintingValidationGET**](EntityoblpnPrintingValidationApi.md#entityOblpnPrintingValidationGET) | **GET** /entity/oblpn_printing_validation | EntityOblpnPrintingValidation_GET


<a name="entityOblpnPrintingValidationByIdGET"></a>
# **entityOblpnPrintingValidationByIdGET**
> Object entityOblpnPrintingValidationByIdGET(id, opts)

EntityOblpnPrintingValidationById_GET



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

var apiInstance = new RestApi.EntityoblpnPrintingValidationApi();

var id = 8.14; // Number | 

var opts = { 
  'fields': "fields_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entityOblpnPrintingValidationByIdGET(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Number**|  | 
 **fields** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="entityOblpnPrintingValidationDescribeGET"></a>
# **entityOblpnPrintingValidationDescribeGET**
> Object entityOblpnPrintingValidationDescribeGET()

EntityOblpnPrintingValidationDescribe_GET



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

var apiInstance = new RestApi.EntityoblpnPrintingValidationApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entityOblpnPrintingValidationDescribeGET(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="entityOblpnPrintingValidationGET"></a>
# **entityOblpnPrintingValidationGET**
> Object entityOblpnPrintingValidationGET(opts)

EntityOblpnPrintingValidation_GET



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

var apiInstance = new RestApi.EntityoblpnPrintingValidationApi();

var opts = { 
  'fields': "fields_example", // String | 
  'ordering': "ordering_example", // String | 
  'pageMode': "paged" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entityOblpnPrintingValidationGET(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**|  | [optional] 
 **ordering** | **String**|  | [optional] 
 **pageMode** | **String**|  | [optional] [default to paged]

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

