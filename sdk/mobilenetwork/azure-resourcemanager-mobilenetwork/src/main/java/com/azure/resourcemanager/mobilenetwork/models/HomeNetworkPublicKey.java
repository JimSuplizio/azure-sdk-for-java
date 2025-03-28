// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A key used for SUPI concealment.
 */
@Fluent
public final class HomeNetworkPublicKey implements JsonSerializable<HomeNetworkPublicKey> {
    /*
     * The Home Network Public Key Identifier determines which public key was used to generate the SUCI sent to the AMF.
     * See TS 23.003 Section 2.2B Section 5.
     */
    private int id;

    /*
     * The URL of Azure Key Vault secret containing the private key, versioned or unversioned. For example:
     * https://contosovault.vault.azure.net/secrets/mySuciPrivateKey/562a4bb76b524a1493a6afe8e536ee78.
     */
    private String url;

    /**
     * Creates an instance of HomeNetworkPublicKey class.
     */
    public HomeNetworkPublicKey() {
    }

    /**
     * Get the id property: The Home Network Public Key Identifier determines which public key was used to generate the
     * SUCI sent to the AMF. See TS 23.003 Section 2.2B Section 5.
     * 
     * @return the id value.
     */
    public int id() {
        return this.id;
    }

    /**
     * Set the id property: The Home Network Public Key Identifier determines which public key was used to generate the
     * SUCI sent to the AMF. See TS 23.003 Section 2.2B Section 5.
     * 
     * @param id the id value to set.
     * @return the HomeNetworkPublicKey object itself.
     */
    public HomeNetworkPublicKey withId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Get the url property: The URL of Azure Key Vault secret containing the private key, versioned or unversioned. For
     * example: https://contosovault.vault.azure.net/secrets/mySuciPrivateKey/562a4bb76b524a1493a6afe8e536ee78.
     * 
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: The URL of Azure Key Vault secret containing the private key, versioned or unversioned. For
     * example: https://contosovault.vault.azure.net/secrets/mySuciPrivateKey/562a4bb76b524a1493a6afe8e536ee78.
     * 
     * @param url the url value to set.
     * @return the HomeNetworkPublicKey object itself.
     */
    public HomeNetworkPublicKey withUrl(String url) {
        this.url = url;
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
        jsonWriter.writeIntField("id", this.id);
        jsonWriter.writeStringField("url", this.url);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HomeNetworkPublicKey from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HomeNetworkPublicKey if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the HomeNetworkPublicKey.
     */
    public static HomeNetworkPublicKey fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HomeNetworkPublicKey deserializedHomeNetworkPublicKey = new HomeNetworkPublicKey();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedHomeNetworkPublicKey.id = reader.getInt();
                } else if ("url".equals(fieldName)) {
                    deserializedHomeNetworkPublicKey.url = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHomeNetworkPublicKey;
        });
    }
}
