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
from swagger_client.api.entityrouting_mode_api import EntityroutingModeApi  # noqa: E501
from swagger_client.rest import ApiException


class TestEntityroutingModeApi(unittest.TestCase):
    """EntityroutingModeApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.entityrouting_mode_api.EntityroutingModeApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_entity_routing_mode_by_id_get(self):
        """Test case for entity_routing_mode_by_id_get

        EntityRoutingModeById_GET  # noqa: E501
        """
        pass

    def test_entity_routing_mode_describe_get(self):
        """Test case for entity_routing_mode_describe_get

        EntityRoutingModeDescribe_GET  # noqa: E501
        """
        pass

    def test_entity_routing_mode_get(self):
        """Test case for entity_routing_mode_get

        EntityRoutingMode_GET  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
