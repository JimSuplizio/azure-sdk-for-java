// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The DraModelSystemData model.
 */
@Fluent
public final class DraModelSystemData extends SystemDataModel {
    /**
     * Creates an instance of DraModelSystemData class.
     */
    public DraModelSystemData() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DraModelSystemData withCreatedBy(String createdBy) {
        super.withCreatedBy(createdBy);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DraModelSystemData withCreatedByType(String createdByType) {
        super.withCreatedByType(createdByType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DraModelSystemData withCreatedAt(OffsetDateTime createdAt) {
        super.withCreatedAt(createdAt);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DraModelSystemData withLastModifiedBy(String lastModifiedBy) {
        super.withLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DraModelSystemData withLastModifiedByType(String lastModifiedByType) {
        super.withLastModifiedByType(lastModifiedByType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DraModelSystemData withLastModifiedAt(OffsetDateTime lastModifiedAt) {
        super.withLastModifiedAt(lastModifiedAt);
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
        jsonWriter.writeStringField("createdBy", createdBy());
        jsonWriter.writeStringField("createdByType", createdByType());
        jsonWriter.writeStringField("createdAt",
            createdAt() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(createdAt()));
        jsonWriter.writeStringField("lastModifiedBy", lastModifiedBy());
        jsonWriter.writeStringField("lastModifiedByType", lastModifiedByType());
        jsonWriter.writeStringField("lastModifiedAt",
            lastModifiedAt() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(lastModifiedAt()));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DraModelSystemData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DraModelSystemData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DraModelSystemData.
     */
    public static DraModelSystemData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DraModelSystemData deserializedDraModelSystemData = new DraModelSystemData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("createdBy".equals(fieldName)) {
                    deserializedDraModelSystemData.withCreatedBy(reader.getString());
                } else if ("createdByType".equals(fieldName)) {
                    deserializedDraModelSystemData.withCreatedByType(reader.getString());
                } else if ("createdAt".equals(fieldName)) {
                    deserializedDraModelSystemData.withCreatedAt(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("lastModifiedBy".equals(fieldName)) {
                    deserializedDraModelSystemData.withLastModifiedBy(reader.getString());
                } else if ("lastModifiedByType".equals(fieldName)) {
                    deserializedDraModelSystemData.withLastModifiedByType(reader.getString());
                } else if ("lastModifiedAt".equals(fieldName)) {
                    deserializedDraModelSystemData.withLastModifiedAt(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDraModelSystemData;
        });
    }
}
