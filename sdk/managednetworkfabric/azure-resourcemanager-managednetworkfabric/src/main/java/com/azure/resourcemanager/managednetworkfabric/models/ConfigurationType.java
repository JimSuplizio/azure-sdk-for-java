// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Input method to configure Access Control List.
 */
public final class ConfigurationType extends ExpandableStringEnum<ConfigurationType> {
    /**
     * Static value File for ConfigurationType.
     */
    public static final ConfigurationType FILE = fromString("File");

    /**
     * Static value Inline for ConfigurationType.
     */
    public static final ConfigurationType INLINE = fromString("Inline");

    /**
     * Creates a new instance of ConfigurationType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ConfigurationType() {
    }

    /**
     * Creates or finds a ConfigurationType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ConfigurationType.
     */
    public static ConfigurationType fromString(String name) {
        return fromString(name, ConfigurationType.class);
    }

    /**
     * Gets known ConfigurationType values.
     * 
     * @return known ConfigurationType values.
     */
    public static Collection<ConfigurationType> values() {
        return values(ConfigurationType.class);
    }
}
