// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Template model for observed values.
 */
@Immutable
public class ObservedValue implements JsonSerializable<ObservedValue> {

    /*
     * The firstSeen property.
     */
    @Generated
    private OffsetDateTime firstSeen;

    /*
     * The lastSeen property.
     */
    @Generated
    private OffsetDateTime lastSeen;

    /*
     * The count property.
     */
    @Generated
    private Long count;

    /*
     * The recent property.
     */
    @Generated
    private Boolean recent;

    /**
     * Creates an instance of ObservedValue class.
     */
    @Generated
    protected ObservedValue() {
    }

    /**
     * Get the firstSeen property: The firstSeen property.
     *
     * @return the firstSeen value.
     */
    @Generated
    public OffsetDateTime getFirstSeen() {
        return this.firstSeen;
    }

    /**
     * Set the firstSeen property: The firstSeen property.
     *
     * @param firstSeen the firstSeen value to set.
     * @return the ObservedValue object itself.
     */
    @Generated
    ObservedValue setFirstSeen(OffsetDateTime firstSeen) {
        this.firstSeen = firstSeen;
        return this;
    }

    /**
     * Get the lastSeen property: The lastSeen property.
     *
     * @return the lastSeen value.
     */
    @Generated
    public OffsetDateTime getLastSeen() {
        return this.lastSeen;
    }

    /**
     * Set the lastSeen property: The lastSeen property.
     *
     * @param lastSeen the lastSeen value to set.
     * @return the ObservedValue object itself.
     */
    @Generated
    ObservedValue setLastSeen(OffsetDateTime lastSeen) {
        this.lastSeen = lastSeen;
        return this;
    }

    /**
     * Get the count property: The count property.
     *
     * @return the count value.
     */
    @Generated
    public Long getCount() {
        return this.count;
    }

    /**
     * Set the count property: The count property.
     *
     * @param count the count value to set.
     * @return the ObservedValue object itself.
     */
    @Generated
    ObservedValue setCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Get the recent property: The recent property.
     *
     * @return the recent value.
     */
    @Generated
    public Boolean isRecent() {
        return this.recent;
    }

    /**
     * Set the recent property: The recent property.
     *
     * @param recent the recent value to set.
     * @return the ObservedValue object itself.
     */
    @Generated
    ObservedValue setRecent(Boolean recent) {
        this.recent = recent;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("firstSeen",
            this.firstSeen == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.firstSeen));
        jsonWriter.writeStringField("lastSeen",
            this.lastSeen == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastSeen));
        jsonWriter.writeNumberField("count", this.count);
        jsonWriter.writeBooleanField("recent", this.recent);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ObservedValue from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ObservedValue if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ObservedValue.
     */
    @Generated
    public static ObservedValue fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ObservedValue deserializedObservedValue = new ObservedValue();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("firstSeen".equals(fieldName)) {
                    deserializedObservedValue.firstSeen = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastSeen".equals(fieldName)) {
                    deserializedObservedValue.lastSeen = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("count".equals(fieldName)) {
                    deserializedObservedValue.count = reader.getNullable(JsonReader::getLong);
                } else if ("recent".equals(fieldName)) {
                    deserializedObservedValue.recent = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedObservedValue;
        });
    }
}
