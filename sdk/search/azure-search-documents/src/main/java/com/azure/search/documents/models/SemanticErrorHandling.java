// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/** Allows the user to choose whether a semantic call should fail completely, or to return partial results. */
public final class SemanticErrorHandling extends ExpandableStringEnum<SemanticErrorHandling> {
    /**
     * If the semantic processing fails, partial results still return. The definition of partial results depends on what
     * semantic step failed and what was the reason for failure.
     */
    public static final SemanticErrorHandling PARTIAL = fromString("partial");

    /**
     * If there is an exception during the semantic processing step, the query will fail and return the appropriate HTTP
     * code depending on the error.
     */
    public static final SemanticErrorHandling FAIL = fromString("fail");

    /**
     * Creates a new instance of SemanticErrorHandling value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SemanticErrorHandling() {}

    /**
     * Creates or finds a SemanticErrorHandling from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SemanticErrorHandling.
     */
    public static SemanticErrorHandling fromString(String name) {
        return fromString(name, SemanticErrorHandling.class);
    }

    /**
     * Gets known SemanticErrorHandling values.
     *
     * @return known SemanticErrorHandling values.
     */
    public static Collection<SemanticErrorHandling> values() {
        return values(SemanticErrorHandling.class);
    }
}