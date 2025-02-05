// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.confluent.fluent.AccessClient;
import com.azure.resourcemanager.confluent.fluent.models.AccessListClusterSuccessResponseInner;
import com.azure.resourcemanager.confluent.fluent.models.AccessListEnvironmentsSuccessResponseInner;
import com.azure.resourcemanager.confluent.fluent.models.AccessListInvitationsSuccessResponseInner;
import com.azure.resourcemanager.confluent.fluent.models.AccessListRoleBindingsSuccessResponseInner;
import com.azure.resourcemanager.confluent.fluent.models.AccessListServiceAccountsSuccessResponseInner;
import com.azure.resourcemanager.confluent.fluent.models.AccessListUsersSuccessResponseInner;
import com.azure.resourcemanager.confluent.fluent.models.AccessRoleBindingNameListSuccessResponseInner;
import com.azure.resourcemanager.confluent.fluent.models.InvitationRecordInner;
import com.azure.resourcemanager.confluent.models.Access;
import com.azure.resourcemanager.confluent.models.AccessCreateRoleBindingRequestModel;
import com.azure.resourcemanager.confluent.models.AccessInviteUserAccountModel;
import com.azure.resourcemanager.confluent.models.AccessListClusterSuccessResponse;
import com.azure.resourcemanager.confluent.models.AccessListEnvironmentsSuccessResponse;
import com.azure.resourcemanager.confluent.models.AccessListInvitationsSuccessResponse;
import com.azure.resourcemanager.confluent.models.AccessListRoleBindingsSuccessResponse;
import com.azure.resourcemanager.confluent.models.AccessListServiceAccountsSuccessResponse;
import com.azure.resourcemanager.confluent.models.AccessListUsersSuccessResponse;
import com.azure.resourcemanager.confluent.models.AccessRoleBindingNameListSuccessResponse;
import com.azure.resourcemanager.confluent.models.InvitationRecord;
import com.azure.resourcemanager.confluent.models.ListAccessRequestModel;
import com.azure.resourcemanager.confluent.models.RoleBindingRecord;

public final class AccessImpl implements Access {
    private static final ClientLogger LOGGER = new ClientLogger(AccessImpl.class);

    private final AccessClient innerClient;

    private final com.azure.resourcemanager.confluent.ConfluentManager serviceManager;

