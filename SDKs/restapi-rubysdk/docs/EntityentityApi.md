# SwaggerClient::EntityentityApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_describe_get**](EntityentityApi.md#entity_describe_get) | **GET** /entity/describe | EntityDescribe_GET


# **entity_describe_get**
> Object entity_describe_get

EntityDescribe_GET



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

api_instance = SwaggerClient::EntityentityApi.new

begin
  #EntityDescribe_GET
  result = api_instance.entity_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityentityApi->entity_describe_get: #{e}"
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



