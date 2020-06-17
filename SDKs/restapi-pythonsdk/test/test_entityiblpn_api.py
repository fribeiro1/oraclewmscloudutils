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
from swagger_client.api.entityiblpn_api import EntityiblpnApi  # noqa: E501
from swagger_client.rest import ApiException


class TestEntityiblpnApi(unittest.TestCase):
    """EntityiblpnApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.entityiblpn_api.EntityiblpnApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_entity_iblpn_by_id_get(self):
        """Test case for entity_iblpn_by_id_get

        EntityIblpnById_GET  # noqa: E501
        """
        pass

    def test_entity_iblpn_by_id_patch(self):
        """Test case for entity_iblpn_by_id_patch

        EntityIblpnById_PATCH  # noqa: E501
        """
        pass

    def test_entity_iblpn_composite_create_post(self):
        """Test case for entity_iblpn_composite_create_post

        EntityIblpnCompositeCreate_POST  # noqa: E501
        """
        pass

    def test_entity_iblpn_describe_get(self):
        """Test case for entity_iblpn_describe_get

        EntityIblpnDescribe_GET  # noqa: E501
        """
        pass

    def test_entity_iblpn_direct_consume_by_id_post(self):
        """Test case for entity_iblpn_direct_consume_by_id_post

        EntityIblpnDirectConsumeById_POST  # noqa: E501
        """
        pass

    def test_entity_iblpn_get(self):
        """Test case for entity_iblpn_get

        EntityIblpn_GET  # noqa: E501
        """
        pass

    def test_entity_iblpn_modify_item_qty_by_id_post(self):
        """Test case for entity_iblpn_modify_item_qty_by_id_post

        EntityIblpnModifyItemQtyById_POST  # noqa: E501
        """
        pass

    def test_entity_iblpn_modify_item_qty_post(self):
        """Test case for entity_iblpn_modify_item_qty_post

        EntityIblpnModifyItemQty_POST  # noqa: E501
        """
        pass

    def test_entity_iblpn_post(self):
        """Test case for entity_iblpn_post

        EntityIblpn_POST  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
