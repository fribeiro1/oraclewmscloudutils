# swagger_client.ReportApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**report_custom_inventory_summary_get**](ReportApi.md#report_custom_inventory_summary_get) | **GET** /report/custom_inventory_summary | ReportCustomInventorySummary_GET


# **report_custom_inventory_summary_get**
> object report_custom_inventory_summary_get(item_code, company_id=company_id, company_id__code=company_id__code, facility_id=facility_id, facility_id__code=facility_id__code, write_header_line_flg=write_header_line_flg)

ReportCustomInventorySummary_GET



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: basic
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'
# Configure OAuth2 access token for authorization: oauth2
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.ReportApi(swagger_client.ApiClient(configuration))
item_code = 'item_code_example' # str | 
company_id = 8.14 # float |  (optional)
company_id__code = 'company_id__code_example' # str |  (optional)
facility_id = 8.14 # float |  (optional)
facility_id__code = 'facility_id__code_example' # str |  (optional)
write_header_line_flg = true # bool |  (optional)

try:
    # ReportCustomInventorySummary_GET
    api_response = api_instance.report_custom_inventory_summary_get(item_code, company_id=company_id, company_id__code=company_id__code, facility_id=facility_id, facility_id__code=facility_id__code, write_header_line_flg=write_header_line_flg)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportApi->report_custom_inventory_summary_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item_code** | **str**|  | 
 **company_id** | **float**|  | [optional] 
 **company_id__code** | **str**|  | [optional] 
 **facility_id** | **float**|  | [optional] 
 **facility_id__code** | **str**|  | [optional] 
 **write_header_line_flg** | **bool**|  | [optional] 

### Return type

**object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

