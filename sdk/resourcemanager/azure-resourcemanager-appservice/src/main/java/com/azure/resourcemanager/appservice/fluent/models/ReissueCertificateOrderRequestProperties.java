// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * ReissueCertificateOrderRequest resource specific properties.
 */
@Fluent
public final class ReissueCertificateOrderRequestProperties
    implements JsonSerializable<ReissueCertificateOrderRequestProperties> {
    /*
     * Certificate Key Size.
     */
    private Integer keySize;

    /*
     * Delay in hours to revoke existing certificate after the new certificate is issued.
     */
    private Integer delayExistingRevokeInHours;

    /*
     * Csr to be used for re-key operation.
     */
    private String csr;

    /*
     * Should we change the ASC type (from managed private key to external private key and vice versa).
     */
    private Boolean isPrivateKeyExternal;

    /**
     * Creates an instance of ReissueCertificateOrderRequestProperties class.
     */
    public ReissueCertificateOrderRequestProperties() {
    }

    /**
     * Get the keySize property: Certificate Key Size.
     * 
     * @return the keySize value.
     */
    public Integer keySize() {
        return this.keySize;
    }

    /**
     * Set the keySize property: Certificate Key Size.
     * 
     * @param keySize the keySize value to set.
     * @return the ReissueCertificateOrderRequestProperties object itself.
     */
    public ReissueCertificateOrderRequestProperties withKeySize(Integer keySize) {
        this.keySize = keySize;
        return this;
    }

    /**
     * Get the delayExistingRevokeInHours property: Delay in hours to revoke existing certificate after the new
     * certificate is issued.
     * 
     * @return the delayExistingRevokeInHours value.
     */
    public Integer delayExistingRevokeInHours() {
        return this.delayExistingRevokeInHours;
    }

    /**
     * Set the delayExistingRevokeInHours property: Delay in hours to revoke existing certificate after the new
     * certificate is issued.
     * 
     * @param delayExistingRevokeInHours the delayExistingRevokeInHours value to set.
     * @return the ReissueCertificateOrderRequestProperties object itself.
     */
    public ReissueCertificateOrderRequestProperties withDelayExistingRevokeInHours(Integer delayExistingRevokeInHours) {
        this.delayExistingRevokeInHours = delayExistingRevokeInHours;
        return this;
    }

    /**
     * Get the csr property: Csr to be used for re-key operation.
     * 
     * @return the csr value.
     */
    public String csr() {
        return this.csr;
    }

    /**
     * Set the csr property: Csr to be used for re-key operation.
     * 
     * @param csr the csr value to set.
     * @return the ReissueCertificateOrderRequestProperties object itself.
     */
    public ReissueCertificateOrderRequestProperties withCsr(String csr) {
        this.csr = csr;
        return this;
    }

    /**
     * Get the isPrivateKeyExternal property: Should we change the ASC type (from managed private key to external
     * private key and vice versa).
     * 
     * @return the isPrivateKeyExternal value.
     */
    public Boolean isPrivateKeyExternal() {
        return this.isPrivateKeyExternal;
    }

    /**
     * Set the isPrivateKeyExternal property: Should we change the ASC type (from managed private key to external
     * private key and vice versa).
     * 
     * @param isPrivateKeyExternal the isPrivateKeyExternal value to set.
     * @return the ReissueCertificateOrderRequestProperties object itself.
     */
    public ReissueCertificateOrderRequestProperties withIsPrivateKeyExternal(Boolean isPrivateKeyExternal) {
        this.isPrivateKeyExternal = isPrivateKeyExternal;
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
        jsonWriter.writeNumberField("keySize", this.keySize);
        jsonWriter.writeNumberField("delayExistingRevokeInHours", this.delayExistingRevokeInHours);
        jsonWriter.writeStringField("csr", this.csr);
        jsonWriter.writeBooleanField("isPrivateKeyExternal", this.isPrivateKeyExternal);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReissueCertificateOrderRequestProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReissueCertificateOrderRequestProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReissueCertificateOrderRequestProperties.
     */
    public static ReissueCertificateOrderRequestProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReissueCertificateOrderRequestProperties deserializedReissueCertificateOrderRequestProperties
                = new ReissueCertificateOrderRequestProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("keySize".equals(fieldName)) {
                    deserializedReissueCertificateOrderRequestProperties.keySize
                        = reader.getNullable(JsonReader::getInt);
                } else if ("delayExistingRevokeInHours".equals(fieldName)) {
                    deserializedReissueCertificateOrderRequestProperties.delayExistingRevokeInHours
                        = reader.getNullable(JsonReader::getInt);
                } else if ("csr".equals(fieldName)) {
                    deserializedReissueCertificateOrderRequestProperties.csr = reader.getString();
                } else if ("isPrivateKeyExternal".equals(fieldName)) {
                    deserializedReissueCertificateOrderRequestProperties.isPrivateKeyExternal
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReissueCertificateOrderRequestProperties;
        });
    }
}
