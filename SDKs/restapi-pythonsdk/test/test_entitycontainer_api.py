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
from swagger_client.api.entitycontainer_api import EntitycontainerApi  # noqa: E501
from swagger_client.rest import ApiException


class TestEntitycontainerApi(unittest.TestCase):
    """EntitycontainerApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.entitycontainer_api.EntitycontainerApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_entity_container_bulk_lock_post(self):
        """Test case for entity_container_bulk_lock_post

        EntityContainerBulkLock_POST  # noqa: E501
        """
        pass

    def test_entity_container_bulk_unlock_post(self):
        """Test case for entity_container_bulk_unlock_post

        EntityContainerBulkUnlock_POST  # noqa: E501
        """
        pass

    def test_entity_container_by_id_get(self):
        """Test case for entity_container_by_id_get

        EntityContainerById_GET  # noqa: E501
        """
        pass

    def test_entity_container_by_id_patch(self):
        """Test case for entity_container_by_id_patch

        EntityContainerById_PATCH  # noqa: E501
        """
        pass

    def test_entity_container_depalletize_by_id_post(self):
        """Test case for entity_container_depalletize_by_id_post

        EntityContainerDepalletizeById_POST  # noqa: E501
        """
        pass

    def test_entity_container_depalletize_post(self):
        """Test case for entity_container_depalletize_post

        EntityContainerDepalletize_POST  # noqa: E501
        """
        pass

    def test_entity_container_describe_get(self):
        """Test case for entity_container_describe_get

        EntityContainerDescribe_GET  # noqa: E501
        """
        pass

    def test_entity_container_get(self):
        """Test case for entity_container_get

        EntityContainer_GET  # noqa: E501
        """
        pass

    def test_entity_container_lock_by_id_post(self):
        """Test case for entity_container_lock_by_id_post

        EntityContainerLockById_POST  # noqa: E501
        """
        pass

    def test_entity_container_orders_by_id_get(self):
        """Test case for entity_container_orders_by_id_get

        EntityContainerOrdersById_GET  # noqa: E501
        """
        pass

    def test_entity_container_palletize_by_id_post(self):
        """Test case for entity_container_palletize_by_id_post

        EntityContainerPalletizeById_POST  # noqa: E501
        """
        pass

    def test_entity_container_unlock_by_id_post(self):
        """Test case for entity_container_unlock_by_id_post

        EntityContainerUnlockById_POST  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
