# SwaggerClient::EntityputawayTypeCalcRuleApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_putaway_type_calc_rule_by_id_get**](EntityputawayTypeCalcRuleApi.md#entity_putaway_type_calc_rule_by_id_get) | **GET** /entity/putaway_type_calc_rule/{id} | EntityPutawayTypeCalcRuleById_GET
[**entity_putaway_type_calc_rule_get**](EntityputawayTypeCalcRuleApi.md#entity_putaway_type_calc_rule_get) | **GET** /entity/putaway_type_calc_rule | EntityPutawayTypeCalcRule_GET
[**entity_putaway_type_calc_rule_post**](EntityputawayTypeCalcRuleApi.md#entity_putaway_type_calc_rule_post) | **POST** /entity/putaway_type_calc_rule | EntityPutawayTypeCalcRule_POST


# **entity_putaway_type_calc_rule_by_id_get**
> Object entity_putaway_type_calc_rule_by_id_get(id, opts)

EntityPutawayTypeCalcRuleById_GET



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

api_instance = SwaggerClient::EntityputawayTypeCalcRuleApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityPutawayTypeCalcRuleById_GET
  result = api_instance.entity_putaway_type_calc_rule_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityputawayTypeCalcRuleApi->entity_putaway_type_calc_rule_by_id_get: #{e}"
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



# **entity_putaway_type_calc_rule_get**
> Object entity_putaway_type_calc_rule_get

EntityPutawayTypeCalcRule_GET



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

api_instance = SwaggerClient::EntityputawayTypeCalcRuleApi.new

begin
  #EntityPutawayTypeCalcRule_GET
  result = api_instance.entity_putaway_type_calc_rule_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityputawayTypeCalcRuleApi->entity_putaway_type_calc_rule_get: #{e}"
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



# **entity_putaway_type_calc_rule_post**
> Object entity_putaway_type_calc_rule_post

EntityPutawayTypeCalcRule_POST



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

api_instance = SwaggerClient::EntityputawayTypeCalcRuleApi.new

begin
  #EntityPutawayTypeCalcRule_POST
  result = api_instance.entity_putaway_type_calc_rule_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityputawayTypeCalcRuleApi->entity_putaway_type_calc_rule_post: #{e}"
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



