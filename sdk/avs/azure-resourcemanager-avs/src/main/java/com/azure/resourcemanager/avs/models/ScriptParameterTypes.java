// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Script Parameter types.
 */
public final class ScriptParameterTypes extends ExpandableStringEnum<ScriptParameterTypes> {
    /**
     * Static value String for ScriptParameterTypes.
     */
    public static final ScriptParameterTypes STRING = fromString("String");

    /**
     * Static value SecureString for ScriptParameterTypes.
     */
    public static final ScriptParameterTypes SECURE_STRING = fromString("SecureString");

    /**
     * Static value Credential for ScriptParameterTypes.
     */
    public static final ScriptParameterTypes CREDENTIAL = fromString("Credential");

    /**
     * Static value Int for ScriptParameterTypes.
     */
    public static final ScriptParameterTypes INT = fromString("Int");

    /**
     * Static value Bool for ScriptParameterTypes.
     */
    public static final ScriptParameterTypes BOOL = fromString("Bool");

    /**
     * Static value Float for ScriptParameterTypes.
     */
    public static final ScriptParameterTypes FLOAT = fromString("Float");

    /**
     * Creates a new instance of ScriptParameterTypes value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ScriptParameterTypes() {
    }

    /**
     * Creates or finds a ScriptParameterTypes from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ScriptParameterTypes.
     */
    public static ScriptParameterTypes fromString(String name) {
        return fromString(name, ScriptParameterTypes.class);
    }

    /**
     * Gets known ScriptParameterTypes values.
     * 
     * @return known ScriptParameterTypes values.
     */
    public static Collection<ScriptParameterTypes> values() {
        return values(ScriptParameterTypes.class);
    }
}
