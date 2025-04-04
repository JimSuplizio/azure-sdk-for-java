// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A license that can be used to deploy an Azure Stack device.
 */
@Fluent
public final class DeploymentLicenseResponseInner implements JsonSerializable<DeploymentLicenseResponseInner> {
    /*
     * A license chain that can be used to temporarily activate an Azure Stack device.
     */
    private List<String> temporaryLicenseChain;

    /*
     * Signature of the license chain.
     */
    private String signature;

    /**
     * Creates an instance of DeploymentLicenseResponseInner class.
     */
    public DeploymentLicenseResponseInner() {
    }

    /**
     * Get the temporaryLicenseChain property: A license chain that can be used to temporarily activate an Azure Stack
     * device.
     * 
     * @return the temporaryLicenseChain value.
     */
    public List<String> temporaryLicenseChain() {
        return this.temporaryLicenseChain;
    }

    /**
     * Set the temporaryLicenseChain property: A license chain that can be used to temporarily activate an Azure Stack
     * device.
     * 
     * @param temporaryLicenseChain the temporaryLicenseChain value to set.
     * @return the DeploymentLicenseResponseInner object itself.
     */
    public DeploymentLicenseResponseInner withTemporaryLicenseChain(List<String> temporaryLicenseChain) {
        this.temporaryLicenseChain = temporaryLicenseChain;
        return this;
    }

    /**
     * Get the signature property: Signature of the license chain.
     * 
     * @return the signature value.
     */
    public String signature() {
        return this.signature;
    }

    /**
     * Set the signature property: Signature of the license chain.
     * 
     * @param signature the signature value to set.
     * @return the DeploymentLicenseResponseInner object itself.
     */
    public DeploymentLicenseResponseInner withSignature(String signature) {
        this.signature = signature;
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
        jsonWriter.writeArrayField("temporaryLicenseChain", this.temporaryLicenseChain,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("signature", this.signature);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeploymentLicenseResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeploymentLicenseResponseInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DeploymentLicenseResponseInner.
     */
    public static DeploymentLicenseResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeploymentLicenseResponseInner deserializedDeploymentLicenseResponseInner
                = new DeploymentLicenseResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("temporaryLicenseChain".equals(fieldName)) {
                    List<String> temporaryLicenseChain = reader.readArray(reader1 -> reader1.getString());
                    deserializedDeploymentLicenseResponseInner.temporaryLicenseChain = temporaryLicenseChain;
                } else if ("signature".equals(fieldName)) {
                    deserializedDeploymentLicenseResponseInner.signature = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeploymentLicenseResponseInner;
        });
    }
}
