# RestApi.EntitylgfapiArchiveLevelApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityLgfapiArchiveLevelByIdGET**](EntitylgfapiArchiveLevelApi.md#entityLgfapiArchiveLevelByIdGET) | **GET** /entity/lgfapi_archive_level/{id} | EntityLgfapiArchiveLevelById_GET
[**entityLgfapiArchiveLevelDescribeGET**](EntitylgfapiArchiveLevelApi.md#entityLgfapiArchiveLevelDescribeGET) | **GET** /entity/lgfapi_archive_level/describe | EntityLgfapiArchiveLevelDescribe_GET
[**entityLgfapiArchiveLevelGET**](EntitylgfapiArchiveLevelApi.md#entityLgfapiArchiveLevelGET) | **GET** /entity/lgfapi_archive_level | EntityLgfapiArchiveLevel_GET


<a name="entityLgfapiArchiveLevelByIdGET"></a>
# **entityLgfapiArchiveLevelByIdGET**
> Object entityLgfapiArchiveLevelByIdGET(id, opts)

EntityLgfapiArchiveLevelById_GET



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

var apiInstance = new RestApi.EntitylgfapiArchiveLevelApi();

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
apiInstance.entityLgfapiArchiveLevelByIdGET(id, opts, callback);
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

<a name="entityLgfapiArchiveLevelDescribeGET"></a>
# **entityLgfapiArchiveLevelDescribeGET**
> Object entityLgfapiArchiveLevelDescribeGET()

EntityLgfapiArchiveLevelDescribe_GET



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

var apiInstance = new RestApi.EntitylgfapiArchiveLevelApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entityLgfapiArchiveLevelDescribeGET(callback);
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

<a name="entityLgfapiArchiveLevelGET"></a>
# **entityLgfapiArchiveLevelGET**
> Object entityLgfapiArchiveLevelGET(opts)

EntityLgfapiArchiveLevel_GET



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

var apiInstance = new RestApi.EntitylgfapiArchiveLevelApi();

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
apiInstance.entityLgfapiArchiveLevelGET(opts, callback);
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

