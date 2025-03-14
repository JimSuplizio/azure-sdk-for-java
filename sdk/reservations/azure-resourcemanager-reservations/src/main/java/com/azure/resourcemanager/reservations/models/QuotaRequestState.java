// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The quota request status.
 */
public final class QuotaRequestState extends ExpandableStringEnum<QuotaRequestState> {
    /**
     * Static value Accepted for QuotaRequestState.
     */
    public static final QuotaRequestState ACCEPTED = fromString("Accepted");

    /**
     * Static value Invalid for QuotaRequestState.
     */
    public static final QuotaRequestState INVALID = fromString("Invalid");

    /**
     * Static value Succeeded for QuotaRequestState.
     */
    public static final QuotaRequestState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for QuotaRequestState.
     */
    public static final QuotaRequestState FAILED = fromString("Failed");

    /**
     * Static value InProgress for QuotaRequestState.
     */
    public static final QuotaRequestState IN_PROGRESS = fromString("InProgress");

    /**
     * Creates a new instance of QuotaRequestState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public QuotaRequestState() {
    }

    /**
     * Creates or finds a QuotaRequestState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding QuotaRequestState.
     */
    public static QuotaRequestState fromString(String name) {
        return fromString(name, QuotaRequestState.class);
    }

    /**
     * Gets known QuotaRequestState values.
     * 
     * @return known QuotaRequestState values.
     */
    public static Collection<QuotaRequestState> values() {
        return values(QuotaRequestState.class);
    }
}
