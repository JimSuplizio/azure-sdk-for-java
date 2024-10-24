// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Diagnostic capabilities achieved by java agent.
 */
@Fluent
public final class RuntimeJavaAgent implements JsonSerializable<RuntimeJavaAgent> {
    /*
     * Enable java agent injection for the java app.
     */
    private Boolean enabled;

    /*
     * Capabilities on the java logging scenario.
     */
    private RuntimeJavaAgentLogging logging;

    /**
     * Creates an instance of RuntimeJavaAgent class.
     */
    public RuntimeJavaAgent() {
    }

    /**
     * Get the enabled property: Enable java agent injection for the java app.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Enable java agent injection for the java app.
     * 
     * @param enabled the enabled value to set.
     * @return the RuntimeJavaAgent object itself.
     */
    public RuntimeJavaAgent withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the logging property: Capabilities on the java logging scenario.
     * 
     * @return the logging value.
     */
    public RuntimeJavaAgentLogging logging() {
        return this.logging;
    }

    /**
     * Set the logging property: Capabilities on the java logging scenario.
     * 
     * @param logging the logging value to set.
     * @return the RuntimeJavaAgent object itself.
     */
    public RuntimeJavaAgent withLogging(RuntimeJavaAgentLogging logging) {
        this.logging = logging;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logging() != null) {
            logging().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeJsonField("logging", this.logging);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RuntimeJavaAgent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RuntimeJavaAgent if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RuntimeJavaAgent.
     */
    public static RuntimeJavaAgent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RuntimeJavaAgent deserializedRuntimeJavaAgent = new RuntimeJavaAgent();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedRuntimeJavaAgent.enabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("logging".equals(fieldName)) {
                    deserializedRuntimeJavaAgent.logging = RuntimeJavaAgentLogging.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRuntimeJavaAgent;
        });
    }
}
