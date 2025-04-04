// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.notificationhubs.fluent.NotificationHubsClient;
import com.azure.resourcemanager.notificationhubs.fluent.models.CheckAvailabilityResultInner;
import com.azure.resourcemanager.notificationhubs.fluent.models.DebugSendResponseInner;
import com.azure.resourcemanager.notificationhubs.fluent.models.NotificationHubResourceInner;
import com.azure.resourcemanager.notificationhubs.fluent.models.PnsCredentialsResourceInner;
import com.azure.resourcemanager.notificationhubs.fluent.models.ResourceListKeysInner;
import com.azure.resourcemanager.notificationhubs.fluent.models.SharedAccessAuthorizationRuleResourceInner;
import com.azure.resourcemanager.notificationhubs.models.CheckAvailabilityParameters;
import com.azure.resourcemanager.notificationhubs.models.CheckAvailabilityResult;
import com.azure.resourcemanager.notificationhubs.models.DebugSendResponse;
import com.azure.resourcemanager.notificationhubs.models.NotificationHubResource;
import com.azure.resourcemanager.notificationhubs.models.NotificationHubs;
import com.azure.resourcemanager.notificationhubs.models.PnsCredentialsResource;
import com.azure.resourcemanager.notificationhubs.models.PolicykeyResource;
import com.azure.resourcemanager.notificationhubs.models.ResourceListKeys;
import com.azure.resourcemanager.notificationhubs.models.SharedAccessAuthorizationRuleCreateOrUpdateParameters;
import com.azure.resourcemanager.notificationhubs.models.SharedAccessAuthorizationRuleResource;

public final class NotificationHubsImpl implements NotificationHubs {
    private static final ClientLogger LOGGER = new ClientLogger(NotificationHubsImpl.class);

    private final NotificationHubsClient innerClient;

    private final com.azure.resourcemanager.notificationhubs.NotificationHubsManager serviceManager;

