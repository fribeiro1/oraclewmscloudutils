# swagger_client.EntitypalletApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_pallet_by_id_get**](EntitypalletApi.md#entity_pallet_by_id_get) | **GET** /entity/pallet/{id} | EntityPalletById_GET
[**entity_pallet_close_inbound_sorting_by_id_post**](EntitypalletApi.md#entity_pallet_close_inbound_sorting_by_id_post) | **POST** /entity/pallet/{id}/close_inbound_sorting | EntityPalletCloseInboundSortingById_POST
[**entity_pallet_close_inbound_sorting_post**](EntitypalletApi.md#entity_pallet_close_inbound_sorting_post) | **POST** /entity/pallet/close_inbound_sorting | EntityPalletCloseInboundSorting_POST
[**entity_pallet_describe_get**](EntitypalletApi.md#entity_pallet_describe_get) | **GET** /entity/pallet/describe | EntityPalletDescribe_GET
[**entity_pallet_get**](EntitypalletApi.md#entity_pallet_get) | **GET** /entity/pallet | EntityPallet_GET
[**entity_pallet_sort_lpn_post**](EntitypalletApi.md#entity_pallet_sort_lpn_post) | **POST** /entity/pallet/sort_lpn | EntityPalletSortLpn_POST


# **entity_pallet_by_id_get**
> object entity_pallet_by_id_get(id, fields=fields)

EntityPalletById_GET



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
api_instance = swagger_client.EntitypalletApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 
fields = 'fields_example' # str |  (optional)

try:
    # EntityPalletById_GET
    api_response = api_instance.entity_pallet_by_id_get(id, fields=fields)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitypalletApi->entity_pallet_by_id_get: %s\n" % e)
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

# **entity_pallet_close_inbound_sorting_by_id_post**
> object entity_pallet_close_inbound_sorting_by_id_post(id)

EntityPalletCloseInboundSortingById_POST



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
api_instance = swagger_client.EntitypalletApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 

try:
    # EntityPalletCloseInboundSortingById_POST
    api_response = api_instance.entity_pallet_close_inbound_sorting_by_id_post(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitypalletApi->entity_pallet_close_inbound_sorting_by_id_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**|  | 

### Return type

**object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entity_pallet_close_inbound_sorting_post**
> object entity_pallet_close_inbound_sorting_post()

EntityPalletCloseInboundSorting_POST



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
api_instance = swagger_client.EntitypalletApi(swagger_client.ApiClient(configuration))

try:
    # EntityPalletCloseInboundSorting_POST
    api_response = api_instance.entity_pallet_close_inbound_sorting_post()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitypalletApi->entity_pallet_close_inbound_sorting_post: %s\n" % e)
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

# **entity_pallet_describe_get**
> object entity_pallet_describe_get()

EntityPalletDescribe_GET



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
api_instance = swagger_client.EntitypalletApi(swagger_client.ApiClient(configuration))

try:
    # EntityPalletDescribe_GET
    api_response = api_instance.entity_pallet_describe_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitypalletApi->entity_pallet_describe_get: %s\n" % e)
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

# **entity_pallet_get**
> object entity_pallet_get(fields=fields, ordering=ordering, page_mode=page_mode)

EntityPallet_GET



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
api_instance = swagger_client.EntitypalletApi(swagger_client.ApiClient(configuration))
fields = 'fields_example' # str |  (optional)
ordering = 'ordering_example' # str |  (optional)
page_mode = 'paged' # str |  (optional) (default to paged)

try:
    # EntityPallet_GET
    api_response = api_instance.entity_pallet_get(fields=fields, ordering=ordering, page_mode=page_mode)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitypalletApi->entity_pallet_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **str**|  | [optional] 
 **ordering** | **str**|  | [optional] 
 **page_mode** | **str**|  | [optional] [default to paged]

### Return type

**object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entity_pallet_sort_lpn_post**
> object entity_pallet_sort_lpn_post()

EntityPalletSortLpn_POST



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
api_instance = swagger_client.EntitypalletApi(swagger_client.ApiClient(configuration))

try:
    # EntityPalletSortLpn_POST
    api_response = api_instance.entity_pallet_sort_lpn_post()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitypalletApi->entity_pallet_sort_lpn_post: %s\n" % e)
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

