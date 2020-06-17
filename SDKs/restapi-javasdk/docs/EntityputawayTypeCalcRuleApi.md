# EntityputawayTypeCalcRuleApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityPutawayTypeCalcRuleByIdGET**](EntityputawayTypeCalcRuleApi.md#entityPutawayTypeCalcRuleByIdGET) | **GET** /entity/putaway_type_calc_rule/{id} | EntityPutawayTypeCalcRuleById_GET
[**entityPutawayTypeCalcRuleGET**](EntityputawayTypeCalcRuleApi.md#entityPutawayTypeCalcRuleGET) | **GET** /entity/putaway_type_calc_rule | EntityPutawayTypeCalcRule_GET
[**entityPutawayTypeCalcRulePOST**](EntityputawayTypeCalcRuleApi.md#entityPutawayTypeCalcRulePOST) | **POST** /entity/putaway_type_calc_rule | EntityPutawayTypeCalcRule_POST


<a name="entityPutawayTypeCalcRuleByIdGET"></a>
# **entityPutawayTypeCalcRuleByIdGET**
> Object entityPutawayTypeCalcRuleByIdGET(id, fields)

EntityPutawayTypeCalcRuleById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityputawayTypeCalcRuleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityputawayTypeCalcRuleApi apiInstance = new EntityputawayTypeCalcRuleApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityPutawayTypeCalcRuleByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityputawayTypeCalcRuleApi#entityPutawayTypeCalcRuleByIdGET");
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

<a name="entityPutawayTypeCalcRuleGET"></a>
# **entityPutawayTypeCalcRuleGET**
> Object entityPutawayTypeCalcRuleGET()

EntityPutawayTypeCalcRule_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityputawayTypeCalcRuleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityputawayTypeCalcRuleApi apiInstance = new EntityputawayTypeCalcRuleApi();
try {
    Object result = apiInstance.entityPutawayTypeCalcRuleGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityputawayTypeCalcRuleApi#entityPutawayTypeCalcRuleGET");
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

<a name="entityPutawayTypeCalcRulePOST"></a>
# **entityPutawayTypeCalcRulePOST**
> Object entityPutawayTypeCalcRulePOST()

EntityPutawayTypeCalcRule_POST



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityputawayTypeCalcRuleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityputawayTypeCalcRuleApi apiInstance = new EntityputawayTypeCalcRuleApi();
try {
    Object result = apiInstance.entityPutawayTypeCalcRulePOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityputawayTypeCalcRuleApi#entityPutawayTypeCalcRulePOST");
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

