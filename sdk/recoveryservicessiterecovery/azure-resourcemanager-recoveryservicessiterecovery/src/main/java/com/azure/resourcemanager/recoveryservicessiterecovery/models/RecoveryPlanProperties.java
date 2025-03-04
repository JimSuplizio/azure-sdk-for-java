// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Recovery plan properties.
 */
@Fluent
public final class RecoveryPlanProperties implements JsonSerializable<RecoveryPlanProperties> {
    /*
     * The friendly name.
     */
    private String friendlyName;

    /*
     * The primary fabric Id.
     */
    private String primaryFabricId;

    /*
     * The primary fabric friendly name.
     */
    private String primaryFabricFriendlyName;

    /*
     * The recovery fabric Id.
     */
    private String recoveryFabricId;

    /*
     * The recovery fabric friendly name.
     */
    private String recoveryFabricFriendlyName;

    /*
     * The failover deployment model.
     */
    private String failoverDeploymentModel;

    /*
     * The list of replication providers.
     */
    private List<String> replicationProviders;

    /*
     * The list of allowed operations.
     */
    private List<String> allowedOperations;

    /*
     * The start time of the last planned failover.
     */
    private OffsetDateTime lastPlannedFailoverTime;

    /*
     * The start time of the last unplanned failover.
     */
    private OffsetDateTime lastUnplannedFailoverTime;

    /*
     * The start time of the last test failover.
     */
    private OffsetDateTime lastTestFailoverTime;

    /*
     * The current scenario details.
     */
    private CurrentScenarioDetails currentScenario;

    /*
     * The recovery plan status.
     */
    private String currentScenarioStatus;

    /*
     * The recovery plan status description.
     */
    private String currentScenarioStatusDescription;

    /*
     * The recovery plan groups.
     */
    private List<RecoveryPlanGroup> groups;

    /*
     * The provider id and provider specific details.
     */
    private List<RecoveryPlanProviderSpecificDetails> providerSpecificDetails;

    /**
     * Creates an instance of RecoveryPlanProperties class.
     */
    public RecoveryPlanProperties() {
    }

    /**
     * Get the friendlyName property: The friendly name.
     * 
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: The friendly name.
     * 
     * @param friendlyName the friendlyName value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the primaryFabricId property: The primary fabric Id.
     * 
     * @return the primaryFabricId value.
     */
    public String primaryFabricId() {
        return this.primaryFabricId;
    }

    /**
     * Set the primaryFabricId property: The primary fabric Id.
     * 
     * @param primaryFabricId the primaryFabricId value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withPrimaryFabricId(String primaryFabricId) {
        this.primaryFabricId = primaryFabricId;
        return this;
    }

    /**
     * Get the primaryFabricFriendlyName property: The primary fabric friendly name.
     * 
     * @return the primaryFabricFriendlyName value.
     */
    public String primaryFabricFriendlyName() {
        return this.primaryFabricFriendlyName;
    }

    /**
     * Set the primaryFabricFriendlyName property: The primary fabric friendly name.
     * 
     * @param primaryFabricFriendlyName the primaryFabricFriendlyName value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withPrimaryFabricFriendlyName(String primaryFabricFriendlyName) {
        this.primaryFabricFriendlyName = primaryFabricFriendlyName;
        return this;
    }

    /**
     * Get the recoveryFabricId property: The recovery fabric Id.
     * 
     * @return the recoveryFabricId value.
     */
    public String recoveryFabricId() {
        return this.recoveryFabricId;
    }

    /**
     * Set the recoveryFabricId property: The recovery fabric Id.
     * 
     * @param recoveryFabricId the recoveryFabricId value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withRecoveryFabricId(String recoveryFabricId) {
        this.recoveryFabricId = recoveryFabricId;
        return this;
    }

    /**
     * Get the recoveryFabricFriendlyName property: The recovery fabric friendly name.
     * 
     * @return the recoveryFabricFriendlyName value.
     */
    public String recoveryFabricFriendlyName() {
        return this.recoveryFabricFriendlyName;
    }

    /**
     * Set the recoveryFabricFriendlyName property: The recovery fabric friendly name.
     * 
     * @param recoveryFabricFriendlyName the recoveryFabricFriendlyName value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withRecoveryFabricFriendlyName(String recoveryFabricFriendlyName) {
        this.recoveryFabricFriendlyName = recoveryFabricFriendlyName;
        return this;
    }

    /**
     * Get the failoverDeploymentModel property: The failover deployment model.
     * 
     * @return the failoverDeploymentModel value.
     */
    public String failoverDeploymentModel() {
        return this.failoverDeploymentModel;
    }

    /**
     * Set the failoverDeploymentModel property: The failover deployment model.
     * 
     * @param failoverDeploymentModel the failoverDeploymentModel value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withFailoverDeploymentModel(String failoverDeploymentModel) {
        this.failoverDeploymentModel = failoverDeploymentModel;
        return this;
    }

    /**
     * Get the replicationProviders property: The list of replication providers.
     * 
     * @return the replicationProviders value.
     */
    public List<String> replicationProviders() {
        return this.replicationProviders;
    }

