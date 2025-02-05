// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Information about a generated ARM template.
 */
@Fluent
public final class ArmTemplateInfoInner implements JsonSerializable<ArmTemplateInfoInner> {
    /*
     * The template's contents.
     */
    private Object template;

    /*
     * The parameters of the ARM template.
     */
    private Object parameters;

    /**
     * Creates an instance of ArmTemplateInfoInner class.
     */
    public ArmTemplateInfoInner() {
    }

    /**
     * Get the template property: The template's contents.
     * 
     * @return the template value.
     */
    public Object template() {
        return this.template;
    }

    /**
     * Set the template property: The template's contents.
     * 
     * @param template the template value to set.
     * @return the ArmTemplateInfoInner object itself.
     */
    public ArmTemplateInfoInner withTemplate(Object template) {
        this.template = template;
        return this;
    }

    /**
     * Get the parameters property: The parameters of the ARM template.
     * 
     * @return the parameters value.
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters of the ARM template.
     * 
     * @param parameters the parameters value to set.
     * @return the ArmTemplateInfoInner object itself.
     */
    public ArmTemplateInfoInner withParameters(Object parameters) {
        this.parameters = parameters;
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
        jsonWriter.writeUntypedField("template", this.template);
        jsonWriter.writeUntypedField("parameters", this.parameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ArmTemplateInfoInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ArmTemplateInfoInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ArmTemplateInfoInner.
     */
    public static ArmTemplateInfoInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ArmTemplateInfoInner deserializedArmTemplateInfoInner = new ArmTemplateInfoInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("template".equals(fieldName)) {
                    deserializedArmTemplateInfoInner.template = reader.readUntyped();
                } else if ("parameters".equals(fieldName)) {
                    deserializedArmTemplateInfoInner.parameters = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedArmTemplateInfoInner;
        });
    }
}
