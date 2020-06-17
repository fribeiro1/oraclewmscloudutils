# EntitybatchNumberApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityBatchNumberByIdGET**](EntitybatchNumberApi.md#entityBatchNumberByIdGET) | **GET** /entity/batch_number/{id} | EntityBatchNumberById_GET
[**entityBatchNumberDescribeGET**](EntitybatchNumberApi.md#entityBatchNumberDescribeGET) | **GET** /entity/batch_number/describe | EntityBatchNumberDescribe_GET
[**entityBatchNumberGET**](EntitybatchNumberApi.md#entityBatchNumberGET) | **GET** /entity/batch_number | EntityBatchNumber_GET
[**entityBatchNumberPOST**](EntitybatchNumberApi.md#entityBatchNumberPOST) | **POST** /entity/batch_number | EntityBatchNumber_POST


<a name="entityBatchNumberByIdGET"></a>
# **entityBatchNumberByIdGET**
> Object entityBatchNumberByIdGET(id, fields)

EntityBatchNumberById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitybatchNumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitybatchNumberApi apiInstance = new EntitybatchNumberApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityBatchNumberByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitybatchNumberApi#entityBatchNumberByIdGET");
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

<a name="entityBatchNumberDescribeGET"></a>
# **entityBatchNumberDescribeGET**
> Object entityBatchNumberDescribeGET()

EntityBatchNumberDescribe_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitybatchNumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitybatchNumberApi apiInstance = new EntitybatchNumberApi();
try {
    Object result = apiInstance.entityBatchNumberDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitybatchNumberApi#entityBatchNumberDescribeGET");
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

<a name="entityBatchNumberGET"></a>
# **entityBatchNumberGET**
> Object entityBatchNumberGET(fields, ordering, pageMode)

EntityBatchNumber_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitybatchNumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitybatchNumberApi apiInstance = new EntitybatchNumberApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityBatchNumberGET(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitybatchNumberApi#entityBatchNumberGET");
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

<a name="entityBatchNumberPOST"></a>
# **entityBatchNumberPOST**
> Object entityBatchNumberPOST(fields, ordering, pageMode)

EntityBatchNumber_POST



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitybatchNumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitybatchNumberApi apiInstance = new EntitybatchNumberApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityBatchNumberPOST(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitybatchNumberApi#entityBatchNumberPOST");
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