    /**
     * Set the replicationProviders property: The list of replication providers.
     * 
     * @param replicationProviders the replicationProviders value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withReplicationProviders(List<String> replicationProviders) {
        this.replicationProviders = replicationProviders;
        return this;
    }

    /**
     * Get the allowedOperations property: The list of allowed operations.
     * 
     * @return the allowedOperations value.
     */
    public List<String> allowedOperations() {
        return this.allowedOperations;
    }

    /**
     * Set the allowedOperations property: The list of allowed operations.
     * 
     * @param allowedOperations the allowedOperations value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withAllowedOperations(List<String> allowedOperations) {
        this.allowedOperations = allowedOperations;
        return this;
    }

    /**
     * Get the lastPlannedFailoverTime property: The start time of the last planned failover.
     * 
     * @return the lastPlannedFailoverTime value.
     */
    public OffsetDateTime lastPlannedFailoverTime() {
        return this.lastPlannedFailoverTime;
    }

    /**
     * Set the lastPlannedFailoverTime property: The start time of the last planned failover.
     * 
     * @param lastPlannedFailoverTime the lastPlannedFailoverTime value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withLastPlannedFailoverTime(OffsetDateTime lastPlannedFailoverTime) {
        this.lastPlannedFailoverTime = lastPlannedFailoverTime;
        return this;
    }

    /**
     * Get the lastUnplannedFailoverTime property: The start time of the last unplanned failover.
     * 
     * @return the lastUnplannedFailoverTime value.
     */
    public OffsetDateTime lastUnplannedFailoverTime() {
        return this.lastUnplannedFailoverTime;
    }

    /**
     * Set the lastUnplannedFailoverTime property: The start time of the last unplanned failover.
     * 
     * @param lastUnplannedFailoverTime the lastUnplannedFailoverTime value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withLastUnplannedFailoverTime(OffsetDateTime lastUnplannedFailoverTime) {
        this.lastUnplannedFailoverTime = lastUnplannedFailoverTime;
        return this;
    }

    /**
     * Get the lastTestFailoverTime property: The start time of the last test failover.
     * 
     * @return the lastTestFailoverTime value.
     */
    public OffsetDateTime lastTestFailoverTime() {
        return this.lastTestFailoverTime;
    }

    /**
     * Set the lastTestFailoverTime property: The start time of the last test failover.
     * 
     * @param lastTestFailoverTime the lastTestFailoverTime value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withLastTestFailoverTime(OffsetDateTime lastTestFailoverTime) {
        this.lastTestFailoverTime = lastTestFailoverTime;
        return this;
    }

    /**
     * Get the currentScenario property: The current scenario details.
     * 
     * @return the currentScenario value.
     */
    public CurrentScenarioDetails currentScenario() {
        return this.currentScenario;
    }

    /**
     * Set the currentScenario property: The current scenario details.
     * 
     * @param currentScenario the currentScenario value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withCurrentScenario(CurrentScenarioDetails currentScenario) {
        this.currentScenario = currentScenario;
        return this;
    }

    /**
     * Get the currentScenarioStatus property: The recovery plan status.
     * 
     * @return the currentScenarioStatus value.
     */
    public String currentScenarioStatus() {
        return this.currentScenarioStatus;
    }

    /**
     * Set the currentScenarioStatus property: The recovery plan status.
     * 
     * @param currentScenarioStatus the currentScenarioStatus value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withCurrentScenarioStatus(String currentScenarioStatus) {
        this.currentScenarioStatus = currentScenarioStatus;
        return this;
    }

    /**
     * Get the currentScenarioStatusDescription property: The recovery plan status description.
     * 
     * @return the currentScenarioStatusDescription value.
     */
    public String currentScenarioStatusDescription() {
        return this.currentScenarioStatusDescription;
    }

    /**
     * Set the currentScenarioStatusDescription property: The recovery plan status description.
     * 
     * @param currentScenarioStatusDescription the currentScenarioStatusDescription value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withCurrentScenarioStatusDescription(String currentScenarioStatusDescription) {
        this.currentScenarioStatusDescription = currentScenarioStatusDescription;
        return this;
    }

    /**
     * Get the groups property: The recovery plan groups.
     * 
     * @return the groups value.
     */
    public List<RecoveryPlanGroup> groups() {
        return this.groups;
    }

