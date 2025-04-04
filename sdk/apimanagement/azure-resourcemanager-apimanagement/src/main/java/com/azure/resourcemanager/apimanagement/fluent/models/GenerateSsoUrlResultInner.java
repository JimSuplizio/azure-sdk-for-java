// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Generate SSO Url operations response details.
 */
@Fluent
public final class GenerateSsoUrlResultInner implements JsonSerializable<GenerateSsoUrlResultInner> {
    /*
     * Redirect Url containing the SSO URL value.
     */
    private String value;

    /**
     * Creates an instance of GenerateSsoUrlResultInner class.
     */
    public GenerateSsoUrlResultInner() {
    }

    /**
     * Get the value property: Redirect Url containing the SSO URL value.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Redirect Url containing the SSO URL value.
     * 
     * @param value the value value to set.
     * @return the GenerateSsoUrlResultInner object itself.
     */
    public GenerateSsoUrlResultInner withValue(String value) {
        this.value = value;
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
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GenerateSsoUrlResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GenerateSsoUrlResultInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GenerateSsoUrlResultInner.
     */
    public static GenerateSsoUrlResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GenerateSsoUrlResultInner deserializedGenerateSsoUrlResultInner = new GenerateSsoUrlResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    deserializedGenerateSsoUrlResultInner.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGenerateSsoUrlResultInner;
        });
    }
}
