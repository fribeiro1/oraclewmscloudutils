# SwaggerClient::EntityverificationEntityApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_verification_entity_by_id_get**](EntityverificationEntityApi.md#entity_verification_entity_by_id_get) | **GET** /entity/verification_entity/{id} | EntityVerificationEntityById_GET
[**entity_verification_entity_describe_get**](EntityverificationEntityApi.md#entity_verification_entity_describe_get) | **GET** /entity/verification_entity/describe | EntityVerificationEntityDescribe_GET
[**entity_verification_entity_get**](EntityverificationEntityApi.md#entity_verification_entity_get) | **GET** /entity/verification_entity | EntityVerificationEntity_GET


# **entity_verification_entity_by_id_get**
> Object entity_verification_entity_by_id_get(id, opts)

EntityVerificationEntityById_GET



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

api_instance = SwaggerClient::EntityverificationEntityApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityVerificationEntityById_GET
  result = api_instance.entity_verification_entity_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityverificationEntityApi->entity_verification_entity_by_id_get: #{e}"
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



# **entity_verification_entity_describe_get**
> Object entity_verification_entity_describe_get

EntityVerificationEntityDescribe_GET



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

api_instance = SwaggerClient::EntityverificationEntityApi.new

begin
  #EntityVerificationEntityDescribe_GET
  result = api_instance.entity_verification_entity_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityverificationEntityApi->entity_verification_entity_describe_get: #{e}"
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



# **entity_verification_entity_get**
> Object entity_verification_entity_get(opts)

EntityVerificationEntity_GET



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

api_instance = SwaggerClient::EntityverificationEntityApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityVerificationEntity_GET
  result = api_instance.entity_verification_entity_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityverificationEntityApi->entity_verification_entity_get: #{e}"
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



