# SwaggerClient::EntityshipmentVerifOrderdtlCancelModeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_shipment_verif_orderdtl_cancel_mode_describe_get**](EntityshipmentVerifOrderdtlCancelModeApi.md#entity_shipment_verif_orderdtl_cancel_mode_describe_get) | **GET** /entity/shipment_verif_orderdtl_cancel_mode/describe | EntityShipmentVerifOrderdtlCancelModeDescribe_GET
[**entity_shipment_verif_orderdtl_cancel_mode_get**](EntityshipmentVerifOrderdtlCancelModeApi.md#entity_shipment_verif_orderdtl_cancel_mode_get) | **GET** /entity/shipment_verif_orderdtl_cancel_mode | EntityShipmentVerifOrderdtlCancelMode_GET
[**get_entity_shipment_verif_orderdtl_cancel_mode_get**](EntityshipmentVerifOrderdtlCancelModeApi.md#get_entity_shipment_verif_orderdtl_cancel_mode_get) | **GET** /entity/shipment_verif_orderdtl_cancel_mode/{id} | EntityShipmentVerifOrderdtlCancelMode_GET


# **entity_shipment_verif_orderdtl_cancel_mode_describe_get**
> Object entity_shipment_verif_orderdtl_cancel_mode_describe_get

EntityShipmentVerifOrderdtlCancelModeDescribe_GET



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

api_instance = SwaggerClient::EntityshipmentVerifOrderdtlCancelModeApi.new

begin
  #EntityShipmentVerifOrderdtlCancelModeDescribe_GET
  result = api_instance.entity_shipment_verif_orderdtl_cancel_mode_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityshipmentVerifOrderdtlCancelModeApi->entity_shipment_verif_orderdtl_cancel_mode_describe_get: #{e}"
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



# **entity_shipment_verif_orderdtl_cancel_mode_get**
> Object entity_shipment_verif_orderdtl_cancel_mode_get(opts)

EntityShipmentVerifOrderdtlCancelMode_GET



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

api_instance = SwaggerClient::EntityshipmentVerifOrderdtlCancelModeApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityShipmentVerifOrderdtlCancelMode_GET
  result = api_instance.entity_shipment_verif_orderdtl_cancel_mode_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityshipmentVerifOrderdtlCancelModeApi->entity_shipment_verif_orderdtl_cancel_mode_get: #{e}"
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



# **get_entity_shipment_verif_orderdtl_cancel_mode_get**
> Object get_entity_shipment_verif_orderdtl_cancel_mode_get(id, opts)

EntityShipmentVerifOrderdtlCancelMode_GET



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

api_instance = SwaggerClient::EntityshipmentVerifOrderdtlCancelModeApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityShipmentVerifOrderdtlCancelMode_GET
  result = api_instance.get_entity_shipment_verif_orderdtl_cancel_mode_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityshipmentVerifOrderdtlCancelModeApi->get_entity_shipment_verif_orderdtl_cancel_mode_get: #{e}"
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



