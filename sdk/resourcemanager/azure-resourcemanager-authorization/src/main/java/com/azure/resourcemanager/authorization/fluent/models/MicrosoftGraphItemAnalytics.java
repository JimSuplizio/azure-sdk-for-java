// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * itemAnalytics.
 */
@Fluent
public final class MicrosoftGraphItemAnalytics extends MicrosoftGraphEntity {
    /*
     * itemActivityStat
     */
    private MicrosoftGraphItemActivityStat allTime;

    /*
     * The itemActivityStats property.
     */
    private List<MicrosoftGraphItemActivityStat> itemActivityStats;

    /*
     * itemActivityStat
     */
    private MicrosoftGraphItemActivityStat lastSevenDays;

    /*
     * itemAnalytics
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphItemAnalytics class.
     */
    public MicrosoftGraphItemAnalytics() {
    }

    /**
     * Get the allTime property: itemActivityStat.
     * 
     * @return the allTime value.
     */
    public MicrosoftGraphItemActivityStat allTime() {
        return this.allTime;
    }

    /**
     * Set the allTime property: itemActivityStat.
     * 
     * @param allTime the allTime value to set.
     * @return the MicrosoftGraphItemAnalytics object itself.
     */
    public MicrosoftGraphItemAnalytics withAllTime(MicrosoftGraphItemActivityStat allTime) {
        this.allTime = allTime;
        return this;
    }

    /**
     * Get the itemActivityStats property: The itemActivityStats property.
     * 
     * @return the itemActivityStats value.
     */
    public List<MicrosoftGraphItemActivityStat> itemActivityStats() {
        return this.itemActivityStats;
    }

    /**
     * Set the itemActivityStats property: The itemActivityStats property.
     * 
     * @param itemActivityStats the itemActivityStats value to set.
     * @return the MicrosoftGraphItemAnalytics object itself.
     */
    public MicrosoftGraphItemAnalytics withItemActivityStats(List<MicrosoftGraphItemActivityStat> itemActivityStats) {
        this.itemActivityStats = itemActivityStats;
        return this;
    }

    /**
     * Get the lastSevenDays property: itemActivityStat.
     * 
     * @return the lastSevenDays value.
     */
    public MicrosoftGraphItemActivityStat lastSevenDays() {
        return this.lastSevenDays;
    }

    /**
     * Set the lastSevenDays property: itemActivityStat.
     * 
     * @param lastSevenDays the lastSevenDays value to set.
     * @return the MicrosoftGraphItemAnalytics object itself.
     */
    public MicrosoftGraphItemAnalytics withLastSevenDays(MicrosoftGraphItemActivityStat lastSevenDays) {
        this.lastSevenDays = lastSevenDays;
        return this;
    }

    /**
     * Get the additionalProperties property: itemAnalytics.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: itemAnalytics.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphItemAnalytics object itself.
     */
    public MicrosoftGraphItemAnalytics withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphItemAnalytics withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (allTime() != null) {
            allTime().validate();
        }
        if (itemActivityStats() != null) {
            itemActivityStats().forEach(e -> e.validate());
        }
        if (lastSevenDays() != null) {
            lastSevenDays().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("allTime", this.allTime);
        jsonWriter.writeArrayField("itemActivityStats", this.itemActivityStats,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("lastSevenDays", this.lastSevenDays);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphItemAnalytics from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphItemAnalytics if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphItemAnalytics.
     */
    public static MicrosoftGraphItemAnalytics fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphItemAnalytics deserializedMicrosoftGraphItemAnalytics = new MicrosoftGraphItemAnalytics();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphItemAnalytics.withId(reader.getString());
                } else if ("allTime".equals(fieldName)) {
                    deserializedMicrosoftGraphItemAnalytics.allTime = MicrosoftGraphItemActivityStat.fromJson(reader);
                } else if ("itemActivityStats".equals(fieldName)) {
                    List<MicrosoftGraphItemActivityStat> itemActivityStats
                        = reader.readArray(reader1 -> MicrosoftGraphItemActivityStat.fromJson(reader1));
                    deserializedMicrosoftGraphItemAnalytics.itemActivityStats = itemActivityStats;
                } else if ("lastSevenDays".equals(fieldName)) {
                    deserializedMicrosoftGraphItemAnalytics.lastSevenDays
                        = MicrosoftGraphItemActivityStat.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphItemAnalytics.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphItemAnalytics;
        });
    }
}
