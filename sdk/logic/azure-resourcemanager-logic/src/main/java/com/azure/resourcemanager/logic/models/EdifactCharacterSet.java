// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The edifact character set.
 */
public final class EdifactCharacterSet extends ExpandableStringEnum<EdifactCharacterSet> {
    /**
     * Static value NotSpecified for EdifactCharacterSet.
     */
    public static final EdifactCharacterSet NOT_SPECIFIED = fromString("NotSpecified");

    /**
     * Static value UNOB for EdifactCharacterSet.
     */
    public static final EdifactCharacterSet UNOB = fromString("UNOB");

    /**
     * Static value UNOA for EdifactCharacterSet.
     */
    public static final EdifactCharacterSet UNOA = fromString("UNOA");

    /**
     * Static value UNOC for EdifactCharacterSet.
     */
    public static final EdifactCharacterSet UNOC = fromString("UNOC");

    /**
     * Static value UNOD for EdifactCharacterSet.
     */
    public static final EdifactCharacterSet UNOD = fromString("UNOD");

    /**
     * Static value UNOE for EdifactCharacterSet.
     */
    public static final EdifactCharacterSet UNOE = fromString("UNOE");

    /**
     * Static value UNOF for EdifactCharacterSet.
     */
    public static final EdifactCharacterSet UNOF = fromString("UNOF");

    /**
     * Static value UNOG for EdifactCharacterSet.
     */
    public static final EdifactCharacterSet UNOG = fromString("UNOG");

    /**
     * Static value UNOH for EdifactCharacterSet.
     */
    public static final EdifactCharacterSet UNOH = fromString("UNOH");

    /**
     * Static value UNOI for EdifactCharacterSet.
     */
    public static final EdifactCharacterSet UNOI = fromString("UNOI");

    /**
     * Static value UNOJ for EdifactCharacterSet.
     */
    public static final EdifactCharacterSet UNOJ = fromString("UNOJ");

    /**
     * Static value UNOK for EdifactCharacterSet.
     */
    public static final EdifactCharacterSet UNOK = fromString("UNOK");

    /**
     * Static value UNOX for EdifactCharacterSet.
     */
    public static final EdifactCharacterSet UNOX = fromString("UNOX");

    /**
     * Static value UNOY for EdifactCharacterSet.
     */
    public static final EdifactCharacterSet UNOY = fromString("UNOY");

    /**
     * Static value KECA for EdifactCharacterSet.
     */
    public static final EdifactCharacterSet KECA = fromString("KECA");

    /**
     * Creates a new instance of EdifactCharacterSet value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EdifactCharacterSet() {
    }

    /**
     * Creates or finds a EdifactCharacterSet from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EdifactCharacterSet.
     */
    public static EdifactCharacterSet fromString(String name) {
        return fromString(name, EdifactCharacterSet.class);
    }

    /**
     * Gets known EdifactCharacterSet values.
     * 
     * @return known EdifactCharacterSet values.
     */
    public static Collection<EdifactCharacterSet> values() {
        return values(EdifactCharacterSet.class);
    }
}
