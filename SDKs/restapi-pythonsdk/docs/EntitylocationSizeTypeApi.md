# swagger_client.EntitylocationSizeTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_location_size_type_by_id_get**](EntitylocationSizeTypeApi.md#entity_location_size_type_by_id_get) | **GET** /entity/location_size_type/{id} | EntityLocationSizeTypeById_GET
[**entity_location_size_type_get**](EntitylocationSizeTypeApi.md#entity_location_size_type_get) | **GET** /entity/location_size_type | EntityLocationSizeType_GET
[**entity_location_size_type_post**](EntitylocationSizeTypeApi.md#entity_location_size_type_post) | **POST** /entity/location_size_type | EntityLocationSizeType_POST


# **entity_location_size_type_by_id_get**
> object entity_location_size_type_by_id_get(id, fields=fields)

EntityLocationSizeTypeById_GET



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
api_instance = swagger_client.EntitylocationSizeTypeApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 
fields = 'fields_example' # str |  (optional)

try:
    # EntityLocationSizeTypeById_GET
    api_response = api_instance.entity_location_size_type_by_id_get(id, fields=fields)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitylocationSizeTypeApi->entity_location_size_type_by_id_get: %s\n" % e)
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

# **entity_location_size_type_get**
> object entity_location_size_type_get()

EntityLocationSizeType_GET



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
api_instance = swagger_client.EntitylocationSizeTypeApi(swagger_client.ApiClient(configuration))

try:
    # EntityLocationSizeType_GET
    api_response = api_instance.entity_location_size_type_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitylocationSizeTypeApi->entity_location_size_type_get: %s\n" % e)
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

# **entity_location_size_type_post**
> object entity_location_size_type_post()

EntityLocationSizeType_POST



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
api_instance = swagger_client.EntitylocationSizeTypeApi(swagger_client.ApiClient(configuration))

try:
    # EntityLocationSizeType_POST
    api_response = api_instance.entity_location_size_type_post()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitylocationSizeTypeApi->entity_location_size_type_post: %s\n" % e)
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

