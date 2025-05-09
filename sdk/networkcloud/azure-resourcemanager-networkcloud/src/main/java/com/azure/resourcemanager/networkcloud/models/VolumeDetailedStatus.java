// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The more detailed status of the volume.
 */
public final class VolumeDetailedStatus extends ExpandableStringEnum<VolumeDetailedStatus> {
    /**
     * Static value Error for VolumeDetailedStatus.
     */
    public static final VolumeDetailedStatus ERROR = fromString("Error");

    /**
     * Static value Active for VolumeDetailedStatus.
     */
    public static final VolumeDetailedStatus ACTIVE = fromString("Active");

    /**
     * Static value Provisioning for VolumeDetailedStatus.
     */
    public static final VolumeDetailedStatus PROVISIONING = fromString("Provisioning");

    /**
     * Creates a new instance of VolumeDetailedStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VolumeDetailedStatus() {
    }

    /**
     * Creates or finds a VolumeDetailedStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VolumeDetailedStatus.
     */
    public static VolumeDetailedStatus fromString(String name) {
        return fromString(name, VolumeDetailedStatus.class);
    }

    /**
     * Gets known VolumeDetailedStatus values.
     * 
     * @return known VolumeDetailedStatus values.
     */
    public static Collection<VolumeDetailedStatus> values() {
        return values(VolumeDetailedStatus.class);
    }
}
