# SwaggerClient::EntityallocationDistributionModeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_allocation_distribution_mode_by_id_get**](EntityallocationDistributionModeApi.md#entity_allocation_distribution_mode_by_id_get) | **GET** /entity/allocation_distribution_mode/{id} | EntityAllocationDistributionModeById_GET
[**entity_allocation_distribution_mode_describe_get**](EntityallocationDistributionModeApi.md#entity_allocation_distribution_mode_describe_get) | **GET** /entity/allocation_distribution_mode/describe | EntityAllocationDistributionModeDescribe_GET
[**entity_allocation_distribution_mode_get**](EntityallocationDistributionModeApi.md#entity_allocation_distribution_mode_get) | **GET** /entity/allocation_distribution_mode | EntityAllocationDistributionMode_GET


# **entity_allocation_distribution_mode_by_id_get**
> Object entity_allocation_distribution_mode_by_id_get(id, opts)

EntityAllocationDistributionModeById_GET



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

api_instance = SwaggerClient::EntityallocationDistributionModeApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityAllocationDistributionModeById_GET
  result = api_instance.entity_allocation_distribution_mode_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityallocationDistributionModeApi->entity_allocation_distribution_mode_by_id_get: #{e}"
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



# **entity_allocation_distribution_mode_describe_get**
> Object entity_allocation_distribution_mode_describe_get

EntityAllocationDistributionModeDescribe_GET



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

api_instance = SwaggerClient::EntityallocationDistributionModeApi.new

begin
  #EntityAllocationDistributionModeDescribe_GET
  result = api_instance.entity_allocation_distribution_mode_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityallocationDistributionModeApi->entity_allocation_distribution_mode_describe_get: #{e}"
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



# **entity_allocation_distribution_mode_get**
> Object entity_allocation_distribution_mode_get(opts)

EntityAllocationDistributionMode_GET



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

api_instance = SwaggerClient::EntityallocationDistributionModeApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityAllocationDistributionMode_GET
  result = api_instance.entity_allocation_distribution_mode_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityallocationDistributionModeApi->entity_allocation_distribution_mode_get: #{e}"
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



