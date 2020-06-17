# EntitylgfapiArchiveLevelApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityLgfapiArchiveLevelByIdGET**](EntitylgfapiArchiveLevelApi.md#entityLgfapiArchiveLevelByIdGET) | **GET** /entity/lgfapi_archive_level/{id} | EntityLgfapiArchiveLevelById_GET
[**entityLgfapiArchiveLevelDescribeGET**](EntitylgfapiArchiveLevelApi.md#entityLgfapiArchiveLevelDescribeGET) | **GET** /entity/lgfapi_archive_level/describe | EntityLgfapiArchiveLevelDescribe_GET
[**entityLgfapiArchiveLevelGET**](EntitylgfapiArchiveLevelApi.md#entityLgfapiArchiveLevelGET) | **GET** /entity/lgfapi_archive_level | EntityLgfapiArchiveLevel_GET


<a name="entityLgfapiArchiveLevelByIdGET"></a>
# **entityLgfapiArchiveLevelByIdGET**
> Object entityLgfapiArchiveLevelByIdGET(id, fields)

EntityLgfapiArchiveLevelById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitylgfapiArchiveLevelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitylgfapiArchiveLevelApi apiInstance = new EntitylgfapiArchiveLevelApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityLgfapiArchiveLevelByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitylgfapiArchiveLevelApi#entityLgfapiArchiveLevelByIdGET");
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

<a name="entityLgfapiArchiveLevelDescribeGET"></a>
# **entityLgfapiArchiveLevelDescribeGET**
> Object entityLgfapiArchiveLevelDescribeGET()

EntityLgfapiArchiveLevelDescribe_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitylgfapiArchiveLevelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitylgfapiArchiveLevelApi apiInstance = new EntitylgfapiArchiveLevelApi();
try {
    Object result = apiInstance.entityLgfapiArchiveLevelDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitylgfapiArchiveLevelApi#entityLgfapiArchiveLevelDescribeGET");
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

<a name="entityLgfapiArchiveLevelGET"></a>
# **entityLgfapiArchiveLevelGET**
> Object entityLgfapiArchiveLevelGET(fields, ordering, pageMode)

EntityLgfapiArchiveLevel_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitylgfapiArchiveLevelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitylgfapiArchiveLevelApi apiInstance = new EntitylgfapiArchiveLevelApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityLgfapiArchiveLevelGET(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitylgfapiArchiveLevelApi#entityLgfapiArchiveLevelGET");
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

