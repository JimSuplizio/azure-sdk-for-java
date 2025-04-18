// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.costmanagement.models.CostManagementResource;
import com.azure.resourcemanager.costmanagement.models.ForecastColumn;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Result of forecast. It contains all columns listed under groupings and aggregation.
 */
@Fluent
public final class ForecastResultInner extends CostManagementResource {
    /*
     * Forecast properties
     */
    private ForecastProperties innerProperties;

    /*
     * ETag of the resource.
     */
    private String etag;

    /*
     * SKU of the resource.
     */
    private String sku;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ForecastResultInner class.
     */
    public ForecastResultInner() {
    }

    /**
     * Get the innerProperties property: Forecast properties.
     * 
     * @return the innerProperties value.
     */
    private ForecastProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: ETag of the resource.
     * 
     * @return the etag value.
     */
    @Override
    public String etag() {
        return this.etag;
    }

    /**
     * Get the sku property: SKU of the resource.
     * 
     * @return the sku value.
     */
    @Override
    public String sku() {
        return this.sku;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForecastResultInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForecastResultInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.innerProperties() == null ? null : this.innerProperties().nextLink();
    }

    /**
     * Set the nextLink property: The link (url) to the next page of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ForecastResultInner object itself.
     */
    public ForecastResultInner withNextLink(String nextLink) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ForecastProperties();
        }
        this.innerProperties().withNextLink(nextLink);
        return this;
    }

    /**
     * Get the columns property: Array of columns.
     * 
     * @return the columns value.
     */
    public List<ForecastColumn> columns() {
        return this.innerProperties() == null ? null : this.innerProperties().columns();
    }

    /**
     * Set the columns property: Array of columns.
     * 
     * @param columns the columns value to set.
     * @return the ForecastResultInner object itself.
     */
    public ForecastResultInner withColumns(List<ForecastColumn> columns) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ForecastProperties();
        }
        this.innerProperties().withColumns(columns);
        return this;
    }

    /**
     * Get the rows property: Array of rows.
     * 
     * @return the rows value.
     */
    public List<List<Object>> rows() {
        return this.innerProperties() == null ? null : this.innerProperties().rows();
    }

    /**
     * Set the rows property: Array of rows.
     * 
     * @param rows the rows value to set.
     * @return the ForecastResultInner object itself.
     */
    public ForecastResultInner withRows(List<List<Object>> rows) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ForecastProperties();
        }
        this.innerProperties().withRows(rows);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ForecastResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ForecastResultInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ForecastResultInner.
     */
    public static ForecastResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ForecastResultInner deserializedForecastResultInner = new ForecastResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedForecastResultInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedForecastResultInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedForecastResultInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedForecastResultInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedForecastResultInner.withTags(tags);
                } else if ("sku".equals(fieldName)) {
                    deserializedForecastResultInner.sku = reader.getString();
                } else if ("eTag".equals(fieldName)) {
                    deserializedForecastResultInner.etag = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedForecastResultInner.innerProperties = ForecastProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedForecastResultInner;
        });
    }
}
