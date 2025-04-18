// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Status Codes for the Firewall.
 */
public final class HealthStatus extends ExpandableStringEnum<HealthStatus> {
    /**
     * Static value GREEN for HealthStatus.
     */
    public static final HealthStatus GREEN = fromString("GREEN");

    /**
     * Static value YELLOW for HealthStatus.
     */
    public static final HealthStatus YELLOW = fromString("YELLOW");

    /**
     * Static value RED for HealthStatus.
     */
    public static final HealthStatus RED = fromString("RED");

    /**
     * Static value INITIALIZING for HealthStatus.
     */
    public static final HealthStatus INITIALIZING = fromString("INITIALIZING");

    /**
     * Creates a new instance of HealthStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public HealthStatus() {
    }

    /**
     * Creates or finds a HealthStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding HealthStatus.
     */
    public static HealthStatus fromString(String name) {
        return fromString(name, HealthStatus.class);
    }

    /**
     * Gets known HealthStatus values.
     * 
     * @return known HealthStatus values.
     */
    public static Collection<HealthStatus> values() {
        return values(HealthStatus.class);
    }
}
