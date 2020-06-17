# SwaggerClient::EntitymheDestinationCodeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_mhe_destination_code_by_id_get**](EntitymheDestinationCodeApi.md#entity_mhe_destination_code_by_id_get) | **GET** /entity/mhe_destination_code/{id} | EntityMheDestinationCodeById_GET
[**entity_mhe_destination_code_describe_get**](EntitymheDestinationCodeApi.md#entity_mhe_destination_code_describe_get) | **GET** /entity/mhe_destination_code/describe | EntityMheDestinationCodeDescribe_GET
[**entity_mhe_destination_code_get**](EntitymheDestinationCodeApi.md#entity_mhe_destination_code_get) | **GET** /entity/mhe_destination_code | EntityMheDestinationCode_GET


# **entity_mhe_destination_code_by_id_get**
> Object entity_mhe_destination_code_by_id_get(id, opts)

EntityMheDestinationCodeById_GET



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

api_instance = SwaggerClient::EntitymheDestinationCodeApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityMheDestinationCodeById_GET
  result = api_instance.entity_mhe_destination_code_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitymheDestinationCodeApi->entity_mhe_destination_code_by_id_get: #{e}"
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



# **entity_mhe_destination_code_describe_get**
> Object entity_mhe_destination_code_describe_get

EntityMheDestinationCodeDescribe_GET



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

api_instance = SwaggerClient::EntitymheDestinationCodeApi.new

begin
  #EntityMheDestinationCodeDescribe_GET
  result = api_instance.entity_mhe_destination_code_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitymheDestinationCodeApi->entity_mhe_destination_code_describe_get: #{e}"
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



# **entity_mhe_destination_code_get**
> Object entity_mhe_destination_code_get(opts)

EntityMheDestinationCode_GET



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

api_instance = SwaggerClient::EntitymheDestinationCodeApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityMheDestinationCode_GET
  result = api_instance.entity_mhe_destination_code_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitymheDestinationCodeApi->entity_mhe_destination_code_get: #{e}"
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



