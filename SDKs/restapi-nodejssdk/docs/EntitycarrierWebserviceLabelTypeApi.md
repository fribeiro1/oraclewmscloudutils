# RestApi.EntitycarrierWebserviceLabelTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityCarrierWebserviceLabelTypeByIdGET**](EntitycarrierWebserviceLabelTypeApi.md#entityCarrierWebserviceLabelTypeByIdGET) | **GET** /entity/carrier_webservice_label_type/{id} | EntityCarrierWebserviceLabelTypeById_GET
[**entityCarrierWebserviceLabelTypeDescribeGET**](EntitycarrierWebserviceLabelTypeApi.md#entityCarrierWebserviceLabelTypeDescribeGET) | **GET** /entity/carrier_webservice_label_type/describe | EntityCarrierWebserviceLabelTypeDescribe_GET
[**entityCarrierWebserviceLabelTypeGET**](EntitycarrierWebserviceLabelTypeApi.md#entityCarrierWebserviceLabelTypeGET) | **GET** /entity/carrier_webservice_label_type | EntityCarrierWebserviceLabelType_GET


<a name="entityCarrierWebserviceLabelTypeByIdGET"></a>
# **entityCarrierWebserviceLabelTypeByIdGET**
> Object entityCarrierWebserviceLabelTypeByIdGET(id, opts)

EntityCarrierWebserviceLabelTypeById_GET



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

var apiInstance = new RestApi.EntitycarrierWebserviceLabelTypeApi();

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
apiInstance.entityCarrierWebserviceLabelTypeByIdGET(id, opts, callback);
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

<a name="entityCarrierWebserviceLabelTypeDescribeGET"></a>
# **entityCarrierWebserviceLabelTypeDescribeGET**
> Object entityCarrierWebserviceLabelTypeDescribeGET()

EntityCarrierWebserviceLabelTypeDescribe_GET



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

var apiInstance = new RestApi.EntitycarrierWebserviceLabelTypeApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entityCarrierWebserviceLabelTypeDescribeGET(callback);
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

<a name="entityCarrierWebserviceLabelTypeGET"></a>
# **entityCarrierWebserviceLabelTypeGET**
> Object entityCarrierWebserviceLabelTypeGET(opts)

EntityCarrierWebserviceLabelType_GET



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

var apiInstance = new RestApi.EntitycarrierWebserviceLabelTypeApi();

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
apiInstance.entityCarrierWebserviceLabelTypeGET(opts, callback);
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
