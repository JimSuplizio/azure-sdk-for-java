// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * POI category result.
 */
@Immutable
public final class PointOfInterestCategory implements JsonSerializable<PointOfInterestCategory> {
    /*
     * Unique ID for the category. ID can be used to restrict search results to specific categories through other Search Service APIs, like [Get Search POI](/rest/api/maps/search/get-search-poi?view=rest-maps-1.0).
     */
    private Integer id;

    /*
     * Name of the category
     */
    private String name;

    /*
     * Array of child category ids
     */
    private List<Integer> childIds;

    /*
     * Array of alternative names of the category
     */
    private List<String> synonyms;

    /**
     * Creates an instance of PointOfInterestCategory class.
     */
    public PointOfInterestCategory() {
    }

    /**
     * Get the id property: Unique ID for the category. ID can be used to restrict search results to specific categories
     * through other Search Service APIs, like [Get Search
     * POI](/rest/api/maps/search/get-search-poi?view=rest-maps-1.0).
     * 
     * @return the id value.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Get the name property: Name of the category.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the childIds property: Array of child category ids.
     * 
     * @return the childIds value.
     */
    public List<Integer> getChildIds() {
        return this.childIds;
    }

    /**
     * Get the synonyms property: Array of alternative names of the category.
     * 
     * @return the synonyms value.
     */
    public List<String> getSynonyms() {
        return this.synonyms;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PointOfInterestCategory from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PointOfInterestCategory if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PointOfInterestCategory.
     */
    public static PointOfInterestCategory fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PointOfInterestCategory deserializedPointOfInterestCategory = new PointOfInterestCategory();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPointOfInterestCategory.id = reader.getNullable(JsonReader::getInt);
                } else if ("name".equals(fieldName)) {
                    deserializedPointOfInterestCategory.name = reader.getString();
                } else if ("childCategoryIds".equals(fieldName)) {
                    List<Integer> childIds = reader.readArray(reader1 -> reader1.getInt());
                    deserializedPointOfInterestCategory.childIds = childIds;
                } else if ("synonyms".equals(fieldName)) {
                    List<String> synonyms = reader.readArray(reader1 -> reader1.getString());
                    deserializedPointOfInterestCategory.synonyms = synonyms;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPointOfInterestCategory;
        });
    }
}
