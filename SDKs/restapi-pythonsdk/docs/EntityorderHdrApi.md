# swagger_client.EntityorderHdrApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_order_hdr_bulk_lock_post**](EntityorderHdrApi.md#entity_order_hdr_bulk_lock_post) | **POST** /entity/order_hdr/bulk_lock | EntityOrderHdrBulkLock_POST
[**entity_order_hdr_bulk_unlock_post**](EntityorderHdrApi.md#entity_order_hdr_bulk_unlock_post) | **POST** /entity/order_hdr/bulk_unlock | EntityOrderHdrBulkUnlock_POST
[**entity_order_hdr_by_id_get**](EntityorderHdrApi.md#entity_order_hdr_by_id_get) | **GET** /entity/order_hdr/{id} | EntityOrderHdrById_GET
[**entity_order_hdr_by_id_patch**](EntityorderHdrApi.md#entity_order_hdr_by_id_patch) | **PATCH** /entity/order_hdr/{id} | EntityOrderHdrById_PATCH
[**entity_order_hdr_describe_get**](EntityorderHdrApi.md#entity_order_hdr_describe_get) | **GET** /entity/order_hdr/describe | EntityOrderHdrDescribe_GET
[**entity_order_hdr_get**](EntityorderHdrApi.md#entity_order_hdr_get) | **GET** /entity/order_hdr | EntityOrderHdr_GET
[**entity_order_hdr_iblpns_by_id_post**](EntityorderHdrApi.md#entity_order_hdr_iblpns_by_id_post) | **POST** /entity/order_hdr/{id}/iblpns | EntityOrderHdrIblpnsById_POST
[**entity_order_hdr_oblpns_by_id_post**](EntityorderHdrApi.md#entity_order_hdr_oblpns_by_id_post) | **POST** /entity/order_hdr/{id}/oblpns | EntityOrderHdrOblpnsById_POST


# **entity_order_hdr_bulk_lock_post**
> object entity_order_hdr_bulk_lock_post()

EntityOrderHdrBulkLock_POST



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
api_instance = swagger_client.EntityorderHdrApi(swagger_client.ApiClient(configuration))

try:
    # EntityOrderHdrBulkLock_POST
    api_response = api_instance.entity_order_hdr_bulk_lock_post()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntityorderHdrApi->entity_order_hdr_bulk_lock_post: %s\n" % e)
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

# **entity_order_hdr_bulk_unlock_post**
> object entity_order_hdr_bulk_unlock_post()

EntityOrderHdrBulkUnlock_POST



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
api_instance = swagger_client.EntityorderHdrApi(swagger_client.ApiClient(configuration))

try:
    # EntityOrderHdrBulkUnlock_POST
    api_response = api_instance.entity_order_hdr_bulk_unlock_post()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntityorderHdrApi->entity_order_hdr_bulk_unlock_post: %s\n" % e)
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

# **entity_order_hdr_by_id_get**
> object entity_order_hdr_by_id_get(id, fields=fields)

EntityOrderHdrById_GET



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
api_instance = swagger_client.EntityorderHdrApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 
fields = 'fields_example' # str |  (optional)

try:
    # EntityOrderHdrById_GET
    api_response = api_instance.entity_order_hdr_by_id_get(id, fields=fields)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntityorderHdrApi->entity_order_hdr_by_id_get: %s\n" % e)
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

# **entity_order_hdr_by_id_patch**
> object entity_order_hdr_by_id_patch(id, fields=fields)

EntityOrderHdrById_PATCH



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
api_instance = swagger_client.EntityorderHdrApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 
fields = 'fields_example' # str |  (optional)

try:
    # EntityOrderHdrById_PATCH
    api_response = api_instance.entity_order_hdr_by_id_patch(id, fields=fields)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntityorderHdrApi->entity_order_hdr_by_id_patch: %s\n" % e)
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

# **entity_order_hdr_describe_get**
> object entity_order_hdr_describe_get()

EntityOrderHdrDescribe_GET



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
api_instance = swagger_client.EntityorderHdrApi(swagger_client.ApiClient(configuration))

try:
    # EntityOrderHdrDescribe_GET
    api_response = api_instance.entity_order_hdr_describe_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntityorderHdrApi->entity_order_hdr_describe_get: %s\n" % e)
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

# **entity_order_hdr_get**
> object entity_order_hdr_get(fields=fields, ordering=ordering, page_mode=page_mode)

EntityOrderHdr_GET



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
api_instance = swagger_client.EntityorderHdrApi(swagger_client.ApiClient(configuration))
fields = 'fields_example' # str |  (optional)
ordering = 'ordering_example' # str |  (optional)
page_mode = 'paged' # str |  (optional) (default to paged)

try:
    # EntityOrderHdr_GET
    api_response = api_instance.entity_order_hdr_get(fields=fields, ordering=ordering, page_mode=page_mode)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntityorderHdrApi->entity_order_hdr_get: %s\n" % e)
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

# **entity_order_hdr_iblpns_by_id_post**
> object entity_order_hdr_iblpns_by_id_post(id)

EntityOrderHdrIblpnsById_POST



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
api_instance = swagger_client.EntityorderHdrApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 

try:
    # EntityOrderHdrIblpnsById_POST
    api_response = api_instance.entity_order_hdr_iblpns_by_id_post(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntityorderHdrApi->entity_order_hdr_iblpns_by_id_post: %s\n" % e)
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

# **entity_order_hdr_oblpns_by_id_post**
> object entity_order_hdr_oblpns_by_id_post(id)

EntityOrderHdrOblpnsById_POST



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
api_instance = swagger_client.EntityorderHdrApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 

try:
    # EntityOrderHdrOblpnsById_POST
    api_response = api_instance.entity_order_hdr_oblpns_by_id_post(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntityorderHdrApi->entity_order_hdr_oblpns_by_id_post: %s\n" % e)
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

