# SwaggerClient::EntityccTriggerApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_cc_trigger_by_id_get**](EntityccTriggerApi.md#entity_cc_trigger_by_id_get) | **GET** /entity/cc_trigger/{id} | EntityCcTriggerById_GET
[**entity_cc_trigger_describe_get**](EntityccTriggerApi.md#entity_cc_trigger_describe_get) | **GET** /entity/cc_trigger/describe | EntityCcTriggerDescribe_GET
[**entity_cc_trigger_get**](EntityccTriggerApi.md#entity_cc_trigger_get) | **GET** /entity/cc_trigger | EntityCcTrigger_GET


# **entity_cc_trigger_by_id_get**
> Object entity_cc_trigger_by_id_get(id, opts)

EntityCcTriggerById_GET



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

api_instance = SwaggerClient::EntityccTriggerApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityCcTriggerById_GET
  result = api_instance.entity_cc_trigger_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityccTriggerApi->entity_cc_trigger_by_id_get: #{e}"
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



# **entity_cc_trigger_describe_get**
> Object entity_cc_trigger_describe_get

EntityCcTriggerDescribe_GET



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

api_instance = SwaggerClient::EntityccTriggerApi.new

begin
  #EntityCcTriggerDescribe_GET
  result = api_instance.entity_cc_trigger_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityccTriggerApi->entity_cc_trigger_describe_get: #{e}"
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



# **entity_cc_trigger_get**
> Object entity_cc_trigger_get(opts)

EntityCcTrigger_GET



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

api_instance = SwaggerClient::EntityccTriggerApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityCcTrigger_GET
  result = api_instance.entity_cc_trigger_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityccTriggerApi->entity_cc_trigger_get: #{e}"
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



