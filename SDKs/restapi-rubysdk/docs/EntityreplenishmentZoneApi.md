# SwaggerClient::EntityreplenishmentZoneApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_replenishment_zone_by_id_get**](EntityreplenishmentZoneApi.md#entity_replenishment_zone_by_id_get) | **GET** /entity/replenishment_zone/{id} | EntityReplenishmentZoneById_GET
[**entity_replenishment_zone_get**](EntityreplenishmentZoneApi.md#entity_replenishment_zone_get) | **GET** /entity/replenishment_zone | EntityReplenishmentZone_GET
[**entity_replenishment_zone_post**](EntityreplenishmentZoneApi.md#entity_replenishment_zone_post) | **POST** /entity/replenishment_zone | EntityReplenishmentZone_POST


# **entity_replenishment_zone_by_id_get**
> Object entity_replenishment_zone_by_id_get(id, opts)

EntityReplenishmentZoneById_GET



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

api_instance = SwaggerClient::EntityreplenishmentZoneApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityReplenishmentZoneById_GET
  result = api_instance.entity_replenishment_zone_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityreplenishmentZoneApi->entity_replenishment_zone_by_id_get: #{e}"
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



# **entity_replenishment_zone_get**
> Object entity_replenishment_zone_get

EntityReplenishmentZone_GET



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

api_instance = SwaggerClient::EntityreplenishmentZoneApi.new

begin
  #EntityReplenishmentZone_GET
  result = api_instance.entity_replenishment_zone_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityreplenishmentZoneApi->entity_replenishment_zone_get: #{e}"
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



# **entity_replenishment_zone_post**
> Object entity_replenishment_zone_post

EntityReplenishmentZone_POST



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

api_instance = SwaggerClient::EntityreplenishmentZoneApi.new

begin
  #EntityReplenishmentZone_POST
  result = api_instance.entity_replenishment_zone_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityreplenishmentZoneApi->entity_replenishment_zone_post: #{e}"
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



