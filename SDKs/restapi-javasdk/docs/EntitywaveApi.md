# EntitywaveApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityWaveByIdGET**](EntitywaveApi.md#entityWaveByIdGET) | **GET** /entity/wave/{id} | EntityWaveById_GET
[**entityWaveDescribeGET**](EntitywaveApi.md#entityWaveDescribeGET) | **GET** /entity/wave/describe | EntityWaveDescribe_GET
[**entityWaveGET**](EntitywaveApi.md#entityWaveGET) | **GET** /entity/wave | EntityWave_GET


<a name="entityWaveByIdGET"></a>
# **entityWaveByIdGET**
> Object entityWaveByIdGET(id, fields)

EntityWaveById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitywaveApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitywaveApi apiInstance = new EntitywaveApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityWaveByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitywaveApi#entityWaveByIdGET");
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

<a name="entityWaveDescribeGET"></a>
# **entityWaveDescribeGET**
> Object entityWaveDescribeGET()

EntityWaveDescribe_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitywaveApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitywaveApi apiInstance = new EntitywaveApi();
try {
    Object result = apiInstance.entityWaveDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitywaveApi#entityWaveDescribeGET");
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

<a name="entityWaveGET"></a>
# **entityWaveGET**
> Object entityWaveGET(fields, ordering, pageMode)

EntityWave_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitywaveApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitywaveApi apiInstance = new EntitywaveApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityWaveGET(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitywaveApi#entityWaveGET");
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

