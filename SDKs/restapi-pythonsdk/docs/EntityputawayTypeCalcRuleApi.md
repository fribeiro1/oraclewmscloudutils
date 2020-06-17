# swagger_client.EntityputawayTypeCalcRuleApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_putaway_type_calc_rule_by_id_get**](EntityputawayTypeCalcRuleApi.md#entity_putaway_type_calc_rule_by_id_get) | **GET** /entity/putaway_type_calc_rule/{id} | EntityPutawayTypeCalcRuleById_GET
[**entity_putaway_type_calc_rule_get**](EntityputawayTypeCalcRuleApi.md#entity_putaway_type_calc_rule_get) | **GET** /entity/putaway_type_calc_rule | EntityPutawayTypeCalcRule_GET
[**entity_putaway_type_calc_rule_post**](EntityputawayTypeCalcRuleApi.md#entity_putaway_type_calc_rule_post) | **POST** /entity/putaway_type_calc_rule | EntityPutawayTypeCalcRule_POST


# **entity_putaway_type_calc_rule_by_id_get**
> object entity_putaway_type_calc_rule_by_id_get(id, fields=fields)

EntityPutawayTypeCalcRuleById_GET



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
api_instance = swagger_client.EntityputawayTypeCalcRuleApi(swagger_client.ApiClient(configuration))
id = 8.14 # float | 
fields = 'fields_example' # str |  (optional)

try:
    # EntityPutawayTypeCalcRuleById_GET
    api_response = api_instance.entity_putaway_type_calc_rule_by_id_get(id, fields=fields)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntityputawayTypeCalcRuleApi->entity_putaway_type_calc_rule_by_id_get: %s\n" % e)
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

# **entity_putaway_type_calc_rule_get**
> object entity_putaway_type_calc_rule_get()

EntityPutawayTypeCalcRule_GET



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
api_instance = swagger_client.EntityputawayTypeCalcRuleApi(swagger_client.ApiClient(configuration))

try:
    # EntityPutawayTypeCalcRule_GET
    api_response = api_instance.entity_putaway_type_calc_rule_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntityputawayTypeCalcRuleApi->entity_putaway_type_calc_rule_get: %s\n" % e)
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

# **entity_putaway_type_calc_rule_post**
> object entity_putaway_type_calc_rule_post()

EntityPutawayTypeCalcRule_POST



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
api_instance = swagger_client.EntityputawayTypeCalcRuleApi(swagger_client.ApiClient(configuration))

try:
    # EntityPutawayTypeCalcRule_POST
    api_response = api_instance.entity_putaway_type_calc_rule_post()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EntityputawayTypeCalcRuleApi->entity_putaway_type_calc_rule_post: %s\n" % e)
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

