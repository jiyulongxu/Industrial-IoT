/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.iiot.opc.twin.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * browse response model.
 */
public class BrowseResponseApiModel {
    /**
     * The node property.
     */
    @JsonProperty(value = "node")
    private NodeApiModel node;

    /**
     * References, if included, otherwise null.
     */
    @JsonProperty(value = "references")
    private List<NodeReferenceApiModel> references;

    /**
     * Continuation token if more results pending.
     */
    @JsonProperty(value = "continuationToken")
    private String continuationToken;

    /**
     * The errorInfo property.
     */
    @JsonProperty(value = "errorInfo")
    private ServiceResultApiModel errorInfo;

    /**
     * Get the node value.
     *
     * @return the node value
     */
    public NodeApiModel node() {
        return this.node;
    }

    /**
     * Set the node value.
     *
     * @param node the node value to set
     * @return the BrowseResponseApiModel object itself.
     */
    public BrowseResponseApiModel withNode(NodeApiModel node) {
        this.node = node;
        return this;
    }

    /**
     * Get references, if included, otherwise null.
     *
     * @return the references value
     */
    public List<NodeReferenceApiModel> references() {
        return this.references;
    }

    /**
     * Set references, if included, otherwise null.
     *
     * @param references the references value to set
     * @return the BrowseResponseApiModel object itself.
     */
    public BrowseResponseApiModel withReferences(List<NodeReferenceApiModel> references) {
        this.references = references;
        return this;
    }

    /**
     * Get continuation token if more results pending.
     *
     * @return the continuationToken value
     */
    public String continuationToken() {
        return this.continuationToken;
    }

    /**
     * Set continuation token if more results pending.
     *
     * @param continuationToken the continuationToken value to set
     * @return the BrowseResponseApiModel object itself.
     */
    public BrowseResponseApiModel withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * Get the errorInfo value.
     *
     * @return the errorInfo value
     */
    public ServiceResultApiModel errorInfo() {
        return this.errorInfo;
    }

    /**
     * Set the errorInfo value.
     *
     * @param errorInfo the errorInfo value to set
     * @return the BrowseResponseApiModel object itself.
     */
    public BrowseResponseApiModel withErrorInfo(ServiceResultApiModel errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

}
