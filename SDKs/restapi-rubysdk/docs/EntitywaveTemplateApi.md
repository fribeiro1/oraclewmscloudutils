# SwaggerClient::EntitywaveTemplateApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_wave_template_by_id_get**](EntitywaveTemplateApi.md#entity_wave_template_by_id_get) | **GET** /entity/wave_template/{id} | EntityWaveTemplateById_GET
[**entity_wave_template_describe_get**](EntitywaveTemplateApi.md#entity_wave_template_describe_get) | **GET** /entity/wave_template/describe | EntityWaveTemplateDescribe_GET
[**entity_wave_template_get**](EntitywaveTemplateApi.md#entity_wave_template_get) | **GET** /entity/wave_template | EntityWaveTemplate_GET


# **entity_wave_template_by_id_get**
> Object entity_wave_template_by_id_get(id, opts)

EntityWaveTemplateById_GET



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

api_instance = SwaggerClient::EntitywaveTemplateApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityWaveTemplateById_GET
  result = api_instance.entity_wave_template_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitywaveTemplateApi->entity_wave_template_by_id_get: #{e}"
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



# **entity_wave_template_describe_get**
> Object entity_wave_template_describe_get

EntityWaveTemplateDescribe_GET



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

api_instance = SwaggerClient::EntitywaveTemplateApi.new

begin
  #EntityWaveTemplateDescribe_GET
  result = api_instance.entity_wave_template_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitywaveTemplateApi->entity_wave_template_describe_get: #{e}"
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



# **entity_wave_template_get**
> Object entity_wave_template_get(opts)

EntityWaveTemplate_GET



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

api_instance = SwaggerClient::EntitywaveTemplateApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityWaveTemplate_GET
  result = api_instance.entity_wave_template_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitywaveTemplateApi->entity_wave_template_get: #{e}"
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



