// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.elasticsan.models.IscsiTargetInfo;
import com.azure.resourcemanager.elasticsan.models.ManagedByInfo;
import com.azure.resourcemanager.elasticsan.models.ProvisioningStates;
import com.azure.resourcemanager.elasticsan.models.SourceCreationData;
import java.io.IOException;

/**
 * Response for Volume request.
 */
@Fluent
public final class VolumeInner extends ProxyResource {
    /*
     * Properties of Volume.
     */
    private VolumeProperties innerProperties = new VolumeProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of VolumeInner class.
     */
    public VolumeInner() {
    }

    /**
     * Get the innerProperties property: Properties of Volume.
     * 
     * @return the innerProperties value.
     */
    private VolumeProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the volumeId property: Unique Id of the volume in GUID format.
     * 
     * @return the volumeId value.
     */
    public String volumeId() {
        return this.innerProperties() == null ? null : this.innerProperties().volumeId();
    }

    /**
     * Get the creationData property: State of the operation on the resource.
     * 
     * @return the creationData value.
     */
    public SourceCreationData creationData() {
        return this.innerProperties() == null ? null : this.innerProperties().creationData();
    }

    /**
     * Set the creationData property: State of the operation on the resource.
     * 
     * @param creationData the creationData value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withCreationData(SourceCreationData creationData) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withCreationData(creationData);
        return this;
    }

    /**
     * Get the sizeGiB property: Volume size.
     * 
     * @return the sizeGiB value.
     */
    public long sizeGiB() {
        return this.innerProperties() == null ? 0L : this.innerProperties().sizeGiB();
    }

    /**
     * Set the sizeGiB property: Volume size.
     * 
     * @param sizeGiB the sizeGiB value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withSizeGiB(long sizeGiB) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withSizeGiB(sizeGiB);
        return this;
    }

    /**
     * Get the storageTarget property: Storage target information.
     * 
     * @return the storageTarget value.
     */
    public IscsiTargetInfo storageTarget() {
        return this.innerProperties() == null ? null : this.innerProperties().storageTarget();
    }

    /**
     * Get the managedBy property: Parent resource information.
     * 
     * @return the managedBy value.
     */
    public ManagedByInfo managedBy() {
        return this.innerProperties() == null ? null : this.innerProperties().managedBy();
    }

    /**
     * Set the managedBy property: Parent resource information.
     * 
     * @param managedBy the managedBy value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withManagedBy(ManagedByInfo managedBy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withManagedBy(managedBy);
        return this;
    }

    /**
     * Get the provisioningState property: State of the operation on the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningStates provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property innerProperties in model VolumeInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VolumeInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VolumeInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VolumeInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VolumeInner.
     */
    public static VolumeInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VolumeInner deserializedVolumeInner = new VolumeInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedVolumeInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedVolumeInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedVolumeInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedVolumeInner.innerProperties = VolumeProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedVolumeInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVolumeInner;
        });
    }
}
