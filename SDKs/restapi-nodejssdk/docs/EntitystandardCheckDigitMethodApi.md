# RestApi.EntitystandardCheckDigitMethodApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityStandardCheckDigitMethodByIdGET**](EntitystandardCheckDigitMethodApi.md#entityStandardCheckDigitMethodByIdGET) | **GET** /entity/standard_check_digit_method/{id} | EntityStandardCheckDigitMethodById_GET
[**entityStandardCheckDigitMethodDescribeGET**](EntitystandardCheckDigitMethodApi.md#entityStandardCheckDigitMethodDescribeGET) | **GET** /entity/standard_check_digit_method/describe | EntityStandardCheckDigitMethodDescribe_GET
[**entityStandardCheckDigitMethodGET**](EntitystandardCheckDigitMethodApi.md#entityStandardCheckDigitMethodGET) | **GET** /entity/standard_check_digit_method | EntityStandardCheckDigitMethod_GET


<a name="entityStandardCheckDigitMethodByIdGET"></a>
# **entityStandardCheckDigitMethodByIdGET**
> Object entityStandardCheckDigitMethodByIdGET(id, opts)

EntityStandardCheckDigitMethodById_GET



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

var apiInstance = new RestApi.EntitystandardCheckDigitMethodApi();

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
apiInstance.entityStandardCheckDigitMethodByIdGET(id, opts, callback);
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

<a name="entityStandardCheckDigitMethodDescribeGET"></a>
# **entityStandardCheckDigitMethodDescribeGET**
> Object entityStandardCheckDigitMethodDescribeGET()

EntityStandardCheckDigitMethodDescribe_GET



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

var apiInstance = new RestApi.EntitystandardCheckDigitMethodApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entityStandardCheckDigitMethodDescribeGET(callback);
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

<a name="entityStandardCheckDigitMethodGET"></a>
# **entityStandardCheckDigitMethodGET**
> Object entityStandardCheckDigitMethodGET(opts)

EntityStandardCheckDigitMethod_GET



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

var apiInstance = new RestApi.EntitystandardCheckDigitMethodApi();

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
apiInstance.entityStandardCheckDigitMethodGET(opts, callback);
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

