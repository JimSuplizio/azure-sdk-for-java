// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.appconfiguration.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The desired status of the snapshot.
 */
public final class ConfigurationSnapshotStatus extends ExpandableStringEnum<ConfigurationSnapshotStatus> {
    /**
     * Static value provisioning for ConfigurationSnapshotStatus.
     */
    public static final ConfigurationSnapshotStatus PROVISIONING = fromString("provisioning");

    /**
     * Static value ready for ConfigurationSnapshotStatus.
     */
    public static final ConfigurationSnapshotStatus READY = fromString("ready");

    /**
     * Static value archived for ConfigurationSnapshotStatus.
     */
    public static final ConfigurationSnapshotStatus ARCHIVED = fromString("archived");

    /**
     * Static value failed for ConfigurationSnapshotStatus.
     */
    public static final ConfigurationSnapshotStatus FAILED = fromString("failed");

    /**
     * Creates a new instance of ConfigurationSnapshotStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ConfigurationSnapshotStatus() {
    }

    /**
     * Creates or finds a ConfigurationSnapshotStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ConfigurationSnapshotStatus.
     */
    public static ConfigurationSnapshotStatus fromString(String name) {
        return fromString(name, ConfigurationSnapshotStatus.class);
    }

    /**
     * Gets known ConfigurationSnapshotStatus values.
     * 
     * @return known ConfigurationSnapshotStatus values.
     */
    public static Collection<ConfigurationSnapshotStatus> values() {
        return values(ConfigurationSnapshotStatus.class);
    }
}
