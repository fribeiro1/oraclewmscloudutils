# EntityshippingBlockedSelectionCriteriaApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityShippingBlockedSelectionCriteriaDescribeGET**](EntityshippingBlockedSelectionCriteriaApi.md#entityShippingBlockedSelectionCriteriaDescribeGET) | **GET** /entity/shipping_blocked_selection_criteria/describe | EntityShippingBlockedSelectionCriteriaDescribe_GET
[**entityShippingBlockedSelectionCriteriaGET**](EntityshippingBlockedSelectionCriteriaApi.md#entityShippingBlockedSelectionCriteriaGET) | **GET** /entity/shipping_blocked_selection_criteria | EntityShippingBlockedSelectionCriteria_GET
[**getEntityShippingBlockedSelectionCriteriaGET**](EntityshippingBlockedSelectionCriteriaApi.md#getEntityShippingBlockedSelectionCriteriaGET) | **GET** /entity/shipping_blocked_selection_criteria/{id} | EntityShippingBlockedSelectionCriteria_GET


<a name="entityShippingBlockedSelectionCriteriaDescribeGET"></a>
# **entityShippingBlockedSelectionCriteriaDescribeGET**
> Object entityShippingBlockedSelectionCriteriaDescribeGET()

EntityShippingBlockedSelectionCriteriaDescribe_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityshippingBlockedSelectionCriteriaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityshippingBlockedSelectionCriteriaApi apiInstance = new EntityshippingBlockedSelectionCriteriaApi();
try {
    Object result = apiInstance.entityShippingBlockedSelectionCriteriaDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityshippingBlockedSelectionCriteriaApi#entityShippingBlockedSelectionCriteriaDescribeGET");
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

<a name="entityShippingBlockedSelectionCriteriaGET"></a>
# **entityShippingBlockedSelectionCriteriaGET**
> Object entityShippingBlockedSelectionCriteriaGET(fields, ordering, pageMode)

EntityShippingBlockedSelectionCriteria_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityshippingBlockedSelectionCriteriaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityshippingBlockedSelectionCriteriaApi apiInstance = new EntityshippingBlockedSelectionCriteriaApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityShippingBlockedSelectionCriteriaGET(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityshippingBlockedSelectionCriteriaApi#entityShippingBlockedSelectionCriteriaGET");
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

<a name="getEntityShippingBlockedSelectionCriteriaGET"></a>
# **getEntityShippingBlockedSelectionCriteriaGET**
> Object getEntityShippingBlockedSelectionCriteriaGET(id, fields)

EntityShippingBlockedSelectionCriteria_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityshippingBlockedSelectionCriteriaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityshippingBlockedSelectionCriteriaApi apiInstance = new EntityshippingBlockedSelectionCriteriaApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.getEntityShippingBlockedSelectionCriteriaGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityshippingBlockedSelectionCriteriaApi#getEntityShippingBlockedSelectionCriteriaGET");
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

