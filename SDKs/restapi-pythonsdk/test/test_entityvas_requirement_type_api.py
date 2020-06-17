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
from swagger_client.api.entityvas_requirement_type_api import EntityvasRequirementTypeApi  # noqa: E501
from swagger_client.rest import ApiException


class TestEntityvasRequirementTypeApi(unittest.TestCase):
    """EntityvasRequirementTypeApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.entityvas_requirement_type_api.EntityvasRequirementTypeApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_entity_vas_requirement_type_by_id_get(self):
        """Test case for entity_vas_requirement_type_by_id_get

        EntityVasRequirementTypeById_GET  # noqa: E501
        """
        pass

    def test_entity_vas_requirement_type_describe_get(self):
        """Test case for entity_vas_requirement_type_describe_get

        EntityVasRequirementTypeDescribe_GET  # noqa: E501
        """
        pass

    def test_entity_vas_requirement_type_get(self):
        """Test case for entity_vas_requirement_type_get

        EntityVasRequirementType_GET  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
