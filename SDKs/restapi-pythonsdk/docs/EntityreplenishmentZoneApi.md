# swagger_client.EntityreplenishmentZoneApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_replenishment_zone_by_id_get**](EntityreplenishmentZoneApi.md#entity_replenishment_zone_by_id_get) | **GET** /entity/replenishment_zone/{id} | EntityReplenishmentZoneById_GET
[**entity_replenishment_zone_get**](EntityreplenishmentZoneApi.md#entity_replenishment_zone_get) | **GET** /entity/replenishment_zone | EntityReplenishmentZone_GET
[**entity_replenishment_zone_post**](EntityreplenishmentZoneApi.md#entity_replenishment_zone_post) | **POST** /entity/replenishment_zone | EntityReplenishmentZone_POST


# **entity_replenishment_zone_by_id_get**
> object entity_replenishment_zone_by_id_get(id, fields=fields)

EntityReplenishmentZoneById_GET



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
api_instance = swagger_client.EntityreplenishmentZoneApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 
fields = 'fields_example' # str |  (optional)

try:
    # EntityReplenishmentZoneById_GET
    api_response = api_instance.entity_replenishment_zone_by_id_get(id, fields=fields)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntityreplenishmentZoneApi->entity_replenishment_zone_by_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**|  | 
 **fields** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entity_replenishment_zone_get**
> object entity_replenishment_zone_get()

EntityReplenishmentZone_GET



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
api_instance = swagger_client.EntityreplenishmentZoneApi(swagger_client.ApiClient(configuration))

try:
    # EntityReplenishmentZone_GET
    api_response = api_instance.entity_replenishment_zone_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntityreplenishmentZoneApi->entity_replenishment_zone_get: %s\n" % e)
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

# **entity_replenishment_zone_post**
> object entity_replenishment_zone_post()

EntityReplenishmentZone_POST



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
api_instance = swagger_client.EntityreplenishmentZoneApi(swagger_client.ApiClient(configuration))

try:
    # EntityReplenishmentZone_POST
    api_response = api_instance.entity_replenishment_zone_post()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntityreplenishmentZoneApi->entity_replenishment_zone_post: %s\n" % e)
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

