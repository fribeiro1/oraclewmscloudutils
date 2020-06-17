# SwaggerClient::EntitycontainerStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_container_status_by_id_get**](EntitycontainerStatusApi.md#entity_container_status_by_id_get) | **GET** /entity/container_status/{id} | EntityContainerStatusById_GET
[**entity_container_status_describe_get**](EntitycontainerStatusApi.md#entity_container_status_describe_get) | **GET** /entity/container_status/describe | EntityContainerStatusDescribe_GET
[**entity_container_status_get**](EntitycontainerStatusApi.md#entity_container_status_get) | **GET** /entity/container_status | EntityContainerStatus_GET


# **entity_container_status_by_id_get**
> Object entity_container_status_by_id_get(id, opts)

EntityContainerStatusById_GET



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

api_instance = SwaggerClient::EntitycontainerStatusApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityContainerStatusById_GET
  result = api_instance.entity_container_status_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitycontainerStatusApi->entity_container_status_by_id_get: #{e}"
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



# **entity_container_status_describe_get**
> Object entity_container_status_describe_get

EntityContainerStatusDescribe_GET



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

api_instance = SwaggerClient::EntitycontainerStatusApi.new

begin
  #EntityContainerStatusDescribe_GET
  result = api_instance.entity_container_status_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitycontainerStatusApi->entity_container_status_describe_get: #{e}"
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



# **entity_container_status_get**
> Object entity_container_status_get(opts)

EntityContainerStatus_GET



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

api_instance = SwaggerClient::EntitycontainerStatusApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityContainerStatus_GET
  result = api_instance.entity_container_status_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitycontainerStatusApi->entity_container_status_get: #{e}"
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



