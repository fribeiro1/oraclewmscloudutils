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
from swagger_client.api.entityob_stop_dtl_api import EntityobStopDtlApi  # noqa: E501
from swagger_client.rest import ApiException


class TestEntityobStopDtlApi(unittest.TestCase):
    """EntityobStopDtlApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.entityob_stop_dtl_api.EntityobStopDtlApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_entity_ob_stop_dtl_by_id_get(self):
        """Test case for entity_ob_stop_dtl_by_id_get

        EntityObStopDtlById_GET  # noqa: E501
        """
        pass

    def test_entity_ob_stop_dtl_describe_get(self):
        """Test case for entity_ob_stop_dtl_describe_get

        EntityObStopDtlDescribe_GET  # noqa: E501
        """
        pass

    def test_entity_ob_stop_dtl_get(self):
        """Test case for entity_ob_stop_dtl_get

        EntityObStopDtl_GET  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
