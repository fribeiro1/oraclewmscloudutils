# swagger_client.EntityqcStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_qc_status_by_id_get**](EntityqcStatusApi.md#entity_qc_status_by_id_get) | **GET** /entity/qc_status/{id} | EntityQcStatusById_GET
[**entity_qc_status_describe_get**](EntityqcStatusApi.md#entity_qc_status_describe_get) | **GET** /entity/qc_status/describe | EntityQcStatusDescribe_GET
[**entity_qc_status_get**](EntityqcStatusApi.md#entity_qc_status_get) | **GET** /entity/qc_status | EntityQcStatus_GET


# **entity_qc_status_by_id_get**
> object entity_qc_status_by_id_get(id, fields=fields)

EntityQcStatusById_GET



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
api_instance = swagger_client.EntityqcStatusApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 
fields = 'fields_example' # str |  (optional)

try:
    # EntityQcStatusById_GET
    api_response = api_instance.entity_qc_status_by_id_get(id, fields=fields)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntityqcStatusApi->entity_qc_status_by_id_get: %s\n" % e)
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

# **entity_qc_status_describe_get**
> object entity_qc_status_describe_get()

EntityQcStatusDescribe_GET



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
api_instance = swagger_client.EntityqcStatusApi(swagger_client.ApiClient(configuration))

try:
    # EntityQcStatusDescribe_GET
    api_response = api_instance.entity_qc_status_describe_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntityqcStatusApi->entity_qc_status_describe_get: %s\n" % e)
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

# **entity_qc_status_get**
> object entity_qc_status_get(fields=fields, ordering=ordering, page_mode=page_mode)

EntityQcStatus_GET



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
api_instance = swagger_client.EntityqcStatusApi(swagger_client.ApiClient(configuration))
fields = 'fields_example' # str |  (optional)
ordering = 'ordering_example' # str |  (optional)
page_mode = 'paged' # str |  (optional) (default to paged)

try:
    # EntityQcStatus_GET
    api_response = api_instance.entity_qc_status_get(fields=fields, ordering=ordering, page_mode=page_mode)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntityqcStatusApi->entity_qc_status_get: %s\n" % e)
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

