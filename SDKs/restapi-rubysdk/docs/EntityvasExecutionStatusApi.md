# SwaggerClient::EntityvasExecutionStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_vas_execution_status_by_id_get**](EntityvasExecutionStatusApi.md#entity_vas_execution_status_by_id_get) | **GET** /entity/vas_execution_status/{id} | EntityVasExecutionStatusById_GET
[**entity_vas_execution_status_describe_get**](EntityvasExecutionStatusApi.md#entity_vas_execution_status_describe_get) | **GET** /entity/vas_execution_status/describe | EntityVasExecutionStatusDescribe_GET
[**entity_vas_execution_status_get**](EntityvasExecutionStatusApi.md#entity_vas_execution_status_get) | **GET** /entity/vas_execution_status | EntityVasExecutionStatus_GET


# **entity_vas_execution_status_by_id_get**
> Object entity_vas_execution_status_by_id_get(id, opts)

EntityVasExecutionStatusById_GET



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

api_instance = SwaggerClient::EntityvasExecutionStatusApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityVasExecutionStatusById_GET
  result = api_instance.entity_vas_execution_status_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityvasExecutionStatusApi->entity_vas_execution_status_by_id_get: #{e}"
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



# **entity_vas_execution_status_describe_get**
> Object entity_vas_execution_status_describe_get

EntityVasExecutionStatusDescribe_GET



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

api_instance = SwaggerClient::EntityvasExecutionStatusApi.new

begin
  #EntityVasExecutionStatusDescribe_GET
  result = api_instance.entity_vas_execution_status_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityvasExecutionStatusApi->entity_vas_execution_status_describe_get: #{e}"
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



# **entity_vas_execution_status_get**
> Object entity_vas_execution_status_get(opts)

EntityVasExecutionStatus_GET



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

api_instance = SwaggerClient::EntityvasExecutionStatusApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityVasExecutionStatus_GET
  result = api_instance.entity_vas_execution_status_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityvasExecutionStatusApi->entity_vas_execution_status_get: #{e}"
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



