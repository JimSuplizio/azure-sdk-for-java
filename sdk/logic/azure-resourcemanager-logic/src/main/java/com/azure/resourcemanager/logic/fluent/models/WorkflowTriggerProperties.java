// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.logic.models.ResourceReference;
import com.azure.resourcemanager.logic.models.WorkflowState;
import com.azure.resourcemanager.logic.models.WorkflowStatus;
import com.azure.resourcemanager.logic.models.WorkflowTriggerProvisioningState;
import com.azure.resourcemanager.logic.models.WorkflowTriggerRecurrence;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The workflow trigger properties.
 */
@Immutable
public final class WorkflowTriggerProperties implements JsonSerializable<WorkflowTriggerProperties> {
    /*
     * Gets the provisioning state.
     */
    private WorkflowTriggerProvisioningState provisioningState;

    /*
     * Gets the created time.
     */
    private OffsetDateTime createdTime;

    /*
     * Gets the changed time.
     */
    private OffsetDateTime changedTime;

    /*
     * Gets the state.
     */
    private WorkflowState state;

    /*
     * Gets the status.
     */
    private WorkflowStatus status;

    /*
     * Gets the last execution time.
     */
    private OffsetDateTime lastExecutionTime;

    /*
     * Gets the next execution time.
     */
    private OffsetDateTime nextExecutionTime;

    /*
     * Gets the workflow trigger recurrence.
     */
    private WorkflowTriggerRecurrence recurrence;

    /*
     * Gets the reference to workflow.
     */
    private ResourceReference workflow;

    /**
     * Creates an instance of WorkflowTriggerProperties class.
     */
    public WorkflowTriggerProperties() {
    }

    /**
     * Get the provisioningState property: Gets the provisioning state.
     * 
     * @return the provisioningState value.
     */
    public WorkflowTriggerProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the createdTime property: Gets the created time.
     * 
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the changedTime property: Gets the changed time.
     * 
     * @return the changedTime value.
     */
    public OffsetDateTime changedTime() {
        return this.changedTime;
    }

    /**
     * Get the state property: Gets the state.
     * 
     * @return the state value.
     */
    public WorkflowState state() {
        return this.state;
    }

    /**
     * Get the status property: Gets the status.
     * 
     * @return the status value.
     */
    public WorkflowStatus status() {
        return this.status;
    }

    /**
     * Get the lastExecutionTime property: Gets the last execution time.
     * 
     * @return the lastExecutionTime value.
     */
    public OffsetDateTime lastExecutionTime() {
        return this.lastExecutionTime;
    }

    /**
     * Get the nextExecutionTime property: Gets the next execution time.
     * 
     * @return the nextExecutionTime value.
     */
    public OffsetDateTime nextExecutionTime() {
        return this.nextExecutionTime;
    }

    /**
     * Get the recurrence property: Gets the workflow trigger recurrence.
     * 
     * @return the recurrence value.
     */
    public WorkflowTriggerRecurrence recurrence() {
        return this.recurrence;
    }

    /**
     * Get the workflow property: Gets the reference to workflow.
     * 
     * @return the workflow value.
     */
    public ResourceReference workflow() {
        return this.workflow;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (recurrence() != null) {
            recurrence().validate();
        }
        if (workflow() != null) {
            workflow().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkflowTriggerProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkflowTriggerProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WorkflowTriggerProperties.
     */
    public static WorkflowTriggerProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkflowTriggerProperties deserializedWorkflowTriggerProperties = new WorkflowTriggerProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedWorkflowTriggerProperties.provisioningState
                        = WorkflowTriggerProvisioningState.fromString(reader.getString());
                } else if ("createdTime".equals(fieldName)) {
                    deserializedWorkflowTriggerProperties.createdTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("changedTime".equals(fieldName)) {
                    deserializedWorkflowTriggerProperties.changedTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("state".equals(fieldName)) {
                    deserializedWorkflowTriggerProperties.state = WorkflowState.fromString(reader.getString());
                } else if ("status".equals(fieldName)) {
                    deserializedWorkflowTriggerProperties.status = WorkflowStatus.fromString(reader.getString());
                } else if ("lastExecutionTime".equals(fieldName)) {
                    deserializedWorkflowTriggerProperties.lastExecutionTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("nextExecutionTime".equals(fieldName)) {
                    deserializedWorkflowTriggerProperties.nextExecutionTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("recurrence".equals(fieldName)) {
                    deserializedWorkflowTriggerProperties.recurrence = WorkflowTriggerRecurrence.fromJson(reader);
                } else if ("workflow".equals(fieldName)) {
                    deserializedWorkflowTriggerProperties.workflow = ResourceReference.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkflowTriggerProperties;
        });
    }
}