    public NotificationHubsImpl(NotificationHubsClient innerClient,
        com.azure.resourcemanager.notificationhubs.NotificationHubsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<CheckAvailabilityResult> checkNotificationHubAvailabilityWithResponse(String resourceGroupName,
        String namespaceName, CheckAvailabilityParameters parameters, Context context) {
        Response<CheckAvailabilityResultInner> inner = this.serviceClient()
            .checkNotificationHubAvailabilityWithResponse(resourceGroupName, namespaceName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new CheckAvailabilityResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckAvailabilityResult checkNotificationHubAvailability(String resourceGroupName, String namespaceName,
        CheckAvailabilityParameters parameters) {
        CheckAvailabilityResultInner inner
            = this.serviceClient().checkNotificationHubAvailability(resourceGroupName, namespaceName, parameters);
        if (inner != null) {
            return new CheckAvailabilityResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String namespaceName, String notificationHubName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, namespaceName, notificationHubName, context);
    }

    public void delete(String resourceGroupName, String namespaceName, String notificationHubName) {
        this.serviceClient().delete(resourceGroupName, namespaceName, notificationHubName);
    }

    public Response<NotificationHubResource> getWithResponse(String resourceGroupName, String namespaceName,
        String notificationHubName, Context context) {
        Response<NotificationHubResourceInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, namespaceName, notificationHubName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NotificationHubResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NotificationHubResource get(String resourceGroupName, String namespaceName, String notificationHubName) {
        NotificationHubResourceInner inner
            = this.serviceClient().get(resourceGroupName, namespaceName, notificationHubName);
        if (inner != null) {
            return new NotificationHubResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DebugSendResponse> debugSendWithResponse(String resourceGroupName, String namespaceName,
        String notificationHubName, Object parameters, Context context) {
        Response<DebugSendResponseInner> inner = this.serviceClient()
            .debugSendWithResponse(resourceGroupName, namespaceName, notificationHubName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DebugSendResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DebugSendResponse debugSend(String resourceGroupName, String namespaceName, String notificationHubName) {
        DebugSendResponseInner inner
            = this.serviceClient().debugSend(resourceGroupName, namespaceName, notificationHubName);
        if (inner != null) {
            return new DebugSendResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SharedAccessAuthorizationRuleResource> createOrUpdateAuthorizationRuleWithResponse(
        String resourceGroupName, String namespaceName, String notificationHubName, String authorizationRuleName,
        SharedAccessAuthorizationRuleCreateOrUpdateParameters parameters, Context context) {
        Response<SharedAccessAuthorizationRuleResourceInner> inner = this.serviceClient()
            .createOrUpdateAuthorizationRuleWithResponse(resourceGroupName, namespaceName, notificationHubName,
                authorizationRuleName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SharedAccessAuthorizationRuleResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SharedAccessAuthorizationRuleResource createOrUpdateAuthorizationRule(String resourceGroupName,
        String namespaceName, String notificationHubName, String authorizationRuleName,
        SharedAccessAuthorizationRuleCreateOrUpdateParameters parameters) {
        SharedAccessAuthorizationRuleResourceInner inner = this.serviceClient()
            .createOrUpdateAuthorizationRule(resourceGroupName, namespaceName, notificationHubName,
                authorizationRuleName, parameters);
        if (inner != null) {
            return new SharedAccessAuthorizationRuleResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteAuthorizationRuleWithResponse(String resourceGroupName, String namespaceName,
        String notificationHubName, String authorizationRuleName, Context context) {
        return this.serviceClient()
            .deleteAuthorizationRuleWithResponse(resourceGroupName, namespaceName, notificationHubName,
                authorizationRuleName, context);
    }

    public void deleteAuthorizationRule(String resourceGroupName, String namespaceName, String notificationHubName,
        String authorizationRuleName) {
        this.serviceClient()
            .deleteAuthorizationRule(resourceGroupName, namespaceName, notificationHubName, authorizationRuleName);
    }

    public Response<SharedAccessAuthorizationRuleResource> getAuthorizationRuleWithResponse(String resourceGroupName,
        String namespaceName, String notificationHubName, String authorizationRuleName, Context context) {
        Response<SharedAccessAuthorizationRuleResourceInner> inner = this.serviceClient()
            .getAuthorizationRuleWithResponse(resourceGroupName, namespaceName, notificationHubName,
                authorizationRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SharedAccessAuthorizationRuleResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SharedAccessAuthorizationRuleResource getAuthorizationRule(String resourceGroupName, String namespaceName,
        String notificationHubName, String authorizationRuleName) {
        SharedAccessAuthorizationRuleResourceInner inner = this.serviceClient()
            .getAuthorizationRule(resourceGroupName, namespaceName, notificationHubName, authorizationRuleName);
        if (inner != null) {
            return new SharedAccessAuthorizationRuleResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<NotificationHubResource> list(String resourceGroupName, String namespaceName) {
        PagedIterable<NotificationHubResourceInner> inner = this.serviceClient().list(resourceGroupName, namespaceName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NotificationHubResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<NotificationHubResource> list(String resourceGroupName, String namespaceName,
        Context context) {
        PagedIterable<NotificationHubResourceInner> inner
            = this.serviceClient().list(resourceGroupName, namespaceName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NotificationHubResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<SharedAccessAuthorizationRuleResource> listAuthorizationRules(String resourceGroupName,
        String namespaceName, String notificationHubName) {
        PagedIterable<SharedAccessAuthorizationRuleResourceInner> inner
            = this.serviceClient().listAuthorizationRules(resourceGroupName, namespaceName, notificationHubName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new SharedAccessAuthorizationRuleResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<SharedAccessAuthorizationRuleResource> listAuthorizationRules(String resourceGroupName,
        String namespaceName, String notificationHubName, Context context) {
        PagedIterable<SharedAccessAuthorizationRuleResourceInner> inner = this.serviceClient()
            .listAuthorizationRules(resourceGroupName, namespaceName, notificationHubName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new SharedAccessAuthorizationRuleResourceImpl(inner1, this.manager()));
    }

    public Response<ResourceListKeys> listKeysWithResponse(String resourceGroupName, String namespaceName,
        String notificationHubName, String authorizationRuleName, Context context) {
        Response<ResourceListKeysInner> inner = this.serviceClient()
            .listKeysWithResponse(resourceGroupName, namespaceName, notificationHubName, authorizationRuleName,
                context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ResourceListKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ResourceListKeys listKeys(String resourceGroupName, String namespaceName, String notificationHubName,
        String authorizationRuleName) {
        ResourceListKeysInner inner = this.serviceClient()
            .listKeys(resourceGroupName, namespaceName, notificationHubName, authorizationRuleName);
        if (inner != null) {
            return new ResourceListKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ResourceListKeys> regenerateKeysWithResponse(String resourceGroupName, String namespaceName,
        String notificationHubName, String authorizationRuleName, PolicykeyResource parameters, Context context) {
        Response<ResourceListKeysInner> inner = this.serviceClient()
            .regenerateKeysWithResponse(resourceGroupName, namespaceName, notificationHubName, authorizationRuleName,
                parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ResourceListKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ResourceListKeys regenerateKeys(String resourceGroupName, String namespaceName, String notificationHubName,
        String authorizationRuleName, PolicykeyResource parameters) {
        ResourceListKeysInner inner = this.serviceClient()
            .regenerateKeys(resourceGroupName, namespaceName, notificationHubName, authorizationRuleName, parameters);
        if (inner != null) {
            return new ResourceListKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PnsCredentialsResource> getPnsCredentialsWithResponse(String resourceGroupName,
        String namespaceName, String notificationHubName, Context context) {
        Response<PnsCredentialsResourceInner> inner = this.serviceClient()
            .getPnsCredentialsWithResponse(resourceGroupName, namespaceName, notificationHubName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PnsCredentialsResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PnsCredentialsResource getPnsCredentials(String resourceGroupName, String namespaceName,
        String notificationHubName) {
        PnsCredentialsResourceInner inner
            = this.serviceClient().getPnsCredentials(resourceGroupName, namespaceName, notificationHubName);
        if (inner != null) {
            return new PnsCredentialsResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NotificationHubResource getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = ResourceManagerUtils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String notificationHubName = ResourceManagerUtils.getValueFromIdByName(id, "notificationHubs");
        if (notificationHubName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'notificationHubs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, notificationHubName, Context.NONE).getValue();
    }

    public Response<NotificationHubResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = ResourceManagerUtils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String notificationHubName = ResourceManagerUtils.getValueFromIdByName(id, "notificationHubs");
        if (notificationHubName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'notificationHubs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, notificationHubName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = ResourceManagerUtils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String notificationHubName = ResourceManagerUtils.getValueFromIdByName(id, "notificationHubs");
        if (notificationHubName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'notificationHubs'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, namespaceName, notificationHubName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = ResourceManagerUtils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String notificationHubName = ResourceManagerUtils.getValueFromIdByName(id, "notificationHubs");
        if (notificationHubName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'notificationHubs'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, namespaceName, notificationHubName, context);
    }

    private NotificationHubsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.notificationhubs.NotificationHubsManager manager() {
        return this.serviceManager;
    }

    public NotificationHubResourceImpl define(String name) {
        return new NotificationHubResourceImpl(name, this.manager());
    }
}
