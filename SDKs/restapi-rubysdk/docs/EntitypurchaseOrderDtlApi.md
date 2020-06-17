# SwaggerClient::EntitypurchaseOrderDtlApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_purchase_order_dtl_by_id_get**](EntitypurchaseOrderDtlApi.md#entity_purchase_order_dtl_by_id_get) | **GET** /entity/purchase_order_dtl/{id} | EntityPurchaseOrderDtlById_GET
[**entity_purchase_order_dtl_by_id_patch**](EntitypurchaseOrderDtlApi.md#entity_purchase_order_dtl_by_id_patch) | **PATCH** /entity/purchase_order_dtl/{id} | EntityPurchaseOrderDtlById_PATCH
[**entity_purchase_order_dtl_describe_get**](EntitypurchaseOrderDtlApi.md#entity_purchase_order_dtl_describe_get) | **GET** /entity/purchase_order_dtl/describe | EntityPurchaseOrderDtlDescribe_GET
[**entity_purchase_order_dtl_get**](EntitypurchaseOrderDtlApi.md#entity_purchase_order_dtl_get) | **GET** /entity/purchase_order_dtl | EntityPurchaseOrderDtl_GET


# **entity_purchase_order_dtl_by_id_get**
> Object entity_purchase_order_dtl_by_id_get(id, opts)

EntityPurchaseOrderDtlById_GET



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

api_instance = SwaggerClient::EntitypurchaseOrderDtlApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityPurchaseOrderDtlById_GET
  result = api_instance.entity_purchase_order_dtl_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypurchaseOrderDtlApi->entity_purchase_order_dtl_by_id_get: #{e}"
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



# **entity_purchase_order_dtl_by_id_patch**
> Object entity_purchase_order_dtl_by_id_patch(id, opts)

EntityPurchaseOrderDtlById_PATCH



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

api_instance = SwaggerClient::EntitypurchaseOrderDtlApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityPurchaseOrderDtlById_PATCH
  result = api_instance.entity_purchase_order_dtl_by_id_patch(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypurchaseOrderDtlApi->entity_purchase_order_dtl_by_id_patch: #{e}"
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



# **entity_purchase_order_dtl_describe_get**
> Object entity_purchase_order_dtl_describe_get

EntityPurchaseOrderDtlDescribe_GET



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

api_instance = SwaggerClient::EntitypurchaseOrderDtlApi.new

begin
  #EntityPurchaseOrderDtlDescribe_GET
  result = api_instance.entity_purchase_order_dtl_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypurchaseOrderDtlApi->entity_purchase_order_dtl_describe_get: #{e}"
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



# **entity_purchase_order_dtl_get**
> Object entity_purchase_order_dtl_get(opts)

EntityPurchaseOrderDtl_GET



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

api_instance = SwaggerClient::EntitypurchaseOrderDtlApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityPurchaseOrderDtl_GET
  result = api_instance.entity_purchase_order_dtl_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypurchaseOrderDtlApi->entity_purchase_order_dtl_get: #{e}"
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



