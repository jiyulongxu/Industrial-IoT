# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator 2.3.33.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class DiscoveryRequestApiModel(Model):
    """Discovery request.

    :param id: Id of discovery request
    :type id: str
    :param discovery: Discovery mode to use. Possible values include: 'Off',
     'Local', 'Network', 'Fast', 'Scan'
    :type discovery: str or ~azure-iiot-opc-history.models.DiscoveryMode
    :param configuration: Scan configuration to use
    :type configuration:
     ~azure-iiot-opc-history.models.DiscoveryConfigApiModel
    """

    _attribute_map = {
        'id': {'key': 'id', 'type': 'str'},
        'discovery': {'key': 'discovery', 'type': 'DiscoveryMode'},
        'configuration': {'key': 'configuration', 'type': 'DiscoveryConfigApiModel'},
    }

    def __init__(self, id=None, discovery=None, configuration=None):
        super(DiscoveryRequestApiModel, self).__init__()
        self.id = id
        self.discovery = discovery
        self.configuration = configuration
