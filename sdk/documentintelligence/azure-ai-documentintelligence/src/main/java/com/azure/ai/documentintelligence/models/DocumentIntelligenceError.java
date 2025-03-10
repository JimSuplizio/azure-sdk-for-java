// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The error object.
 */
@Immutable
public final class DocumentIntelligenceError implements JsonSerializable<DocumentIntelligenceError> {

    /*
     * One of a server-defined set of error codes.
     */
    @Generated
    private final String code;

    /*
     * A human-readable representation of the error.
     */
    @Generated
    private final String message;

    /*
     * The target of the error.
     */
    @Generated
    private String target;

    /*
     * An array of details about specific errors that led to this reported error.
     */
    @Generated
    private List<DocumentIntelligenceError> details;

    /**
     * Creates an instance of DocumentIntelligenceError class.
     *
     * @param code the code value to set.
     * @param message the message value to set.
     */
    @Generated
    private DocumentIntelligenceError(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Get the code property: One of a server-defined set of error codes.
     *
     * @return the code value.
     */
    @Generated
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: A human-readable representation of the error.
     *
     * @return the message value.
     */
    @Generated
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the target property: The target of the error.
     *
     * @return the target value.
     */
    @Generated
    public String getTarget() {
        return this.target;
    }

    /**
     * Get the details property: An array of details about specific errors that led to this reported error.
     *
     * @return the details value.
     */
    @Generated
    public List<DocumentIntelligenceError> getDetails() {
        return this.details;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("code", this.code);
        jsonWriter.writeStringField("message", this.message);
        jsonWriter.writeStringField("target", this.target);
        jsonWriter.writeArrayField("details", this.details, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("innererror", this.innerError);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DocumentIntelligenceError from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DocumentIntelligenceError if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DocumentIntelligenceError.
     */
    @Generated
    public static DocumentIntelligenceError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String code = null;
            String message = null;
            String target = null;
            List<DocumentIntelligenceError> details = null;
            DocumentIntelligenceInnerError innerError = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("code".equals(fieldName)) {
                    code = reader.getString();
                } else if ("message".equals(fieldName)) {
                    message = reader.getString();
                } else if ("target".equals(fieldName)) {
                    target = reader.getString();
                } else if ("details".equals(fieldName)) {
                    details = reader.readArray(reader1 -> DocumentIntelligenceError.fromJson(reader1));
                } else if ("innererror".equals(fieldName)) {
                    innerError = DocumentIntelligenceInnerError.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            DocumentIntelligenceError deserializedDocumentIntelligenceError
                = new DocumentIntelligenceError(code, message);
            deserializedDocumentIntelligenceError.target = target;
            deserializedDocumentIntelligenceError.details = details;
            deserializedDocumentIntelligenceError.innerError = innerError;
            return deserializedDocumentIntelligenceError;
        });
    }

    /*
     * An object containing more specific information than the current object about the error.
     */
    @Generated
    private DocumentIntelligenceInnerError innerError;

    /**
     * Get the innerError property: An object containing more specific information than the current object about the
     * error.
     *
     * @return the innerError value.
     */
    @Generated
    public DocumentIntelligenceInnerError getInnerError() {
        return this.innerError;
    }
}
