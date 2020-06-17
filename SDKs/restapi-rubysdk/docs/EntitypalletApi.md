# SwaggerClient::EntitypalletApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_pallet_by_id_get**](EntitypalletApi.md#entity_pallet_by_id_get) | **GET** /entity/pallet/{id} | EntityPalletById_GET
[**entity_pallet_close_inbound_sorting_by_id_post**](EntitypalletApi.md#entity_pallet_close_inbound_sorting_by_id_post) | **POST** /entity/pallet/{id}/close_inbound_sorting | EntityPalletCloseInboundSortingById_POST
[**entity_pallet_close_inbound_sorting_post**](EntitypalletApi.md#entity_pallet_close_inbound_sorting_post) | **POST** /entity/pallet/close_inbound_sorting | EntityPalletCloseInboundSorting_POST
[**entity_pallet_describe_get**](EntitypalletApi.md#entity_pallet_describe_get) | **GET** /entity/pallet/describe | EntityPalletDescribe_GET
[**entity_pallet_get**](EntitypalletApi.md#entity_pallet_get) | **GET** /entity/pallet | EntityPallet_GET
[**entity_pallet_sort_lpn_post**](EntitypalletApi.md#entity_pallet_sort_lpn_post) | **POST** /entity/pallet/sort_lpn | EntityPalletSortLpn_POST


# **entity_pallet_by_id_get**
> Object entity_pallet_by_id_get(id, opts)

EntityPalletById_GET



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

api_instance = SwaggerClient::EntitypalletApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityPalletById_GET
  result = api_instance.entity_pallet_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypalletApi->entity_pallet_by_id_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Float**|  | 
 **fields** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



# **entity_pallet_close_inbound_sorting_by_id_post**
> Object entity_pallet_close_inbound_sorting_by_id_post(id)

EntityPalletCloseInboundSortingById_POST



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

api_instance = SwaggerClient::EntitypalletApi.new

id = 8.14 # Float | 


begin
  #EntityPalletCloseInboundSortingById_POST
  result = api_instance.entity_pallet_close_inbound_sorting_by_id_post(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypalletApi->entity_pallet_close_inbound_sorting_by_id_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Float**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



# **entity_pallet_close_inbound_sorting_post**
> Object entity_pallet_close_inbound_sorting_post

EntityPalletCloseInboundSorting_POST



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

api_instance = SwaggerClient::EntitypalletApi.new

begin
  #EntityPalletCloseInboundSorting_POST
  result = api_instance.entity_pallet_close_inbound_sorting_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypalletApi->entity_pallet_close_inbound_sorting_post: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



# **entity_pallet_describe_get**
> Object entity_pallet_describe_get

EntityPalletDescribe_GET



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

api_instance = SwaggerClient::EntitypalletApi.new

begin
  #EntityPalletDescribe_GET
  result = api_instance.entity_pallet_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypalletApi->entity_pallet_describe_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



# **entity_pallet_get**
> Object entity_pallet_get(opts)

EntityPallet_GET



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

api_instance = SwaggerClient::EntitypalletApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityPallet_GET
  result = api_instance.entity_pallet_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypalletApi->entity_pallet_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**|  | [optional] 
 **ordering** | **String**|  | [optional] 
 **page_mode** | **String**|  | [optional] [default to paged]

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



# **entity_pallet_sort_lpn_post**
> Object entity_pallet_sort_lpn_post

EntityPalletSortLpn_POST



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

api_instance = SwaggerClient::EntitypalletApi.new

begin
  #EntityPalletSortLpn_POST
  result = api_instance.entity_pallet_sort_lpn_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypalletApi->entity_pallet_sort_lpn_post: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



