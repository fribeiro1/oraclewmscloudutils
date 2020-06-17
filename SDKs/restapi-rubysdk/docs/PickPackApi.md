# SwaggerClient::PickPackApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pick_pack_close_lpn_post**](PickPackApi.md#pick_pack_close_lpn_post) | **POST** /pick_pack/close_lpn | PickPackCloseLpn_POST
[**pick_pack_pick_confirm_post**](PickPackApi.md#pick_pack_pick_confirm_post) | **POST** /pick_pack/pick_confirm | PickPackPickConfirm_POST
[**pick_pack_wave_complete_post**](PickPackApi.md#pick_pack_wave_complete_post) | **POST** /pick_pack/wave_complete | PickPackWaveComplete_POST


# **pick_pack_close_lpn_post**
> Object pick_pack_close_lpn_post(to_container_nbr, opts)

PickPackCloseLpn_POST



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PickPackApi.new

to_container_nbr = 'to_container_nbr_example' # String | 

opts = { 
  async_flg: true, # BOOLEAN | 
  close_container_status: 'close_container_status_example', # String | 
  company_id: 8.14, # Float | 
  company_id__code: 'company_id__code_example', # String | 
  facility_id: 8.14, # Float | 
  facility_id__code: 'facility_id__code_example', # String | 
  reason_code: 'reason_code_example', # String | 
  short_on_close_flg: true, # BOOLEAN | 
  update_inventory_on_short_flg: true, # BOOLEAN | 
  to_container__code: 'to_container__code_example' # String | 
}

begin
  #PickPackCloseLpn_POST
  result = api_instance.pick_pack_close_lpn_post(to_container_nbr, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PickPackApi->pick_pack_close_lpn_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to_container_nbr** | **String**|  | 
 **async_flg** | **BOOLEAN**|  | [optional] 
 **close_container_status** | **String**|  | [optional] 
 **company_id** | **Float**|  | [optional] 
 **company_id__code** | **String**|  | [optional] 
 **facility_id** | **Float**|  | [optional] 
 **facility_id__code** | **String**|  | [optional] 
 **reason_code** | **String**|  | [optional] 
 **short_on_close_flg** | **BOOLEAN**|  | [optional] 
 **update_inventory_on_short_flg** | **BOOLEAN**|  | [optional] 
 **to_container__code** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



# **pick_pack_pick_confirm_post**
> Object pick_pack_pick_confirm_post(async_flg, mhe_mode_flg, order_nbr, wave_nbr, opts)

PickPackPickConfirm_POST



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PickPackApi.new

async_flg = true # BOOLEAN | 

mhe_mode_flg = true # BOOLEAN | 

order_nbr = 'order_nbr_example' # String | 

wave_nbr = 'wave_nbr_example' # String | 

opts = { 
  allocation_uom: 'allocation_uom_example', # String | 
  batch_nbr: 'batch_nbr_example', # String | 
  close_container_status: 'close_container_status_example', # String | 
  company_id: 8.14, # Float | 
  company_id__code: 'company_id__code_example', # String | 
  facility_id: 8.14, # Float | 
  facility_id__code: 'facility_id__code_example', # String | 
  from_container_nbr: 'from_container_nbr_example', # String | 
  item_alternate_code: 'item_alternate_code_example', # String | 
  item_barcode: 'item_barcode_example', # String | 
  mhe_system_code: 'mhe_system_code_example', # String | 
  pick_location: 'pick_location_example', # String | 
  qty: 8.14, # Float | 
  reason_code: 'reason_code_example', # String | 
  short_flg: true, # BOOLEAN | 
  short_on_close_flg: true, # BOOLEAN | 
  to_container_nbr: 'to_container_nbr_example', # String | 
  uom_qty: 'uom_qty_example', # String | 
  update_inventory_on_short_flg: true # BOOLEAN | 
}

begin
  #PickPackPickConfirm_POST
  result = api_instance.pick_pack_pick_confirm_post(async_flg, mhe_mode_flg, order_nbr, wave_nbr, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PickPackApi->pick_pack_pick_confirm_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **async_flg** | **BOOLEAN**|  | 
 **mhe_mode_flg** | **BOOLEAN**|  | 
 **order_nbr** | **String**|  | 
 **wave_nbr** | **String**|  | 
 **allocation_uom** | **String**|  | [optional] 
 **batch_nbr** | **String**|  | [optional] 
 **close_container_status** | **String**|  | [optional] 
 **company_id** | **Float**|  | [optional] 
 **company_id__code** | **String**|  | [optional] 
 **facility_id** | **Float**|  | [optional] 
 **facility_id__code** | **String**|  | [optional] 
 **from_container_nbr** | **String**|  | [optional] 
 **item_alternate_code** | **String**|  | [optional] 
 **item_barcode** | **String**|  | [optional] 
 **mhe_system_code** | **String**|  | [optional] 
 **pick_location** | **String**|  | [optional] 
 **qty** | **Float**|  | [optional] 
 **reason_code** | **String**|  | [optional] 
 **short_flg** | **BOOLEAN**|  | [optional] 
 **short_on_close_flg** | **BOOLEAN**|  | [optional] 
 **to_container_nbr** | **String**|  | [optional] 
 **uom_qty** | **String**|  | [optional] 
 **update_inventory_on_short_flg** | **BOOLEAN**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



# **pick_pack_wave_complete_post**
> Object pick_pack_wave_complete_post(wave_nbr, opts)

PickPackWaveComplete_POST



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PickPackApi.new

wave_nbr = 'wave_nbr_example' # String | 

opts = { 
  async_flg: true, # BOOLEAN | 
  close_container_status: 'close_container_status_example', # String | 
  company_id: 8.14, # Float | 
  company_id__code: 'company_id__code_example', # String | 
  facility_id: 8.14, # Float | 
  facility_id__code: 'facility_id__code_example', # String | 
  mhe_system_code: 'mhe_system_code_example', # String | 
  reason_code: 'reason_code_example', # String | 
  update_inventory_on_short_flg: true # BOOLEAN | 
}

begin
  #PickPackWaveComplete_POST
  result = api_instance.pick_pack_wave_complete_post(wave_nbr, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PickPackApi->pick_pack_wave_complete_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wave_nbr** | **String**|  | 
 **async_flg** | **BOOLEAN**|  | [optional] 
 **close_container_status** | **String**|  | [optional] 
 **company_id** | **Float**|  | [optional] 
 **company_id__code** | **String**|  | [optional] 
 **facility_id** | **Float**|  | [optional] 
 **facility_id__code** | **String**|  | [optional] 
 **mhe_system_code** | **String**|  | [optional] 
 **reason_code** | **String**|  | [optional] 
 **update_inventory_on_short_flg** | **BOOLEAN**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



