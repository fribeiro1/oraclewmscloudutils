# EntitybarcodeTypeDtlApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityBarcodeTypeDtlByIdGET**](EntitybarcodeTypeDtlApi.md#entityBarcodeTypeDtlByIdGET) | **GET** /entity/barcode_type_dtl/{id} | EntityBarcodeTypeDtlById_GET
[**entityBarcodeTypeDtlDescribeGET**](EntitybarcodeTypeDtlApi.md#entityBarcodeTypeDtlDescribeGET) | **GET** /entity/barcode_type_dtl/describe | EntityBarcodeTypeDtlDescribe_GET
[**entityBarcodeTypeDtlGET**](EntitybarcodeTypeDtlApi.md#entityBarcodeTypeDtlGET) | **GET** /entity/barcode_type_dtl | EntityBarcodeTypeDtl_GET


<a name="entityBarcodeTypeDtlByIdGET"></a>
# **entityBarcodeTypeDtlByIdGET**
> Object entityBarcodeTypeDtlByIdGET(id, fields)

EntityBarcodeTypeDtlById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitybarcodeTypeDtlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitybarcodeTypeDtlApi apiInstance = new EntitybarcodeTypeDtlApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityBarcodeTypeDtlByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitybarcodeTypeDtlApi#entityBarcodeTypeDtlByIdGET");
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

<a name="entityBarcodeTypeDtlDescribeGET"></a>
# **entityBarcodeTypeDtlDescribeGET**
> Object entityBarcodeTypeDtlDescribeGET()

EntityBarcodeTypeDtlDescribe_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitybarcodeTypeDtlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitybarcodeTypeDtlApi apiInstance = new EntitybarcodeTypeDtlApi();
try {
    Object result = apiInstance.entityBarcodeTypeDtlDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitybarcodeTypeDtlApi#entityBarcodeTypeDtlDescribeGET");
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

<a name="entityBarcodeTypeDtlGET"></a>
# **entityBarcodeTypeDtlGET**
> Object entityBarcodeTypeDtlGET(fields, ordering, pageMode)

EntityBarcodeTypeDtl_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitybarcodeTypeDtlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitybarcodeTypeDtlApi apiInstance = new EntitybarcodeTypeDtlApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityBarcodeTypeDtlGET(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitybarcodeTypeDtlApi#entityBarcodeTypeDtlGET");
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

