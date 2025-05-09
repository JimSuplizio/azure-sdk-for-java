// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The Azure Core NFVI detail.
 */
@Fluent
public final class AzureCoreNfviDetails extends NfvIs {
    /*
     * The NFVI type.
     */
    private NfviType nfviType = NfviType.AZURE_CORE;

    /*
     * Location of the Azure core.
     */
    private String location;

    /**
     * Creates an instance of AzureCoreNfviDetails class.
     */
    public AzureCoreNfviDetails() {
    }

    /**
     * Get the nfviType property: The NFVI type.
     * 
     * @return the nfviType value.
     */
    @Override
    public NfviType nfviType() {
        return this.nfviType;
    }

    /**
     * Get the location property: Location of the Azure core.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location of the Azure core.
     * 
     * @param location the location value to set.
     * @return the AzureCoreNfviDetails object itself.
     */
    public AzureCoreNfviDetails withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureCoreNfviDetails withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", name());
        jsonWriter.writeStringField("nfviType", this.nfviType == null ? null : this.nfviType.toString());
        jsonWriter.writeStringField("location", this.location);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureCoreNfviDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureCoreNfviDetails if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureCoreNfviDetails.
     */
    public static AzureCoreNfviDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureCoreNfviDetails deserializedAzureCoreNfviDetails = new AzureCoreNfviDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedAzureCoreNfviDetails.withName(reader.getString());
                } else if ("nfviType".equals(fieldName)) {
                    deserializedAzureCoreNfviDetails.nfviType = NfviType.fromString(reader.getString());
                } else if ("location".equals(fieldName)) {
                    deserializedAzureCoreNfviDetails.location = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureCoreNfviDetails;
        });
    }
}
