# SwaggerClient::EntityverificationTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_verification_type_by_id_get**](EntityverificationTypeApi.md#entity_verification_type_by_id_get) | **GET** /entity/verification_type/{id} | EntityVerificationTypeById_GET
[**entity_verification_type_describe_get**](EntityverificationTypeApi.md#entity_verification_type_describe_get) | **GET** /entity/verification_type/describe | EntityVerificationTypeDescribe_GET
[**entity_verification_type_get**](EntityverificationTypeApi.md#entity_verification_type_get) | **GET** /entity/verification_type | EntityVerificationType_GET


# **entity_verification_type_by_id_get**
> Object entity_verification_type_by_id_get(id, opts)

EntityVerificationTypeById_GET



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

api_instance = SwaggerClient::EntityverificationTypeApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityVerificationTypeById_GET
  result = api_instance.entity_verification_type_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityverificationTypeApi->entity_verification_type_by_id_get: #{e}"
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



# **entity_verification_type_describe_get**
> Object entity_verification_type_describe_get

EntityVerificationTypeDescribe_GET



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

api_instance = SwaggerClient::EntityverificationTypeApi.new

begin
  #EntityVerificationTypeDescribe_GET
  result = api_instance.entity_verification_type_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityverificationTypeApi->entity_verification_type_describe_get: #{e}"
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



# **entity_verification_type_get**
> Object entity_verification_type_get(opts)

EntityVerificationType_GET



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

api_instance = SwaggerClient::EntityverificationTypeApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityVerificationType_GET
  result = api_instance.entity_verification_type_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityverificationTypeApi->entity_verification_type_get: #{e}"
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



