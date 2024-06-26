// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

/**
 * Operation status.
 */
public enum OperationStatus {
    /**
     * The operation has not started yet.
     */
    NOT_STARTED("notStarted"),

    /**
     * The operation is in progress.
     */
    RUNNING("running"),

    /**
     * The operation has failed.
     */
    FAILED("failed"),

    /**
     * The operation has succeeded.
     */
    SUCCEEDED("succeeded"),

    /**
     * The operation has been canceled.
     */
    CANCELED("canceled");

    /**
     * The actual serialized value for a OperationStatus instance.
     */
    private final String value;

    OperationStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OperationStatus instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed OperationStatus object, or null if unable to parse.
     */
    public static OperationStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        OperationStatus[] items = OperationStatus.values();
        for (OperationStatus item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
