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
from swagger_client.api.entitycapacity_check_method_api import EntitycapacityCheckMethodApi  # noqa: E501
from swagger_client.rest import ApiException


class TestEntitycapacityCheckMethodApi(unittest.TestCase):
    """EntitycapacityCheckMethodApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.entitycapacity_check_method_api.EntitycapacityCheckMethodApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_entity_capacity_check_method_by_id_get(self):
        """Test case for entity_capacity_check_method_by_id_get

        EntityCapacityCheckMethodById_GET  # noqa: E501
        """
        pass

    def test_entity_capacity_check_method_describe_get(self):
        """Test case for entity_capacity_check_method_describe_get

        EntityCapacityCheckMethodDescribe_GET  # noqa: E501
        """
        pass

    def test_entity_capacity_check_method_get(self):
        """Test case for entity_capacity_check_method_get

        EntityCapacityCheckMethod_GET  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
