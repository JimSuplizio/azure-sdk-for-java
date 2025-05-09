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
 * Single-network slice selection assistance information (S-NSSAI).
 */
@Fluent
public final class Snssai implements JsonSerializable<Snssai> {
    /*
     * Slice/service type (SST).
     */
    private int sst;

    /*
     * Slice differentiator (SD).
     */
    private String sd;

    /**
     * Creates an instance of Snssai class.
     */
    public Snssai() {
    }

    /**
     * Get the sst property: Slice/service type (SST).
     * 
     * @return the sst value.
     */
    public int sst() {
        return this.sst;
    }

    /**
     * Set the sst property: Slice/service type (SST).
     * 
     * @param sst the sst value to set.
     * @return the Snssai object itself.
     */
    public Snssai withSst(int sst) {
        this.sst = sst;
        return this;
    }

    /**
     * Get the sd property: Slice differentiator (SD).
     * 
     * @return the sd value.
     */
    public String sd() {
        return this.sd;
    }

    /**
     * Set the sd property: Slice differentiator (SD).
     * 
     * @param sd the sd value to set.
     * @return the Snssai object itself.
     */
    public Snssai withSd(String sd) {
        this.sd = sd;
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
        jsonWriter.writeIntField("sst", this.sst);
        jsonWriter.writeStringField("sd", this.sd);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Snssai from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Snssai if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Snssai.
     */
    public static Snssai fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Snssai deserializedSnssai = new Snssai();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sst".equals(fieldName)) {
                    deserializedSnssai.sst = reader.getInt();
                } else if ("sd".equals(fieldName)) {
                    deserializedSnssai.sd = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSnssai;
        });
    }
}
