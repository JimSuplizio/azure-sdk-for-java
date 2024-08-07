// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The restorable dropped managed database's properties.
 */
@Immutable
public final class RestorableDroppedManagedDatabaseProperties
    implements JsonSerializable<RestorableDroppedManagedDatabaseProperties> {
    /*
     * The name of the database.
     */
    private String databaseName;

    /*
     * The creation date of the database (ISO8601 format).
     */
    private OffsetDateTime creationDate;

    /*
     * The deletion date of the database (ISO8601 format).
     */
    private OffsetDateTime deletionDate;

    /*
     * The earliest restore date of the database (ISO8601 format).
     */
    private OffsetDateTime earliestRestoreDate;

    /**
     * Creates an instance of RestorableDroppedManagedDatabaseProperties class.
     */
    public RestorableDroppedManagedDatabaseProperties() {
    }

    /**
     * Get the databaseName property: The name of the database.
     * 
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the creationDate property: The creation date of the database (ISO8601 format).
     * 
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the deletionDate property: The deletion date of the database (ISO8601 format).
     * 
     * @return the deletionDate value.
     */
    public OffsetDateTime deletionDate() {
        return this.deletionDate;
    }

    /**
     * Get the earliestRestoreDate property: The earliest restore date of the database (ISO8601 format).
     * 
     * @return the earliestRestoreDate value.
     */
    public OffsetDateTime earliestRestoreDate() {
        return this.earliestRestoreDate;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RestorableDroppedManagedDatabaseProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RestorableDroppedManagedDatabaseProperties if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RestorableDroppedManagedDatabaseProperties.
     */
    public static RestorableDroppedManagedDatabaseProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RestorableDroppedManagedDatabaseProperties deserializedRestorableDroppedManagedDatabaseProperties
                = new RestorableDroppedManagedDatabaseProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("databaseName".equals(fieldName)) {
                    deserializedRestorableDroppedManagedDatabaseProperties.databaseName = reader.getString();
                } else if ("creationDate".equals(fieldName)) {
                    deserializedRestorableDroppedManagedDatabaseProperties.creationDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("deletionDate".equals(fieldName)) {
                    deserializedRestorableDroppedManagedDatabaseProperties.deletionDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("earliestRestoreDate".equals(fieldName)) {
                    deserializedRestorableDroppedManagedDatabaseProperties.earliestRestoreDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRestorableDroppedManagedDatabaseProperties;
        });
    }
}
