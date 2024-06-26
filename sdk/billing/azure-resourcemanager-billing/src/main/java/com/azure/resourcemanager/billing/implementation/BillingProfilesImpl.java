// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billing.fluent.BillingProfilesClient;
import com.azure.resourcemanager.billing.fluent.models.BillingProfileInner;
import com.azure.resourcemanager.billing.models.BillingProfile;
import com.azure.resourcemanager.billing.models.BillingProfiles;

public final class BillingProfilesImpl implements BillingProfiles {
    private static final ClientLogger LOGGER = new ClientLogger(BillingProfilesImpl.class);

    private final BillingProfilesClient innerClient;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    public BillingProfilesImpl(
        BillingProfilesClient innerClient, com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<BillingProfile> listByBillingAccount(String billingAccountName) {
        PagedIterable<BillingProfileInner> inner = this.serviceClient().listByBillingAccount(billingAccountName);
        return Utils.mapPage(inner, inner1 -> new BillingProfileImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingProfile> listByBillingAccount(
        String billingAccountName, String expand, Context context) {
        PagedIterable<BillingProfileInner> inner =
            this.serviceClient().listByBillingAccount(billingAccountName, expand, context);
        return Utils.mapPage(inner, inner1 -> new BillingProfileImpl(inner1, this.manager()));
    }

    public Response<BillingProfile> getWithResponse(
        String billingAccountName, String billingProfileName, String expand, Context context) {
        Response<BillingProfileInner> inner =
            this.serviceClient().getWithResponse(billingAccountName, billingProfileName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BillingProfileImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BillingProfile get(String billingAccountName, String billingProfileName) {
        BillingProfileInner inner = this.serviceClient().get(billingAccountName, billingProfileName);
        if (inner != null) {
            return new BillingProfileImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public BillingProfile createOrUpdate(
        String billingAccountName, String billingProfileName, BillingProfileInner parameters) {
        BillingProfileInner inner =
            this.serviceClient().createOrUpdate(billingAccountName, billingProfileName, parameters);
        if (inner != null) {
            return new BillingProfileImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public BillingProfile createOrUpdate(
        String billingAccountName, String billingProfileName, BillingProfileInner parameters, Context context) {
        BillingProfileInner inner =
            this.serviceClient().createOrUpdate(billingAccountName, billingProfileName, parameters, context);
        if (inner != null) {
            return new BillingProfileImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private BillingProfilesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
