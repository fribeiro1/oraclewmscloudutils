# SwaggerClient::EntityputawaySearchModeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_putaway_search_mode_by_id_get**](EntityputawaySearchModeApi.md#entity_putaway_search_mode_by_id_get) | **GET** /entity/putaway_search_mode/{id} | EntityPutawaySearchModeById_GET
[**entity_putaway_search_mode_describe_get**](EntityputawaySearchModeApi.md#entity_putaway_search_mode_describe_get) | **GET** /entity/putaway_search_mode/describe | EntityPutawaySearchModeDescribe_GET
[**entity_putaway_search_mode_get**](EntityputawaySearchModeApi.md#entity_putaway_search_mode_get) | **GET** /entity/putaway_search_mode | EntityPutawaySearchMode_GET


# **entity_putaway_search_mode_by_id_get**
> Object entity_putaway_search_mode_by_id_get(id, opts)

EntityPutawaySearchModeById_GET



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

api_instance = SwaggerClient::EntityputawaySearchModeApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityPutawaySearchModeById_GET
  result = api_instance.entity_putaway_search_mode_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityputawaySearchModeApi->entity_putaway_search_mode_by_id_get: #{e}"
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



# **entity_putaway_search_mode_describe_get**
> Object entity_putaway_search_mode_describe_get

EntityPutawaySearchModeDescribe_GET



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

api_instance = SwaggerClient::EntityputawaySearchModeApi.new

begin
  #EntityPutawaySearchModeDescribe_GET
  result = api_instance.entity_putaway_search_mode_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityputawaySearchModeApi->entity_putaway_search_mode_describe_get: #{e}"
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



# **entity_putaway_search_mode_get**
> Object entity_putaway_search_mode_get(opts)

EntityPutawaySearchMode_GET



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

api_instance = SwaggerClient::EntityputawaySearchModeApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityPutawaySearchMode_GET
  result = api_instance.entity_putaway_search_mode_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityputawaySearchModeApi->entity_putaway_search_mode_get: #{e}"
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



