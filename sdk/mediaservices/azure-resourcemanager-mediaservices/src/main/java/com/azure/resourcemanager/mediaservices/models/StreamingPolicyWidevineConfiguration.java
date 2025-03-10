// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Class to specify configurations of Widevine in Streaming Policy.
 */
@Fluent
public final class StreamingPolicyWidevineConfiguration
    implements JsonSerializable<StreamingPolicyWidevineConfiguration> {
    /*
     * Template for the URL of the custom service delivering licenses to end user players. Not required when using Azure
     * Media Services for issuing licenses. The template supports replaceable tokens that the service will update at
     * runtime with the value specific to the request. The currently supported token values are {AlternativeMediaId},
     * which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced
     * with the value of identifier of the key being requested.
     */
    private String customLicenseAcquisitionUrlTemplate;

    /**
     * Creates an instance of StreamingPolicyWidevineConfiguration class.
     */
    public StreamingPolicyWidevineConfiguration() {
    }

    /**
     * Get the customLicenseAcquisitionUrlTemplate property: Template for the URL of the custom service delivering
     * licenses to end user players. Not required when using Azure Media Services for issuing licenses. The template
     * supports replaceable tokens that the service will update at runtime with the value specific to the request. The
     * currently supported token values are {AlternativeMediaId}, which is replaced with the value of
     * StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the
     * key being requested.
     * 
     * @return the customLicenseAcquisitionUrlTemplate value.
     */
    public String customLicenseAcquisitionUrlTemplate() {
        return this.customLicenseAcquisitionUrlTemplate;
    }

    /**
     * Set the customLicenseAcquisitionUrlTemplate property: Template for the URL of the custom service delivering
     * licenses to end user players. Not required when using Azure Media Services for issuing licenses. The template
     * supports replaceable tokens that the service will update at runtime with the value specific to the request. The
     * currently supported token values are {AlternativeMediaId}, which is replaced with the value of
     * StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the
     * key being requested.
     * 
     * @param customLicenseAcquisitionUrlTemplate the customLicenseAcquisitionUrlTemplate value to set.
     * @return the StreamingPolicyWidevineConfiguration object itself.
     */
    public StreamingPolicyWidevineConfiguration
        withCustomLicenseAcquisitionUrlTemplate(String customLicenseAcquisitionUrlTemplate) {
        this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
        return this;
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
        jsonWriter.writeStringField("customLicenseAcquisitionUrlTemplate", this.customLicenseAcquisitionUrlTemplate);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StreamingPolicyWidevineConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StreamingPolicyWidevineConfiguration if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StreamingPolicyWidevineConfiguration.
     */
    public static StreamingPolicyWidevineConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StreamingPolicyWidevineConfiguration deserializedStreamingPolicyWidevineConfiguration
                = new StreamingPolicyWidevineConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("customLicenseAcquisitionUrlTemplate".equals(fieldName)) {
                    deserializedStreamingPolicyWidevineConfiguration.customLicenseAcquisitionUrlTemplate
                        = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStreamingPolicyWidevineConfiguration;
        });
    }
}
