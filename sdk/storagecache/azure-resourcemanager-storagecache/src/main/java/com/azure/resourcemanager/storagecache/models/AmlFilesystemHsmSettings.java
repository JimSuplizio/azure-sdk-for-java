// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * AML file system HSM settings.
 */
@Fluent
public final class AmlFilesystemHsmSettings implements JsonSerializable<AmlFilesystemHsmSettings> {
    /*
     * Resource ID of storage container used for hydrating the namespace and archiving from the namespace. The resource
     * provider must have permission to create SAS tokens on the storage account.
     */
    private String container;

    /*
     * Resource ID of storage container used for logging events and errors. Must be a separate container in the same
     * storage account as the hydration and archive container. The resource provider must have permission to create SAS
     * tokens on the storage account.
     */
    private String loggingContainer;

    /*
     * Only blobs in the non-logging container that start with this path/prefix get imported into the cluster namespace.
     * This is only used during initial creation of the AML file system. It automatically creates an import job resource
     * that can be deleted.
     */
    private String importPrefix;

    /*
     * Only blobs in the non-logging container that start with one of the paths/prefixes in this array get imported into
     * the cluster namespace. This is only used during initial creation of the AML file system and has '/' as the
     * default value. It automatically creates an import job resource that can be deleted.
     */
    private List<String> importPrefixesInitial;

    /**
     * Creates an instance of AmlFilesystemHsmSettings class.
     */
    public AmlFilesystemHsmSettings() {
    }

    /**
     * Get the container property: Resource ID of storage container used for hydrating the namespace and archiving from
     * the namespace. The resource provider must have permission to create SAS tokens on the storage account.
     * 
     * @return the container value.
     */
    public String container() {
        return this.container;
    }

    /**
     * Set the container property: Resource ID of storage container used for hydrating the namespace and archiving from
     * the namespace. The resource provider must have permission to create SAS tokens on the storage account.
     * 
     * @param container the container value to set.
     * @return the AmlFilesystemHsmSettings object itself.
     */
    public AmlFilesystemHsmSettings withContainer(String container) {
        this.container = container;
        return this;
    }

    /**
     * Get the loggingContainer property: Resource ID of storage container used for logging events and errors. Must be a
     * separate container in the same storage account as the hydration and archive container. The resource provider must
     * have permission to create SAS tokens on the storage account.
     * 
     * @return the loggingContainer value.
     */
    public String loggingContainer() {
        return this.loggingContainer;
    }

    /**
     * Set the loggingContainer property: Resource ID of storage container used for logging events and errors. Must be a
     * separate container in the same storage account as the hydration and archive container. The resource provider must
     * have permission to create SAS tokens on the storage account.
     * 
     * @param loggingContainer the loggingContainer value to set.
     * @return the AmlFilesystemHsmSettings object itself.
     */
    public AmlFilesystemHsmSettings withLoggingContainer(String loggingContainer) {
        this.loggingContainer = loggingContainer;
        return this;
    }

    /**
     * Get the importPrefix property: Only blobs in the non-logging container that start with this path/prefix get
     * imported into the cluster namespace. This is only used during initial creation of the AML file system. It
     * automatically creates an import job resource that can be deleted.
     * 
     * @return the importPrefix value.
     */
    public String importPrefix() {
        return this.importPrefix;
    }

    /**
     * Set the importPrefix property: Only blobs in the non-logging container that start with this path/prefix get
     * imported into the cluster namespace. This is only used during initial creation of the AML file system. It
     * automatically creates an import job resource that can be deleted.
     * 
     * @param importPrefix the importPrefix value to set.
     * @return the AmlFilesystemHsmSettings object itself.
     */
    public AmlFilesystemHsmSettings withImportPrefix(String importPrefix) {
        this.importPrefix = importPrefix;
        return this;
    }

    /**
     * Get the importPrefixesInitial property: Only blobs in the non-logging container that start with one of the
     * paths/prefixes in this array get imported into the cluster namespace. This is only used during initial creation
     * of the AML file system and has '/' as the default value. It automatically creates an import job resource that can
     * be deleted.
     * 
     * @return the importPrefixesInitial value.
     */
    public List<String> importPrefixesInitial() {
        return this.importPrefixesInitial;
    }

    /**
     * Set the importPrefixesInitial property: Only blobs in the non-logging container that start with one of the
     * paths/prefixes in this array get imported into the cluster namespace. This is only used during initial creation
     * of the AML file system and has '/' as the default value. It automatically creates an import job resource that can
     * be deleted.
     * 
     * @param importPrefixesInitial the importPrefixesInitial value to set.
     * @return the AmlFilesystemHsmSettings object itself.
     */
    public AmlFilesystemHsmSettings withImportPrefixesInitial(List<String> importPrefixesInitial) {
        this.importPrefixesInitial = importPrefixesInitial;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (container() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property container in model AmlFilesystemHsmSettings"));
        }
        if (loggingContainer() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property loggingContainer in model AmlFilesystemHsmSettings"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AmlFilesystemHsmSettings.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("container", this.container);
        jsonWriter.writeStringField("loggingContainer", this.loggingContainer);
        jsonWriter.writeStringField("importPrefix", this.importPrefix);
        jsonWriter.writeArrayField("importPrefixesInitial", this.importPrefixesInitial,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AmlFilesystemHsmSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AmlFilesystemHsmSettings if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AmlFilesystemHsmSettings.
     */
    public static AmlFilesystemHsmSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AmlFilesystemHsmSettings deserializedAmlFilesystemHsmSettings = new AmlFilesystemHsmSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("container".equals(fieldName)) {
                    deserializedAmlFilesystemHsmSettings.container = reader.getString();
                } else if ("loggingContainer".equals(fieldName)) {
                    deserializedAmlFilesystemHsmSettings.loggingContainer = reader.getString();
                } else if ("importPrefix".equals(fieldName)) {
                    deserializedAmlFilesystemHsmSettings.importPrefix = reader.getString();
                } else if ("importPrefixesInitial".equals(fieldName)) {
                    List<String> importPrefixesInitial = reader.readArray(reader1 -> reader1.getString());
                    deserializedAmlFilesystemHsmSettings.importPrefixesInitial = importPrefixesInitial;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAmlFilesystemHsmSettings;
        });
    }
}
