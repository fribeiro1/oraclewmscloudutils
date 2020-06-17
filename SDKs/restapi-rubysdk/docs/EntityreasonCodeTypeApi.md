# SwaggerClient::EntityreasonCodeTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_reason_code_type_by_id_get**](EntityreasonCodeTypeApi.md#entity_reason_code_type_by_id_get) | **GET** /entity/reason_code_type/{id} | EntityReasonCodeTypeById_GET
[**entity_reason_code_type_describe_get**](EntityreasonCodeTypeApi.md#entity_reason_code_type_describe_get) | **GET** /entity/reason_code_type/describe | EntityReasonCodeTypeDescribe_GET
[**entity_reason_code_type_get**](EntityreasonCodeTypeApi.md#entity_reason_code_type_get) | **GET** /entity/reason_code_type | EntityReasonCodeType_GET


# **entity_reason_code_type_by_id_get**
> Object entity_reason_code_type_by_id_get(id, opts)

EntityReasonCodeTypeById_GET



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

api_instance = SwaggerClient::EntityreasonCodeTypeApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityReasonCodeTypeById_GET
  result = api_instance.entity_reason_code_type_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityreasonCodeTypeApi->entity_reason_code_type_by_id_get: #{e}"
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



# **entity_reason_code_type_describe_get**
> Object entity_reason_code_type_describe_get

EntityReasonCodeTypeDescribe_GET



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

api_instance = SwaggerClient::EntityreasonCodeTypeApi.new

begin
  #EntityReasonCodeTypeDescribe_GET
  result = api_instance.entity_reason_code_type_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityreasonCodeTypeApi->entity_reason_code_type_describe_get: #{e}"
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



# **entity_reason_code_type_get**
> Object entity_reason_code_type_get(opts)

EntityReasonCodeType_GET



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

api_instance = SwaggerClient::EntityreasonCodeTypeApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityReasonCodeType_GET
  result = api_instance.entity_reason_code_type_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityreasonCodeTypeApi->entity_reason_code_type_get: #{e}"
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



