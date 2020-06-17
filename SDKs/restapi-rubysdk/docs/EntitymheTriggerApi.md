# SwaggerClient::EntitymheTriggerApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_mhe_trigger_by_id_get**](EntitymheTriggerApi.md#entity_mhe_trigger_by_id_get) | **GET** /entity/mhe_trigger/{id} | EntityMheTriggerById_GET
[**entity_mhe_trigger_describe_get**](EntitymheTriggerApi.md#entity_mhe_trigger_describe_get) | **GET** /entity/mhe_trigger/describe | EntityMheTriggerDescribe_GET
[**entity_mhe_trigger_get**](EntitymheTriggerApi.md#entity_mhe_trigger_get) | **GET** /entity/mhe_trigger | EntityMheTrigger_GET


# **entity_mhe_trigger_by_id_get**
> Object entity_mhe_trigger_by_id_get(id, opts)

EntityMheTriggerById_GET



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

api_instance = SwaggerClient::EntitymheTriggerApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityMheTriggerById_GET
  result = api_instance.entity_mhe_trigger_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitymheTriggerApi->entity_mhe_trigger_by_id_get: #{e}"
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



# **entity_mhe_trigger_describe_get**
> Object entity_mhe_trigger_describe_get

EntityMheTriggerDescribe_GET



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

api_instance = SwaggerClient::EntitymheTriggerApi.new

begin
  #EntityMheTriggerDescribe_GET
  result = api_instance.entity_mhe_trigger_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitymheTriggerApi->entity_mhe_trigger_describe_get: #{e}"
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



# **entity_mhe_trigger_get**
> Object entity_mhe_trigger_get(opts)

EntityMheTrigger_GET



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

api_instance = SwaggerClient::EntitymheTriggerApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityMheTrigger_GET
  result = api_instance.entity_mhe_trigger_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitymheTriggerApi->entity_mhe_trigger_get: #{e}"
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



