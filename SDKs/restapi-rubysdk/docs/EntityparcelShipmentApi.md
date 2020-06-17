# SwaggerClient::EntityparcelShipmentApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_parcel_shipment_by_id_get**](EntityparcelShipmentApi.md#entity_parcel_shipment_by_id_get) | **GET** /entity/parcel_shipment/{id} | EntityParcelShipmentById_GET
[**entity_parcel_shipment_describe_get**](EntityparcelShipmentApi.md#entity_parcel_shipment_describe_get) | **GET** /entity/parcel_shipment/describe | EntityParcelShipmentDescribe_GET
[**entity_parcel_shipment_get**](EntityparcelShipmentApi.md#entity_parcel_shipment_get) | **GET** /entity/parcel_shipment | EntityParcelShipment_GET


# **entity_parcel_shipment_by_id_get**
> Object entity_parcel_shipment_by_id_get(id, opts)

EntityParcelShipmentById_GET



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

api_instance = SwaggerClient::EntityparcelShipmentApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityParcelShipmentById_GET
  result = api_instance.entity_parcel_shipment_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityparcelShipmentApi->entity_parcel_shipment_by_id_get: #{e}"
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



# **entity_parcel_shipment_describe_get**
> Object entity_parcel_shipment_describe_get

EntityParcelShipmentDescribe_GET



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

api_instance = SwaggerClient::EntityparcelShipmentApi.new

begin
  #EntityParcelShipmentDescribe_GET
  result = api_instance.entity_parcel_shipment_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityparcelShipmentApi->entity_parcel_shipment_describe_get: #{e}"
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



# **entity_parcel_shipment_get**
> Object entity_parcel_shipment_get(opts)

EntityParcelShipment_GET



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

api_instance = SwaggerClient::EntityparcelShipmentApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityParcelShipment_GET
  result = api_instance.entity_parcel_shipment_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityparcelShipmentApi->entity_parcel_shipment_get: #{e}"
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



