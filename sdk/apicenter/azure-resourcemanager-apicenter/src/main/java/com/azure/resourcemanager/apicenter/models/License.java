// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The license information for the API.
 */
@Fluent
public final class License implements JsonSerializable<License> {
    /*
     * Name of the license.
     */
    private String name;

    /*
     * URL pointing to the license details. The URL field is mutually exclusive of the
     * identifier field.
     */
    private String url;

    /*
     * SPDX license information for the API. The identifier field is mutually
     * exclusive of the URL field.
     */
    private String identifier;

    /**
     * Creates an instance of License class.
     */
    public License() {
    }

    /**
     * Get the name property: Name of the license.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the license.
     * 
     * @param name the name value to set.
     * @return the License object itself.
     */
    public License withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the url property: URL pointing to the license details. The URL field is mutually exclusive of the
     * identifier field.
     * 
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: URL pointing to the license details. The URL field is mutually exclusive of the
     * identifier field.
     * 
     * @param url the url value to set.
     * @return the License object itself.
     */
    public License withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the identifier property: SPDX license information for the API. The identifier field is mutually
     * exclusive of the URL field.
     * 
     * @return the identifier value.
     */
    public String identifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: SPDX license information for the API. The identifier field is mutually
     * exclusive of the URL field.
     * 
     * @param identifier the identifier value to set.
     * @return the License object itself.
     */
    public License withIdentifier(String identifier) {
        this.identifier = identifier;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("url", this.url);
        jsonWriter.writeStringField("identifier", this.identifier);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of License from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of License if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the License.
     */
    public static License fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            License deserializedLicense = new License();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedLicense.name = reader.getString();
                } else if ("url".equals(fieldName)) {
                    deserializedLicense.url = reader.getString();
                } else if ("identifier".equals(fieldName)) {
                    deserializedLicense.identifier = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLicense;
        });
    }
}
