# swagger_client.ReplenishmentApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**replenishment_replenish_to_active_post**](ReplenishmentApi.md#replenishment_replenish_to_active_post) | **POST** /replenishment/replenish_to_active | ReplenishmentReplenishToActive_POST


# **replenishment_replenish_to_active_post**
> object replenishment_replenish_to_active_post()

ReplenishmentReplenishToActive_POST



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: basic
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'
# Configure OAuth2 access token for authorization: oauth2
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.ReplenishmentApi(swagger_client.ApiClient(configuration))

try:
    # ReplenishmentReplenishToActive_POST
    api_response = api_instance.replenishment_replenish_to_active_post()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReplenishmentApi->replenishment_replenish_to_active_post: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

