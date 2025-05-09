// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * SQL Server version.
 */
public final class SqlVersion extends ExpandableStringEnum<SqlVersion> {
    /**
     * Static value SQL Server 2019 for SqlVersion.
     */
    public static final SqlVersion SQL_SERVER_2019 = fromString("SQL Server 2019");

    /**
     * Static value SQL Server 2017 for SqlVersion.
     */
    public static final SqlVersion SQL_SERVER_2017 = fromString("SQL Server 2017");

    /**
     * Static value SQL Server 2016 for SqlVersion.
     */
    public static final SqlVersion SQL_SERVER_2016 = fromString("SQL Server 2016");

    /**
     * Creates a new instance of SqlVersion value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SqlVersion() {
    }

    /**
     * Creates or finds a SqlVersion from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SqlVersion.
     */
    public static SqlVersion fromString(String name) {
        return fromString(name, SqlVersion.class);
    }

    /**
     * Gets known SqlVersion values.
     * 
     * @return known SqlVersion values.
     */
    public static Collection<SqlVersion> values() {
        return values(SqlVersion.class);
    }
}
