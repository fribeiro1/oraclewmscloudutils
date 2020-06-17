# EntitystandardCheckDigitMethodApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityStandardCheckDigitMethodByIdGET**](EntitystandardCheckDigitMethodApi.md#entityStandardCheckDigitMethodByIdGET) | **GET** /entity/standard_check_digit_method/{id} | EntityStandardCheckDigitMethodById_GET
[**entityStandardCheckDigitMethodDescribeGET**](EntitystandardCheckDigitMethodApi.md#entityStandardCheckDigitMethodDescribeGET) | **GET** /entity/standard_check_digit_method/describe | EntityStandardCheckDigitMethodDescribe_GET
[**entityStandardCheckDigitMethodGET**](EntitystandardCheckDigitMethodApi.md#entityStandardCheckDigitMethodGET) | **GET** /entity/standard_check_digit_method | EntityStandardCheckDigitMethod_GET


<a name="entityStandardCheckDigitMethodByIdGET"></a>
# **entityStandardCheckDigitMethodByIdGET**
> Object entityStandardCheckDigitMethodByIdGET(id, fields)

EntityStandardCheckDigitMethodById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitystandardCheckDigitMethodApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitystandardCheckDigitMethodApi apiInstance = new EntitystandardCheckDigitMethodApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityStandardCheckDigitMethodByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitystandardCheckDigitMethodApi#entityStandardCheckDigitMethodByIdGET");
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

<a name="entityStandardCheckDigitMethodDescribeGET"></a>
# **entityStandardCheckDigitMethodDescribeGET**
> Object entityStandardCheckDigitMethodDescribeGET()

EntityStandardCheckDigitMethodDescribe_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitystandardCheckDigitMethodApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitystandardCheckDigitMethodApi apiInstance = new EntitystandardCheckDigitMethodApi();
try {
    Object result = apiInstance.entityStandardCheckDigitMethodDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitystandardCheckDigitMethodApi#entityStandardCheckDigitMethodDescribeGET");
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

<a name="entityStandardCheckDigitMethodGET"></a>
# **entityStandardCheckDigitMethodGET**
> Object entityStandardCheckDigitMethodGET(fields, ordering, pageMode)

EntityStandardCheckDigitMethod_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitystandardCheckDigitMethodApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitystandardCheckDigitMethodApi apiInstance = new EntitystandardCheckDigitMethodApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityStandardCheckDigitMethodGET(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitystandardCheckDigitMethodApi#entityStandardCheckDigitMethodGET");
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

