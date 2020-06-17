# SwaggerClient::EntitywaveStageApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_wave_stage_by_id_get**](EntitywaveStageApi.md#entity_wave_stage_by_id_get) | **GET** /entity/wave_stage/{id} | EntityWaveStageById_GET
[**entity_wave_stage_describe_get**](EntitywaveStageApi.md#entity_wave_stage_describe_get) | **GET** /entity/wave_stage/describe | EntityWaveStageDescribe_GET
[**entity_wave_stage_get**](EntitywaveStageApi.md#entity_wave_stage_get) | **GET** /entity/wave_stage | EntityWaveStage_GET


# **entity_wave_stage_by_id_get**
> Object entity_wave_stage_by_id_get(id, opts)

EntityWaveStageById_GET



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

api_instance = SwaggerClient::EntitywaveStageApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityWaveStageById_GET
  result = api_instance.entity_wave_stage_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitywaveStageApi->entity_wave_stage_by_id_get: #{e}"
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



# **entity_wave_stage_describe_get**
> Object entity_wave_stage_describe_get

EntityWaveStageDescribe_GET



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

api_instance = SwaggerClient::EntitywaveStageApi.new

begin
  #EntityWaveStageDescribe_GET
  result = api_instance.entity_wave_stage_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitywaveStageApi->entity_wave_stage_describe_get: #{e}"
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



# **entity_wave_stage_get**
> Object entity_wave_stage_get(opts)

EntityWaveStage_GET



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

api_instance = SwaggerClient::EntitywaveStageApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityWaveStage_GET
  result = api_instance.entity_wave_stage_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitywaveStageApi->entity_wave_stage_get: #{e}"
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



