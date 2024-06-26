// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Parameters for onboard operation.
 */
@Fluent
public final class OnboardRequest implements JsonSerializable<OnboardRequest> {
    /*
     * List of subscription ids to be onboarded
     */
    private List<String> subscriptionIds;

    /**
     * Creates an instance of OnboardRequest class.
     */
    public OnboardRequest() {
    }

    /**
     * Get the subscriptionIds property: List of subscription ids to be onboarded.
     * 
     * @return the subscriptionIds value.
     */
    public List<String> subscriptionIds() {
        return this.subscriptionIds;
    }

    /**
     * Set the subscriptionIds property: List of subscription ids to be onboarded.
     * 
     * @param subscriptionIds the subscriptionIds value to set.
     * @return the OnboardRequest object itself.
     */
    public OnboardRequest withSubscriptionIds(List<String> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subscriptionIds() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property subscriptionIds in model OnboardRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OnboardRequest.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("subscriptionIds", this.subscriptionIds,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OnboardRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OnboardRequest if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OnboardRequest.
     */
    public static OnboardRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OnboardRequest deserializedOnboardRequest = new OnboardRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("subscriptionIds".equals(fieldName)) {
                    List<String> subscriptionIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedOnboardRequest.subscriptionIds = subscriptionIds;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOnboardRequest;
        });
    }
}
