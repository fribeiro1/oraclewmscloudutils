# EntitymultiFieldBarcodeDelimiterApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityMultiFieldBarcodeDelimiterByIdGET**](EntitymultiFieldBarcodeDelimiterApi.md#entityMultiFieldBarcodeDelimiterByIdGET) | **GET** /entity/multi_field_barcode_delimiter/{id} | EntityMultiFieldBarcodeDelimiterById_GET
[**entityMultiFieldBarcodeDelimiterDescribeGET**](EntitymultiFieldBarcodeDelimiterApi.md#entityMultiFieldBarcodeDelimiterDescribeGET) | **GET** /entity/multi_field_barcode_delimiter/describe | EntityMultiFieldBarcodeDelimiterDescribe_GET
[**entityMultiFieldBarcodeDelimiterGET**](EntitymultiFieldBarcodeDelimiterApi.md#entityMultiFieldBarcodeDelimiterGET) | **GET** /entity/multi_field_barcode_delimiter | EntityMultiFieldBarcodeDelimiter_GET


<a name="entityMultiFieldBarcodeDelimiterByIdGET"></a>
# **entityMultiFieldBarcodeDelimiterByIdGET**
> Object entityMultiFieldBarcodeDelimiterByIdGET(id, fields)

EntityMultiFieldBarcodeDelimiterById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitymultiFieldBarcodeDelimiterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitymultiFieldBarcodeDelimiterApi apiInstance = new EntitymultiFieldBarcodeDelimiterApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityMultiFieldBarcodeDelimiterByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitymultiFieldBarcodeDelimiterApi#entityMultiFieldBarcodeDelimiterByIdGET");
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

<a name="entityMultiFieldBarcodeDelimiterDescribeGET"></a>
# **entityMultiFieldBarcodeDelimiterDescribeGET**
> Object entityMultiFieldBarcodeDelimiterDescribeGET()

EntityMultiFieldBarcodeDelimiterDescribe_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitymultiFieldBarcodeDelimiterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitymultiFieldBarcodeDelimiterApi apiInstance = new EntitymultiFieldBarcodeDelimiterApi();
try {
    Object result = apiInstance.entityMultiFieldBarcodeDelimiterDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitymultiFieldBarcodeDelimiterApi#entityMultiFieldBarcodeDelimiterDescribeGET");
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

<a name="entityMultiFieldBarcodeDelimiterGET"></a>
# **entityMultiFieldBarcodeDelimiterGET**
> Object entityMultiFieldBarcodeDelimiterGET(fields, ordering, pageMode)

EntityMultiFieldBarcodeDelimiter_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitymultiFieldBarcodeDelimiterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitymultiFieldBarcodeDelimiterApi apiInstance = new EntitymultiFieldBarcodeDelimiterApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityMultiFieldBarcodeDelimiterGET(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitymultiFieldBarcodeDelimiterApi#entityMultiFieldBarcodeDelimiterGET");
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

