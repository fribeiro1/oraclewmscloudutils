# EntitycarrierWebserviceLabelTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityCarrierWebserviceLabelTypeByIdGET**](EntitycarrierWebserviceLabelTypeApi.md#entityCarrierWebserviceLabelTypeByIdGET) | **GET** /entity/carrier_webservice_label_type/{id} | EntityCarrierWebserviceLabelTypeById_GET
[**entityCarrierWebserviceLabelTypeDescribeGET**](EntitycarrierWebserviceLabelTypeApi.md#entityCarrierWebserviceLabelTypeDescribeGET) | **GET** /entity/carrier_webservice_label_type/describe | EntityCarrierWebserviceLabelTypeDescribe_GET
[**entityCarrierWebserviceLabelTypeGET**](EntitycarrierWebserviceLabelTypeApi.md#entityCarrierWebserviceLabelTypeGET) | **GET** /entity/carrier_webservice_label_type | EntityCarrierWebserviceLabelType_GET


<a name="entityCarrierWebserviceLabelTypeByIdGET"></a>
# **entityCarrierWebserviceLabelTypeByIdGET**
> Object entityCarrierWebserviceLabelTypeByIdGET(id, fields)

EntityCarrierWebserviceLabelTypeById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitycarrierWebserviceLabelTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitycarrierWebserviceLabelTypeApi apiInstance = new EntitycarrierWebserviceLabelTypeApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityCarrierWebserviceLabelTypeByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitycarrierWebserviceLabelTypeApi#entityCarrierWebserviceLabelTypeByIdGET");
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

<a name="entityCarrierWebserviceLabelTypeDescribeGET"></a>
# **entityCarrierWebserviceLabelTypeDescribeGET**
> Object entityCarrierWebserviceLabelTypeDescribeGET()

EntityCarrierWebserviceLabelTypeDescribe_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitycarrierWebserviceLabelTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitycarrierWebserviceLabelTypeApi apiInstance = new EntitycarrierWebserviceLabelTypeApi();
try {
    Object result = apiInstance.entityCarrierWebserviceLabelTypeDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitycarrierWebserviceLabelTypeApi#entityCarrierWebserviceLabelTypeDescribeGET");
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

<a name="entityCarrierWebserviceLabelTypeGET"></a>
# **entityCarrierWebserviceLabelTypeGET**
> Object entityCarrierWebserviceLabelTypeGET(fields, ordering, pageMode)

EntityCarrierWebserviceLabelType_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitycarrierWebserviceLabelTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitycarrierWebserviceLabelTypeApi apiInstance = new EntitycarrierWebserviceLabelTypeApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityCarrierWebserviceLabelTypeGET(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitycarrierWebserviceLabelTypeApi#entityCarrierWebserviceLabelTypeGET");
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

