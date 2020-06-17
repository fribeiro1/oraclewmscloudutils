# EntityallocationStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityAllocationStatusByIdGET**](EntityallocationStatusApi.md#entityAllocationStatusByIdGET) | **GET** /entity/allocation_status/{id} | EntityAllocationStatusById_GET
[**entityAllocationStatusDescribeGET**](EntityallocationStatusApi.md#entityAllocationStatusDescribeGET) | **GET** /entity/allocation_status/describe | EntityAllocationStatusDescribe_GET
[**entityAllocationStatusGET**](EntityallocationStatusApi.md#entityAllocationStatusGET) | **GET** /entity/allocation_status | EntityAllocationStatus_GET


<a name="entityAllocationStatusByIdGET"></a>
# **entityAllocationStatusByIdGET**
> Object entityAllocationStatusByIdGET(id, fields)

EntityAllocationStatusById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityallocationStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityallocationStatusApi apiInstance = new EntityallocationStatusApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityAllocationStatusByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityallocationStatusApi#entityAllocationStatusByIdGET");
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

<a name="entityAllocationStatusDescribeGET"></a>
# **entityAllocationStatusDescribeGET**
> Object entityAllocationStatusDescribeGET()

EntityAllocationStatusDescribe_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityallocationStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityallocationStatusApi apiInstance = new EntityallocationStatusApi();
try {
    Object result = apiInstance.entityAllocationStatusDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityallocationStatusApi#entityAllocationStatusDescribeGET");
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

<a name="entityAllocationStatusGET"></a>
# **entityAllocationStatusGET**
> Object entityAllocationStatusGET(fields, ordering, pageMode)

EntityAllocationStatus_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityallocationStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityallocationStatusApi apiInstance = new EntityallocationStatusApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityAllocationStatusGET(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityallocationStatusApi#entityAllocationStatusGET");
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

