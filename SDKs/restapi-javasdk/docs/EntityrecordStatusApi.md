# EntityrecordStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityRecordStatusByIdGET**](EntityrecordStatusApi.md#entityRecordStatusByIdGET) | **GET** /entity/record_status/{id} | EntityRecordStatusById_GET
[**entityRecordStatusDescribeGET**](EntityrecordStatusApi.md#entityRecordStatusDescribeGET) | **GET** /entity/record_status/describe | EntityRecordStatusDescribe_GET
[**entityRecordStatusGET**](EntityrecordStatusApi.md#entityRecordStatusGET) | **GET** /entity/record_status | EntityRecordStatus_GET


<a name="entityRecordStatusByIdGET"></a>
# **entityRecordStatusByIdGET**
> Object entityRecordStatusByIdGET(id, fields)

EntityRecordStatusById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityrecordStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityrecordStatusApi apiInstance = new EntityrecordStatusApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityRecordStatusByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityrecordStatusApi#entityRecordStatusByIdGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **BigDecimal**|  |
 **fields** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="entityRecordStatusDescribeGET"></a>
# **entityRecordStatusDescribeGET**
> Object entityRecordStatusDescribeGET()

EntityRecordStatusDescribe_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityrecordStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityrecordStatusApi apiInstance = new EntityrecordStatusApi();
try {
    Object result = apiInstance.entityRecordStatusDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityrecordStatusApi#entityRecordStatusDescribeGET");
    e.printStackTrace();
}
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

<a name="entityRecordStatusGET"></a>
# **entityRecordStatusGET**
> Object entityRecordStatusGET(fields, ordering, pageMode)

EntityRecordStatus_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityrecordStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityrecordStatusApi apiInstance = new EntityrecordStatusApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityRecordStatusGET(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityrecordStatusApi#entityRecordStatusGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**|  | [optional]
 **ordering** | **String**|  | [optional]
 **pageMode** | **String**|  | [optional] [default to paged] [enum: paged, sequenced]

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

