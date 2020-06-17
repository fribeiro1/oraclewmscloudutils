# SwaggerClient::EntityselectionTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_selection_type_by_id_get**](EntityselectionTypeApi.md#entity_selection_type_by_id_get) | **GET** /entity/selection_type/{id} | EntitySelectionTypeById_GET
[**entity_selection_type_describe_get**](EntityselectionTypeApi.md#entity_selection_type_describe_get) | **GET** /entity/selection_type/describe | EntitySelectionTypeDescribe_GET
[**entity_selection_type_get**](EntityselectionTypeApi.md#entity_selection_type_get) | **GET** /entity/selection_type | EntitySelectionType_GET


# **entity_selection_type_by_id_get**
> Object entity_selection_type_by_id_get(id, opts)

EntitySelectionTypeById_GET



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

api_instance = SwaggerClient::EntityselectionTypeApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntitySelectionTypeById_GET
  result = api_instance.entity_selection_type_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityselectionTypeApi->entity_selection_type_by_id_get: #{e}"
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



# **entity_selection_type_describe_get**
> Object entity_selection_type_describe_get

EntitySelectionTypeDescribe_GET



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

api_instance = SwaggerClient::EntityselectionTypeApi.new

begin
  #EntitySelectionTypeDescribe_GET
  result = api_instance.entity_selection_type_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityselectionTypeApi->entity_selection_type_describe_get: #{e}"
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



# **entity_selection_type_get**
> Object entity_selection_type_get(opts)

EntitySelectionType_GET



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

api_instance = SwaggerClient::EntityselectionTypeApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntitySelectionType_GET
  result = api_instance.entity_selection_type_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityselectionTypeApi->entity_selection_type_get: #{e}"
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



