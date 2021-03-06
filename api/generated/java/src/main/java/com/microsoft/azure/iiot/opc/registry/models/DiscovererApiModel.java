/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.iiot.opc.registry.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Discoverer registration model.
 */
public class DiscovererApiModel {
    /**
     * Discoverer id.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Site of the discoverer.
     */
    @JsonProperty(value = "siteId")
    private String siteId;

    /**
     * Possible values include: 'Off', 'Local', 'Network', 'Fast', 'Scan'.
     */
    @JsonProperty(value = "discovery")
    private DiscoveryMode discovery;

    /**
     * The discoveryConfig property.
     */
    @JsonProperty(value = "discoveryConfig")
    private DiscoveryConfigApiModel discoveryConfig;

    /**
     * Possible values include: 'Error', 'Information', 'Debug', 'Verbose'.
     */
    @JsonProperty(value = "logLevel")
    private TraceLogLevel logLevel;

    /**
     * Whether the registration is out of sync between
     * client (module) and server (service) (default: false).
     */
    @JsonProperty(value = "outOfSync")
    private Boolean outOfSync;

    /**
     * Whether discoverer is connected on this registration.
     */
    @JsonProperty(value = "connected")
    private Boolean connected;

    /**
     * Get discoverer id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set discoverer id.
     *
     * @param id the id value to set
     * @return the DiscovererApiModel object itself.
     */
    public DiscovererApiModel withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get site of the discoverer.
     *
     * @return the siteId value
     */
    public String siteId() {
        return this.siteId;
    }

    /**
     * Set site of the discoverer.
     *
     * @param siteId the siteId value to set
     * @return the DiscovererApiModel object itself.
     */
    public DiscovererApiModel withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * Get possible values include: 'Off', 'Local', 'Network', 'Fast', 'Scan'.
     *
     * @return the discovery value
     */
    public DiscoveryMode discovery() {
        return this.discovery;
    }

    /**
     * Set possible values include: 'Off', 'Local', 'Network', 'Fast', 'Scan'.
     *
     * @param discovery the discovery value to set
     * @return the DiscovererApiModel object itself.
     */
    public DiscovererApiModel withDiscovery(DiscoveryMode discovery) {
        this.discovery = discovery;
        return this;
    }

    /**
     * Get the discoveryConfig value.
     *
     * @return the discoveryConfig value
     */
    public DiscoveryConfigApiModel discoveryConfig() {
        return this.discoveryConfig;
    }

    /**
     * Set the discoveryConfig value.
     *
     * @param discoveryConfig the discoveryConfig value to set
     * @return the DiscovererApiModel object itself.
     */
    public DiscovererApiModel withDiscoveryConfig(DiscoveryConfigApiModel discoveryConfig) {
        this.discoveryConfig = discoveryConfig;
        return this;
    }

    /**
     * Get possible values include: 'Error', 'Information', 'Debug', 'Verbose'.
     *
     * @return the logLevel value
     */
    public TraceLogLevel logLevel() {
        return this.logLevel;
    }

    /**
     * Set possible values include: 'Error', 'Information', 'Debug', 'Verbose'.
     *
     * @param logLevel the logLevel value to set
     * @return the DiscovererApiModel object itself.
     */
    public DiscovererApiModel withLogLevel(TraceLogLevel logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * Get whether the registration is out of sync between
     client (module) and server (service) (default: false).
     *
     * @return the outOfSync value
     */
    public Boolean outOfSync() {
        return this.outOfSync;
    }

    /**
     * Set whether the registration is out of sync between
     client (module) and server (service) (default: false).
     *
     * @param outOfSync the outOfSync value to set
     * @return the DiscovererApiModel object itself.
     */
    public DiscovererApiModel withOutOfSync(Boolean outOfSync) {
        this.outOfSync = outOfSync;
        return this;
    }

    /**
     * Get whether discoverer is connected on this registration.
     *
     * @return the connected value
     */
    public Boolean connected() {
        return this.connected;
    }

    /**
     * Set whether discoverer is connected on this registration.
     *
     * @param connected the connected value to set
     * @return the DiscovererApiModel object itself.
     */
    public DiscovererApiModel withConnected(Boolean connected) {
        this.connected = connected;
        return this;
    }

}
