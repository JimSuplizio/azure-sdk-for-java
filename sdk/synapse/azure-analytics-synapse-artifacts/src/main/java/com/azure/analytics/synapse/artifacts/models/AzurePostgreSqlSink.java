// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A copy activity Azure PostgreSQL sink.
 */
@Fluent
public final class AzurePostgreSqlSink extends CopySink {
    /*
     * Copy sink type.
     */
    private String type = "AzurePostgreSqlSink";

    /*
     * A query to execute before starting the copy. Type: string (or Expression with resultType string).
     */
    private Object preCopyScript;

    /**
     * Creates an instance of AzurePostgreSqlSink class.
     */
    public AzurePostgreSqlSink() {
    }

    /**
     * Get the type property: Copy sink type.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the preCopyScript property: A query to execute before starting the copy. Type: string (or Expression with
     * resultType string).
     * 
     * @return the preCopyScript value.
     */
    public Object getPreCopyScript() {
        return this.preCopyScript;
    }

    /**
     * Set the preCopyScript property: A query to execute before starting the copy. Type: string (or Expression with
     * resultType string).
     * 
     * @param preCopyScript the preCopyScript value to set.
     * @return the AzurePostgreSqlSink object itself.
     */
    public AzurePostgreSqlSink setPreCopyScript(Object preCopyScript) {
        this.preCopyScript = preCopyScript;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzurePostgreSqlSink setWriteBatchSize(Object writeBatchSize) {
        super.setWriteBatchSize(writeBatchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzurePostgreSqlSink setWriteBatchTimeout(Object writeBatchTimeout) {
        super.setWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzurePostgreSqlSink setSinkRetryCount(Object sinkRetryCount) {
        super.setSinkRetryCount(sinkRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzurePostgreSqlSink setSinkRetryWait(Object sinkRetryWait) {
        super.setSinkRetryWait(sinkRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzurePostgreSqlSink setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("writeBatchSize", getWriteBatchSize());
        jsonWriter.writeUntypedField("writeBatchTimeout", getWriteBatchTimeout());
        jsonWriter.writeUntypedField("sinkRetryCount", getSinkRetryCount());
        jsonWriter.writeUntypedField("sinkRetryWait", getSinkRetryWait());
        jsonWriter.writeUntypedField("maxConcurrentConnections", getMaxConcurrentConnections());
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeUntypedField("preCopyScript", this.preCopyScript);
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzurePostgreSqlSink from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzurePostgreSqlSink if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzurePostgreSqlSink.
     */
    public static AzurePostgreSqlSink fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzurePostgreSqlSink deserializedAzurePostgreSqlSink = new AzurePostgreSqlSink();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("writeBatchSize".equals(fieldName)) {
                    deserializedAzurePostgreSqlSink.setWriteBatchSize(reader.readUntyped());
                } else if ("writeBatchTimeout".equals(fieldName)) {
                    deserializedAzurePostgreSqlSink.setWriteBatchTimeout(reader.readUntyped());
                } else if ("sinkRetryCount".equals(fieldName)) {
                    deserializedAzurePostgreSqlSink.setSinkRetryCount(reader.readUntyped());
                } else if ("sinkRetryWait".equals(fieldName)) {
                    deserializedAzurePostgreSqlSink.setSinkRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedAzurePostgreSqlSink.setMaxConcurrentConnections(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedAzurePostgreSqlSink.type = reader.getString();
                } else if ("preCopyScript".equals(fieldName)) {
                    deserializedAzurePostgreSqlSink.preCopyScript = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedAzurePostgreSqlSink.setAdditionalProperties(additionalProperties);

            return deserializedAzurePostgreSqlSink;
        });
    }
}
