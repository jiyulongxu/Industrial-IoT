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


class EndpointInfoListApiModel(Model):
    """Endpoint registration list.

    :param items: Endpoint registrations
    :type items: list[~azure-iiot-opc-history.models.EndpointInfoApiModel]
    :param continuation_token: Continuation or null if final
    :type continuation_token: str
    """

    _attribute_map = {
        'items': {'key': 'items', 'type': '[EndpointInfoApiModel]'},
        'continuation_token': {'key': 'continuationToken', 'type': 'str'},
    }

    def __init__(self, items=None, continuation_token=None):
        super(EndpointInfoListApiModel, self).__init__()
        self.items = items
        self.continuation_token = continuation_token
