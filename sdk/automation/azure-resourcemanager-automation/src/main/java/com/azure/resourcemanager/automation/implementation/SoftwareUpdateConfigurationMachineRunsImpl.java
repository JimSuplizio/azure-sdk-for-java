// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.SoftwareUpdateConfigurationMachineRunsClient;
import com.azure.resourcemanager.automation.fluent.models.SoftwareUpdateConfigurationMachineRunInner;
import com.azure.resourcemanager.automation.fluent.models.SoftwareUpdateConfigurationMachineRunListResultInner;
import com.azure.resourcemanager.automation.models.SoftwareUpdateConfigurationMachineRun;
import com.azure.resourcemanager.automation.models.SoftwareUpdateConfigurationMachineRunListResult;
import com.azure.resourcemanager.automation.models.SoftwareUpdateConfigurationMachineRuns;
import java.util.UUID;

public final class SoftwareUpdateConfigurationMachineRunsImpl implements SoftwareUpdateConfigurationMachineRuns {
    private static final ClientLogger LOGGER = new ClientLogger(SoftwareUpdateConfigurationMachineRunsImpl.class);

    private final SoftwareUpdateConfigurationMachineRunsClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public SoftwareUpdateConfigurationMachineRunsImpl(SoftwareUpdateConfigurationMachineRunsClient innerClient,
        com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<SoftwareUpdateConfigurationMachineRun> getByIdWithResponse(String resourceGroupName,
        String automationAccountName, UUID softwareUpdateConfigurationMachineRunId, String clientRequestId,
        Context context) {
        Response<SoftwareUpdateConfigurationMachineRunInner> inner = this.serviceClient()
            .getByIdWithResponse(resourceGroupName, automationAccountName, softwareUpdateConfigurationMachineRunId,
                clientRequestId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SoftwareUpdateConfigurationMachineRunImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SoftwareUpdateConfigurationMachineRun getById(String resourceGroupName, String automationAccountName,
        UUID softwareUpdateConfigurationMachineRunId) {
        SoftwareUpdateConfigurationMachineRunInner inner = this.serviceClient()
            .getById(resourceGroupName, automationAccountName, softwareUpdateConfigurationMachineRunId);
        if (inner != null) {
            return new SoftwareUpdateConfigurationMachineRunImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SoftwareUpdateConfigurationMachineRunListResult> listWithResponse(String resourceGroupName,
        String automationAccountName, String clientRequestId, String filter, String skip, String top, Context context) {
        Response<SoftwareUpdateConfigurationMachineRunListResultInner> inner = this.serviceClient()
            .listWithResponse(resourceGroupName, automationAccountName, clientRequestId, filter, skip, top, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SoftwareUpdateConfigurationMachineRunListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SoftwareUpdateConfigurationMachineRunListResult list(String resourceGroupName,
        String automationAccountName) {
        SoftwareUpdateConfigurationMachineRunListResultInner inner
            = this.serviceClient().list(resourceGroupName, automationAccountName);
        if (inner != null) {
            return new SoftwareUpdateConfigurationMachineRunListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private SoftwareUpdateConfigurationMachineRunsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }
}
