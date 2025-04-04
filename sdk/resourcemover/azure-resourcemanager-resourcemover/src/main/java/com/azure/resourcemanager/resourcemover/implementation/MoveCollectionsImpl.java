// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resourcemover.fluent.MoveCollectionsClient;
import com.azure.resourcemanager.resourcemover.fluent.models.MoveCollectionInner;
import com.azure.resourcemanager.resourcemover.fluent.models.OperationStatusInner;
import com.azure.resourcemanager.resourcemover.fluent.models.RequiredForResourcesCollectionInner;
import com.azure.resourcemanager.resourcemover.models.BulkRemoveRequest;
import com.azure.resourcemanager.resourcemover.models.CommitRequest;
import com.azure.resourcemanager.resourcemover.models.DiscardRequest;
import com.azure.resourcemanager.resourcemover.models.MoveCollection;
import com.azure.resourcemanager.resourcemover.models.MoveCollections;
import com.azure.resourcemanager.resourcemover.models.OperationStatus;
import com.azure.resourcemanager.resourcemover.models.PrepareRequest;
import com.azure.resourcemanager.resourcemover.models.RequiredForResourcesCollection;
import com.azure.resourcemanager.resourcemover.models.ResourceMoveRequest;

public final class MoveCollectionsImpl implements MoveCollections {
    private static final ClientLogger LOGGER = new ClientLogger(MoveCollectionsImpl.class);

    private final MoveCollectionsClient innerClient;

    private final com.azure.resourcemanager.resourcemover.ResourceMoverManager serviceManager;

    public MoveCollectionsImpl(MoveCollectionsClient innerClient,
        com.azure.resourcemanager.resourcemover.ResourceMoverManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public OperationStatus deleteByResourceGroup(String resourceGroupName, String moveCollectionName) {
        OperationStatusInner inner = this.serviceClient().delete(resourceGroupName, moveCollectionName);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatus delete(String resourceGroupName, String moveCollectionName, Context context) {
        OperationStatusInner inner = this.serviceClient().delete(resourceGroupName, moveCollectionName, context);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MoveCollection> getByResourceGroupWithResponse(String resourceGroupName, String moveCollectionName,
        Context context) {
        Response<MoveCollectionInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, moveCollectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new MoveCollectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public MoveCollection getByResourceGroup(String resourceGroupName, String moveCollectionName) {
        MoveCollectionInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, moveCollectionName);
        if (inner != null) {
            return new MoveCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatus prepare(String resourceGroupName, String moveCollectionName) {
        OperationStatusInner inner = this.serviceClient().prepare(resourceGroupName, moveCollectionName);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatus prepare(String resourceGroupName, String moveCollectionName, PrepareRequest body,
        Context context) {
        OperationStatusInner inner = this.serviceClient().prepare(resourceGroupName, moveCollectionName, body, context);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatus initiateMove(String resourceGroupName, String moveCollectionName) {
        OperationStatusInner inner = this.serviceClient().initiateMove(resourceGroupName, moveCollectionName);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatus initiateMove(String resourceGroupName, String moveCollectionName, ResourceMoveRequest body,
        Context context) {
        OperationStatusInner inner
            = this.serviceClient().initiateMove(resourceGroupName, moveCollectionName, body, context);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatus commit(String resourceGroupName, String moveCollectionName) {
        OperationStatusInner inner = this.serviceClient().commit(resourceGroupName, moveCollectionName);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatus commit(String resourceGroupName, String moveCollectionName, CommitRequest body,
        Context context) {
        OperationStatusInner inner = this.serviceClient().commit(resourceGroupName, moveCollectionName, body, context);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatus discard(String resourceGroupName, String moveCollectionName) {
        OperationStatusInner inner = this.serviceClient().discard(resourceGroupName, moveCollectionName);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatus discard(String resourceGroupName, String moveCollectionName, DiscardRequest body,
        Context context) {
        OperationStatusInner inner = this.serviceClient().discard(resourceGroupName, moveCollectionName, body, context);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatus resolveDependencies(String resourceGroupName, String moveCollectionName) {
        OperationStatusInner inner = this.serviceClient().resolveDependencies(resourceGroupName, moveCollectionName);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatus resolveDependencies(String resourceGroupName, String moveCollectionName, Context context) {
        OperationStatusInner inner
            = this.serviceClient().resolveDependencies(resourceGroupName, moveCollectionName, context);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatus bulkRemove(String resourceGroupName, String moveCollectionName) {
        OperationStatusInner inner = this.serviceClient().bulkRemove(resourceGroupName, moveCollectionName);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatus bulkRemove(String resourceGroupName, String moveCollectionName, BulkRemoveRequest body,
        Context context) {
        OperationStatusInner inner
            = this.serviceClient().bulkRemove(resourceGroupName, moveCollectionName, body, context);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<MoveCollection> list() {
        PagedIterable<MoveCollectionInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new MoveCollectionImpl(inner1, this.manager()));
    }

    public PagedIterable<MoveCollection> list(Context context) {
        PagedIterable<MoveCollectionInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new MoveCollectionImpl(inner1, this.manager()));
    }

    public PagedIterable<MoveCollection> listByResourceGroup(String resourceGroupName) {
        PagedIterable<MoveCollectionInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new MoveCollectionImpl(inner1, this.manager()));
    }

    public PagedIterable<MoveCollection> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<MoveCollectionInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new MoveCollectionImpl(inner1, this.manager()));
    }

    public Response<RequiredForResourcesCollection> listRequiredForWithResponse(String resourceGroupName,
        String moveCollectionName, String sourceId, Context context) {
        Response<RequiredForResourcesCollectionInner> inner = this.serviceClient()
            .listRequiredForWithResponse(resourceGroupName, moveCollectionName, sourceId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new RequiredForResourcesCollectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RequiredForResourcesCollection listRequiredFor(String resourceGroupName, String moveCollectionName,
        String sourceId) {
        RequiredForResourcesCollectionInner inner
            = this.serviceClient().listRequiredFor(resourceGroupName, moveCollectionName, sourceId);
        if (inner != null) {
            return new RequiredForResourcesCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public MoveCollection getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String moveCollectionName = ResourceManagerUtils.getValueFromIdByName(id, "moveCollections");
        if (moveCollectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'moveCollections'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, moveCollectionName, Context.NONE).getValue();
    }

    public Response<MoveCollection> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String moveCollectionName = ResourceManagerUtils.getValueFromIdByName(id, "moveCollections");
        if (moveCollectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'moveCollections'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, moveCollectionName, context);
    }

    public OperationStatus deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String moveCollectionName = ResourceManagerUtils.getValueFromIdByName(id, "moveCollections");
        if (moveCollectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'moveCollections'.", id)));
        }
        return this.delete(resourceGroupName, moveCollectionName, Context.NONE);
    }

    public OperationStatus deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String moveCollectionName = ResourceManagerUtils.getValueFromIdByName(id, "moveCollections");
        if (moveCollectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'moveCollections'.", id)));
        }
        return this.delete(resourceGroupName, moveCollectionName, context);
    }

    private MoveCollectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.resourcemover.ResourceMoverManager manager() {
        return this.serviceManager;
    }

    public MoveCollectionImpl define(String name) {
        return new MoveCollectionImpl(name, this.manager());
    }
}
