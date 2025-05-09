// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devopsinfrastructure.fluent.PoolsClient;
import com.azure.resourcemanager.devopsinfrastructure.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.devopsinfrastructure.fluent.models.PoolInner;
import com.azure.resourcemanager.devopsinfrastructure.models.CheckNameAvailability;
import com.azure.resourcemanager.devopsinfrastructure.models.CheckNameAvailabilityResult;
import com.azure.resourcemanager.devopsinfrastructure.models.Pool;
import com.azure.resourcemanager.devopsinfrastructure.models.Pools;

public final class PoolsImpl implements Pools {
    private static final ClientLogger LOGGER = new ClientLogger(PoolsImpl.class);

    private final PoolsClient innerClient;

    private final com.azure.resourcemanager.devopsinfrastructure.DevOpsInfrastructureManager serviceManager;

    public PoolsImpl(PoolsClient innerClient,
        com.azure.resourcemanager.devopsinfrastructure.DevOpsInfrastructureManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Pool> getByResourceGroupWithResponse(String resourceGroupName, String poolName, Context context) {
        Response<PoolInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, poolName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PoolImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Pool getByResourceGroup(String resourceGroupName, String poolName) {
        PoolInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, poolName);
        if (inner != null) {
            return new PoolImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String poolName) {
        this.serviceClient().delete(resourceGroupName, poolName);
    }

    public void delete(String resourceGroupName, String poolName, Context context) {
        this.serviceClient().delete(resourceGroupName, poolName, context);
    }

    public PagedIterable<Pool> listByResourceGroup(String resourceGroupName) {
        PagedIterable<PoolInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PoolImpl(inner1, this.manager()));
    }

    public PagedIterable<Pool> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<PoolInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PoolImpl(inner1, this.manager()));
    }

    public PagedIterable<Pool> list() {
        PagedIterable<PoolInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PoolImpl(inner1, this.manager()));
    }

    public PagedIterable<Pool> list(Context context) {
        PagedIterable<PoolInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PoolImpl(inner1, this.manager()));
    }

    public Response<CheckNameAvailabilityResult> checkNameAvailabilityWithResponse(CheckNameAvailability body,
        Context context) {
        Response<CheckNameAvailabilityResultInner> inner
            = this.serviceClient().checkNameAvailabilityWithResponse(body, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new CheckNameAvailabilityResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckNameAvailabilityResult checkNameAvailability(CheckNameAvailability body) {
        CheckNameAvailabilityResultInner inner = this.serviceClient().checkNameAvailability(body);
        if (inner != null) {
            return new CheckNameAvailabilityResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Pool getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String poolName = ResourceManagerUtils.getValueFromIdByName(id, "pools");
        if (poolName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'pools'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, poolName, Context.NONE).getValue();
    }

    public Response<Pool> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String poolName = ResourceManagerUtils.getValueFromIdByName(id, "pools");
        if (poolName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'pools'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, poolName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String poolName = ResourceManagerUtils.getValueFromIdByName(id, "pools");
        if (poolName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'pools'.", id)));
        }
        this.delete(resourceGroupName, poolName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String poolName = ResourceManagerUtils.getValueFromIdByName(id, "pools");
        if (poolName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'pools'.", id)));
        }
        this.delete(resourceGroupName, poolName, context);
    }

    private PoolsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.devopsinfrastructure.DevOpsInfrastructureManager manager() {
        return this.serviceManager;
    }

    public PoolImpl define(String name) {
        return new PoolImpl(name, this.manager());
    }
}
