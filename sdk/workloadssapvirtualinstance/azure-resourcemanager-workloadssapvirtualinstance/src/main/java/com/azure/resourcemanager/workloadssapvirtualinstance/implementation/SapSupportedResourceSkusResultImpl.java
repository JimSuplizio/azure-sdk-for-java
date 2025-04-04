// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.implementation;

import com.azure.resourcemanager.workloadssapvirtualinstance.fluent.models.SapSupportedResourceSkusResultInner;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapSupportedResourceSkusResult;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapSupportedSku;
import java.util.Collections;
import java.util.List;

public final class SapSupportedResourceSkusResultImpl implements SapSupportedResourceSkusResult {
    private SapSupportedResourceSkusResultInner innerObject;

    private final com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager serviceManager;

    SapSupportedResourceSkusResultImpl(SapSupportedResourceSkusResultInner innerObject,
        com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<SapSupportedSku> supportedSkus() {
        List<SapSupportedSku> inner = this.innerModel().supportedSkus();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SapSupportedResourceSkusResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager manager() {
        return this.serviceManager;
    }
}
