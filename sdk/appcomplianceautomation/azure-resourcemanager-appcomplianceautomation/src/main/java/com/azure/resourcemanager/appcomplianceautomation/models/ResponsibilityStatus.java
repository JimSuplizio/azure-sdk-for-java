// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Indicates the customer responsibility status.
 */
public final class ResponsibilityStatus extends ExpandableStringEnum<ResponsibilityStatus> {
    /**
     * Static value Passed for ResponsibilityStatus.
     */
    public static final ResponsibilityStatus PASSED = fromString("Passed");

    /**
     * Static value Failed for ResponsibilityStatus.
     */
    public static final ResponsibilityStatus FAILED = fromString("Failed");

    /**
     * Static value NotApplicable for ResponsibilityStatus.
     */
    public static final ResponsibilityStatus NOT_APPLICABLE = fromString("NotApplicable");

    /**
     * Static value PendingApproval for ResponsibilityStatus.
     */
    public static final ResponsibilityStatus PENDING_APPROVAL = fromString("PendingApproval");

    /**
     * Creates a new instance of ResponsibilityStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ResponsibilityStatus() {
    }

    /**
     * Creates or finds a ResponsibilityStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ResponsibilityStatus.
     */
    public static ResponsibilityStatus fromString(String name) {
        return fromString(name, ResponsibilityStatus.class);
    }

    /**
     * Gets known ResponsibilityStatus values.
     * 
     * @return known ResponsibilityStatus values.
     */
    public static Collection<ResponsibilityStatus> values() {
        return values(ResponsibilityStatus.class);
    }
}
