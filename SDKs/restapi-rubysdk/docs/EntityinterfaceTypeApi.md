# SwaggerClient::EntityinterfaceTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_interface_type_by_id_get**](EntityinterfaceTypeApi.md#entity_interface_type_by_id_get) | **GET** /entity/interface_type/{id} | EntityInterfaceTypeById_GET
[**entity_interface_type_describe_get**](EntityinterfaceTypeApi.md#entity_interface_type_describe_get) | **GET** /entity/interface_type/describe | EntityInterfaceTypeDescribe_GET
[**entity_interface_type_get**](EntityinterfaceTypeApi.md#entity_interface_type_get) | **GET** /entity/interface_type | EntityInterfaceType_GET


# **entity_interface_type_by_id_get**
> Object entity_interface_type_by_id_get(id, opts)

EntityInterfaceTypeById_GET



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

api_instance = SwaggerClient::EntityinterfaceTypeApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityInterfaceTypeById_GET
  result = api_instance.entity_interface_type_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityinterfaceTypeApi->entity_interface_type_by_id_get: #{e}"
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



# **entity_interface_type_describe_get**
> Object entity_interface_type_describe_get

EntityInterfaceTypeDescribe_GET



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

api_instance = SwaggerClient::EntityinterfaceTypeApi.new

begin
  #EntityInterfaceTypeDescribe_GET
  result = api_instance.entity_interface_type_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityinterfaceTypeApi->entity_interface_type_describe_get: #{e}"
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



# **entity_interface_type_get**
> Object entity_interface_type_get(opts)

EntityInterfaceType_GET



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

api_instance = SwaggerClient::EntityinterfaceTypeApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityInterfaceType_GET
  result = api_instance.entity_interface_type_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityinterfaceTypeApi->entity_interface_type_get: #{e}"
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



