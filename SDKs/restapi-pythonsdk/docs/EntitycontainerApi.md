# swagger_client.EntitycontainerApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_container_bulk_lock_post**](EntitycontainerApi.md#entity_container_bulk_lock_post) | **POST** /entity/container/bulk_lock | EntityContainerBulkLock_POST
[**entity_container_bulk_unlock_post**](EntitycontainerApi.md#entity_container_bulk_unlock_post) | **POST** /entity/container/bulk_unlock | EntityContainerBulkUnlock_POST
[**entity_container_by_id_get**](EntitycontainerApi.md#entity_container_by_id_get) | **GET** /entity/container/{id} | EntityContainerById_GET
[**entity_container_by_id_patch**](EntitycontainerApi.md#entity_container_by_id_patch) | **PATCH** /entity/container/{id} | EntityContainerById_PATCH
[**entity_container_depalletize_by_id_post**](EntitycontainerApi.md#entity_container_depalletize_by_id_post) | **POST** /entity/container/{id}/depalletize | EntityContainerDepalletizeById_POST
[**entity_container_depalletize_post**](EntitycontainerApi.md#entity_container_depalletize_post) | **POST** /entity/container/depalletize | EntityContainerDepalletize_POST
[**entity_container_describe_get**](EntitycontainerApi.md#entity_container_describe_get) | **GET** /entity/container/describe | EntityContainerDescribe_GET
[**entity_container_get**](EntitycontainerApi.md#entity_container_get) | **GET** /entity/container | EntityContainer_GET
[**entity_container_lock_by_id_post**](EntitycontainerApi.md#entity_container_lock_by_id_post) | **POST** /entity/container/{id}/lock | EntityContainerLockById_POST
[**entity_container_orders_by_id_get**](EntitycontainerApi.md#entity_container_orders_by_id_get) | **GET** /entity/container/{id}/orders | EntityContainerOrdersById_GET
[**entity_container_palletize_by_id_post**](EntitycontainerApi.md#entity_container_palletize_by_id_post) | **POST** /entity/container/{id}/palletize | EntityContainerPalletizeById_POST
[**entity_container_unlock_by_id_post**](EntitycontainerApi.md#entity_container_unlock_by_id_post) | **POST** /entity/container/{id}/unlock | EntityContainerUnlockById_POST


# **entity_container_bulk_lock_post**
> object entity_container_bulk_lock_post()

EntityContainerBulkLock_POST



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
api_instance = swagger_client.EntitycontainerApi(swagger_client.ApiClient(configuration))

try:
    # EntityContainerBulkLock_POST
    api_response = api_instance.entity_container_bulk_lock_post()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitycontainerApi->entity_container_bulk_lock_post: %s\n" % e)
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

# **entity_container_bulk_unlock_post**
> object entity_container_bulk_unlock_post()

EntityContainerBulkUnlock_POST



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
api_instance = swagger_client.EntitycontainerApi(swagger_client.ApiClient(configuration))

try:
    # EntityContainerBulkUnlock_POST
    api_response = api_instance.entity_container_bulk_unlock_post()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitycontainerApi->entity_container_bulk_unlock_post: %s\n" % e)
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

# **entity_container_by_id_get**
> object entity_container_by_id_get(id, fields=fields)

EntityContainerById_GET



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
api_instance = swagger_client.EntitycontainerApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 
fields = 'fields_example' # str |  (optional)

try:
    # EntityContainerById_GET
    api_response = api_instance.entity_container_by_id_get(id, fields=fields)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitycontainerApi->entity_container_by_id_get: %s\n" % e)
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

# **entity_container_by_id_patch**
> object entity_container_by_id_patch(id, fields=fields)

EntityContainerById_PATCH



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
api_instance = swagger_client.EntitycontainerApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 
fields = 'fields_example' # str |  (optional)

try:
    # EntityContainerById_PATCH
    api_response = api_instance.entity_container_by_id_patch(id, fields=fields)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitycontainerApi->entity_container_by_id_patch: %s\n" % e)
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

# **entity_container_depalletize_by_id_post**
> object entity_container_depalletize_by_id_post(id)

EntityContainerDepalletizeById_POST



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
api_instance = swagger_client.EntitycontainerApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 

try:
    # EntityContainerDepalletizeById_POST
    api_response = api_instance.entity_container_depalletize_by_id_post(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitycontainerApi->entity_container_depalletize_by_id_post: %s\n" % e)
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

# **entity_container_depalletize_post**
> object entity_container_depalletize_post()

EntityContainerDepalletize_POST



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
api_instance = swagger_client.EntitycontainerApi(swagger_client.ApiClient(configuration))

try:
    # EntityContainerDepalletize_POST
    api_response = api_instance.entity_container_depalletize_post()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitycontainerApi->entity_container_depalletize_post: %s\n" % e)
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

# **entity_container_describe_get**
> object entity_container_describe_get()

EntityContainerDescribe_GET



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
api_instance = swagger_client.EntitycontainerApi(swagger_client.ApiClient(configuration))

try:
    # EntityContainerDescribe_GET
    api_response = api_instance.entity_container_describe_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitycontainerApi->entity_container_describe_get: %s\n" % e)
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

# **entity_container_get**
> object entity_container_get(fields=fields, ordering=ordering, page_mode=page_mode)

EntityContainer_GET



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
api_instance = swagger_client.EntitycontainerApi(swagger_client.ApiClient(configuration))
fields = 'fields_example' # str |  (optional)
ordering = 'ordering_example' # str |  (optional)
page_mode = 'paged' # str |  (optional) (default to paged)

try:
    # EntityContainer_GET
    api_response = api_instance.entity_container_get(fields=fields, ordering=ordering, page_mode=page_mode)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitycontainerApi->entity_container_get: %s\n" % e)
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

# **entity_container_lock_by_id_post**
> object entity_container_lock_by_id_post(id)

EntityContainerLockById_POST



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
api_instance = swagger_client.EntitycontainerApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 

try:
    # EntityContainerLockById_POST
    api_response = api_instance.entity_container_lock_by_id_post(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitycontainerApi->entity_container_lock_by_id_post: %s\n" % e)
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

# **entity_container_orders_by_id_get**
> object entity_container_orders_by_id_get(id)

EntityContainerOrdersById_GET



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
api_instance = swagger_client.EntitycontainerApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 

try:
    # EntityContainerOrdersById_GET
    api_response = api_instance.entity_container_orders_by_id_get(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitycontainerApi->entity_container_orders_by_id_get: %s\n" % e)
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

# **entity_container_palletize_by_id_post**
> object entity_container_palletize_by_id_post(id)

EntityContainerPalletizeById_POST



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
api_instance = swagger_client.EntitycontainerApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 

try:
    # EntityContainerPalletizeById_POST
    api_response = api_instance.entity_container_palletize_by_id_post(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitycontainerApi->entity_container_palletize_by_id_post: %s\n" % e)
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

# **entity_container_unlock_by_id_post**
> object entity_container_unlock_by_id_post(id)

EntityContainerUnlockById_POST



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
api_instance = swagger_client.EntitycontainerApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 

try:
    # EntityContainerUnlockById_POST
    api_response = api_instance.entity_container_unlock_by_id_post(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitycontainerApi->entity_container_unlock_by_id_post: %s\n" % e)
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

