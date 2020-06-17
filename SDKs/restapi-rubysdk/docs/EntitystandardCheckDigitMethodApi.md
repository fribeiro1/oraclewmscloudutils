# SwaggerClient::EntitystandardCheckDigitMethodApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_standard_check_digit_method_by_id_get**](EntitystandardCheckDigitMethodApi.md#entity_standard_check_digit_method_by_id_get) | **GET** /entity/standard_check_digit_method/{id} | EntityStandardCheckDigitMethodById_GET
[**entity_standard_check_digit_method_describe_get**](EntitystandardCheckDigitMethodApi.md#entity_standard_check_digit_method_describe_get) | **GET** /entity/standard_check_digit_method/describe | EntityStandardCheckDigitMethodDescribe_GET
[**entity_standard_check_digit_method_get**](EntitystandardCheckDigitMethodApi.md#entity_standard_check_digit_method_get) | **GET** /entity/standard_check_digit_method | EntityStandardCheckDigitMethod_GET


# **entity_standard_check_digit_method_by_id_get**
> Object entity_standard_check_digit_method_by_id_get(id, opts)

EntityStandardCheckDigitMethodById_GET



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

api_instance = SwaggerClient::EntitystandardCheckDigitMethodApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityStandardCheckDigitMethodById_GET
  result = api_instance.entity_standard_check_digit_method_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitystandardCheckDigitMethodApi->entity_standard_check_digit_method_by_id_get: #{e}"
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



# **entity_standard_check_digit_method_describe_get**
> Object entity_standard_check_digit_method_describe_get

EntityStandardCheckDigitMethodDescribe_GET



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

api_instance = SwaggerClient::EntitystandardCheckDigitMethodApi.new

begin
  #EntityStandardCheckDigitMethodDescribe_GET
  result = api_instance.entity_standard_check_digit_method_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitystandardCheckDigitMethodApi->entity_standard_check_digit_method_describe_get: #{e}"
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



# **entity_standard_check_digit_method_get**
> Object entity_standard_check_digit_method_get(opts)

EntityStandardCheckDigitMethod_GET



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

api_instance = SwaggerClient::EntitystandardCheckDigitMethodApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityStandardCheckDigitMethod_GET
  result = api_instance.entity_standard_check_digit_method_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitystandardCheckDigitMethodApi->entity_standard_check_digit_method_get: #{e}"
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



