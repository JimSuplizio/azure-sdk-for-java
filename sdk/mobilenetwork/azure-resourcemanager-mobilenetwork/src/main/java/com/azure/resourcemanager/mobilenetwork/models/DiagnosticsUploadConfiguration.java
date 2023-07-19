// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configuration for uploading packet core diagnostics. */
@Fluent
public final class DiagnosticsUploadConfiguration {
    /*
     * The Storage Account Container URL to upload diagnostics to.
     */
    @JsonProperty(value = "storageAccountContainerUrl", required = true)
    private String storageAccountContainerUrl;

    /** Creates an instance of DiagnosticsUploadConfiguration class. */
    public DiagnosticsUploadConfiguration() {
    }

    /**
     * Get the storageAccountContainerUrl property: The Storage Account Container URL to upload diagnostics to.
     *
     * @return the storageAccountContainerUrl value.
     */
    public String storageAccountContainerUrl() {
        return this.storageAccountContainerUrl;
    }

    /**
     * Set the storageAccountContainerUrl property: The Storage Account Container URL to upload diagnostics to.
     *
     * @param storageAccountContainerUrl the storageAccountContainerUrl value to set.
     * @return the DiagnosticsUploadConfiguration object itself.
     */
    public DiagnosticsUploadConfiguration withStorageAccountContainerUrl(String storageAccountContainerUrl) {
        this.storageAccountContainerUrl = storageAccountContainerUrl;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageAccountContainerUrl() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storageAccountContainerUrl in model"
                            + " DiagnosticsUploadConfiguration"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiagnosticsUploadConfiguration.class);
}