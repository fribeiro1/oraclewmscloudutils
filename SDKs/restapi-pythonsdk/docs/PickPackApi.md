# swagger_client.PickPackApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pick_pack_close_lpn_post**](PickPackApi.md#pick_pack_close_lpn_post) | **POST** /pick_pack/close_lpn | PickPackCloseLpn_POST
[**pick_pack_pick_confirm_post**](PickPackApi.md#pick_pack_pick_confirm_post) | **POST** /pick_pack/pick_confirm | PickPackPickConfirm_POST
[**pick_pack_wave_complete_post**](PickPackApi.md#pick_pack_wave_complete_post) | **POST** /pick_pack/wave_complete | PickPackWaveComplete_POST


# **pick_pack_close_lpn_post**
> object pick_pack_close_lpn_post(to_container_nbr, async_flg=async_flg, close_container_status=close_container_status, company_id=company_id, company_id__code=company_id__code, facility_id=facility_id, facility_id__code=facility_id__code, reason_code=reason_code, short_on_close_flg=short_on_close_flg, update_inventory_on_short_flg=update_inventory_on_short_flg, to_container__code=to_container__code)

PickPackCloseLpn_POST



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
api_instance = swagger_client.PickPackApi(swagger_client.ApiClient(configuration))
to_container_nbr = 'to_container_nbr_example' # str | 
async_flg = true # bool |  (optional)
close_container_status = 'close_container_status_example' # str |  (optional)
company_id = 8.14 # float |  (optional)
company_id__code = 'company_id__code_example' # str |  (optional)
facility_id = 8.14 # float |  (optional)
facility_id__code = 'facility_id__code_example' # str |  (optional)
reason_code = 'reason_code_example' # str |  (optional)
short_on_close_flg = true # bool |  (optional)
update_inventory_on_short_flg = true # bool |  (optional)
to_container__code = 'to_container__code_example' # str |  (optional)

try:
    # PickPackCloseLpn_POST
    api_response = api_instance.pick_pack_close_lpn_post(to_container_nbr, async_flg=async_flg, close_container_status=close_container_status, company_id=company_id, company_id__code=company_id__code, facility_id=facility_id, facility_id__code=facility_id__code, reason_code=reason_code, short_on_close_flg=short_on_close_flg, update_inventory_on_short_flg=update_inventory_on_short_flg, to_container__code=to_container__code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PickPackApi->pick_pack_close_lpn_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to_container_nbr** | **str**|  | 
 **async_flg** | **bool**|  | [optional] 
 **close_container_status** | **str**|  | [optional] 
 **company_id** | **float**|  | [optional] 
 **company_id__code** | **str**|  | [optional] 
 **facility_id** | **float**|  | [optional] 
 **facility_id__code** | **str**|  | [optional] 
 **reason_code** | **str**|  | [optional] 
 **short_on_close_flg** | **bool**|  | [optional] 
 **update_inventory_on_short_flg** | **bool**|  | [optional] 
 **to_container__code** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pick_pack_pick_confirm_post**
> object pick_pack_pick_confirm_post(async_flg, mhe_mode_flg, order_nbr, wave_nbr, allocation_uom=allocation_uom, batch_nbr=batch_nbr, close_container_status=close_container_status, company_id=company_id, company_id__code=company_id__code, facility_id=facility_id, facility_id__code=facility_id__code, from_container_nbr=from_container_nbr, item_alternate_code=item_alternate_code, item_barcode=item_barcode, mhe_system_code=mhe_system_code, pick_location=pick_location, qty=qty, reason_code=reason_code, short_flg=short_flg, short_on_close_flg=short_on_close_flg, to_container_nbr=to_container_nbr, uom_qty=uom_qty, update_inventory_on_short_flg=update_inventory_on_short_flg)

PickPackPickConfirm_POST



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
api_instance = swagger_client.PickPackApi(swagger_client.ApiClient(configuration))
async_flg = true # bool | 
mhe_mode_flg = true # bool | 
order_nbr = 'order_nbr_example' # str | 
wave_nbr = 'wave_nbr_example' # str | 
allocation_uom = 'allocation_uom_example' # str |  (optional)
batch_nbr = 'batch_nbr_example' # str |  (optional)
close_container_status = 'close_container_status_example' # str |  (optional)
company_id = 8.14 # float |  (optional)
company_id__code = 'company_id__code_example' # str |  (optional)
facility_id = 8.14 # float |  (optional)
facility_id__code = 'facility_id__code_example' # str |  (optional)
from_container_nbr = 'from_container_nbr_example' # str |  (optional)
item_alternate_code = 'item_alternate_code_example' # str |  (optional)
item_barcode = 'item_barcode_example' # str |  (optional)
mhe_system_code = 'mhe_system_code_example' # str |  (optional)
pick_location = 'pick_location_example' # str |  (optional)
qty = 8.14 # float |  (optional)
reason_code = 'reason_code_example' # str |  (optional)
short_flg = true # bool |  (optional)
short_on_close_flg = true # bool |  (optional)
to_container_nbr = 'to_container_nbr_example' # str |  (optional)
uom_qty = 'uom_qty_example' # str |  (optional)
update_inventory_on_short_flg = true # bool |  (optional)

try:
    # PickPackPickConfirm_POST
    api_response = api_instance.pick_pack_pick_confirm_post(async_flg, mhe_mode_flg, order_nbr, wave_nbr, allocation_uom=allocation_uom, batch_nbr=batch_nbr, close_container_status=close_container_status, company_id=company_id, company_id__code=company_id__code, facility_id=facility_id, facility_id__code=facility_id__code, from_container_nbr=from_container_nbr, item_alternate_code=item_alternate_code, item_barcode=item_barcode, mhe_system_code=mhe_system_code, pick_location=pick_location, qty=qty, reason_code=reason_code, short_flg=short_flg, short_on_close_flg=short_on_close_flg, to_container_nbr=to_container_nbr, uom_qty=uom_qty, update_inventory_on_short_flg=update_inventory_on_short_flg)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PickPackApi->pick_pack_pick_confirm_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **async_flg** | **bool**|  | 
 **mhe_mode_flg** | **bool**|  | 
 **order_nbr** | **str**|  | 
 **wave_nbr** | **str**|  | 
 **allocation_uom** | **str**|  | [optional] 
 **batch_nbr** | **str**|  | [optional] 
 **close_container_status** | **str**|  | [optional] 
 **company_id** | **float**|  | [optional] 
 **company_id__code** | **str**|  | [optional] 
 **facility_id** | **float**|  | [optional] 
 **facility_id__code** | **str**|  | [optional] 
 **from_container_nbr** | **str**|  | [optional] 
 **item_alternate_code** | **str**|  | [optional] 
 **item_barcode** | **str**|  | [optional] 
 **mhe_system_code** | **str**|  | [optional] 
 **pick_location** | **str**|  | [optional] 
 **qty** | **float**|  | [optional] 
 **reason_code** | **str**|  | [optional] 
 **short_flg** | **bool**|  | [optional] 
 **short_on_close_flg** | **bool**|  | [optional] 
 **to_container_nbr** | **str**|  | [optional] 
 **uom_qty** | **str**|  | [optional] 
 **update_inventory_on_short_flg** | **bool**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pick_pack_wave_complete_post**
> object pick_pack_wave_complete_post(wave_nbr, async_flg=async_flg, close_container_status=close_container_status, company_id=company_id, company_id__code=company_id__code, facility_id=facility_id, facility_id__code=facility_id__code, mhe_system_code=mhe_system_code, reason_code=reason_code, update_inventory_on_short_flg=update_inventory_on_short_flg)

PickPackWaveComplete_POST



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
api_instance = swagger_client.PickPackApi(swagger_client.ApiClient(configuration))
wave_nbr = 'wave_nbr_example' # str | 
async_flg = true # bool |  (optional)
close_container_status = 'close_container_status_example' # str |  (optional)
company_id = 8.14 # float |  (optional)
company_id__code = 'company_id__code_example' # str |  (optional)
facility_id = 8.14 # float |  (optional)
facility_id__code = 'facility_id__code_example' # str |  (optional)
mhe_system_code = 'mhe_system_code_example' # str |  (optional)
reason_code = 'reason_code_example' # str |  (optional)
update_inventory_on_short_flg = true # bool |  (optional)

try:
    # PickPackWaveComplete_POST
    api_response = api_instance.pick_pack_wave_complete_post(wave_nbr, async_flg=async_flg, close_container_status=close_container_status, company_id=company_id, company_id__code=company_id__code, facility_id=facility_id, facility_id__code=facility_id__code, mhe_system_code=mhe_system_code, reason_code=reason_code, update_inventory_on_short_flg=update_inventory_on_short_flg)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PickPackApi->pick_pack_wave_complete_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wave_nbr** | **str**|  | 
 **async_flg** | **bool**|  | [optional] 
 **close_container_status** | **str**|  | [optional] 
 **company_id** | **float**|  | [optional] 
 **company_id__code** | **str**|  | [optional] 
 **facility_id** | **float**|  | [optional] 
 **facility_id__code** | **str**|  | [optional] 
 **mhe_system_code** | **str**|  | [optional] 
 **reason_code** | **str**|  | [optional] 
 **update_inventory_on_short_flg** | **bool**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

