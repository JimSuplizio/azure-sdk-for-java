// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.StackPreferredOs;
import com.azure.resourcemanager.appservice.models.WebAppMajorVersion;
import java.io.IOException;
import java.util.List;

/**
 * WebAppStack resource specific properties.
 */
@Immutable
public final class WebAppStackProperties implements JsonSerializable<WebAppStackProperties> {
    /*
     * Web App stack (display only).
     */
    private String displayText;

    /*
     * Web App stack name.
     */
    private String value;

    /*
     * List of major versions available.
     */
    private List<WebAppMajorVersion> majorVersions;

    /*
     * Web App stack preferred OS.
     */
    private StackPreferredOs preferredOs;

    /**
     * Creates an instance of WebAppStackProperties class.
     */
    public WebAppStackProperties() {
    }

    /**
     * Get the displayText property: Web App stack (display only).
     * 
     * @return the displayText value.
     */
    public String displayText() {
        return this.displayText;
    }

    /**
     * Get the value property: Web App stack name.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Get the majorVersions property: List of major versions available.
     * 
     * @return the majorVersions value.
     */
    public List<WebAppMajorVersion> majorVersions() {
        return this.majorVersions;
    }

    /**
     * Get the preferredOs property: Web App stack preferred OS.
     * 
     * @return the preferredOs value.
     */
    public StackPreferredOs preferredOs() {
        return this.preferredOs;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (majorVersions() != null) {
            majorVersions().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WebAppStackProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WebAppStackProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WebAppStackProperties.
     */
    public static WebAppStackProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WebAppStackProperties deserializedWebAppStackProperties = new WebAppStackProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("displayText".equals(fieldName)) {
                    deserializedWebAppStackProperties.displayText = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedWebAppStackProperties.value = reader.getString();
                } else if ("majorVersions".equals(fieldName)) {
                    List<WebAppMajorVersion> majorVersions
                        = reader.readArray(reader1 -> WebAppMajorVersion.fromJson(reader1));
                    deserializedWebAppStackProperties.majorVersions = majorVersions;
                } else if ("preferredOs".equals(fieldName)) {
                    deserializedWebAppStackProperties.preferredOs = StackPreferredOs.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWebAppStackProperties;
        });
    }
}
