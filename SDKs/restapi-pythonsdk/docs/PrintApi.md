# swagger_client.PrintApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**print_label_ib_container_get**](PrintApi.md#print_label_ib_container_get) | **GET** /print/label/ib_container | PrintLabelIbContainer_GET
[**print_label_ib_container_post**](PrintApi.md#print_label_ib_container_post) | **POST** /print/label/ib_container | PrintLabelIbContainer_POST
[**print_label_pallet_get**](PrintApi.md#print_label_pallet_get) | **GET** /print/label/pallet | PrintLabelPallet_GET
[**print_label_pallet_post**](PrintApi.md#print_label_pallet_post) | **POST** /print/label/pallet | PrintLabelPallet_POST
[**print_label_shipping_get**](PrintApi.md#print_label_shipping_get) | **GET** /print/label/shipping | PrintLabelShipping_GET
[**print_label_shipping_post**](PrintApi.md#print_label_shipping_post) | **POST** /print/label/shipping | PrintLabelShipping_POST


# **print_label_ib_container_get**
> object print_label_ib_container_get(company_id, container_nbr, facility_id, id, label_designer_code)

PrintLabelIbContainer_GET



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
api_instance = swagger_client.PrintApi(swagger_client.ApiClient(configuration))
company_id = 8.14 # float | 
container_nbr = 'container_nbr_example' # str | 
facility_id = 8.14 # float | 
id = 8.14 # float | 
label_designer_code = 'label_designer_code_example' # str | 

try:
    # PrintLabelIbContainer_GET
    api_response = api_instance.print_label_ib_container_get(company_id, container_nbr, facility_id, id, label_designer_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrintApi->print_label_ib_container_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **float**|  | 
 **container_nbr** | **str**|  | 
 **facility_id** | **float**|  | 
 **id** | **float**|  | 
 **label_designer_code** | **str**|  | 

### Return type

**object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **print_label_ib_container_post**
> object print_label_ib_container_post(company_id, container_nbr, facility_id, id, label_designer_code)

PrintLabelIbContainer_POST



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
api_instance = swagger_client.PrintApi(swagger_client.ApiClient(configuration))
company_id = 8.14 # float | 
container_nbr = 'container_nbr_example' # str | 
facility_id = 8.14 # float | 
id = 8.14 # float | 
label_designer_code = 'label_designer_code_example' # str | 

try:
    # PrintLabelIbContainer_POST
    api_response = api_instance.print_label_ib_container_post(company_id, container_nbr, facility_id, id, label_designer_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrintApi->print_label_ib_container_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **float**|  | 
 **container_nbr** | **str**|  | 
 **facility_id** | **float**|  | 
 **id** | **float**|  | 
 **label_designer_code** | **str**|  | 

### Return type

**object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **print_label_pallet_get**
> object print_label_pallet_get(company_id, container_nbr, facility_id, id, label_designer_code)

PrintLabelPallet_GET



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
api_instance = swagger_client.PrintApi(swagger_client.ApiClient(configuration))
company_id = 8.14 # float | 
container_nbr = 'container_nbr_example' # str | 
facility_id = 8.14 # float | 
id = 8.14 # float | 
label_designer_code = 'label_designer_code_example' # str | 

try:
    # PrintLabelPallet_GET
    api_response = api_instance.print_label_pallet_get(company_id, container_nbr, facility_id, id, label_designer_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrintApi->print_label_pallet_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **float**|  | 
 **container_nbr** | **str**|  | 
 **facility_id** | **float**|  | 
 **id** | **float**|  | 
 **label_designer_code** | **str**|  | 

### Return type

**object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **print_label_pallet_post**
> object print_label_pallet_post(company_id, container_nbr, facility_id, id, label_designer_code)

PrintLabelPallet_POST



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
api_instance = swagger_client.PrintApi(swagger_client.ApiClient(configuration))
company_id = 8.14 # float | 
container_nbr = 'container_nbr_example' # str | 
facility_id = 8.14 # float | 
id = 8.14 # float | 
label_designer_code = 'label_designer_code_example' # str | 

try:
    # PrintLabelPallet_POST
    api_response = api_instance.print_label_pallet_post(company_id, container_nbr, facility_id, id, label_designer_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrintApi->print_label_pallet_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **float**|  | 
 **container_nbr** | **str**|  | 
 **facility_id** | **float**|  | 
 **id** | **float**|  | 
 **label_designer_code** | **str**|  | 

### Return type

**object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **print_label_shipping_get**
> object print_label_shipping_get(company_id, container_nbr, facility_id, id, label_designer_code)

PrintLabelShipping_GET



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
api_instance = swagger_client.PrintApi(swagger_client.ApiClient(configuration))
company_id = 8.14 # float | 
container_nbr = 'container_nbr_example' # str | 
facility_id = 8.14 # float | 
id = 8.14 # float | 
label_designer_code = 'label_designer_code_example' # str | 

try:
    # PrintLabelShipping_GET
    api_response = api_instance.print_label_shipping_get(company_id, container_nbr, facility_id, id, label_designer_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrintApi->print_label_shipping_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **float**|  | 
 **container_nbr** | **str**|  | 
 **facility_id** | **float**|  | 
 **id** | **float**|  | 
 **label_designer_code** | **str**|  | 

### Return type

**object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **print_label_shipping_post**
> object print_label_shipping_post(company_id, container_nbr, facility_id, id, label_designer_code)

PrintLabelShipping_POST



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
api_instance = swagger_client.PrintApi(swagger_client.ApiClient(configuration))
company_id = 8.14 # float | 
container_nbr = 'container_nbr_example' # str | 
facility_id = 8.14 # float | 
id = 8.14 # float | 
label_designer_code = 'label_designer_code_example' # str | 

try:
    # PrintLabelShipping_POST
    api_response = api_instance.print_label_shipping_post(company_id, container_nbr, facility_id, id, label_designer_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrintApi->print_label_shipping_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **float**|  | 
 **container_nbr** | **str**|  | 
 **facility_id** | **float**|  | 
 **id** | **float**|  | 
 **label_designer_code** | **str**|  | 

### Return type

**object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