    public AccessImpl(AccessClient innerClient, com.azure.resourcemanager.confluent.ConfluentManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<AccessListUsersSuccessResponse> listUsersWithResponse(String resourceGroupName,
        String organizationName, ListAccessRequestModel body, Context context) {
        Response<AccessListUsersSuccessResponseInner> inner
            = this.serviceClient().listUsersWithResponse(resourceGroupName, organizationName, body, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AccessListUsersSuccessResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessListUsersSuccessResponse listUsers(String resourceGroupName, String organizationName,
        ListAccessRequestModel body) {
        AccessListUsersSuccessResponseInner inner
            = this.serviceClient().listUsers(resourceGroupName, organizationName, body);
        if (inner != null) {
            return new AccessListUsersSuccessResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessListServiceAccountsSuccessResponse> listServiceAccountsWithResponse(String resourceGroupName,
        String organizationName, ListAccessRequestModel body, Context context) {
        Response<AccessListServiceAccountsSuccessResponseInner> inner
            = this.serviceClient().listServiceAccountsWithResponse(resourceGroupName, organizationName, body, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AccessListServiceAccountsSuccessResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessListServiceAccountsSuccessResponse listServiceAccounts(String resourceGroupName,
        String organizationName, ListAccessRequestModel body) {
        AccessListServiceAccountsSuccessResponseInner inner
            = this.serviceClient().listServiceAccounts(resourceGroupName, organizationName, body);
        if (inner != null) {
            return new AccessListServiceAccountsSuccessResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessListInvitationsSuccessResponse> listInvitationsWithResponse(String resourceGroupName,
        String organizationName, ListAccessRequestModel body, Context context) {
        Response<AccessListInvitationsSuccessResponseInner> inner
            = this.serviceClient().listInvitationsWithResponse(resourceGroupName, organizationName, body, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AccessListInvitationsSuccessResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessListInvitationsSuccessResponse listInvitations(String resourceGroupName, String organizationName,
        ListAccessRequestModel body) {
        AccessListInvitationsSuccessResponseInner inner
            = this.serviceClient().listInvitations(resourceGroupName, organizationName, body);
        if (inner != null) {
            return new AccessListInvitationsSuccessResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<InvitationRecord> inviteUserWithResponse(String resourceGroupName, String organizationName,
        AccessInviteUserAccountModel body, Context context) {
        Response<InvitationRecordInner> inner
            = this.serviceClient().inviteUserWithResponse(resourceGroupName, organizationName, body, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new InvitationRecordImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public InvitationRecord inviteUser(String resourceGroupName, String organizationName,
        AccessInviteUserAccountModel body) {
        InvitationRecordInner inner = this.serviceClient().inviteUser(resourceGroupName, organizationName, body);
        if (inner != null) {
            return new InvitationRecordImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessListEnvironmentsSuccessResponse> listEnvironmentsWithResponse(String resourceGroupName,
        String organizationName, ListAccessRequestModel body, Context context) {
        Response<AccessListEnvironmentsSuccessResponseInner> inner
            = this.serviceClient().listEnvironmentsWithResponse(resourceGroupName, organizationName, body, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AccessListEnvironmentsSuccessResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessListEnvironmentsSuccessResponse listEnvironments(String resourceGroupName, String organizationName,
        ListAccessRequestModel body) {
        AccessListEnvironmentsSuccessResponseInner inner
            = this.serviceClient().listEnvironments(resourceGroupName, organizationName, body);
        if (inner != null) {
            return new AccessListEnvironmentsSuccessResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessListClusterSuccessResponse> listClustersWithResponse(String resourceGroupName,
        String organizationName, ListAccessRequestModel body, Context context) {
        Response<AccessListClusterSuccessResponseInner> inner
            = this.serviceClient().listClustersWithResponse(resourceGroupName, organizationName, body, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AccessListClusterSuccessResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessListClusterSuccessResponse listClusters(String resourceGroupName, String organizationName,
        ListAccessRequestModel body) {
        AccessListClusterSuccessResponseInner inner
            = this.serviceClient().listClusters(resourceGroupName, organizationName, body);
        if (inner != null) {
            return new AccessListClusterSuccessResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessListRoleBindingsSuccessResponse> listRoleBindingsWithResponse(String resourceGroupName,
        String organizationName, ListAccessRequestModel body, Context context) {
        Response<AccessListRoleBindingsSuccessResponseInner> inner
            = this.serviceClient().listRoleBindingsWithResponse(resourceGroupName, organizationName, body, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AccessListRoleBindingsSuccessResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessListRoleBindingsSuccessResponse listRoleBindings(String resourceGroupName, String organizationName,
        ListAccessRequestModel body) {
        AccessListRoleBindingsSuccessResponseInner inner
            = this.serviceClient().listRoleBindings(resourceGroupName, organizationName, body);
        if (inner != null) {
            return new AccessListRoleBindingsSuccessResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RoleBindingRecord> createRoleBindingWithResponse(String resourceGroupName, String organizationName,
        AccessCreateRoleBindingRequestModel body, Context context) {
        return this.serviceClient().createRoleBindingWithResponse(resourceGroupName, organizationName, body, context);
    }

    public RoleBindingRecord createRoleBinding(String resourceGroupName, String organizationName,
        AccessCreateRoleBindingRequestModel body) {
        return this.serviceClient().createRoleBinding(resourceGroupName, organizationName, body);
    }

    public Response<Void> deleteRoleBindingWithResponse(String resourceGroupName, String organizationName,
        String roleBindingId, Context context) {
        return this.serviceClient()
            .deleteRoleBindingWithResponse(resourceGroupName, organizationName, roleBindingId, context);
    }

    public void deleteRoleBinding(String resourceGroupName, String organizationName, String roleBindingId) {
        this.serviceClient().deleteRoleBinding(resourceGroupName, organizationName, roleBindingId);
    }

    public Response<AccessRoleBindingNameListSuccessResponse> listRoleBindingNameListWithResponse(
        String resourceGroupName, String organizationName, ListAccessRequestModel body, Context context) {
        Response<AccessRoleBindingNameListSuccessResponseInner> inner = this.serviceClient()
            .listRoleBindingNameListWithResponse(resourceGroupName, organizationName, body, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AccessRoleBindingNameListSuccessResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessRoleBindingNameListSuccessResponse listRoleBindingNameList(String resourceGroupName,
        String organizationName, ListAccessRequestModel body) {
        AccessRoleBindingNameListSuccessResponseInner inner
            = this.serviceClient().listRoleBindingNameList(resourceGroupName, organizationName, body);
        if (inner != null) {
            return new AccessRoleBindingNameListSuccessResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private AccessClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.confluent.ConfluentManager manager() {
        return this.serviceManager;
    }
}
