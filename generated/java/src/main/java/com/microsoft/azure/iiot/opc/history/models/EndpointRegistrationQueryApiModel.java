/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.iiot.opc.history.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Endpoint query.
 */
public class EndpointRegistrationQueryApiModel {
    /**
     * Endoint url for direct server access.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * Type of credential selected for authentication. Possible values include:
     * 'None', 'UserName', 'X509Certificate', 'JwtToken'.
     */
    @JsonProperty(value = "userAuthentication")
    private CredentialType userAuthentication;

    /**
     * Certificate of the endpoint.
     */
    @JsonProperty(value = "certificate")
    private byte[] certificate;

    /**
     * Security Mode. Possible values include: 'Best', 'Sign',
     * 'SignAndEncrypt', 'None'.
     */
    @JsonProperty(value = "securityMode")
    private SecurityMode securityMode;

    /**
     * Security policy uri.
     */
    @JsonProperty(value = "securityPolicy")
    private String securityPolicy;

    /**
     * Whether the endpoint was activated.
     */
    @JsonProperty(value = "activated")
    private Boolean activated;

    /**
     * Whether the endpoint is connected on supervisor.
     */
    @JsonProperty(value = "connected")
    private Boolean connected;

    /**
     * The last state of the the activated endpoint. Possible values include:
     * 'Connecting', 'NotReachable', 'Busy', 'NoTrust', 'CertificateInvalid',
     * 'Ready', 'Error'.
     */
    @JsonProperty(value = "endpointState")
    private EndpointConnectivityState endpointState;

    /**
     * Whether to include endpoints that were soft deleted.
     */
    @JsonProperty(value = "includeNotSeenSince")
    private Boolean includeNotSeenSince;

    /**
     * Get endoint url for direct server access.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set endoint url for direct server access.
     *
     * @param url the url value to set
     * @return the EndpointRegistrationQueryApiModel object itself.
     */
    public EndpointRegistrationQueryApiModel withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get type of credential selected for authentication. Possible values include: 'None', 'UserName', 'X509Certificate', 'JwtToken'.
     *
     * @return the userAuthentication value
     */
    public CredentialType userAuthentication() {
        return this.userAuthentication;
    }

    /**
     * Set type of credential selected for authentication. Possible values include: 'None', 'UserName', 'X509Certificate', 'JwtToken'.
     *
     * @param userAuthentication the userAuthentication value to set
     * @return the EndpointRegistrationQueryApiModel object itself.
     */
    public EndpointRegistrationQueryApiModel withUserAuthentication(CredentialType userAuthentication) {
        this.userAuthentication = userAuthentication;
        return this;
    }

    /**
     * Get certificate of the endpoint.
     *
     * @return the certificate value
     */
    public byte[] certificate() {
        return this.certificate;
    }

    /**
     * Set certificate of the endpoint.
     *
     * @param certificate the certificate value to set
     * @return the EndpointRegistrationQueryApiModel object itself.
     */
    public EndpointRegistrationQueryApiModel withCertificate(byte[] certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Get security Mode. Possible values include: 'Best', 'Sign', 'SignAndEncrypt', 'None'.
     *
     * @return the securityMode value
     */
    public SecurityMode securityMode() {
        return this.securityMode;
    }

    /**
     * Set security Mode. Possible values include: 'Best', 'Sign', 'SignAndEncrypt', 'None'.
     *
     * @param securityMode the securityMode value to set
     * @return the EndpointRegistrationQueryApiModel object itself.
     */
    public EndpointRegistrationQueryApiModel withSecurityMode(SecurityMode securityMode) {
        this.securityMode = securityMode;
        return this;
    }

    /**
     * Get security policy uri.
     *
     * @return the securityPolicy value
     */
    public String securityPolicy() {
        return this.securityPolicy;
    }

    /**
     * Set security policy uri.
     *
     * @param securityPolicy the securityPolicy value to set
     * @return the EndpointRegistrationQueryApiModel object itself.
     */
    public EndpointRegistrationQueryApiModel withSecurityPolicy(String securityPolicy) {
        this.securityPolicy = securityPolicy;
        return this;
    }

    /**
     * Get whether the endpoint was activated.
     *
     * @return the activated value
     */
    public Boolean activated() {
        return this.activated;
    }

    /**
     * Set whether the endpoint was activated.
     *
     * @param activated the activated value to set
     * @return the EndpointRegistrationQueryApiModel object itself.
     */
    public EndpointRegistrationQueryApiModel withActivated(Boolean activated) {
        this.activated = activated;
        return this;
    }

    /**
     * Get whether the endpoint is connected on supervisor.
     *
     * @return the connected value
     */
    public Boolean connected() {
        return this.connected;
    }

    /**
     * Set whether the endpoint is connected on supervisor.
     *
     * @param connected the connected value to set
     * @return the EndpointRegistrationQueryApiModel object itself.
     */
    public EndpointRegistrationQueryApiModel withConnected(Boolean connected) {
        this.connected = connected;
        return this;
    }

    /**
     * Get the last state of the the activated endpoint. Possible values include: 'Connecting', 'NotReachable', 'Busy', 'NoTrust', 'CertificateInvalid', 'Ready', 'Error'.
     *
     * @return the endpointState value
     */
    public EndpointConnectivityState endpointState() {
        return this.endpointState;
    }

    /**
     * Set the last state of the the activated endpoint. Possible values include: 'Connecting', 'NotReachable', 'Busy', 'NoTrust', 'CertificateInvalid', 'Ready', 'Error'.
     *
     * @param endpointState the endpointState value to set
     * @return the EndpointRegistrationQueryApiModel object itself.
     */
    public EndpointRegistrationQueryApiModel withEndpointState(EndpointConnectivityState endpointState) {
        this.endpointState = endpointState;
        return this;
    }

    /**
     * Get whether to include endpoints that were soft deleted.
     *
     * @return the includeNotSeenSince value
     */
    public Boolean includeNotSeenSince() {
        return this.includeNotSeenSince;
    }

    /**
     * Set whether to include endpoints that were soft deleted.
     *
     * @param includeNotSeenSince the includeNotSeenSince value to set
     * @return the EndpointRegistrationQueryApiModel object itself.
     */
    public EndpointRegistrationQueryApiModel withIncludeNotSeenSince(Boolean includeNotSeenSince) {
        this.includeNotSeenSince = includeNotSeenSince;
        return this;
    }

}
