# EntitypurchaseOrderHdrApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityPurchaseOrderHdrByIdGET**](EntitypurchaseOrderHdrApi.md#entityPurchaseOrderHdrByIdGET) | **GET** /entity/purchase_order_hdr/{id} | EntityPurchaseOrderHdrById_GET
[**entityPurchaseOrderHdrByIdPATCH**](EntitypurchaseOrderHdrApi.md#entityPurchaseOrderHdrByIdPATCH) | **PATCH** /entity/purchase_order_hdr/{id} | EntityPurchaseOrderHdrById_PATCH
[**entityPurchaseOrderHdrDescribeGET**](EntitypurchaseOrderHdrApi.md#entityPurchaseOrderHdrDescribeGET) | **GET** /entity/purchase_order_hdr/describe | EntityPurchaseOrderHdrDescribe_GET
[**entityPurchaseOrderHdrGET**](EntitypurchaseOrderHdrApi.md#entityPurchaseOrderHdrGET) | **GET** /entity/purchase_order_hdr | EntityPurchaseOrderHdr_GET


<a name="entityPurchaseOrderHdrByIdGET"></a>
# **entityPurchaseOrderHdrByIdGET**
> Object entityPurchaseOrderHdrByIdGET(id, fields)

EntityPurchaseOrderHdrById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitypurchaseOrderHdrApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitypurchaseOrderHdrApi apiInstance = new EntitypurchaseOrderHdrApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityPurchaseOrderHdrByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitypurchaseOrderHdrApi#entityPurchaseOrderHdrByIdGET");
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

<a name="entityPurchaseOrderHdrByIdPATCH"></a>
# **entityPurchaseOrderHdrByIdPATCH**
> Object entityPurchaseOrderHdrByIdPATCH(id, fields)

EntityPurchaseOrderHdrById_PATCH



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitypurchaseOrderHdrApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitypurchaseOrderHdrApi apiInstance = new EntitypurchaseOrderHdrApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityPurchaseOrderHdrByIdPATCH(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitypurchaseOrderHdrApi#entityPurchaseOrderHdrByIdPATCH");
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

<a name="entityPurchaseOrderHdrDescribeGET"></a>
# **entityPurchaseOrderHdrDescribeGET**
> Object entityPurchaseOrderHdrDescribeGET()

EntityPurchaseOrderHdrDescribe_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitypurchaseOrderHdrApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitypurchaseOrderHdrApi apiInstance = new EntitypurchaseOrderHdrApi();
try {
    Object result = apiInstance.entityPurchaseOrderHdrDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitypurchaseOrderHdrApi#entityPurchaseOrderHdrDescribeGET");
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

<a name="entityPurchaseOrderHdrGET"></a>
# **entityPurchaseOrderHdrGET**
> Object entityPurchaseOrderHdrGET(fields, ordering, pageMode)

EntityPurchaseOrderHdr_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitypurchaseOrderHdrApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitypurchaseOrderHdrApi apiInstance = new EntitypurchaseOrderHdrApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityPurchaseOrderHdrGET(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitypurchaseOrderHdrApi#entityPurchaseOrderHdrGET");
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

