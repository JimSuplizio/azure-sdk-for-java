// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Opening hours for a POI (Points of Interest).
 */
@Immutable
public final class OperatingHours implements JsonSerializable<OperatingHours> {
    /*
     * Value used in the request: none or "nextSevenDays"
     */
    private String mode;

    /*
     * List of time ranges for the next 7 days
     */
    private List<OperatingHoursTimeRange> timeRanges;

    /**
     * Creates an instance of OperatingHours class.
     */
    public OperatingHours() {
    }

    /**
     * Get the mode property: Value used in the request: none or "nextSevenDays".
     * 
     * @return the mode value.
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * Get the timeRanges property: List of time ranges for the next 7 days.
     * 
     * @return the timeRanges value.
     */
    public List<OperatingHoursTimeRange> getTimeRanges() {
        return this.timeRanges;
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
     * Reads an instance of OperatingHours from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperatingHours if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperatingHours.
     */
    public static OperatingHours fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperatingHours deserializedOperatingHours = new OperatingHours();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("mode".equals(fieldName)) {
                    deserializedOperatingHours.mode = reader.getString();
                } else if ("timeRanges".equals(fieldName)) {
                    List<OperatingHoursTimeRange> timeRanges
                        = reader.readArray(reader1 -> OperatingHoursTimeRange.fromJson(reader1));
                    deserializedOperatingHours.timeRanges = timeRanges;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperatingHours;
        });
    }
}
