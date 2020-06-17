# SwaggerClient::EntityseqCounterApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_seq_counter_by_id_get**](EntityseqCounterApi.md#entity_seq_counter_by_id_get) | **GET** /entity/seq_counter/{id} | EntitySeqCounterById_GET
[**entity_seq_counter_describe_get**](EntityseqCounterApi.md#entity_seq_counter_describe_get) | **GET** /entity/seq_counter/describe | EntitySeqCounterDescribe_GET
[**entity_seq_counter_get**](EntityseqCounterApi.md#entity_seq_counter_get) | **GET** /entity/seq_counter | EntitySeqCounter_GET


# **entity_seq_counter_by_id_get**
> Object entity_seq_counter_by_id_get(id, opts)

EntitySeqCounterById_GET



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

api_instance = SwaggerClient::EntityseqCounterApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntitySeqCounterById_GET
  result = api_instance.entity_seq_counter_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityseqCounterApi->entity_seq_counter_by_id_get: #{e}"
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



# **entity_seq_counter_describe_get**
> Object entity_seq_counter_describe_get

EntitySeqCounterDescribe_GET



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

api_instance = SwaggerClient::EntityseqCounterApi.new

begin
  #EntitySeqCounterDescribe_GET
  result = api_instance.entity_seq_counter_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityseqCounterApi->entity_seq_counter_describe_get: #{e}"
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



# **entity_seq_counter_get**
> Object entity_seq_counter_get(opts)

EntitySeqCounter_GET



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

api_instance = SwaggerClient::EntityseqCounterApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntitySeqCounter_GET
  result = api_instance.entity_seq_counter_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityseqCounterApi->entity_seq_counter_get: #{e}"
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



