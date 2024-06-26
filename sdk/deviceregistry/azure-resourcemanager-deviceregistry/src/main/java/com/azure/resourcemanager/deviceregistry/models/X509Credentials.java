// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The x509 certificate for authentication mode Certificate.
 */
@Fluent
public final class X509Credentials implements JsonSerializable<X509Credentials> {
    /*
     * A reference to secret containing the certificate and private key (e.g. stored as .der/.pem or .der/.pfx).
     */
    private String certificateReference;

    /**
     * Creates an instance of X509Credentials class.
     */
    public X509Credentials() {
    }

    /**
     * Get the certificateReference property: A reference to secret containing the certificate and private key (e.g.
     * stored as .der/.pem or .der/.pfx).
     * 
     * @return the certificateReference value.
     */
    public String certificateReference() {
        return this.certificateReference;
    }

    /**
     * Set the certificateReference property: A reference to secret containing the certificate and private key (e.g.
     * stored as .der/.pem or .der/.pfx).
     * 
     * @param certificateReference the certificateReference value to set.
     * @return the X509Credentials object itself.
     */
    public X509Credentials withCertificateReference(String certificateReference) {
        this.certificateReference = certificateReference;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (certificateReference() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property certificateReference in model X509Credentials"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(X509Credentials.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("certificateReference", this.certificateReference);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of X509Credentials from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of X509Credentials if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the X509Credentials.
     */
    public static X509Credentials fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            X509Credentials deserializedX509Credentials = new X509Credentials();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("certificateReference".equals(fieldName)) {
                    deserializedX509Credentials.certificateReference = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedX509Credentials;
        });
    }
}
