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

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application info model.
 */
public class ApplicationInfoApiModel {
    /**
     * Unique application id.
     */
    @JsonProperty(value = "applicationId")
    private String applicationId;

    /**
     * Type of application. Possible values include: 'Server', 'Client',
     * 'ClientAndServer'.
     */
    @JsonProperty(value = "applicationType")
    private ApplicationType applicationType;

    /**
     * Unique application uri.
     */
    @JsonProperty(value = "applicationUri")
    private String applicationUri;

    /**
     * Product uri.
     */
    @JsonProperty(value = "productUri")
    private String productUri;

    /**
     * Name of server.
     */
    @JsonProperty(value = "applicationName")
    private String applicationName;

    /**
     * Locale of name - defaults to "en".
     */
    @JsonProperty(value = "locale")
    private String locale;

    /**
     * Application public cert.
     */
    @JsonProperty(value = "certificate")
    private byte[] certificate;

    /**
     * The capabilities advertised by the server.
     */
    @JsonProperty(value = "capabilities")
    private List<String> capabilities;

    /**
     * Discovery urls of the server.
     */
    @JsonProperty(value = "discoveryUrls")
    private List<String> discoveryUrls;

    /**
     * Discovery profile uri.
     */
    @JsonProperty(value = "discoveryProfileUri")
    private String discoveryProfileUri;

    /**
     * Host addresses of server application or null.
     */
    @JsonProperty(value = "hostAddresses")
    private List<String> hostAddresses;

    /**
     * Site of the application.
     */
    @JsonProperty(value = "siteId")
    private String siteId;

    /**
     * Supervisor having registered the application.
     */
    @JsonProperty(value = "supervisorId")
    private String supervisorId;

    /**
     * Last time application was seen.
     */
    @JsonProperty(value = "notSeenSince")
    private DateTime notSeenSince;

    /**
     * Get unique application id.
     *
     * @return the applicationId value
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Set unique application id.
     *
     * @param applicationId the applicationId value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get type of application. Possible values include: 'Server', 'Client', 'ClientAndServer'.
     *
     * @return the applicationType value
     */
    public ApplicationType applicationType() {
        return this.applicationType;
    }

    /**
     * Set type of application. Possible values include: 'Server', 'Client', 'ClientAndServer'.
     *
     * @param applicationType the applicationType value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withApplicationType(ApplicationType applicationType) {
        this.applicationType = applicationType;
        return this;
    }

    /**
     * Get unique application uri.
     *
     * @return the applicationUri value
     */
    public String applicationUri() {
        return this.applicationUri;
    }

    /**
     * Set unique application uri.
     *
     * @param applicationUri the applicationUri value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withApplicationUri(String applicationUri) {
        this.applicationUri = applicationUri;
        return this;
    }

    /**
     * Get product uri.
     *
     * @return the productUri value
     */
    public String productUri() {
        return this.productUri;
    }

    /**
     * Set product uri.
     *
     * @param productUri the productUri value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withProductUri(String productUri) {
        this.productUri = productUri;
        return this;
    }

    /**
     * Get name of server.
     *
     * @return the applicationName value
     */
    public String applicationName() {
        return this.applicationName;
    }

    /**
     * Set name of server.
     *
     * @param applicationName the applicationName value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Get locale of name - defaults to "en".
     *
     * @return the locale value
     */
    public String locale() {
        return this.locale;
    }

    /**
     * Set locale of name - defaults to "en".
     *
     * @param locale the locale value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Get application public cert.
     *
     * @return the certificate value
     */
    public byte[] certificate() {
        return this.certificate;
    }

    /**
     * Set application public cert.
     *
     * @param certificate the certificate value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withCertificate(byte[] certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Get the capabilities advertised by the server.
     *
     * @return the capabilities value
     */
    public List<String> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities advertised by the server.
     *
     * @param capabilities the capabilities value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withCapabilities(List<String> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get discovery urls of the server.
     *
     * @return the discoveryUrls value
     */
    public List<String> discoveryUrls() {
        return this.discoveryUrls;
    }

    /**
     * Set discovery urls of the server.
     *
     * @param discoveryUrls the discoveryUrls value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withDiscoveryUrls(List<String> discoveryUrls) {
        this.discoveryUrls = discoveryUrls;
        return this;
    }

    /**
     * Get discovery profile uri.
     *
     * @return the discoveryProfileUri value
     */
    public String discoveryProfileUri() {
        return this.discoveryProfileUri;
    }

    /**
     * Set discovery profile uri.
     *
     * @param discoveryProfileUri the discoveryProfileUri value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withDiscoveryProfileUri(String discoveryProfileUri) {
        this.discoveryProfileUri = discoveryProfileUri;
        return this;
    }

    /**
     * Get host addresses of server application or null.
     *
     * @return the hostAddresses value
     */
    public List<String> hostAddresses() {
        return this.hostAddresses;
    }

    /**
     * Set host addresses of server application or null.
     *
     * @param hostAddresses the hostAddresses value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withHostAddresses(List<String> hostAddresses) {
        this.hostAddresses = hostAddresses;
        return this;
    }

    /**
     * Get site of the application.
     *
     * @return the siteId value
     */
    public String siteId() {
        return this.siteId;
    }

    /**
     * Set site of the application.
     *
     * @param siteId the siteId value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * Get supervisor having registered the application.
     *
     * @return the supervisorId value
     */
    public String supervisorId() {
        return this.supervisorId;
    }

    /**
     * Set supervisor having registered the application.
     *
     * @param supervisorId the supervisorId value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId;
        return this;
    }

    /**
     * Get last time application was seen.
     *
     * @return the notSeenSince value
     */
    public DateTime notSeenSince() {
        return this.notSeenSince;
    }

    /**
     * Set last time application was seen.
     *
     * @param notSeenSince the notSeenSince value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withNotSeenSince(DateTime notSeenSince) {
        this.notSeenSince = notSeenSince;
        return this;
    }

}
