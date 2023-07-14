// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The status of the worker selector. */
public final class RouterWorkerSelectorStatusInternal extends ExpandableStringEnum<RouterWorkerSelectorStatusInternal> {
    /** Static value active for RouterWorkerSelectorStatusInternal. */
    public static final RouterWorkerSelectorStatusInternal ACTIVE = fromString("active");

    /** Static value expired for RouterWorkerSelectorStatusInternal. */
    public static final RouterWorkerSelectorStatusInternal EXPIRED = fromString("expired");

    /**
     * Creates a new instance of RouterWorkerSelectorStatusInternal value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RouterWorkerSelectorStatusInternal() {}

    /**
     * Creates or finds a RouterWorkerSelectorStatusInternal from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RouterWorkerSelectorStatusInternal.
     */
    @JsonCreator
    public static RouterWorkerSelectorStatusInternal fromString(String name) {
        return fromString(name, RouterWorkerSelectorStatusInternal.class);
    }

    /**
     * Gets known RouterWorkerSelectorStatusInternal values.
     *
     * @return known RouterWorkerSelectorStatusInternal values.
     */
    public static Collection<RouterWorkerSelectorStatusInternal> values() {
        return values(RouterWorkerSelectorStatusInternal.class);
    }
}