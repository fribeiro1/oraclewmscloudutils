# SwaggerClient::EntityallocationApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_allocation_by_id_get**](EntityallocationApi.md#entity_allocation_by_id_get) | **GET** /entity/allocation/{id} | EntityAllocationById_GET
[**entity_allocation_describe_get**](EntityallocationApi.md#entity_allocation_describe_get) | **GET** /entity/allocation/describe | EntityAllocationDescribe_GET
[**entity_allocation_get**](EntityallocationApi.md#entity_allocation_get) | **GET** /entity/allocation | EntityAllocation_GET


# **entity_allocation_by_id_get**
> Object entity_allocation_by_id_get(id, opts)

EntityAllocationById_GET



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

api_instance = SwaggerClient::EntityallocationApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityAllocationById_GET
  result = api_instance.entity_allocation_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityallocationApi->entity_allocation_by_id_get: #{e}"
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



# **entity_allocation_describe_get**
> Object entity_allocation_describe_get

EntityAllocationDescribe_GET



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

api_instance = SwaggerClient::EntityallocationApi.new

begin
  #EntityAllocationDescribe_GET
  result = api_instance.entity_allocation_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityallocationApi->entity_allocation_describe_get: #{e}"
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



# **entity_allocation_get**
> Object entity_allocation_get(opts)

EntityAllocation_GET



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

api_instance = SwaggerClient::EntityallocationApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityAllocation_GET
  result = api_instance.entity_allocation_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityallocationApi->entity_allocation_get: #{e}"
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



