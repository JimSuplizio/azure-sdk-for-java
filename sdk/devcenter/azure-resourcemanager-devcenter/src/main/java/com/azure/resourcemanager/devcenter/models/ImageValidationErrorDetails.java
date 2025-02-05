// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Image validation error details.
 */
@Fluent
public final class ImageValidationErrorDetails implements JsonSerializable<ImageValidationErrorDetails> {
    /*
     * An identifier for the error.
     */
    private String code;

    /*
     * A message describing the error.
     */
    private String message;

    /**
     * Creates an instance of ImageValidationErrorDetails class.
     */
    public ImageValidationErrorDetails() {
    }

    /**
     * Get the code property: An identifier for the error.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: An identifier for the error.
     * 
     * @param code the code value to set.
     * @return the ImageValidationErrorDetails object itself.
     */
    public ImageValidationErrorDetails withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: A message describing the error.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: A message describing the error.
     * 
     * @param message the message value to set.
     * @return the ImageValidationErrorDetails object itself.
     */
    public ImageValidationErrorDetails withMessage(String message) {
        this.message = message;
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
        jsonWriter.writeStringField("code", this.code);
        jsonWriter.writeStringField("message", this.message);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImageValidationErrorDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImageValidationErrorDetails if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ImageValidationErrorDetails.
     */
    public static ImageValidationErrorDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ImageValidationErrorDetails deserializedImageValidationErrorDetails = new ImageValidationErrorDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedImageValidationErrorDetails.code = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedImageValidationErrorDetails.message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedImageValidationErrorDetails;
        });
    }
}
