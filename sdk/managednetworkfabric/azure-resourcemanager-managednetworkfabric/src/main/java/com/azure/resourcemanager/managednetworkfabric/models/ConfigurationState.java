// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Configuration state for the resource. */
public final class ConfigurationState extends ExpandableStringEnum<ConfigurationState> {
    /** Static value Succeeded for ConfigurationState. */
    public static final ConfigurationState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ConfigurationState. */
    public static final ConfigurationState FAILED = fromString("Failed");

    /** Static value Rejected for ConfigurationState. */
    public static final ConfigurationState REJECTED = fromString("Rejected");

    /** Static value Accepted for ConfigurationState. */
    public static final ConfigurationState ACCEPTED = fromString("Accepted");

    /** Static value Provisioned for ConfigurationState. */
    public static final ConfigurationState PROVISIONED = fromString("Provisioned");

    /** Static value ErrorProvisioning for ConfigurationState. */
    public static final ConfigurationState ERROR_PROVISIONING = fromString("ErrorProvisioning");

    /** Static value Deprovisioning for ConfigurationState. */
    public static final ConfigurationState DEPROVISIONING = fromString("Deprovisioning");

    /** Static value Deprovisioned for ConfigurationState. */
    public static final ConfigurationState DEPROVISIONED = fromString("Deprovisioned");

    /** Static value ErrorDeprovisioning for ConfigurationState. */
    public static final ConfigurationState ERROR_DEPROVISIONING = fromString("ErrorDeprovisioning");

    /** Static value DeferredControl for ConfigurationState. */
    public static final ConfigurationState DEFERRED_CONTROL = fromString("DeferredControl");

    /**
     * Creates a new instance of ConfigurationState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ConfigurationState() {
    }

    /**
     * Creates or finds a ConfigurationState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConfigurationState.
     */
    @JsonCreator
    public static ConfigurationState fromString(String name) {
        return fromString(name, ConfigurationState.class);
    }

    /**
     * Gets known ConfigurationState values.
     *
     * @return known ConfigurationState values.
     */
    public static Collection<ConfigurationState> values() {
        return values(ConfigurationState.class);
    }
}