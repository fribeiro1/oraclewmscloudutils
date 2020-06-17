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
from swagger_client.api.entityitem_assignment_type_api import EntityitemAssignmentTypeApi  # noqa: E501
from swagger_client.rest import ApiException


class TestEntityitemAssignmentTypeApi(unittest.TestCase):
    """EntityitemAssignmentTypeApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.entityitem_assignment_type_api.EntityitemAssignmentTypeApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_entity_item_assignment_type_by_id_get(self):
        """Test case for entity_item_assignment_type_by_id_get

        EntityItemAssignmentTypeById_GET  # noqa: E501
        """
        pass

    def test_entity_item_assignment_type_describe_get(self):
        """Test case for entity_item_assignment_type_describe_get

        EntityItemAssignmentTypeDescribe_GET  # noqa: E501
        """
        pass

    def test_entity_item_assignment_type_get(self):
        """Test case for entity_item_assignment_type_get

        EntityItemAssignmentType_GET  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
