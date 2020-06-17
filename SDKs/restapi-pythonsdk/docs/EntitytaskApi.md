# swagger_client.EntitytaskApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_task_by_id_get**](EntitytaskApi.md#entity_task_by_id_get) | **GET** /entity/task/{id} | EntityTaskById_GET
[**entity_task_describe_get**](EntitytaskApi.md#entity_task_describe_get) | **GET** /entity/task/describe | EntityTaskDescribe_GET
[**entity_task_get**](EntitytaskApi.md#entity_task_get) | **GET** /entity/task | EntityTask_GET
[**entity_task_next_task_get**](EntitytaskApi.md#entity_task_next_task_get) | **GET** /entity/task/next_task | EntityTaskNextTask_GET


# **entity_task_by_id_get**
> object entity_task_by_id_get(id, fields=fields)

EntityTaskById_GET



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
api_instance = swagger_client.EntitytaskApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 
fields = 'fields_example' # str |  (optional)

try:
    # EntityTaskById_GET
    api_response = api_instance.entity_task_by_id_get(id, fields=fields)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitytaskApi->entity_task_by_id_get: %s\n" % e)
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

# **entity_task_describe_get**
> object entity_task_describe_get()

EntityTaskDescribe_GET



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
api_instance = swagger_client.EntitytaskApi(swagger_client.ApiClient(configuration))

try:
    # EntityTaskDescribe_GET
    api_response = api_instance.entity_task_describe_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitytaskApi->entity_task_describe_get: %s\n" % e)
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

# **entity_task_get**
> object entity_task_get(fields=fields, ordering=ordering, page_mode=page_mode, facility_id=facility_id, facility_id__code=facility_id__code, location_barcode=location_barcode, task_type=task_type, ordering_rule=ordering_rule)

EntityTask_GET



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
api_instance = swagger_client.EntitytaskApi(swagger_client.ApiClient(configuration))
fields = 'fields_example' # str |  (optional)
ordering = 'ordering_example' # str |  (optional)
page_mode = 'paged' # str |  (optional) (default to paged)
facility_id = 56 # int |  (optional)
facility_id__code = 'facility_id__code_example' # str |  (optional)
location_barcode = 'location_barcode_example' # str |  (optional)
task_type = 'task_type_example' # str |  (optional)
ordering_rule = 'ordering_rule_example' # str |  (optional)

try:
    # EntityTask_GET
    api_response = api_instance.entity_task_get(fields=fields, ordering=ordering, page_mode=page_mode, facility_id=facility_id, facility_id__code=facility_id__code, location_barcode=location_barcode, task_type=task_type, ordering_rule=ordering_rule)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitytaskApi->entity_task_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **str**|  | [optional] 
 **ordering** | **str**|  | [optional] 
 **page_mode** | **str**|  | [optional] [default to paged]
 **facility_id** | **int**|  | [optional] 
 **facility_id__code** | **str**|  | [optional] 
 **location_barcode** | **str**|  | [optional] 
 **task_type** | **str**|  | [optional] 
 **ordering_rule** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entity_task_next_task_get**
> object entity_task_next_task_get(facility_id, facility_id__code, location_barcode, ordering_rule, task_type)

EntityTaskNextTask_GET



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
api_instance = swagger_client.EntitytaskApi(swagger_client.ApiClient(configuration))
facility_id = 8.14 # float | 
facility_id__code = 'facility_id__code_example' # str | 
location_barcode = 'location_barcode_example' # str | 
ordering_rule = 'ordering_rule_example' # str | 
task_type = 'task_type_example' # str | 

try:
    # EntityTaskNextTask_GET
    api_response = api_instance.entity_task_next_task_get(facility_id, facility_id__code, location_barcode, ordering_rule, task_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntitytaskApi->entity_task_next_task_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **facility_id** | **float**|  | 
 **facility_id__code** | **str**|  | 
 **location_barcode** | **str**|  | 
 **ordering_rule** | **str**|  | 
 **task_type** | **str**|  | 

### Return type

**object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

