# EntitypurchaseOrderDtlApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityPurchaseOrderDtlByIdGET**](EntitypurchaseOrderDtlApi.md#entityPurchaseOrderDtlByIdGET) | **GET** /entity/purchase_order_dtl/{id} | EntityPurchaseOrderDtlById_GET
[**entityPurchaseOrderDtlByIdPATCH**](EntitypurchaseOrderDtlApi.md#entityPurchaseOrderDtlByIdPATCH) | **PATCH** /entity/purchase_order_dtl/{id} | EntityPurchaseOrderDtlById_PATCH
[**entityPurchaseOrderDtlDescribeGET**](EntitypurchaseOrderDtlApi.md#entityPurchaseOrderDtlDescribeGET) | **GET** /entity/purchase_order_dtl/describe | EntityPurchaseOrderDtlDescribe_GET
[**entityPurchaseOrderDtlGET**](EntitypurchaseOrderDtlApi.md#entityPurchaseOrderDtlGET) | **GET** /entity/purchase_order_dtl | EntityPurchaseOrderDtl_GET


<a name="entityPurchaseOrderDtlByIdGET"></a>
# **entityPurchaseOrderDtlByIdGET**
> Object entityPurchaseOrderDtlByIdGET(id, fields)

EntityPurchaseOrderDtlById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitypurchaseOrderDtlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitypurchaseOrderDtlApi apiInstance = new EntitypurchaseOrderDtlApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityPurchaseOrderDtlByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitypurchaseOrderDtlApi#entityPurchaseOrderDtlByIdGET");
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

<a name="entityPurchaseOrderDtlByIdPATCH"></a>
# **entityPurchaseOrderDtlByIdPATCH**
> Object entityPurchaseOrderDtlByIdPATCH(id, fields)

EntityPurchaseOrderDtlById_PATCH



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitypurchaseOrderDtlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitypurchaseOrderDtlApi apiInstance = new EntitypurchaseOrderDtlApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityPurchaseOrderDtlByIdPATCH(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitypurchaseOrderDtlApi#entityPurchaseOrderDtlByIdPATCH");
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

<a name="entityPurchaseOrderDtlDescribeGET"></a>
# **entityPurchaseOrderDtlDescribeGET**
> Object entityPurchaseOrderDtlDescribeGET()

EntityPurchaseOrderDtlDescribe_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitypurchaseOrderDtlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitypurchaseOrderDtlApi apiInstance = new EntitypurchaseOrderDtlApi();
try {
    Object result = apiInstance.entityPurchaseOrderDtlDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitypurchaseOrderDtlApi#entityPurchaseOrderDtlDescribeGET");
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

<a name="entityPurchaseOrderDtlGET"></a>
# **entityPurchaseOrderDtlGET**
> Object entityPurchaseOrderDtlGET(fields, ordering, pageMode)

EntityPurchaseOrderDtl_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitypurchaseOrderDtlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitypurchaseOrderDtlApi apiInstance = new EntitypurchaseOrderDtlApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityPurchaseOrderDtlGET(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitypurchaseOrderDtlApi#entityPurchaseOrderDtlGET");
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

