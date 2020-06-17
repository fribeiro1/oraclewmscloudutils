# SwaggerClient::EntitytaskApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_task_by_id_get**](EntitytaskApi.md#entity_task_by_id_get) | **GET** /entity/task/{id} | EntityTaskById_GET
[**entity_task_describe_get**](EntitytaskApi.md#entity_task_describe_get) | **GET** /entity/task/describe | EntityTaskDescribe_GET
[**entity_task_get**](EntitytaskApi.md#entity_task_get) | **GET** /entity/task | EntityTask_GET
[**entity_task_next_task_get**](EntitytaskApi.md#entity_task_next_task_get) | **GET** /entity/task/next_task | EntityTaskNextTask_GET


# **entity_task_by_id_get**
> Object entity_task_by_id_get(id, opts)

EntityTaskById_GET



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

api_instance = SwaggerClient::EntitytaskApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityTaskById_GET
  result = api_instance.entity_task_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitytaskApi->entity_task_by_id_get: #{e}"
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



# **entity_task_describe_get**
> Object entity_task_describe_get

EntityTaskDescribe_GET



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

api_instance = SwaggerClient::EntitytaskApi.new

begin
  #EntityTaskDescribe_GET
  result = api_instance.entity_task_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitytaskApi->entity_task_describe_get: #{e}"
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



# **entity_task_get**
> Object entity_task_get(opts)

EntityTask_GET



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

api_instance = SwaggerClient::EntitytaskApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged', # String | 
  facility_id: 56, # Integer | 
  facility_id__code: 'facility_id__code_example', # String | 
  location_barcode: 'location_barcode_example', # String | 
  task_type: 'task_type_example', # String | 
  ordering_rule: 'ordering_rule_example' # String | 
}

begin
  #EntityTask_GET
  result = api_instance.entity_task_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitytaskApi->entity_task_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**|  | [optional] 
 **ordering** | **String**|  | [optional] 
 **page_mode** | **String**|  | [optional] [default to paged]
 **facility_id** | **Integer**|  | [optional] 
 **facility_id__code** | **String**|  | [optional] 
 **location_barcode** | **String**|  | [optional] 
 **task_type** | **String**|  | [optional] 
 **ordering_rule** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



# **entity_task_next_task_get**
> Object entity_task_next_task_get(facility_id, facility_id__code, location_barcode, ordering_rule, task_type)

EntityTaskNextTask_GET



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

api_instance = SwaggerClient::EntitytaskApi.new

facility_id = 8.14 # Float | 

facility_id__code = 'facility_id__code_example' # String | 

location_barcode = 'location_barcode_example' # String | 

ordering_rule = 'ordering_rule_example' # String | 

task_type = 'task_type_example' # String | 


begin
  #EntityTaskNextTask_GET
  result = api_instance.entity_task_next_task_get(facility_id, facility_id__code, location_barcode, ordering_rule, task_type)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitytaskApi->entity_task_next_task_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **facility_id** | **Float**|  | 
 **facility_id__code** | **String**|  | 
 **location_barcode** | **String**|  | 
 **ordering_rule** | **String**|  | 
 **task_type** | **String**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



