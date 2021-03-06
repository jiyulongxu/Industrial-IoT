# encoding: utf-8
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module azure.iiot.opc.twin
  module Models
    #
    # Credential model
    #
    class CredentialApiModel
      # @return [CredentialType] Possible values include: 'None', 'UserName',
      # 'X509Certificate', 'JwtToken'
      attr_accessor :type

      # @return Value to pass to server
      attr_accessor :value


      #
      # Mapper for CredentialApiModel class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'CredentialApiModel',
          type: {
            name: 'Composite',
            class_name: 'CredentialApiModel',
            model_properties: {
              type: {
                client_side_validation: true,
                required: false,
                serialized_name: 'type',
                type: {
                  name: 'Enum',
                  module: 'CredentialType'
                }
              },
              value: {
                client_side_validation: true,
                required: false,
                serialized_name: 'value',
                type: {
                  name: 'Object'
                }
              }
            }
          }
        }
      end
    end
  end
end
