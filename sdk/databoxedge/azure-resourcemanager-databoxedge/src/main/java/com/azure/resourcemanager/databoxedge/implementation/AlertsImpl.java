// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.fluent.AlertsClient;
import com.azure.resourcemanager.databoxedge.fluent.models.AlertInner;
import com.azure.resourcemanager.databoxedge.models.Alert;
import com.azure.resourcemanager.databoxedge.models.Alerts;

public final class AlertsImpl implements Alerts {
    private static final ClientLogger LOGGER = new ClientLogger(AlertsImpl.class);

    private final AlertsClient innerClient;

    private final com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager;

    public AlertsImpl(AlertsClient innerClient,
        com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Alert> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        PagedIterable<AlertInner> inner = this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AlertImpl(inner1, this.manager()));
    }

    public PagedIterable<Alert> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName, Context context) {
        PagedIterable<AlertInner> inner
            = this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AlertImpl(inner1, this.manager()));
    }

    public Response<Alert> getWithResponse(String deviceName, String name, String resourceGroupName, Context context) {
        Response<AlertInner> inner = this.serviceClient().getWithResponse(deviceName, name, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AlertImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Alert get(String deviceName, String name, String resourceGroupName) {
        AlertInner inner = this.serviceClient().get(deviceName, name, resourceGroupName);
        if (inner != null) {
            return new AlertImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private AlertsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
