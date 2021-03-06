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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for TraceLogLevel.
 */
public enum TraceLogLevel {
    /** Enum value Error. */
    ERROR("Error"),

    /** Enum value Information. */
    INFORMATION("Information"),

    /** Enum value Debug. */
    DEBUG("Debug"),

    /** Enum value Verbose. */
    VERBOSE("Verbose");

    /** The actual serialized value for a TraceLogLevel instance. */
    private String value;

    TraceLogLevel(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TraceLogLevel instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TraceLogLevel object, or null if unable to parse.
     */
    @JsonCreator
    public static TraceLogLevel fromString(String value) {
        TraceLogLevel[] items = TraceLogLevel.values();
        for (TraceLogLevel item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
