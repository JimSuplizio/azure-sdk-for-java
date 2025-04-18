// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Azure VM workload-specific protectable item representing SQL Availability Group.
 */
@Fluent
public final class AzureVmWorkloadSqlAvailabilityGroupProtectableItem extends AzureVmWorkloadProtectableItem {
    /*
     * Type of the backup item.
     */
    private String protectableItemType = "SQLAvailabilityGroupContainer";

    /*
     * List of the nodes in case of distributed container.
     */
    private List<DistributedNodesInfo> nodesList;

    /**
     * Creates an instance of AzureVmWorkloadSqlAvailabilityGroupProtectableItem class.
     */
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem() {
    }

    /**
     * Get the protectableItemType property: Type of the backup item.
     * 
     * @return the protectableItemType value.
     */
    @Override
    public String protectableItemType() {
        return this.protectableItemType;
    }

    /**
     * Get the nodesList property: List of the nodes in case of distributed container.
     * 
     * @return the nodesList value.
     */
    public List<DistributedNodesInfo> nodesList() {
        return this.nodesList;
    }

    /**
     * Set the nodesList property: List of the nodes in case of distributed container.
     * 
     * @param nodesList the nodesList value to set.
     * @return the AzureVmWorkloadSqlAvailabilityGroupProtectableItem object itself.
     */
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withNodesList(List<DistributedNodesInfo> nodesList) {
        this.nodesList = nodesList;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withParentName(String parentName) {
        super.withParentName(parentName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withParentUniqueName(String parentUniqueName) {
        super.withParentUniqueName(parentUniqueName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withServerName(String serverName) {
        super.withServerName(serverName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withIsAutoProtectable(Boolean isAutoProtectable) {
        super.withIsAutoProtectable(isAutoProtectable);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withIsAutoProtected(Boolean isAutoProtected) {
        super.withIsAutoProtected(isAutoProtected);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withSubinquireditemcount(Integer subinquireditemcount) {
        super.withSubinquireditemcount(subinquireditemcount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem
        withSubprotectableitemcount(Integer subprotectableitemcount) {
        super.withSubprotectableitemcount(subprotectableitemcount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem
        withPrebackupvalidation(PreBackupValidation prebackupvalidation) {
        super.withPrebackupvalidation(prebackupvalidation);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withIsProtectable(Boolean isProtectable) {
        super.withIsProtectable(isProtectable);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withBackupManagementType(String backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withWorkloadType(String workloadType) {
        super.withWorkloadType(workloadType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlAvailabilityGroupProtectableItem withProtectionState(ProtectionStatus protectionState) {
        super.withProtectionState(protectionState);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (nodesList() != null) {
            nodesList().forEach(e -> e.validate());
        }
        if (prebackupvalidation() != null) {
            prebackupvalidation().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("backupManagementType", backupManagementType());
        jsonWriter.writeStringField("workloadType", workloadType());
        jsonWriter.writeStringField("friendlyName", friendlyName());
        jsonWriter.writeStringField("protectionState", protectionState() == null ? null : protectionState().toString());
        jsonWriter.writeStringField("parentName", parentName());
        jsonWriter.writeStringField("parentUniqueName", parentUniqueName());
        jsonWriter.writeStringField("serverName", serverName());
        jsonWriter.writeBooleanField("isAutoProtectable", isAutoProtectable());
        jsonWriter.writeBooleanField("isAutoProtected", isAutoProtected());
        jsonWriter.writeNumberField("subinquireditemcount", subinquireditemcount());
        jsonWriter.writeNumberField("subprotectableitemcount", subprotectableitemcount());
        jsonWriter.writeJsonField("prebackupvalidation", prebackupvalidation());
        jsonWriter.writeBooleanField("isProtectable", isProtectable());
        jsonWriter.writeStringField("protectableItemType", this.protectableItemType);
        jsonWriter.writeArrayField("nodesList", this.nodesList, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureVmWorkloadSqlAvailabilityGroupProtectableItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureVmWorkloadSqlAvailabilityGroupProtectableItem if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureVmWorkloadSqlAvailabilityGroupProtectableItem.
     */
    public static AzureVmWorkloadSqlAvailabilityGroupProtectableItem fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            AzureVmWorkloadSqlAvailabilityGroupProtectableItem deserializedAzureVmWorkloadSqlAvailabilityGroupProtectableItem
                = new AzureVmWorkloadSqlAvailabilityGroupProtectableItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("backupManagementType".equals(fieldName)) {
                    deserializedAzureVmWorkloadSqlAvailabilityGroupProtectableItem
                        .withBackupManagementType(reader.getString());
                } else if ("workloadType".equals(fieldName)) {
                    deserializedAzureVmWorkloadSqlAvailabilityGroupProtectableItem.withWorkloadType(reader.getString());
                } else if ("friendlyName".equals(fieldName)) {
                    deserializedAzureVmWorkloadSqlAvailabilityGroupProtectableItem.withFriendlyName(reader.getString());
                } else if ("protectionState".equals(fieldName)) {
                    deserializedAzureVmWorkloadSqlAvailabilityGroupProtectableItem
                        .withProtectionState(ProtectionStatus.fromString(reader.getString()));
                } else if ("parentName".equals(fieldName)) {
                    deserializedAzureVmWorkloadSqlAvailabilityGroupProtectableItem.withParentName(reader.getString());
                } else if ("parentUniqueName".equals(fieldName)) {
                    deserializedAzureVmWorkloadSqlAvailabilityGroupProtectableItem
                        .withParentUniqueName(reader.getString());
                } else if ("serverName".equals(fieldName)) {
                    deserializedAzureVmWorkloadSqlAvailabilityGroupProtectableItem.withServerName(reader.getString());
                } else if ("isAutoProtectable".equals(fieldName)) {
                    deserializedAzureVmWorkloadSqlAvailabilityGroupProtectableItem
                        .withIsAutoProtectable(reader.getNullable(JsonReader::getBoolean));
                } else if ("isAutoProtected".equals(fieldName)) {
                    deserializedAzureVmWorkloadSqlAvailabilityGroupProtectableItem
                        .withIsAutoProtected(reader.getNullable(JsonReader::getBoolean));
                } else if ("subinquireditemcount".equals(fieldName)) {
                    deserializedAzureVmWorkloadSqlAvailabilityGroupProtectableItem
                        .withSubinquireditemcount(reader.getNullable(JsonReader::getInt));
                } else if ("subprotectableitemcount".equals(fieldName)) {
                    deserializedAzureVmWorkloadSqlAvailabilityGroupProtectableItem
                        .withSubprotectableitemcount(reader.getNullable(JsonReader::getInt));
                } else if ("prebackupvalidation".equals(fieldName)) {
                    deserializedAzureVmWorkloadSqlAvailabilityGroupProtectableItem
                        .withPrebackupvalidation(PreBackupValidation.fromJson(reader));
                } else if ("isProtectable".equals(fieldName)) {
                    deserializedAzureVmWorkloadSqlAvailabilityGroupProtectableItem
                        .withIsProtectable(reader.getNullable(JsonReader::getBoolean));
                } else if ("protectableItemType".equals(fieldName)) {
                    deserializedAzureVmWorkloadSqlAvailabilityGroupProtectableItem.protectableItemType
                        = reader.getString();
                } else if ("nodesList".equals(fieldName)) {
                    List<DistributedNodesInfo> nodesList
                        = reader.readArray(reader1 -> DistributedNodesInfo.fromJson(reader1));
                    deserializedAzureVmWorkloadSqlAvailabilityGroupProtectableItem.nodesList = nodesList;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureVmWorkloadSqlAvailabilityGroupProtectableItem;
        });
    }
}
