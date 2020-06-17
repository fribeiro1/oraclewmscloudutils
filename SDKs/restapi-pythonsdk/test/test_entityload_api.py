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
from swagger_client.api.entityload_api import EntityloadApi  # noqa: E501
from swagger_client.rest import ApiException


class TestEntityloadApi(unittest.TestCase):
    """EntityloadApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.entityload_api.EntityloadApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_entity_load_by_id_get(self):
        """Test case for entity_load_by_id_get

        EntityLoadById_GET  # noqa: E501
        """
        pass

    def test_entity_load_by_id_patch(self):
        """Test case for entity_load_by_id_patch

        EntityLoadById_PATCH  # noqa: E501
        """
        pass

    def test_entity_load_check_in_by_id_post(self):
        """Test case for entity_load_check_in_by_id_post

        EntityLoadCheckInById_POST  # noqa: E501
        """
        pass

    def test_entity_load_check_in_post(self):
        """Test case for entity_load_check_in_post

        EntityLoadCheckIn_POST  # noqa: E501
        """
        pass

    def test_entity_load_check_out_by_id_post(self):
        """Test case for entity_load_check_out_by_id_post

        EntityLoadCheckOutById_POST  # noqa: E501
        """
        pass

    def test_entity_load_check_out_post(self):
        """Test case for entity_load_check_out_post

        EntityLoadCheckOut_POST  # noqa: E501
        """
        pass

    def test_entity_load_describe_get(self):
        """Test case for entity_load_describe_get

        EntityLoadDescribe_GET  # noqa: E501
        """
        pass

    def test_entity_load_get(self):
        """Test case for entity_load_get

        EntityLoad_GET  # noqa: E501
        """
        pass

    def test_entity_load_ship_by_id_post(self):
        """Test case for entity_load_ship_by_id_post

        EntityLoadShipById_POST  # noqa: E501
        """
        pass

    def test_entity_load_ship_post(self):
        """Test case for entity_load_ship_post

        EntityLoadShip_POST  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
