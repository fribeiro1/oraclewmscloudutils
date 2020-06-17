# SwaggerClient::EntitypalletActivityApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_pallet_activity_by_id_get**](EntitypalletActivityApi.md#entity_pallet_activity_by_id_get) | **GET** /entity/pallet_activity/{id} | EntityPalletActivityById_GET
[**entity_pallet_activity_describe_get**](EntitypalletActivityApi.md#entity_pallet_activity_describe_get) | **GET** /entity/pallet_activity/describe | EntityPalletActivityDescribe_GET
[**entity_pallet_activity_get**](EntitypalletActivityApi.md#entity_pallet_activity_get) | **GET** /entity/pallet_activity | EntityPalletActivity_GET


# **entity_pallet_activity_by_id_get**
> Object entity_pallet_activity_by_id_get(id, opts)

EntityPalletActivityById_GET



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

api_instance = SwaggerClient::EntitypalletActivityApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityPalletActivityById_GET
  result = api_instance.entity_pallet_activity_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypalletActivityApi->entity_pallet_activity_by_id_get: #{e}"
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



# **entity_pallet_activity_describe_get**
> Object entity_pallet_activity_describe_get

EntityPalletActivityDescribe_GET



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

api_instance = SwaggerClient::EntitypalletActivityApi.new

begin
  #EntityPalletActivityDescribe_GET
  result = api_instance.entity_pallet_activity_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypalletActivityApi->entity_pallet_activity_describe_get: #{e}"
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



# **entity_pallet_activity_get**
> Object entity_pallet_activity_get(opts)

EntityPalletActivity_GET



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

api_instance = SwaggerClient::EntitypalletActivityApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityPalletActivity_GET
  result = api_instance.entity_pallet_activity_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypalletActivityApi->entity_pallet_activity_get: #{e}"
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



