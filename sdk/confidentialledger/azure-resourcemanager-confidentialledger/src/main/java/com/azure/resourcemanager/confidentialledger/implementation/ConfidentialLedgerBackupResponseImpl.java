// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.implementation;

import com.azure.resourcemanager.confidentialledger.fluent.models.ConfidentialLedgerBackupResponseInner;
import com.azure.resourcemanager.confidentialledger.models.ConfidentialLedgerBackupResponse;

public final class ConfidentialLedgerBackupResponseImpl implements ConfidentialLedgerBackupResponse {
    private ConfidentialLedgerBackupResponseInner innerObject;

    private final com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager serviceManager;

    ConfidentialLedgerBackupResponseImpl(ConfidentialLedgerBackupResponseInner innerObject,
        com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String message() {
        return this.innerModel().message();
    }

    public ConfidentialLedgerBackupResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager manager() {
        return this.serviceManager;
    }
}
