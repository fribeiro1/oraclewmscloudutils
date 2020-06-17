# swagger_client.DefaultApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assign_oblp_nto_load**](DefaultApi.md#assign_oblp_nto_load) | **POST** /assign_oblpn_to_load/ | Assign OBLPN to Load
[**assignand_load_lpn**](DefaultApi.md#assignand_load_lpn) | **POST** /assign_and_load_oblpn/ | Assign and Load LPN
[**create_lpn**](DefaultApi.md#create_lpn) | **POST** /create_lpn/ | Create LPN
[**divert_confirm**](DefaultApi.md#divert_confirm) | **POST** /divert_confirm/ | Divert Confirm
[**entity_update**](DefaultApi.md#entity_update) | **PATCH** /entity/{entity_name}/{key}/{sequence_number}/ | Entity Update
[**extended_property**](DefaultApi.md#extended_property) | **GET** /extended_property/{entity_name}/{key}/{extended_property}/ | Extended Property
[**from_mhe_distribution_pack**](DefaultApi.md#from_mhe_distribution_pack) | **POST** /from_mhe_distribution_pack/ | From MHE Distribution Pack
[**from_mhe_distribution_short**](DefaultApi.md#from_mhe_distribution_short) | **POST** /from_mhe_distribution_short/ | From MHE Distribution Short
[**get_next_numbers**](DefaultApi.md#get_next_numbers) | **POST** /get_next_numbers/ | Get Next Numbers
[**get_status**](DefaultApi.md#get_status) | **POST** /get_status/ | Get Status
[**induct_lpn**](DefaultApi.md#induct_lpn) | **POST** /induct_lpn/ | Induct LPN
[**init_stage_interface**](DefaultApi.md#init_stage_interface) | **POST** /init_stage_interface/ | Init Stage Interface
[**lock_unlock_lpn**](DefaultApi.md#lock_unlock_lpn) | **POST** /lock_unlock_lpn/ | Lock/Unlock LPN
[**object_inquiry**](DefaultApi.md#object_inquiry) | **GET** /entity/{entity}/{key}/ | Object Inquiry
[**pick_confirm**](DefaultApi.md#pick_confirm) | **POST** /pick_confirm/ | Pick Confirm
[**receive_lpn**](DefaultApi.md#receive_lpn) | **POST** /receive_lpn/ | Receive LPN
[**run_mhe_stage_interface**](DefaultApi.md#run_mhe_stage_interface) | **POST** /run_mhe_stage_interface/ | Run MHE Stage Interface
[**run_stage_interface**](DefaultApi.md#run_stage_interface) | **POST** /run_stage_interface/ | Run Stage Interface
[**ship_oblpn**](DefaultApi.md#ship_oblpn) | **POST** /ship_oblpn | Ship OBLPN
[**update_active_inventory**](DefaultApi.md#update_active_inventory) | **PATCH** /entity/active_inventory/{location_barcode}/ | Update Active Inventory
[**update_carrier_lpn_label**](DefaultApi.md#update_carrier_lpn_label) | **POST** /update_carrier_lpn_label/ | Update Carrier LPN Label
[**update_oblpn_dimensions**](DefaultApi.md#update_oblpn_dimensions) | **POST** /update_oblpn_dims/ | Update OBLPN Dimensions
[**update_oblpn_tracking_number**](DefaultApi.md#update_oblpn_tracking_number) | **POST** /update_oblpn_tracing_nbr/ | Update OBLPN Tracking Number
[**update_output_interface**](DefaultApi.md#update_output_interface) | **POST** /update_output_interface/ | Update Output Interface


# **assign_oblp_nto_load**
> object assign_oblp_nto_load(load_nbr, oblpn_nbr, carrier_code=carrier_code, company_code=company_code, delimiter=delimiter, facility_code=facility_code, reassign_load_flg=reassign_load_flg, require_specific_oblpn_status=require_specific_oblpn_status, trailer_nbr=trailer_nbr)

Assign OBLPN to Load



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
load_nbr = 'load_nbr_example' # str | 
oblpn_nbr = 'oblpn_nbr_example' # str | 
carrier_code = 'carrier_code_example' # str |  (optional)
company_code = 'company_code_example' # str |  (optional)
delimiter = 'delimiter_example' # str |  (optional)
facility_code = 'facility_code_example' # str |  (optional)
reassign_load_flg = true # bool |  (optional)
require_specific_oblpn_status = 56 # int |  (optional)
trailer_nbr = 'trailer_nbr_example' # str |  (optional)

try:
    # Assign OBLPN to Load
    api_response = api_instance.assign_oblp_nto_load(load_nbr, oblpn_nbr, carrier_code=carrier_code, company_code=company_code, delimiter=delimiter, facility_code=facility_code, reassign_load_flg=reassign_load_flg, require_specific_oblpn_status=require_specific_oblpn_status, trailer_nbr=trailer_nbr)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->assign_oblp_nto_load: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **load_nbr** | **str**|  | 
 **oblpn_nbr** | **str**|  | 
 **carrier_code** | **str**|  | [optional] 
 **company_code** | **str**|  | [optional] 
 **delimiter** | **str**|  | [optional] 
 **facility_code** | **str**|  | [optional] 
 **reassign_load_flg** | **bool**|  | [optional] 
 **require_specific_oblpn_status** | **int**|  | [optional] 
 **trailer_nbr** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **assignand_load_lpn**
> object assignand_load_lpn(load_nbr, oblpn_nbr, company_code=company_code, dock_door_nbr=dock_door_nbr, facility_code=facility_code, oblpn_weight=oblpn_weight, pallet_nbr=pallet_nbr, trailer_nbr=trailer_nbr)

Assign and Load LPN



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
load_nbr = 'load_nbr_example' # str | 
oblpn_nbr = 'oblpn_nbr_example' # str | 
company_code = 'company_code_example' # str |  (optional)
dock_door_nbr = 'dock_door_nbr_example' # str |  (optional)
facility_code = 'facility_code_example' # str |  (optional)
oblpn_weight = 8.14 # float |  (optional)
pallet_nbr = 'pallet_nbr_example' # str |  (optional)
trailer_nbr = 'trailer_nbr_example' # str |  (optional)

try:
    # Assign and Load LPN
    api_response = api_instance.assignand_load_lpn(load_nbr, oblpn_nbr, company_code=company_code, dock_door_nbr=dock_door_nbr, facility_code=facility_code, oblpn_weight=oblpn_weight, pallet_nbr=pallet_nbr, trailer_nbr=trailer_nbr)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->assignand_load_lpn: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **load_nbr** | **str**|  | 
 **oblpn_nbr** | **str**|  | 
 **company_code** | **str**|  | [optional] 
 **dock_door_nbr** | **str**|  | [optional] 
 **facility_code** | **str**|  | [optional] 
 **oblpn_weight** | **float**|  | [optional] 
 **pallet_nbr** | **str**|  | [optional] 
 **trailer_nbr** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_lpn**
> object create_lpn(lpn_nbr, qty, batch_number=batch_number, company_code=company_code, dest_facility_code=dest_facility_code, drop_locn_barcode=drop_locn_barcode, expiry_date=expiry_date, facility_code=facility_code, item_alternate_code=item_alternate_code, item_barcode=item_barcode, lock_code=lock_code, lpn_weight=lpn_weight, order_type=order_type, xdock_lpn_flg=xdock_lpn_flg)

Create LPN



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
lpn_nbr = 'lpn_nbr_example' # str | 
qty = 56 # int | 
batch_number = 'batch_number_example' # str |  (optional)
company_code = 'company_code_example' # str |  (optional)
dest_facility_code = 'dest_facility_code_example' # str |  (optional)
drop_locn_barcode = 'drop_locn_barcode_example' # str |  (optional)
expiry_date = 'expiry_date_example' # str |  (optional)
facility_code = 'facility_code_example' # str |  (optional)
item_alternate_code = 'item_alternate_code_example' # str |  (optional)
item_barcode = 'item_barcode_example' # str |  (optional)
lock_code = 'lock_code_example' # str |  (optional)
lpn_weight = 8.14 # float |  (optional)
order_type = 'order_type_example' # str |  (optional)
xdock_lpn_flg = true # bool |  (optional)

try:
    # Create LPN
    api_response = api_instance.create_lpn(lpn_nbr, qty, batch_number=batch_number, company_code=company_code, dest_facility_code=dest_facility_code, drop_locn_barcode=drop_locn_barcode, expiry_date=expiry_date, facility_code=facility_code, item_alternate_code=item_alternate_code, item_barcode=item_barcode, lock_code=lock_code, lpn_weight=lpn_weight, order_type=order_type, xdock_lpn_flg=xdock_lpn_flg)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->create_lpn: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lpn_nbr** | **str**|  | 
 **qty** | **int**|  | 
 **batch_number** | **str**|  | [optional] 
 **company_code** | **str**|  | [optional] 
 **dest_facility_code** | **str**|  | [optional] 
 **drop_locn_barcode** | **str**|  | [optional] 
 **expiry_date** | **str**|  | [optional] 
 **facility_code** | **str**|  | [optional] 
 **item_alternate_code** | **str**|  | [optional] 
 **item_barcode** | **str**|  | [optional] 
 **lock_code** | **str**|  | [optional] 
 **lpn_weight** | **float**|  | [optional] 
 **order_type** | **str**|  | [optional] 
 **xdock_lpn_flg** | **bool**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **divert_confirm**
> object divert_confirm(flat_data=flat_data, xml_data=xml_data)

Divert Confirm



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
flat_data = 'flat_data_example' # str |  (optional)
xml_data = 'xml_data_example' # str |  (optional)

try:
    # Divert Confirm
    api_response = api_instance.divert_confirm(flat_data=flat_data, xml_data=xml_data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->divert_confirm: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flat_data** | **str**|  | [optional] 
 **xml_data** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **entity_update**
> object entity_update(entity_name, key, sequence_number)

Entity Update



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
entity_name = 'entity_name_example' # str | 
key = 'key_example' # str | 
sequence_number = 'sequence_number_example' # str | 

try:
    # Entity Update
    api_response = api_instance.entity_update(entity_name, key, sequence_number)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->entity_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity_name** | **str**|  | 
 **key** | **str**|  | 
 **sequence_number** | **str**|  | 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **extended_property**
> object extended_property(entity_name, extended_property, key, company_code=company_code, facility_code=facility_code)

Extended Property



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
entity_name = 'entity_name_example' # str | 
extended_property = 'extended_property_example' # str | 
key = 'key_example' # str | 
company_code = 'company_code_example' # str |  (optional)
facility_code = 'facility_code_example' # str |  (optional)

try:
    # Extended Property
    api_response = api_instance.extended_property(entity_name, extended_property, key, company_code=company_code, facility_code=facility_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->extended_property: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity_name** | **str**|  | 
 **extended_property** | **str**|  | 
 **key** | **str**|  | 
 **company_code** | **str**|  | [optional] 
 **facility_code** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **from_mhe_distribution_pack**
> object from_mhe_distribution_pack(xml_data=xml_data)

From MHE Distribution Pack



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
xml_data = 'xml_data_example' # str |  (optional)

try:
    # From MHE Distribution Pack
    api_response = api_instance.from_mhe_distribution_pack(xml_data=xml_data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->from_mhe_distribution_pack: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xml_data** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **from_mhe_distribution_short**
> object from_mhe_distribution_short(flat_data=flat_data, xml_data=xml_data)

From MHE Distribution Short



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
flat_data = 'flat_data_example' # str |  (optional)
xml_data = 'xml_data_example' # str |  (optional)

try:
    # From MHE Distribution Short
    api_response = api_instance.from_mhe_distribution_short(flat_data=flat_data, xml_data=xml_data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->from_mhe_distribution_short: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flat_data** | **str**|  | [optional] 
 **xml_data** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_next_numbers**
> object get_next_numbers(counter_code, company_code=company_code, count=count, facility_code=facility_code)

Get Next Numbers



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
counter_code = 'counter_code_example' # str | 
company_code = 'company_code_example' # str |  (optional)
count = 56 # int |  (optional)
facility_code = 'facility_code_example' # str |  (optional)

try:
    # Get Next Numbers
    api_response = api_instance.get_next_numbers(counter_code, company_code=company_code, count=count, facility_code=facility_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->get_next_numbers: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **counter_code** | **str**|  | 
 **company_code** | **str**|  | [optional] 
 **count** | **int**|  | [optional] 
 **facility_code** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_status**
> object get_status(entity, key, company_code=company_code, facility_code=facility_code)

Get Status



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
entity = 'entity_example' # str | 
key = 'key_example' # str | 
company_code = 'company_code_example' # str |  (optional)
facility_code = 'facility_code_example' # str |  (optional)

try:
    # Get Status
    api_response = api_instance.get_status(entity, key, company_code=company_code, facility_code=facility_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->get_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **str**|  | 
 **key** | **str**|  | 
 **company_code** | **str**|  | [optional] 
 **facility_code** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **induct_lpn**
> object induct_lpn(flat_data=flat_data, xml_data=xml_data)

Induct LPN



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
flat_data = 'flat_data_example' # str |  (optional)
xml_data = 'xml_data_example' # str |  (optional)

try:
    # Induct LPN
    api_response = api_instance.induct_lpn(flat_data=flat_data, xml_data=xml_data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->induct_lpn: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flat_data** | **str**|  | [optional] 
 **xml_data** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **init_stage_interface**
> object init_stage_interface(_async=_async, entity=entity, flat_data=flat_data, validate_xml=validate_xml, xml_data=xml_data)

Init Stage Interface



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
_async = true # bool |  (optional)
entity = 'entity_example' # str |  (optional)
flat_data = 'flat_data_example' # str |  (optional)
validate_xml = true # bool |  (optional)
xml_data = 'xml_data_example' # str |  (optional)

try:
    # Init Stage Interface
    api_response = api_instance.init_stage_interface(_async=_async, entity=entity, flat_data=flat_data, validate_xml=validate_xml, xml_data=xml_data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->init_stage_interface: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_async** | **bool**|  | [optional] 
 **entity** | **str**|  | [optional] 
 **flat_data** | **str**|  | [optional] 
 **validate_xml** | **bool**|  | [optional] 
 **xml_data** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lock_unlock_lpn**
> object lock_unlock_lpn(action=action, company_code=company_code, facility_code=facility_code, lock_code=lock_code, lpn_nbr=lpn_nbr, remove_lock_from_shipment_dtl_flg=remove_lock_from_shipment_dtl_flg)

Lock/Unlock LPN



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
action = 'action_example' # str |  (optional)
company_code = 'company_code_example' # str |  (optional)
facility_code = 'facility_code_example' # str |  (optional)
lock_code = 'lock_code_example' # str |  (optional)
lpn_nbr = 'lpn_nbr_example' # str |  (optional)
remove_lock_from_shipment_dtl_flg = true # bool |  (optional)

try:
    # Lock/Unlock LPN
    api_response = api_instance.lock_unlock_lpn(action=action, company_code=company_code, facility_code=facility_code, lock_code=lock_code, lpn_nbr=lpn_nbr, remove_lock_from_shipment_dtl_flg=remove_lock_from_shipment_dtl_flg)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->lock_unlock_lpn: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **str**|  | [optional] 
 **company_code** | **str**|  | [optional] 
 **facility_code** | **str**|  | [optional] 
 **lock_code** | **str**|  | [optional] 
 **lpn_nbr** | **str**|  | [optional] 
 **remove_lock_from_shipment_dtl_flg** | **bool**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **object_inquiry**
> object object_inquiry(entity, key, company_code, facility_code, minimize=minimize)

Object Inquiry



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
entity = 'entity_example' # str | 
key = 'key_example' # str | 
company_code = 'company_code_example' # str | 
facility_code = 'facility_code_example' # str | 
minimize = 'minimize_example' # str |  (optional)

try:
    # Object Inquiry
    api_response = api_instance.object_inquiry(entity, key, company_code, facility_code, minimize=minimize)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->object_inquiry: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **str**|  | 
 **key** | **str**|  | 
 **company_code** | **str**|  | 
 **facility_code** | **str**|  | 
 **minimize** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pick_confirm**
> object pick_confirm(flat_data=flat_data, xml_data=xml_data)

Pick Confirm



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
flat_data = 'flat_data_example' # str |  (optional)
xml_data = 'xml_data_example' # str |  (optional)

try:
    # Pick Confirm
    api_response = api_instance.pick_confirm(flat_data=flat_data, xml_data=xml_data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->pick_confirm: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flat_data** | **str**|  | [optional] 
 **xml_data** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **receive_lpn**
> object receive_lpn(lpn_nbr, company_code=company_code, facility_code=facility_code, rcvd_trailer_nbr=rcvd_trailer_nbr, received_ts=received_ts, receiving_location=receiving_location, xdock_lpn_flg=xdock_lpn_flg, xml_data=xml_data)

Receive LPN



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
lpn_nbr = 'lpn_nbr_example' # str | 
company_code = 'company_code_example' # str |  (optional)
facility_code = 'facility_code_example' # str |  (optional)
rcvd_trailer_nbr = 'rcvd_trailer_nbr_example' # str |  (optional)
received_ts = 'received_ts_example' # str |  (optional)
receiving_location = 'receiving_location_example' # str |  (optional)
xdock_lpn_flg = true # bool |  (optional)
xml_data = 'xml_data_example' # str |  (optional)

try:
    # Receive LPN
    api_response = api_instance.receive_lpn(lpn_nbr, company_code=company_code, facility_code=facility_code, rcvd_trailer_nbr=rcvd_trailer_nbr, received_ts=received_ts, receiving_location=receiving_location, xdock_lpn_flg=xdock_lpn_flg, xml_data=xml_data)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->receive_lpn: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lpn_nbr** | **str**|  | 
 **company_code** | **str**|  | [optional] 
 **facility_code** | **str**|  | [optional] 
 **rcvd_trailer_nbr** | **str**|  | [optional] 
 **received_ts** | **str**|  | [optional] 
 **receiving_location** | **str**|  | [optional] 
 **xdock_lpn_flg** | **bool**|  | [optional] 
 **xml_data** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **run_mhe_stage_interface**
> object run_mhe_stage_interface(company_code, entity, facility_code, mhe_vendor_code, python_function=python_function)

Run MHE Stage Interface



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
company_code = 'company_code_example' # str | 
entity = 'entity_example' # str | 
facility_code = 'facility_code_example' # str | 
mhe_vendor_code = 'mhe_vendor_code_example' # str | 
python_function = 'python_function_example' # str |  (optional)

try:
    # Run MHE Stage Interface
    api_response = api_instance.run_mhe_stage_interface(company_code, entity, facility_code, mhe_vendor_code, python_function=python_function)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->run_mhe_stage_interface: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_code** | **str**|  | 
 **entity** | **str**|  | 
 **facility_code** | **str**|  | 
 **mhe_vendor_code** | **str**|  | 
 **python_function** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **run_stage_interface**
> object run_stage_interface(company_code, entity, facility_code, file_group_nbr, _async=_async)

Run Stage Interface



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
company_code = 'company_code_example' # str | 
entity = 'entity_example' # str | 
facility_code = 'facility_code_example' # str | 
file_group_nbr = 'file_group_nbr_example' # str | 
_async = true # bool |  (optional)

try:
    # Run Stage Interface
    api_response = api_instance.run_stage_interface(company_code, entity, facility_code, file_group_nbr, _async=_async)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->run_stage_interface: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_code** | **str**|  | 
 **entity** | **str**|  | 
 **facility_code** | **str**|  | 
 **file_group_nbr** | **str**|  | 
 **_async** | **bool**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ship_oblpn**
> object ship_oblpn(company_code, facility_code, locn_barcode, oblpn_nbr, output_file_to_generate=output_file_to_generate)

Ship OBLPN



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
company_code = 'company_code_example' # str | 
facility_code = 'facility_code_example' # str | 
locn_barcode = 'locn_barcode_example' # str | 
oblpn_nbr = 'oblpn_nbr_example' # str | 
output_file_to_generate = 'output_file_to_generate_example' # str |  (optional)

try:
    # Ship OBLPN
    api_response = api_instance.ship_oblpn(company_code, facility_code, locn_barcode, oblpn_nbr, output_file_to_generate=output_file_to_generate)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->ship_oblpn: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_code** | **str**|  | 
 **facility_code** | **str**|  | 
 **locn_barcode** | **str**|  | 
 **oblpn_nbr** | **str**|  | 
 **output_file_to_generate** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_active_inventory**
> object update_active_inventory(location_barcode, reason_code, actual_qty=actual_qty, adjustment_qty=adjustment_qty, batch_number=batch_number, company_code=company_code, expiry_data=expiry_data, facility_code=facility_code, invn_attr_a=invn_attr_a, invn_attr_b=invn_attr_b, invn_attr_c=invn_attr_c, invn_attr_d=invn_attr_d, invn_attr_e=invn_attr_e, invn_attr_f=invn_attr_f, invn_attr_g=invn_attr_g, item_alternate_code=item_alternate_code, item_barcode=item_barcode, item_code=item_code, locn_capacity_check_flg=locn_capacity_check_flg)

Update Active Inventory



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
location_barcode = 'location_barcode_example' # str | 
reason_code = 'reason_code_example' # str | 
actual_qty = 8.14 # float |  (optional)
adjustment_qty = 8.14 # float |  (optional)
batch_number = 'batch_number_example' # str |  (optional)
company_code = 'company_code_example' # str |  (optional)
expiry_data = 'expiry_data_example' # str |  (optional)
facility_code = 'facility_code_example' # str |  (optional)
invn_attr_a = 'invn_attr_a_example' # str |  (optional)
invn_attr_b = 'invn_attr_b_example' # str |  (optional)
invn_attr_c = 'invn_attr_c_example' # str |  (optional)
invn_attr_d = 'invn_attr_d_example' # str |  (optional)
invn_attr_e = 'invn_attr_e_example' # str |  (optional)
invn_attr_f = 'invn_attr_f_example' # str |  (optional)
invn_attr_g = 'invn_attr_g_example' # str |  (optional)
item_alternate_code = 'item_alternate_code_example' # str |  (optional)
item_barcode = 'item_barcode_example' # str |  (optional)
item_code = 'item_code_example' # str |  (optional)
locn_capacity_check_flg = true # bool |  (optional)

try:
    # Update Active Inventory
    api_response = api_instance.update_active_inventory(location_barcode, reason_code, actual_qty=actual_qty, adjustment_qty=adjustment_qty, batch_number=batch_number, company_code=company_code, expiry_data=expiry_data, facility_code=facility_code, invn_attr_a=invn_attr_a, invn_attr_b=invn_attr_b, invn_attr_c=invn_attr_c, invn_attr_d=invn_attr_d, invn_attr_e=invn_attr_e, invn_attr_f=invn_attr_f, invn_attr_g=invn_attr_g, item_alternate_code=item_alternate_code, item_barcode=item_barcode, item_code=item_code, locn_capacity_check_flg=locn_capacity_check_flg)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->update_active_inventory: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **location_barcode** | **str**|  | 
 **reason_code** | **str**|  | 
 **actual_qty** | **float**|  | [optional] 
 **adjustment_qty** | **float**|  | [optional] 
 **batch_number** | **str**|  | [optional] 
 **company_code** | **str**|  | [optional] 
 **expiry_data** | **str**|  | [optional] 
 **facility_code** | **str**|  | [optional] 
 **invn_attr_a** | **str**|  | [optional] 
 **invn_attr_b** | **str**|  | [optional] 
 **invn_attr_c** | **str**|  | [optional] 
 **invn_attr_d** | **str**|  | [optional] 
 **invn_attr_e** | **str**|  | [optional] 
 **invn_attr_f** | **str**|  | [optional] 
 **invn_attr_g** | **str**|  | [optional] 
 **item_alternate_code** | **str**|  | [optional] 
 **item_barcode** | **str**|  | [optional] 
 **item_code** | **str**|  | [optional] 
 **locn_capacity_check_flg** | **bool**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_carrier_lpn_label**
> object update_carrier_lpn_label(label, oblpn_nbr, company_code=company_code, facility_code=facility_code)

Update Carrier LPN Label



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
label = 'label_example' # str | 
oblpn_nbr = 'oblpn_nbr_example' # str | 
company_code = 'company_code_example' # str |  (optional)
facility_code = 'facility_code_example' # str |  (optional)

try:
    # Update Carrier LPN Label
    api_response = api_instance.update_carrier_lpn_label(label, oblpn_nbr, company_code=company_code, facility_code=facility_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->update_carrier_lpn_label: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **label** | **str**|  | 
 **oblpn_nbr** | **str**|  | 
 **company_code** | **str**|  | [optional] 
 **facility_code** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_oblpn_dimensions**
> object update_oblpn_dimensions(calc_vol_flg, company_code, facility_code, height, length, oblpn_nbr, width, ship_oblpn=ship_oblpn, shipping_location=shipping_location, volume=volume, weight=weight)

Update OBLPN Dimensions



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
calc_vol_flg = true # bool | 
company_code = 'company_code_example' # str | 
facility_code = 'facility_code_example' # str | 
height = 8.14 # float | 
length = 8.14 # float | 
oblpn_nbr = 'oblpn_nbr_example' # str | 
width = 8.14 # float | 
ship_oblpn = true # bool |  (optional)
shipping_location = 'shipping_location_example' # str |  (optional)
volume = 8.14 # float |  (optional)
weight = 8.14 # float |  (optional)

try:
    # Update OBLPN Dimensions
    api_response = api_instance.update_oblpn_dimensions(calc_vol_flg, company_code, facility_code, height, length, oblpn_nbr, width, ship_oblpn=ship_oblpn, shipping_location=shipping_location, volume=volume, weight=weight)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->update_oblpn_dimensions: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calc_vol_flg** | **bool**|  | 
 **company_code** | **str**|  | 
 **facility_code** | **str**|  | 
 **height** | **float**|  | 
 **length** | **float**|  | 
 **oblpn_nbr** | **str**|  | 
 **width** | **float**|  | 
 **ship_oblpn** | **bool**|  | [optional] 
 **shipping_location** | **str**|  | [optional] 
 **volume** | **float**|  | [optional] 
 **weight** | **float**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_oblpn_tracking_number**
> object update_oblpn_tracking_number(company_code, facility_code, oblpn_nbr, tracking_nbr, dry_ice_weight=dry_ice_weight, estimated_delivery_time=estimated_delivery_time, master_tracking_nbr=master_tracking_nbr, rate=rate, ship_via_code=ship_via_code, weight=weight)

Update OBLPN Tracking Number



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
company_code = 'company_code_example' # str | 
facility_code = 'facility_code_example' # str | 
oblpn_nbr = 'oblpn_nbr_example' # str | 
tracking_nbr = 'tracking_nbr_example' # str | 
dry_ice_weight = 8.14 # float |  (optional)
estimated_delivery_time = 'estimated_delivery_time_example' # str |  (optional)
master_tracking_nbr = 'master_tracking_nbr_example' # str |  (optional)
rate = 'rate_example' # str |  (optional)
ship_via_code = 'ship_via_code_example' # str |  (optional)
weight = 8.14 # float |  (optional)

try:
    # Update OBLPN Tracking Number
    api_response = api_instance.update_oblpn_tracking_number(company_code, facility_code, oblpn_nbr, tracking_nbr, dry_ice_weight=dry_ice_weight, estimated_delivery_time=estimated_delivery_time, master_tracking_nbr=master_tracking_nbr, rate=rate, ship_via_code=ship_via_code, weight=weight)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->update_oblpn_tracking_number: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_code** | **str**|  | 
 **facility_code** | **str**|  | 
 **oblpn_nbr** | **str**|  | 
 **tracking_nbr** | **str**|  | 
 **dry_ice_weight** | **float**|  | [optional] 
 **estimated_delivery_time** | **str**|  | [optional] 
 **master_tracking_nbr** | **str**|  | [optional] 
 **rate** | **str**|  | [optional] 
 **ship_via_code** | **str**|  | [optional] 
 **weight** | **float**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_output_interface**
> object update_output_interface(company_code=company_code, cust_intl_code=cust_intl_code, facility_code=facility_code, filename=filename, interface_type_code=interface_type_code, message=message, run_output_interface_flg=run_output_interface_flg, status_id=status_id)

Update Output Interface



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

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
company_code = 'company_code_example' # str |  (optional)
cust_intl_code = 'cust_intl_code_example' # str |  (optional)
facility_code = 'facility_code_example' # str |  (optional)
filename = 'filename_example' # str |  (optional)
interface_type_code = 'interface_type_code_example' # str |  (optional)
message = 'message_example' # str |  (optional)
run_output_interface_flg = true # bool |  (optional)
status_id = 56 # int |  (optional)

try:
    # Update Output Interface
    api_response = api_instance.update_output_interface(company_code=company_code, cust_intl_code=cust_intl_code, facility_code=facility_code, filename=filename, interface_type_code=interface_type_code, message=message, run_output_interface_flg=run_output_interface_flg, status_id=status_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->update_output_interface: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_code** | **str**|  | [optional] 
 **cust_intl_code** | **str**|  | [optional] 
 **facility_code** | **str**|  | [optional] 
 **filename** | **str**|  | [optional] 
 **interface_type_code** | **str**|  | [optional] 
 **message** | **str**|  | [optional] 
 **run_output_interface_flg** | **bool**|  | [optional] 
 **status_id** | **int**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

