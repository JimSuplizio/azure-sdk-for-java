// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

/**
 * Schedule interval type.
 */
public enum JobScheduleType {
    /**
     * Enum value Once.
     */
    ONCE("Once"),

    /**
     * Enum value Recurring.
     */
    RECURRING("Recurring");

    /**
     * The actual serialized value for a JobScheduleType instance.
     */
    private final String value;

    JobScheduleType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a JobScheduleType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed JobScheduleType object, or null if unable to parse.
     */
    public static JobScheduleType fromString(String value) {
        if (value == null) {
            return null;
        }
        JobScheduleType[] items = JobScheduleType.values();
        for (JobScheduleType item : items) {
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