    /**
     * Set the groups property: The recovery plan groups.
     * 
     * @param groups the groups value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withGroups(List<RecoveryPlanGroup> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * Get the providerSpecificDetails property: The provider id and provider specific details.
     * 
     * @return the providerSpecificDetails value.
     */
    public List<RecoveryPlanProviderSpecificDetails> providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails property: The provider id and provider specific details.
     * 
     * @param providerSpecificDetails the providerSpecificDetails value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties
        withProviderSpecificDetails(List<RecoveryPlanProviderSpecificDetails> providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (currentScenario() != null) {
            currentScenario().validate();
        }
        if (groups() != null) {
            groups().forEach(e -> e.validate());
        }
        if (providerSpecificDetails() != null) {
            providerSpecificDetails().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("friendlyName", this.friendlyName);
        jsonWriter.writeStringField("primaryFabricId", this.primaryFabricId);
        jsonWriter.writeStringField("primaryFabricFriendlyName", this.primaryFabricFriendlyName);
        jsonWriter.writeStringField("recoveryFabricId", this.recoveryFabricId);
        jsonWriter.writeStringField("recoveryFabricFriendlyName", this.recoveryFabricFriendlyName);
        jsonWriter.writeStringField("failoverDeploymentModel", this.failoverDeploymentModel);
        jsonWriter.writeArrayField("replicationProviders", this.replicationProviders,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("allowedOperations", this.allowedOperations,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("lastPlannedFailoverTime",
            this.lastPlannedFailoverTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastPlannedFailoverTime));
        jsonWriter.writeStringField("lastUnplannedFailoverTime",
            this.lastUnplannedFailoverTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastUnplannedFailoverTime));
        jsonWriter.writeStringField("lastTestFailoverTime",
            this.lastTestFailoverTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastTestFailoverTime));
        jsonWriter.writeJsonField("currentScenario", this.currentScenario);
        jsonWriter.writeStringField("currentScenarioStatus", this.currentScenarioStatus);
        jsonWriter.writeStringField("currentScenarioStatusDescription", this.currentScenarioStatusDescription);
        jsonWriter.writeArrayField("groups", this.groups, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("providerSpecificDetails", this.providerSpecificDetails,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RecoveryPlanProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RecoveryPlanProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RecoveryPlanProperties.
     */
    public static RecoveryPlanProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RecoveryPlanProperties deserializedRecoveryPlanProperties = new RecoveryPlanProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("friendlyName".equals(fieldName)) {
                    deserializedRecoveryPlanProperties.friendlyName = reader.getString();
                } else if ("primaryFabricId".equals(fieldName)) {
                    deserializedRecoveryPlanProperties.primaryFabricId = reader.getString();
                } else if ("primaryFabricFriendlyName".equals(fieldName)) {
                    deserializedRecoveryPlanProperties.primaryFabricFriendlyName = reader.getString();
                } else if ("recoveryFabricId".equals(fieldName)) {
                    deserializedRecoveryPlanProperties.recoveryFabricId = reader.getString();
                } else if ("recoveryFabricFriendlyName".equals(fieldName)) {
                    deserializedRecoveryPlanProperties.recoveryFabricFriendlyName = reader.getString();
                } else if ("failoverDeploymentModel".equals(fieldName)) {
                    deserializedRecoveryPlanProperties.failoverDeploymentModel = reader.getString();
                } else if ("replicationProviders".equals(fieldName)) {
                    List<String> replicationProviders = reader.readArray(reader1 -> reader1.getString());
                    deserializedRecoveryPlanProperties.replicationProviders = replicationProviders;
                } else if ("allowedOperations".equals(fieldName)) {
                    List<String> allowedOperations = reader.readArray(reader1 -> reader1.getString());
                    deserializedRecoveryPlanProperties.allowedOperations = allowedOperations;
                } else if ("lastPlannedFailoverTime".equals(fieldName)) {
                    deserializedRecoveryPlanProperties.lastPlannedFailoverTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastUnplannedFailoverTime".equals(fieldName)) {
                    deserializedRecoveryPlanProperties.lastUnplannedFailoverTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastTestFailoverTime".equals(fieldName)) {
                    deserializedRecoveryPlanProperties.lastTestFailoverTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("currentScenario".equals(fieldName)) {
                    deserializedRecoveryPlanProperties.currentScenario = CurrentScenarioDetails.fromJson(reader);
                } else if ("currentScenarioStatus".equals(fieldName)) {
                    deserializedRecoveryPlanProperties.currentScenarioStatus = reader.getString();
                } else if ("currentScenarioStatusDescription".equals(fieldName)) {
                    deserializedRecoveryPlanProperties.currentScenarioStatusDescription = reader.getString();
                } else if ("groups".equals(fieldName)) {
                    List<RecoveryPlanGroup> groups = reader.readArray(reader1 -> RecoveryPlanGroup.fromJson(reader1));
                    deserializedRecoveryPlanProperties.groups = groups;
                } else if ("providerSpecificDetails".equals(fieldName)) {
                    List<RecoveryPlanProviderSpecificDetails> providerSpecificDetails
                        = reader.readArray(reader1 -> RecoveryPlanProviderSpecificDetails.fromJson(reader1));
                    deserializedRecoveryPlanProperties.providerSpecificDetails = providerSpecificDetails;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRecoveryPlanProperties;
        });
    }
}
