# SwaggerClient::EntitypaymentMethodApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_payment_method_by_id_get**](EntitypaymentMethodApi.md#entity_payment_method_by_id_get) | **GET** /entity/payment_method/{id} | EntityPaymentMethodById_GET
[**entity_payment_method_describe_get**](EntitypaymentMethodApi.md#entity_payment_method_describe_get) | **GET** /entity/payment_method/describe | EntityPaymentMethodDescribe_GET
[**entity_payment_method_get**](EntitypaymentMethodApi.md#entity_payment_method_get) | **GET** /entity/payment_method | EntityPaymentMethod_GET


# **entity_payment_method_by_id_get**
> Object entity_payment_method_by_id_get(id, opts)

EntityPaymentMethodById_GET



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

api_instance = SwaggerClient::EntitypaymentMethodApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityPaymentMethodById_GET
  result = api_instance.entity_payment_method_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypaymentMethodApi->entity_payment_method_by_id_get: #{e}"
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



# **entity_payment_method_describe_get**
> Object entity_payment_method_describe_get

EntityPaymentMethodDescribe_GET



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

api_instance = SwaggerClient::EntitypaymentMethodApi.new

begin
  #EntityPaymentMethodDescribe_GET
  result = api_instance.entity_payment_method_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypaymentMethodApi->entity_payment_method_describe_get: #{e}"
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



# **entity_payment_method_get**
> Object entity_payment_method_get(opts)

EntityPaymentMethod_GET



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

api_instance = SwaggerClient::EntitypaymentMethodApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityPaymentMethod_GET
  result = api_instance.entity_payment_method_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypaymentMethodApi->entity_payment_method_get: #{e}"
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



