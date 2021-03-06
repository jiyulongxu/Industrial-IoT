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
 * Result of node browse continuation
 *
 */
class BrowseNextResponseApiModel {
  /**
   * Create a BrowseNextResponseApiModel.
   * @property {array} [references] References, if included, otherwise null.
   * @property {string} [continuationToken] Continuation token if more results
   * pending.
   * @property {object} [errorInfo]
   * @property {number} [errorInfo.statusCode] Error code - if null operation
   * succeeded.
   * @property {string} [errorInfo.errorMessage] Error message in case of error
   * or null.
   * @property {object} [errorInfo.diagnostics] Additional diagnostics
   * information
   */
  constructor() {
  }

  /**
   * Defines the metadata of BrowseNextResponseApiModel
   *
   * @returns {object} metadata of BrowseNextResponseApiModel
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'BrowseNextResponseApiModel',
      type: {
        name: 'Composite',
        className: 'BrowseNextResponseApiModel',
        modelProperties: {
          references: {
            required: false,
            serializedName: 'references',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'NodeReferenceApiModelElementType',
                  type: {
                    name: 'Composite',
                    className: 'NodeReferenceApiModel'
                  }
              }
            }
          },
          continuationToken: {
            required: false,
            serializedName: 'continuationToken',
            type: {
              name: 'String'
            }
          },
          errorInfo: {
            required: false,
            serializedName: 'errorInfo',
            type: {
              name: 'Composite',
              className: 'ServiceResultApiModel'
            }
          }
        }
      }
    };
  }
}

module.exports = BrowseNextResponseApiModel;
