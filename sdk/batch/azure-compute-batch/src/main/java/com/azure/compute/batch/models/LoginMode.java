// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * LoginMode enums.
 */
public final class LoginMode extends ExpandableStringEnum<LoginMode> {

    /**
     * The LOGON32_LOGON_BATCH Win32 login mode. The batch login mode is recommended for long running parallel
     * processes.
     */
    @Generated
    public static final LoginMode BATCH = fromString("batch");

    /**
     * The LOGON32_LOGON_INTERACTIVE Win32 login mode. UAC is enabled on Windows VirtualMachineConfiguration Pools. If
     * this option is used with an elevated user identity in a Windows VirtualMachineConfiguration Pool, the user
     * session will not be elevated unless the application executed by the Task command line is configured to always
     * require administrative privilege or to always require maximum privilege.
     */
    @Generated
    public static final LoginMode INTERACTIVE = fromString("interactive");

    /**
     * Creates a new instance of LoginMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public LoginMode() {
    }

    /**
     * Creates or finds a LoginMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LoginMode.
     */
    @Generated
    public static LoginMode fromString(String name) {
        return fromString(name, LoginMode.class);
    }

    /**
     * Gets known LoginMode values.
     *
     * @return known LoginMode values.
     */
    @Generated
    public static Collection<LoginMode> values() {
        return values(LoginMode.class);
    }
}
