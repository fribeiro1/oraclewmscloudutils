# SwaggerClient::EntityshippingBlockedSelectionCriteriaApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_shipping_blocked_selection_criteria_describe_get**](EntityshippingBlockedSelectionCriteriaApi.md#entity_shipping_blocked_selection_criteria_describe_get) | **GET** /entity/shipping_blocked_selection_criteria/describe | EntityShippingBlockedSelectionCriteriaDescribe_GET
[**entity_shipping_blocked_selection_criteria_get**](EntityshippingBlockedSelectionCriteriaApi.md#entity_shipping_blocked_selection_criteria_get) | **GET** /entity/shipping_blocked_selection_criteria | EntityShippingBlockedSelectionCriteria_GET
[**get_entity_shipping_blocked_selection_criteria_get**](EntityshippingBlockedSelectionCriteriaApi.md#get_entity_shipping_blocked_selection_criteria_get) | **GET** /entity/shipping_blocked_selection_criteria/{id} | EntityShippingBlockedSelectionCriteria_GET


# **entity_shipping_blocked_selection_criteria_describe_get**
> Object entity_shipping_blocked_selection_criteria_describe_get

EntityShippingBlockedSelectionCriteriaDescribe_GET



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

api_instance = SwaggerClient::EntityshippingBlockedSelectionCriteriaApi.new

begin
  #EntityShippingBlockedSelectionCriteriaDescribe_GET
  result = api_instance.entity_shipping_blocked_selection_criteria_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityshippingBlockedSelectionCriteriaApi->entity_shipping_blocked_selection_criteria_describe_get: #{e}"
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



# **entity_shipping_blocked_selection_criteria_get**
> Object entity_shipping_blocked_selection_criteria_get(opts)

EntityShippingBlockedSelectionCriteria_GET



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

api_instance = SwaggerClient::EntityshippingBlockedSelectionCriteriaApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityShippingBlockedSelectionCriteria_GET
  result = api_instance.entity_shipping_blocked_selection_criteria_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityshippingBlockedSelectionCriteriaApi->entity_shipping_blocked_selection_criteria_get: #{e}"
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



# **get_entity_shipping_blocked_selection_criteria_get**
> Object get_entity_shipping_blocked_selection_criteria_get(id, opts)

EntityShippingBlockedSelectionCriteria_GET



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

api_instance = SwaggerClient::EntityshippingBlockedSelectionCriteriaApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityShippingBlockedSelectionCriteria_GET
  result = api_instance.get_entity_shipping_blocked_selection_criteria_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityshippingBlockedSelectionCriteriaApi->get_entity_shipping_blocked_selection_criteria_get: #{e}"
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



