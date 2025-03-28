// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Indicates whether this threshold will be displayed on cost charts.
 */
public final class CostThresholdStatus extends ExpandableStringEnum<CostThresholdStatus> {
    /**
     * Static value Enabled for CostThresholdStatus.
     */
    public static final CostThresholdStatus ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for CostThresholdStatus.
     */
    public static final CostThresholdStatus DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of CostThresholdStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CostThresholdStatus() {
    }

    /**
     * Creates or finds a CostThresholdStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CostThresholdStatus.
     */
    public static CostThresholdStatus fromString(String name) {
        return fromString(name, CostThresholdStatus.class);
    }

    /**
     * Gets known CostThresholdStatus values.
     * 
     * @return known CostThresholdStatus values.
     */
    public static Collection<CostThresholdStatus> values() {
        return values(CostThresholdStatus.class);
    }
}
