// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * SecurityEncryptionTypes enums.
 */
public final class SecurityEncryptionTypes extends ExpandableStringEnum<SecurityEncryptionTypes> {

    /**
     * NonPersistedTPM.
     */
    @Generated
    public static final SecurityEncryptionTypes NON_PERSISTED_TPM = fromString("NonPersistedTPM");

    /**
     * VMGuestStateOnly.
     */
    @Generated
    public static final SecurityEncryptionTypes VMGUEST_STATE_ONLY = fromString("VMGuestStateOnly");

    /**
     * Creates a new instance of SecurityEncryptionTypes value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public SecurityEncryptionTypes() {
    }

    /**
     * Creates or finds a SecurityEncryptionTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SecurityEncryptionTypes.
     */
    @Generated
    public static SecurityEncryptionTypes fromString(String name) {
        return fromString(name, SecurityEncryptionTypes.class);
    }

    /**
     * Gets known SecurityEncryptionTypes values.
     *
     * @return known SecurityEncryptionTypes values.
     */
    @Generated
    public static Collection<SecurityEncryptionTypes> values() {
        return values(SecurityEncryptionTypes.class);
    }
}
