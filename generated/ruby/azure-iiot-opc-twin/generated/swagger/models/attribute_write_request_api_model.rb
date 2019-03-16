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
    # Attribute and value to write to it
    #
    class AttributeWriteRequestApiModel
      # @return [String] Node to write to (mandatory)
      attr_accessor :node_id

      # @return [NodeAttribute] Attribute to write (mandatory). Possible values
      # include: 'NodeClass', 'BrowseName', 'DisplayName', 'Description',
      # 'WriteMask', 'UserWriteMask', 'IsAbstract', 'Symmetric', 'InverseName',
      # 'ContainsNoLoops', 'EventNotifier', 'Value', 'DataType', 'ValueRank',
      # 'ArrayDimensions', 'AccessLevel', 'UserAccessLevel',
      # 'MinimumSamplingInterval', 'Historizing', 'Executable',
      # 'UserExecutable', 'DataTypeDefinition', 'RolePermissions',
      # 'UserRolePermissions', 'AccessRestrictions'
      attr_accessor :attribute

      # @return Value to write (mandatory)
      attr_accessor :value


      #
      # Mapper for AttributeWriteRequestApiModel class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'AttributeWriteRequestApiModel',
          type: {
            name: 'Composite',
            class_name: 'AttributeWriteRequestApiModel',
            model_properties: {
              node_id: {
                client_side_validation: true,
                required: true,
                serialized_name: 'nodeId',
                type: {
                  name: 'String'
                }
              },
              attribute: {
                client_side_validation: true,
                required: true,
                serialized_name: 'attribute',
                type: {
                  name: 'Enum',
                  module: 'NodeAttribute'
                }
              },
              value: {
                client_side_validation: true,
                required: true,
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
