# swagger_client.EntitylocationApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_location_by_id_get**](EntitylocationApi.md#entity_location_by_id_get) | **GET** /entity/location/{id} | EntityLocationById_GET
[**entity_location_by_id_patch**](EntitylocationApi.md#entity_location_by_id_patch) | **PATCH** /entity/location/{id} | EntityLocationById_PATCH
[**entity_location_describe_get**](EntitylocationApi.md#entity_location_describe_get) | **GET** /entity/location/describe | EntityLocationDescribe_GET
[**entity_location_get**](EntitylocationApi.md#entity_location_get) | **GET** /entity/location | EntityLocation_GET
[**entity_location_update_active_inventory_by_id_post**](EntitylocationApi.md#entity_location_update_active_inventory_by_id_post) | **POST** /entity/location/{id}/update_active_inventory | EntityLocationUpdateActiveInventoryById_POST
[**entity_location_update_active_inventory_post**](EntitylocationApi.md#entity_location_update_active_inventory_post) | **POST** /entity/location/update_active_inventory | EntityLocationUpdateActiveInventory_POST
[**entity_location_year_first_available_get**](EntitylocationApi.md#entity_location_year_first_available_get) | **GET** /entity/location/yard/first_available | EntityLocationYearFirstAvailable_GET


# **entity_location_by_id_get**
> object entity_location_by_id_get(id, fields=fields)

EntityLocationById_GET



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
api_instance = swagger_client.EntitylocationApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 
fields = 'fields_example' # str |  (optional)

try:
    # EntityLocationById_GET
    api_response = api_instance.entity_location_by_id_get(id, fields=fields)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitylocationApi->entity_location_by_id_get: %s\n" % e)
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

# **entity_location_by_id_patch**
> object entity_location_by_id_patch(id, fields=fields)

EntityLocationById_PATCH



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
api_instance = swagger_client.EntitylocationApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 
fields = 'fields_example' # str |  (optional)

try:
    # EntityLocationById_PATCH
    api_response = api_instance.entity_location_by_id_patch(id, fields=fields)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitylocationApi->entity_location_by_id_patch: %s\n" % e)
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

# **entity_location_describe_get**
> object entity_location_describe_get()

EntityLocationDescribe_GET



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
api_instance = swagger_client.EntitylocationApi(swagger_client.ApiClient(configuration))

try:
    # EntityLocationDescribe_GET
    api_response = api_instance.entity_location_describe_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitylocationApi->entity_location_describe_get: %s\n" % e)
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

# **entity_location_get**
> object entity_location_get(fields=fields, ordering=ordering, page_mode=page_mode)

EntityLocation_GET



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
api_instance = swagger_client.EntitylocationApi(swagger_client.ApiClient(configuration))
fields = 'fields_example' # str |  (optional)
ordering = 'ordering_example' # str |  (optional)
page_mode = 'paged' # str |  (optional) (default to paged)

try:
    # EntityLocation_GET
    api_response = api_instance.entity_location_get(fields=fields, ordering=ordering, page_mode=page_mode)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitylocationApi->entity_location_get: %s\n" % e)
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

# **entity_location_update_active_inventory_by_id_post**
> object entity_location_update_active_inventory_by_id_post(id)

EntityLocationUpdateActiveInventoryById_POST



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
api_instance = swagger_client.EntitylocationApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 

try:
    # EntityLocationUpdateActiveInventoryById_POST
    api_response = api_instance.entity_location_update_active_inventory_by_id_post(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitylocationApi->entity_location_update_active_inventory_by_id_post: %s\n" % e)
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

# **entity_location_update_active_inventory_post**
> object entity_location_update_active_inventory_post()

EntityLocationUpdateActiveInventory_POST



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
api_instance = swagger_client.EntitylocationApi(swagger_client.ApiClient(configuration))

try:
    # EntityLocationUpdateActiveInventory_POST
    api_response = api_instance.entity_location_update_active_inventory_post()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitylocationApi->entity_location_update_active_inventory_post: %s\n" % e)
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

# **entity_location_year_first_available_get**
> object entity_location_year_first_available_get(facility_id=facility_id, facility_id__code=facility_id__code)

EntityLocationYearFirstAvailable_GET



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
api_instance = swagger_client.EntitylocationApi(swagger_client.ApiClient(configuration))
facility_id = 'facility_id_example' # str |  (optional)
facility_id__code = 'facility_id__code_example' # str |  (optional)

try:
    # EntityLocationYearFirstAvailable_GET
    api_response = api_instance.entity_location_year_first_available_get(facility_id=facility_id, facility_id__code=facility_id__code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitylocationApi->entity_location_year_first_available_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **facility_id** | **str**|  | [optional] 
 **facility_id__code** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

