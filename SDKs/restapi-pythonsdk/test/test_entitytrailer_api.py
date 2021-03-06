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
from swagger_client.api.entitytrailer_api import EntitytrailerApi  # noqa: E501
from swagger_client.rest import ApiException


class TestEntitytrailerApi(unittest.TestCase):
    """EntitytrailerApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.entitytrailer_api.EntitytrailerApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_entity_trailer_by_id_get(self):
        """Test case for entity_trailer_by_id_get

        EntityTrailerById_GET  # noqa: E501
        """
        pass

    def test_entity_trailer_describe_get(self):
        """Test case for entity_trailer_describe_get

        EntityTrailerDescribe_GET  # noqa: E501
        """
        pass

    def test_entity_trailer_get(self):
        """Test case for entity_trailer_get

        EntityTrailer_GET  # noqa: E501
        """
        pass

    def test_entity_trailer_locate_to_yard_by_id_post(self):
        """Test case for entity_trailer_locate_to_yard_by_id_post

        EntityTrailerLocateToYardById_POST  # noqa: E501
        """
        pass

    def test_entity_trailer_locate_to_yard_post(self):
        """Test case for entity_trailer_locate_to_yard_post

        EntityTrailerLocateToYard_POST  # noqa: E501
        """
        pass

    def test_entity_trailer_post(self):
        """Test case for entity_trailer_post

        EntityTrailer_POST  # noqa: E501
        """
        pass

    def test_entity_trailer_remove_from_yard_by_id_post(self):
        """Test case for entity_trailer_remove_from_yard_by_id_post

        EntityTrailerRemoveFromYardById_POST  # noqa: E501
        """
        pass

    def test_entity_trailer_remove_from_yard_post(self):
        """Test case for entity_trailer_remove_from_yard_post

        EntityTrailerRemoveFromYard_POST  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
