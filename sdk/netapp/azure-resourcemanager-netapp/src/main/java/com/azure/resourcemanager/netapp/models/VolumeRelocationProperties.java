// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Volume relocation properties.
 */
@Fluent
public final class VolumeRelocationProperties implements JsonSerializable<VolumeRelocationProperties> {
    /*
     * Has relocation been requested for this volume
     */
    private Boolean relocationRequested;

    /*
     * Has relocation finished and is ready to be cleaned up
     */
    private Boolean readyToBeFinalized;

    /**
     * Creates an instance of VolumeRelocationProperties class.
     */
    public VolumeRelocationProperties() {
    }

    /**
     * Get the relocationRequested property: Has relocation been requested for this volume.
     * 
     * @return the relocationRequested value.
     */
    public Boolean relocationRequested() {
        return this.relocationRequested;
    }

    /**
     * Set the relocationRequested property: Has relocation been requested for this volume.
     * 
     * @param relocationRequested the relocationRequested value to set.
     * @return the VolumeRelocationProperties object itself.
     */
    public VolumeRelocationProperties withRelocationRequested(Boolean relocationRequested) {
        this.relocationRequested = relocationRequested;
        return this;
    }

    /**
     * Get the readyToBeFinalized property: Has relocation finished and is ready to be cleaned up.
     * 
     * @return the readyToBeFinalized value.
     */
    public Boolean readyToBeFinalized() {
        return this.readyToBeFinalized;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("relocationRequested", this.relocationRequested);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VolumeRelocationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VolumeRelocationProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VolumeRelocationProperties.
     */
    public static VolumeRelocationProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VolumeRelocationProperties deserializedVolumeRelocationProperties = new VolumeRelocationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("relocationRequested".equals(fieldName)) {
                    deserializedVolumeRelocationProperties.relocationRequested
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("readyToBeFinalized".equals(fieldName)) {
                    deserializedVolumeRelocationProperties.readyToBeFinalized
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVolumeRelocationProperties;
        });
    }
}
