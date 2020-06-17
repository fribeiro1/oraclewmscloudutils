# swagger_client.EntitytrailerApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_trailer_by_id_get**](EntitytrailerApi.md#entity_trailer_by_id_get) | **GET** /entity/trailer/{id} | EntityTrailerById_GET
[**entity_trailer_describe_get**](EntitytrailerApi.md#entity_trailer_describe_get) | **GET** /entity/trailer/describe | EntityTrailerDescribe_GET
[**entity_trailer_get**](EntitytrailerApi.md#entity_trailer_get) | **GET** /entity/trailer | EntityTrailer_GET
[**entity_trailer_locate_to_yard_by_id_post**](EntitytrailerApi.md#entity_trailer_locate_to_yard_by_id_post) | **POST** /entity/trailer/{id}/locate_to_yard | EntityTrailerLocateToYardById_POST
[**entity_trailer_locate_to_yard_post**](EntitytrailerApi.md#entity_trailer_locate_to_yard_post) | **POST** /entity/trailer/locate_to_yard | EntityTrailerLocateToYard_POST
[**entity_trailer_post**](EntitytrailerApi.md#entity_trailer_post) | **POST** /entity/trailer | EntityTrailer_POST
[**entity_trailer_remove_from_yard_by_id_post**](EntitytrailerApi.md#entity_trailer_remove_from_yard_by_id_post) | **POST** /entity/trailer/{id}/remove_from_yard | EntityTrailerRemoveFromYardById_POST
[**entity_trailer_remove_from_yard_post**](EntitytrailerApi.md#entity_trailer_remove_from_yard_post) | **POST** /entity/trailer/remove_from_yard | EntityTrailerRemoveFromYard_POST


# **entity_trailer_by_id_get**
> object entity_trailer_by_id_get(id, fields=fields)

EntityTrailerById_GET



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
api_instance = swagger_client.EntitytrailerApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 
fields = 'fields_example' # str |  (optional)

try:
    # EntityTrailerById_GET
    api_response = api_instance.entity_trailer_by_id_get(id, fields=fields)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitytrailerApi->entity_trailer_by_id_get: %s\n" % e)
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

# **entity_trailer_describe_get**
> object entity_trailer_describe_get()

EntityTrailerDescribe_GET



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
api_instance = swagger_client.EntitytrailerApi(swagger_client.ApiClient(configuration))

try:
    # EntityTrailerDescribe_GET
    api_response = api_instance.entity_trailer_describe_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitytrailerApi->entity_trailer_describe_get: %s\n" % e)
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

# **entity_trailer_get**
> object entity_trailer_get(fields=fields, ordering=ordering, page_mode=page_mode)

EntityTrailer_GET



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
api_instance = swagger_client.EntitytrailerApi(swagger_client.ApiClient(configuration))
fields = 'fields_example' # str |  (optional)
ordering = 'ordering_example' # str |  (optional)
page_mode = 'paged' # str |  (optional) (default to paged)

try:
    # EntityTrailer_GET
    api_response = api_instance.entity_trailer_get(fields=fields, ordering=ordering, page_mode=page_mode)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitytrailerApi->entity_trailer_get: %s\n" % e)
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

# **entity_trailer_locate_to_yard_by_id_post**
> object entity_trailer_locate_to_yard_by_id_post(id)

EntityTrailerLocateToYardById_POST



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
api_instance = swagger_client.EntitytrailerApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 

try:
    # EntityTrailerLocateToYardById_POST
    api_response = api_instance.entity_trailer_locate_to_yard_by_id_post(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitytrailerApi->entity_trailer_locate_to_yard_by_id_post: %s\n" % e)
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

# **entity_trailer_locate_to_yard_post**
> object entity_trailer_locate_to_yard_post()

EntityTrailerLocateToYard_POST



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
api_instance = swagger_client.EntitytrailerApi(swagger_client.ApiClient(configuration))

try:
    # EntityTrailerLocateToYard_POST
    api_response = api_instance.entity_trailer_locate_to_yard_post()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitytrailerApi->entity_trailer_locate_to_yard_post: %s\n" % e)
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

# **entity_trailer_post**
> object entity_trailer_post(fields=fields, ordering=ordering, page_mode=page_mode)

EntityTrailer_POST



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
api_instance = swagger_client.EntitytrailerApi(swagger_client.ApiClient(configuration))
fields = 'fields_example' # str |  (optional)
ordering = 'ordering_example' # str |  (optional)
page_mode = 'paged' # str |  (optional) (default to paged)

try:
    # EntityTrailer_POST
    api_response = api_instance.entity_trailer_post(fields=fields, ordering=ordering, page_mode=page_mode)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitytrailerApi->entity_trailer_post: %s\n" % e)
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

# **entity_trailer_remove_from_yard_by_id_post**
> object entity_trailer_remove_from_yard_by_id_post(id)

EntityTrailerRemoveFromYardById_POST



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
api_instance = swagger_client.EntitytrailerApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 

try:
    # EntityTrailerRemoveFromYardById_POST
    api_response = api_instance.entity_trailer_remove_from_yard_by_id_post(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitytrailerApi->entity_trailer_remove_from_yard_by_id_post: %s\n" % e)
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

# **entity_trailer_remove_from_yard_post**
> object entity_trailer_remove_from_yard_post()

EntityTrailerRemoveFromYard_POST



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
api_instance = swagger_client.EntitytrailerApi(swagger_client.ApiClient(configuration))

try:
    # EntityTrailerRemoveFromYard_POST
    api_response = api_instance.entity_trailer_remove_from_yard_post()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitytrailerApi->entity_trailer_remove_from_yard_post: %s\n" % e)
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

