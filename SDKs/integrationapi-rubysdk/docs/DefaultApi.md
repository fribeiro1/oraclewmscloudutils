# SwaggerClient::DefaultApi

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
> Object assign_oblp_nto_load(load_nbr, oblpn_nbr, opts)

Assign OBLPN to Load



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

load_nbr = 'load_nbr_example' # String | 

oblpn_nbr = 'oblpn_nbr_example' # String | 

opts = { 
  carrier_code: 'carrier_code_example', # String | 
  company_code: 'company_code_example', # String | 
  delimiter: 'delimiter_example', # String | 
  facility_code: 'facility_code_example', # String | 
  reassign_load_flg: true, # BOOLEAN | 
  require_specific_oblpn_status: 56, # Integer | 
  trailer_nbr: 'trailer_nbr_example' # String | 
}

begin
  #Assign OBLPN to Load
  result = api_instance.assign_oblp_nto_load(load_nbr, oblpn_nbr, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->assign_oblp_nto_load: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **load_nbr** | **String**|  | 
 **oblpn_nbr** | **String**|  | 
 **carrier_code** | **String**|  | [optional] 
 **company_code** | **String**|  | [optional] 
 **delimiter** | **String**|  | [optional] 
 **facility_code** | **String**|  | [optional] 
 **reassign_load_flg** | **BOOLEAN**|  | [optional] 
 **require_specific_oblpn_status** | **Integer**|  | [optional] 
 **trailer_nbr** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **assignand_load_lpn**
> Object assignand_load_lpn(load_nbr, oblpn_nbr, opts)

Assign and Load LPN



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

load_nbr = 'load_nbr_example' # String | 

oblpn_nbr = 'oblpn_nbr_example' # String | 

opts = { 
  company_code: 'company_code_example', # String | 
  dock_door_nbr: 'dock_door_nbr_example', # String | 
  facility_code: 'facility_code_example', # String | 
  oblpn_weight: 8.14, # Float | 
  pallet_nbr: 'pallet_nbr_example', # String | 
  trailer_nbr: 'trailer_nbr_example' # String | 
}

begin
  #Assign and Load LPN
  result = api_instance.assignand_load_lpn(load_nbr, oblpn_nbr, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->assignand_load_lpn: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **load_nbr** | **String**|  | 
 **oblpn_nbr** | **String**|  | 
 **company_code** | **String**|  | [optional] 
 **dock_door_nbr** | **String**|  | [optional] 
 **facility_code** | **String**|  | [optional] 
 **oblpn_weight** | **Float**|  | [optional] 
 **pallet_nbr** | **String**|  | [optional] 
 **trailer_nbr** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **create_lpn**
> Object create_lpn(lpn_nbr, qty, opts)

Create LPN



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

lpn_nbr = 'lpn_nbr_example' # String | 

qty = 56 # Integer | 

opts = { 
  batch_number: 'batch_number_example', # String | 
  company_code: 'company_code_example', # String | 
  dest_facility_code: 'dest_facility_code_example', # String | 
  drop_locn_barcode: 'drop_locn_barcode_example', # String | 
  expiry_date: 'expiry_date_example', # String | 
  facility_code: 'facility_code_example', # String | 
  item_alternate_code: 'item_alternate_code_example', # String | 
  item_barcode: 'item_barcode_example', # String | 
  lock_code: 'lock_code_example', # String | 
  lpn_weight: 8.14, # Float | 
  order_type: 'order_type_example', # String | 
  xdock_lpn_flg: true # BOOLEAN | 
}

begin
  #Create LPN
  result = api_instance.create_lpn(lpn_nbr, qty, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->create_lpn: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lpn_nbr** | **String**|  | 
 **qty** | **Integer**|  | 
 **batch_number** | **String**|  | [optional] 
 **company_code** | **String**|  | [optional] 
 **dest_facility_code** | **String**|  | [optional] 
 **drop_locn_barcode** | **String**|  | [optional] 
 **expiry_date** | **String**|  | [optional] 
 **facility_code** | **String**|  | [optional] 
 **item_alternate_code** | **String**|  | [optional] 
 **item_barcode** | **String**|  | [optional] 
 **lock_code** | **String**|  | [optional] 
 **lpn_weight** | **Float**|  | [optional] 
 **order_type** | **String**|  | [optional] 
 **xdock_lpn_flg** | **BOOLEAN**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **divert_confirm**
> Object divert_confirm(opts)

Divert Confirm



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

opts = { 
  flat_data: 'flat_data_example', # String | 
  xml_data: 'xml_data_example' # String | 
}

begin
  #Divert Confirm
  result = api_instance.divert_confirm(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->divert_confirm: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flat_data** | **String**|  | [optional] 
 **xml_data** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **entity_update**
> Object entity_update(entity_name, key, sequence_number)

Entity Update



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

entity_name = 'entity_name_example' # String | 

key = 'key_example' # String | 

sequence_number = 'sequence_number_example' # String | 


begin
  #Entity Update
  result = api_instance.entity_update(entity_name, key, sequence_number)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->entity_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity_name** | **String**|  | 
 **key** | **String**|  | 
 **sequence_number** | **String**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **extended_property**
> Object extended_property(entity_name, extended_property, key, opts)

Extended Property



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

entity_name = 'entity_name_example' # String | 

extended_property = 'extended_property_example' # String | 

key = 'key_example' # String | 

opts = { 
  company_code: 'company_code_example', # String | 
  facility_code: 'facility_code_example' # String | 
}

begin
  #Extended Property
  result = api_instance.extended_property(entity_name, extended_property, key, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->extended_property: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity_name** | **String**|  | 
 **extended_property** | **String**|  | 
 **key** | **String**|  | 
 **company_code** | **String**|  | [optional] 
 **facility_code** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **from_mhe_distribution_pack**
> Object from_mhe_distribution_pack(opts)

From MHE Distribution Pack



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

opts = { 
  xml_data: 'xml_data_example' # String | 
}

begin
  #From MHE Distribution Pack
  result = api_instance.from_mhe_distribution_pack(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->from_mhe_distribution_pack: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xml_data** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **from_mhe_distribution_short**
> Object from_mhe_distribution_short(opts)

From MHE Distribution Short



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

opts = { 
  flat_data: 'flat_data_example', # String | 
  xml_data: 'xml_data_example' # String | 
}

begin
  #From MHE Distribution Short
  result = api_instance.from_mhe_distribution_short(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->from_mhe_distribution_short: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flat_data** | **String**|  | [optional] 
 **xml_data** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **get_next_numbers**
> Object get_next_numbers(counter_code, opts)

Get Next Numbers



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

counter_code = 'counter_code_example' # String | 

opts = { 
  company_code: 'company_code_example', # String | 
  count: 56, # Integer | 
  facility_code: 'facility_code_example' # String | 
}

begin
  #Get Next Numbers
  result = api_instance.get_next_numbers(counter_code, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->get_next_numbers: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **counter_code** | **String**|  | 
 **company_code** | **String**|  | [optional] 
 **count** | **Integer**|  | [optional] 
 **facility_code** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **get_status**
> Object get_status(entity, key, opts)

Get Status



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

entity = 'entity_example' # String | 

key = 'key_example' # String | 

opts = { 
  company_code: 'company_code_example', # String | 
  facility_code: 'facility_code_example' # String | 
}

begin
  #Get Status
  result = api_instance.get_status(entity, key, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->get_status: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **String**|  | 
 **key** | **String**|  | 
 **company_code** | **String**|  | [optional] 
 **facility_code** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **induct_lpn**
> Object induct_lpn(opts)

Induct LPN



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

opts = { 
  flat_data: 'flat_data_example', # String | 
  xml_data: 'xml_data_example' # String | 
}

begin
  #Induct LPN
  result = api_instance.induct_lpn(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->induct_lpn: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flat_data** | **String**|  | [optional] 
 **xml_data** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **init_stage_interface**
> Object init_stage_interface(opts)

Init Stage Interface



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

opts = { 
  async: true, # BOOLEAN | 
  entity: 'entity_example', # String | 
  flat_data: 'flat_data_example', # String | 
  validate_xml: true, # BOOLEAN | 
  xml_data: 'xml_data_example' # String | 
}

begin
  #Init Stage Interface
  result = api_instance.init_stage_interface(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->init_stage_interface: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **async** | **BOOLEAN**|  | [optional] 
 **entity** | **String**|  | [optional] 
 **flat_data** | **String**|  | [optional] 
 **validate_xml** | **BOOLEAN**|  | [optional] 
 **xml_data** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **lock_unlock_lpn**
> Object lock_unlock_lpn(opts)

Lock/Unlock LPN



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

opts = { 
  action: 'action_example', # String | 
  company_code: 'company_code_example', # String | 
  facility_code: 'facility_code_example', # String | 
  lock_code: 'lock_code_example', # String | 
  lpn_nbr: 'lpn_nbr_example', # String | 
  remove_lock_from_shipment_dtl_flg: true # BOOLEAN | 
}

begin
  #Lock/Unlock LPN
  result = api_instance.lock_unlock_lpn(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->lock_unlock_lpn: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**|  | [optional] 
 **company_code** | **String**|  | [optional] 
 **facility_code** | **String**|  | [optional] 
 **lock_code** | **String**|  | [optional] 
 **lpn_nbr** | **String**|  | [optional] 
 **remove_lock_from_shipment_dtl_flg** | **BOOLEAN**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **object_inquiry**
> Object object_inquiry(entity, key, company_code, facility_code, opts)

Object Inquiry



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

entity = 'entity_example' # String | 

key = 'key_example' # String | 

company_code = 'company_code_example' # String | 

facility_code = 'facility_code_example' # String | 

opts = { 
  minimize: 'minimize_example' # String | 
}

begin
  #Object Inquiry
  result = api_instance.object_inquiry(entity, key, company_code, facility_code, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->object_inquiry: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **String**|  | 
 **key** | **String**|  | 
 **company_code** | **String**|  | 
 **facility_code** | **String**|  | 
 **minimize** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **pick_confirm**
> Object pick_confirm(opts)

Pick Confirm



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

opts = { 
  flat_data: 'flat_data_example', # String | 
  xml_data: 'xml_data_example' # String | 
}

begin
  #Pick Confirm
  result = api_instance.pick_confirm(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->pick_confirm: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flat_data** | **String**|  | [optional] 
 **xml_data** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **receive_lpn**
> Object receive_lpn(lpn_nbr, opts)

Receive LPN



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

lpn_nbr = 'lpn_nbr_example' # String | 

opts = { 
  company_code: 'company_code_example', # String | 
  facility_code: 'facility_code_example', # String | 
  rcvd_trailer_nbr: 'rcvd_trailer_nbr_example', # String | 
  received_ts: 'received_ts_example', # String | 
  receiving_location: 'receiving_location_example', # String | 
  xdock_lpn_flg: true, # BOOLEAN | 
  xml_data: 'xml_data_example' # String | 
}

begin
  #Receive LPN
  result = api_instance.receive_lpn(lpn_nbr, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->receive_lpn: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lpn_nbr** | **String**|  | 
 **company_code** | **String**|  | [optional] 
 **facility_code** | **String**|  | [optional] 
 **rcvd_trailer_nbr** | **String**|  | [optional] 
 **received_ts** | **String**|  | [optional] 
 **receiving_location** | **String**|  | [optional] 
 **xdock_lpn_flg** | **BOOLEAN**|  | [optional] 
 **xml_data** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **run_mhe_stage_interface**
> Object run_mhe_stage_interface(company_code, entity, facility_code, mhe_vendor_code, opts)

Run MHE Stage Interface



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

company_code = 'company_code_example' # String | 

entity = 'entity_example' # String | 

facility_code = 'facility_code_example' # String | 

mhe_vendor_code = 'mhe_vendor_code_example' # String | 

opts = { 
  python_function: 'python_function_example' # String | 
}

begin
  #Run MHE Stage Interface
  result = api_instance.run_mhe_stage_interface(company_code, entity, facility_code, mhe_vendor_code, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->run_mhe_stage_interface: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_code** | **String**|  | 
 **entity** | **String**|  | 
 **facility_code** | **String**|  | 
 **mhe_vendor_code** | **String**|  | 
 **python_function** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **run_stage_interface**
> Object run_stage_interface(company_code, entity, facility_code, file_group_nbr, opts)

Run Stage Interface



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

company_code = 'company_code_example' # String | 

entity = 'entity_example' # String | 

facility_code = 'facility_code_example' # String | 

file_group_nbr = 'file_group_nbr_example' # String | 

opts = { 
  async: true # BOOLEAN | 
}

begin
  #Run Stage Interface
  result = api_instance.run_stage_interface(company_code, entity, facility_code, file_group_nbr, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->run_stage_interface: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_code** | **String**|  | 
 **entity** | **String**|  | 
 **facility_code** | **String**|  | 
 **file_group_nbr** | **String**|  | 
 **async** | **BOOLEAN**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **ship_oblpn**
> Object ship_oblpn(company_code, facility_code, locn_barcode, oblpn_nbr, opts)

Ship OBLPN



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

company_code = 'company_code_example' # String | 

facility_code = 'facility_code_example' # String | 

locn_barcode = 'locn_barcode_example' # String | 

oblpn_nbr = 'oblpn_nbr_example' # String | 

opts = { 
  output_file_to_generate: 'output_file_to_generate_example' # String | 
}

begin
  #Ship OBLPN
  result = api_instance.ship_oblpn(company_code, facility_code, locn_barcode, oblpn_nbr, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->ship_oblpn: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_code** | **String**|  | 
 **facility_code** | **String**|  | 
 **locn_barcode** | **String**|  | 
 **oblpn_nbr** | **String**|  | 
 **output_file_to_generate** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **update_active_inventory**
> Object update_active_inventory(location_barcode, reason_code, opts)

Update Active Inventory



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

location_barcode = 'location_barcode_example' # String | 

reason_code = 'reason_code_example' # String | 

opts = { 
  actual_qty: 8.14, # Float | 
  adjustment_qty: 8.14, # Float | 
  batch_number: 'batch_number_example', # String | 
  company_code: 'company_code_example', # String | 
  expiry_data: 'expiry_data_example', # String | 
  facility_code: 'facility_code_example', # String | 
  invn_attr_a: 'invn_attr_a_example', # String | 
  invn_attr_b: 'invn_attr_b_example', # String | 
  invn_attr_c: 'invn_attr_c_example', # String | 
  invn_attr_d: 'invn_attr_d_example', # String | 
  invn_attr_e: 'invn_attr_e_example', # String | 
  invn_attr_f: 'invn_attr_f_example', # String | 
  invn_attr_g: 'invn_attr_g_example', # String | 
  item_alternate_code: 'item_alternate_code_example', # String | 
  item_barcode: 'item_barcode_example', # String | 
  item_code: 'item_code_example', # String | 
  locn_capacity_check_flg: true # BOOLEAN | 
}

begin
  #Update Active Inventory
  result = api_instance.update_active_inventory(location_barcode, reason_code, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->update_active_inventory: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **location_barcode** | **String**|  | 
 **reason_code** | **String**|  | 
 **actual_qty** | **Float**|  | [optional] 
 **adjustment_qty** | **Float**|  | [optional] 
 **batch_number** | **String**|  | [optional] 
 **company_code** | **String**|  | [optional] 
 **expiry_data** | **String**|  | [optional] 
 **facility_code** | **String**|  | [optional] 
 **invn_attr_a** | **String**|  | [optional] 
 **invn_attr_b** | **String**|  | [optional] 
 **invn_attr_c** | **String**|  | [optional] 
 **invn_attr_d** | **String**|  | [optional] 
 **invn_attr_e** | **String**|  | [optional] 
 **invn_attr_f** | **String**|  | [optional] 
 **invn_attr_g** | **String**|  | [optional] 
 **item_alternate_code** | **String**|  | [optional] 
 **item_barcode** | **String**|  | [optional] 
 **item_code** | **String**|  | [optional] 
 **locn_capacity_check_flg** | **BOOLEAN**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **update_carrier_lpn_label**
> Object update_carrier_lpn_label(label, oblpn_nbr, opts)

Update Carrier LPN Label



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

label = 'label_example' # String | 

oblpn_nbr = 'oblpn_nbr_example' # String | 

opts = { 
  company_code: 'company_code_example', # String | 
  facility_code: 'facility_code_example' # String | 
}

begin
  #Update Carrier LPN Label
  result = api_instance.update_carrier_lpn_label(label, oblpn_nbr, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->update_carrier_lpn_label: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **label** | **String**|  | 
 **oblpn_nbr** | **String**|  | 
 **company_code** | **String**|  | [optional] 
 **facility_code** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **update_oblpn_dimensions**
> Object update_oblpn_dimensions(calc_vol_flg, company_code, facility_code, height, length, oblpn_nbr, width, opts)

Update OBLPN Dimensions



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

calc_vol_flg = true # BOOLEAN | 

company_code = 'company_code_example' # String | 

facility_code = 'facility_code_example' # String | 

height = 8.14 # Float | 

length = 8.14 # Float | 

oblpn_nbr = 'oblpn_nbr_example' # String | 

width = 8.14 # Float | 

opts = { 
  ship_oblpn: true, # BOOLEAN | 
  shipping_location: 'shipping_location_example', # String | 
  volume: 8.14, # Float | 
  weight: 8.14 # Float | 
}

begin
  #Update OBLPN Dimensions
  result = api_instance.update_oblpn_dimensions(calc_vol_flg, company_code, facility_code, height, length, oblpn_nbr, width, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->update_oblpn_dimensions: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calc_vol_flg** | **BOOLEAN**|  | 
 **company_code** | **String**|  | 
 **facility_code** | **String**|  | 
 **height** | **Float**|  | 
 **length** | **Float**|  | 
 **oblpn_nbr** | **String**|  | 
 **width** | **Float**|  | 
 **ship_oblpn** | **BOOLEAN**|  | [optional] 
 **shipping_location** | **String**|  | [optional] 
 **volume** | **Float**|  | [optional] 
 **weight** | **Float**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **update_oblpn_tracking_number**
> Object update_oblpn_tracking_number(company_code, facility_code, oblpn_nbr, tracking_nbr, opts)

Update OBLPN Tracking Number



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

company_code = 'company_code_example' # String | 

facility_code = 'facility_code_example' # String | 

oblpn_nbr = 'oblpn_nbr_example' # String | 

tracking_nbr = 'tracking_nbr_example' # String | 

opts = { 
  dry_ice_weight: 8.14, # Float | 
  estimated_delivery_time: 'estimated_delivery_time_example', # String | 
  master_tracking_nbr: 'master_tracking_nbr_example', # String | 
  rate: 'rate_example', # String | 
  ship_via_code: 'ship_via_code_example', # String | 
  weight: 8.14 # Float | 
}

begin
  #Update OBLPN Tracking Number
  result = api_instance.update_oblpn_tracking_number(company_code, facility_code, oblpn_nbr, tracking_nbr, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->update_oblpn_tracking_number: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_code** | **String**|  | 
 **facility_code** | **String**|  | 
 **oblpn_nbr** | **String**|  | 
 **tracking_nbr** | **String**|  | 
 **dry_ice_weight** | **Float**|  | [optional] 
 **estimated_delivery_time** | **String**|  | [optional] 
 **master_tracking_nbr** | **String**|  | [optional] 
 **rate** | **String**|  | [optional] 
 **ship_via_code** | **String**|  | [optional] 
 **weight** | **Float**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



# **update_output_interface**
> Object update_output_interface(opts)

Update Output Interface



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::DefaultApi.new

opts = { 
  company_code: 'company_code_example', # String | 
  cust_intl_code: 'cust_intl_code_example', # String | 
  facility_code: 'facility_code_example', # String | 
  filename: 'filename_example', # String | 
  interface_type_code: 'interface_type_code_example', # String | 
  message: 'message_example', # String | 
  run_output_interface_flg: true, # BOOLEAN | 
  status_id: 56 # Integer | 
}

begin
  #Update Output Interface
  result = api_instance.update_output_interface(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->update_output_interface: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_code** | **String**|  | [optional] 
 **cust_intl_code** | **String**|  | [optional] 
 **facility_code** | **String**|  | [optional] 
 **filename** | **String**|  | [optional] 
 **interface_type_code** | **String**|  | [optional] 
 **message** | **String**|  | [optional] 
 **run_output_interface_flg** | **BOOLEAN**|  | [optional] 
 **status_id** | **Integer**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml



