/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Discoverer registration query
 *
 */
class DiscovererQueryApiModel {
  /**
   * Create a DiscovererQueryApiModel.
   * @property {string} [siteId] Site of the discoverer
   * @property {string} [discovery] Possible values include: 'Off', 'Local',
   * 'Network', 'Fast', 'Scan'
   * @property {boolean} [connected] Included connected or disconnected
   */
  constructor() {
  }

  /**
   * Defines the metadata of DiscovererQueryApiModel
   *
   * @returns {object} metadata of DiscovererQueryApiModel
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'DiscovererQueryApiModel',
      type: {
        name: 'Composite',
        className: 'DiscovererQueryApiModel',
        modelProperties: {
          siteId: {
            required: false,
            serializedName: 'siteId',
            type: {
              name: 'String'
            }
          },
          discovery: {
            required: false,
            serializedName: 'discovery',
            type: {
              name: 'Enum',
              allowedValues: [ 'Off', 'Local', 'Network', 'Fast', 'Scan' ]
            }
          },
          connected: {
            required: false,
            serializedName: 'connected',
            type: {
              name: 'Boolean'
            }
          }
        }
      }
    };
  }
}

module.exports = DiscovererQueryApiModel;
