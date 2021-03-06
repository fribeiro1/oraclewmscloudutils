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
from swagger_client.api.print_api import PrintApi  # noqa: E501
from swagger_client.rest import ApiException


class TestPrintApi(unittest.TestCase):
    """PrintApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.print_api.PrintApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_print_label_ib_container_get(self):
        """Test case for print_label_ib_container_get

        PrintLabelIbContainer_GET  # noqa: E501
        """
        pass

    def test_print_label_ib_container_post(self):
        """Test case for print_label_ib_container_post

        PrintLabelIbContainer_POST  # noqa: E501
        """
        pass

    def test_print_label_pallet_get(self):
        """Test case for print_label_pallet_get

        PrintLabelPallet_GET  # noqa: E501
        """
        pass

    def test_print_label_pallet_post(self):
        """Test case for print_label_pallet_post

        PrintLabelPallet_POST  # noqa: E501
        """
        pass

    def test_print_label_shipping_get(self):
        """Test case for print_label_shipping_get

        PrintLabelShipping_GET  # noqa: E501
        """
        pass

    def test_print_label_shipping_post(self):
        """Test case for print_label_shipping_post

        PrintLabelShipping_POST  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
