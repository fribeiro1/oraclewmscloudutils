# ReplenishmentApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**replenishmentReplenishToActivePOST**](ReplenishmentApi.md#replenishmentReplenishToActivePOST) | **POST** /replenishment/replenish_to_active | ReplenishmentReplenishToActive_POST


<a name="replenishmentReplenishToActivePOST"></a>
# **replenishmentReplenishToActivePOST**
> Object replenishmentReplenishToActivePOST()

ReplenishmentReplenishToActive_POST



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReplenishmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ReplenishmentApi apiInstance = new ReplenishmentApi();
try {
    Object result = apiInstance.replenishmentReplenishToActivePOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplenishmentApi#replenishmentReplenishToActivePOST");
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

