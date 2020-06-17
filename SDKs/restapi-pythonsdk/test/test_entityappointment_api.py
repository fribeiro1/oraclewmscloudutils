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
from swagger_client.api.entityappointment_api import EntityappointmentApi  # noqa: E501
from swagger_client.rest import ApiException


class TestEntityappointmentApi(unittest.TestCase):
    """EntityappointmentApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.entityappointment_api.EntityappointmentApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_entity_appointment_by_id_get(self):
        """Test case for entity_appointment_by_id_get

        EntityAppointmentById_GET  # noqa: E501
        """
        pass

    def test_entity_appointment_by_id_patch(self):
        """Test case for entity_appointment_by_id_patch

        EntityAppointmentById_PATCH  # noqa: E501
        """
        pass

    def test_entity_appointment_describe_get(self):
        """Test case for entity_appointment_describe_get

        EntityAppointmentDescribe_GET  # noqa: E501
        """
        pass

    def test_entity_appointment_get(self):
        """Test case for entity_appointment_get

        EntityAppointment_GET  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()