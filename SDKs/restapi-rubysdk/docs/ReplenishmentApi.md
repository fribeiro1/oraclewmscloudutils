# SwaggerClient::ReplenishmentApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**replenishment_replenish_to_active_post**](ReplenishmentApi.md#replenishment_replenish_to_active_post) | **POST** /replenishment/replenish_to_active | ReplenishmentReplenishToActive_POST


# **replenishment_replenish_to_active_post**
> Object replenishment_replenish_to_active_post

ReplenishmentReplenishToActive_POST



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

api_instance = SwaggerClient::ReplenishmentApi.new

begin
  #ReplenishmentReplenishToActive_POST
  result = api_instance.replenishment_replenish_to_active_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ReplenishmentApi->replenishment_replenish_to_active_post: #{e}"
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



