// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.springappdiscovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * ErrorSummary model.
 */
@Fluent
public final class ErrorSummaryModel implements JsonSerializable<ErrorSummaryModel> {
    /*
     * The type of Object.
     */
    private String affectedResourceType;

    /*
     * The count.
     */
    private Long affectedObjectsCount;

    /**
     * Creates an instance of ErrorSummaryModel class.
     */
    public ErrorSummaryModel() {
    }

    /**
     * Get the affectedResourceType property: The type of Object.
     * 
     * @return the affectedResourceType value.
     */
    public String affectedResourceType() {
        return this.affectedResourceType;
    }

    /**
     * Set the affectedResourceType property: The type of Object.
     * 
     * @param affectedResourceType the affectedResourceType value to set.
     * @return the ErrorSummaryModel object itself.
     */
    public ErrorSummaryModel withAffectedResourceType(String affectedResourceType) {
        this.affectedResourceType = affectedResourceType;
        return this;
    }

    /**
     * Get the affectedObjectsCount property: The count.
     * 
     * @return the affectedObjectsCount value.
     */
    public Long affectedObjectsCount() {
        return this.affectedObjectsCount;
    }

    /**
     * Set the affectedObjectsCount property: The count.
     * 
     * @param affectedObjectsCount the affectedObjectsCount value to set.
     * @return the ErrorSummaryModel object itself.
     */
    public ErrorSummaryModel withAffectedObjectsCount(Long affectedObjectsCount) {
        this.affectedObjectsCount = affectedObjectsCount;
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
        jsonWriter.writeStringField("affectedResourceType", this.affectedResourceType);
        jsonWriter.writeNumberField("affectedObjectsCount", this.affectedObjectsCount);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ErrorSummaryModel from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ErrorSummaryModel if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ErrorSummaryModel.
     */
    public static ErrorSummaryModel fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ErrorSummaryModel deserializedErrorSummaryModel = new ErrorSummaryModel();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("affectedResourceType".equals(fieldName)) {
                    deserializedErrorSummaryModel.affectedResourceType = reader.getString();
                } else if ("affectedObjectsCount".equals(fieldName)) {
                    deserializedErrorSummaryModel.affectedObjectsCount = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedErrorSummaryModel;
        });
    }
}
