# coding: utf-8

"""
    REST API

    This is a sample definition of the Oracle WMS Cloud REST API.  The views expressed here are my own and do not necessarily reflect the views of Oracle.  # noqa: E501

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import swagger_client
from swagger_client.api.report_api import ReportApi  # noqa: E501
from swagger_client.rest import ApiException


class TestReportApi(unittest.TestCase):
    """ReportApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.report_api.ReportApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_report_custom_inventory_summary_get(self):
        """Test case for report_custom_inventory_summary_get

        ReportCustomInventorySummary_GET  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()