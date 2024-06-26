// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Error definition.
 */
@Fluent
public final class Error implements JsonSerializable<Error> {
    /*
     * Service specific error code which serves as the substatus for the HTTP error code.
     */
    private String code;

    /*
     * Service specific error type which serves as additional context for the error herein.
     */
    private String type;

    /*
     * Description of the error.
     */
    private String message;

    /*
     * An array of additional nested error response info objects, as described by this contract.
     */
    private List<Error> details;

    /**
     * Creates an instance of Error class.
     */
    public Error() {
    }

    /**
     * Get the code property: Service specific error code which serves as the substatus for the HTTP error code.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the type property: Service specific error type which serves as additional context for the error herein.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the message property: Description of the error.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the details property: An array of additional nested error response info objects, as described by this
     * contract.
     * 
     * @return the details value.
     */
    public List<Error> details() {
        return this.details;
    }

    /**
     * Set the details property: An array of additional nested error response info objects, as described by this
     * contract.
     * 
     * @param details the details value to set.
     * @return the Error object itself.
     */
    public Error withDetails(List<Error> details) {
        this.details = details;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (details() != null) {
            details().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("details", this.details, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Error from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Error if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Error.
     */
    public static Error fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Error deserializedError = new Error();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedError.code = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedError.type = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedError.message = reader.getString();
                } else if ("details".equals(fieldName)) {
                    List<Error> details = reader.readArray(reader1 -> Error.fromJson(reader1));
                    deserializedError.details = details;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedError;
        });
    }
}
