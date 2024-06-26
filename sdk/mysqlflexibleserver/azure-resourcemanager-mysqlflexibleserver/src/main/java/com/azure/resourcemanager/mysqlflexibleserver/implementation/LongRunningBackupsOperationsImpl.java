// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.LongRunningBackupsOperationsClient;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ServerBackupV2Inner;
import com.azure.resourcemanager.mysqlflexibleserver.models.LongRunningBackupsOperations;
import com.azure.resourcemanager.mysqlflexibleserver.models.ServerBackupV2;

public final class LongRunningBackupsOperationsImpl implements LongRunningBackupsOperations {
    private static final ClientLogger LOGGER = new ClientLogger(LongRunningBackupsOperationsImpl.class);

    private final LongRunningBackupsOperationsClient innerClient;

    private final com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager;

    public LongRunningBackupsOperationsImpl(LongRunningBackupsOperationsClient innerClient,
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ServerBackupV2> getWithResponse(String resourceGroupName, String serverName, String backupName,
        Context context) {
        Response<ServerBackupV2Inner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, serverName, backupName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ServerBackupV2Impl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ServerBackupV2 get(String resourceGroupName, String serverName, String backupName) {
        ServerBackupV2Inner inner = this.serviceClient().get(resourceGroupName, serverName, backupName);
        if (inner != null) {
            return new ServerBackupV2Impl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ServerBackupV2> list(String resourceGroupName, String serverName) {
        PagedIterable<ServerBackupV2Inner> inner = this.serviceClient().list(resourceGroupName, serverName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ServerBackupV2Impl(inner1, this.manager()));
    }

    public PagedIterable<ServerBackupV2> list(String resourceGroupName, String serverName, Context context) {
        PagedIterable<ServerBackupV2Inner> inner = this.serviceClient().list(resourceGroupName, serverName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ServerBackupV2Impl(inner1, this.manager()));
    }

    private LongRunningBackupsOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager() {
        return this.serviceManager;
    }
}
