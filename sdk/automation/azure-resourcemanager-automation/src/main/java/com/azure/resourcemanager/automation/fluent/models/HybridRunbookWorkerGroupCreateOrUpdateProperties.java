// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.automation.models.RunAsCredentialAssociationProperty;
import java.io.IOException;

/**
 * The hybrid runbook worker group properties.
 */
@Fluent
public final class HybridRunbookWorkerGroupCreateOrUpdateProperties
    implements JsonSerializable<HybridRunbookWorkerGroupCreateOrUpdateProperties> {
    /*
     * Sets the credential of a worker group.
     */
    private RunAsCredentialAssociationProperty credential;

    /**
     * Creates an instance of HybridRunbookWorkerGroupCreateOrUpdateProperties class.
     */
    public HybridRunbookWorkerGroupCreateOrUpdateProperties() {
    }

    /**
     * Get the credential property: Sets the credential of a worker group.
     * 
     * @return the credential value.
     */
    public RunAsCredentialAssociationProperty credential() {
        return this.credential;
    }

    /**
     * Set the credential property: Sets the credential of a worker group.
     * 
     * @param credential the credential value to set.
     * @return the HybridRunbookWorkerGroupCreateOrUpdateProperties object itself.
     */
    public HybridRunbookWorkerGroupCreateOrUpdateProperties
        withCredential(RunAsCredentialAssociationProperty credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (credential() != null) {
            credential().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("credential", this.credential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HybridRunbookWorkerGroupCreateOrUpdateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HybridRunbookWorkerGroupCreateOrUpdateProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HybridRunbookWorkerGroupCreateOrUpdateProperties.
     */
    public static HybridRunbookWorkerGroupCreateOrUpdateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HybridRunbookWorkerGroupCreateOrUpdateProperties deserializedHybridRunbookWorkerGroupCreateOrUpdateProperties
                = new HybridRunbookWorkerGroupCreateOrUpdateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("credential".equals(fieldName)) {
                    deserializedHybridRunbookWorkerGroupCreateOrUpdateProperties.credential
                        = RunAsCredentialAssociationProperty.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHybridRunbookWorkerGroupCreateOrUpdateProperties;
        });
    }
}
