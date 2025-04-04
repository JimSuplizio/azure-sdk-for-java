// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Enforce a minimal Tls version for the server.
 */
public final class MinimalTlsVersionEnum extends ExpandableStringEnum<MinimalTlsVersionEnum> {
    /**
     * Static value TLS1_0 for MinimalTlsVersionEnum.
     */
    public static final MinimalTlsVersionEnum TLS1_0 = fromString("TLS1_0");

    /**
     * Static value TLS1_1 for MinimalTlsVersionEnum.
     */
    public static final MinimalTlsVersionEnum TLS1_1 = fromString("TLS1_1");

    /**
     * Static value TLS1_2 for MinimalTlsVersionEnum.
     */
    public static final MinimalTlsVersionEnum TLS1_2 = fromString("TLS1_2");

    /**
     * Static value TLSEnforcementDisabled for MinimalTlsVersionEnum.
     */
    public static final MinimalTlsVersionEnum TLSENFORCEMENT_DISABLED = fromString("TLSEnforcementDisabled");

    /**
     * Creates a new instance of MinimalTlsVersionEnum value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MinimalTlsVersionEnum() {
    }

    /**
     * Creates or finds a MinimalTlsVersionEnum from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MinimalTlsVersionEnum.
     */
    public static MinimalTlsVersionEnum fromString(String name) {
        return fromString(name, MinimalTlsVersionEnum.class);
    }

    /**
     * Gets known MinimalTlsVersionEnum values.
     * 
     * @return known MinimalTlsVersionEnum values.
     */
    public static Collection<MinimalTlsVersionEnum> values() {
        return values(MinimalTlsVersionEnum.class);
    }
}
