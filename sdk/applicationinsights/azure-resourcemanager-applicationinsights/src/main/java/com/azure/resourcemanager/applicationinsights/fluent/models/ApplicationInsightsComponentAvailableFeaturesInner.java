// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.applicationinsights.models.ApplicationInsightsComponentFeature;
import java.io.IOException;
import java.util.List;

/**
 * An Application Insights component available features.
 */
@Immutable
public final class ApplicationInsightsComponentAvailableFeaturesInner
    implements JsonSerializable<ApplicationInsightsComponentAvailableFeaturesInner> {
    /*
     * A list of Application Insights component feature.
     */
    private List<ApplicationInsightsComponentFeature> result;

    /**
     * Creates an instance of ApplicationInsightsComponentAvailableFeaturesInner class.
     */
    public ApplicationInsightsComponentAvailableFeaturesInner() {
    }

    /**
     * Get the result property: A list of Application Insights component feature.
     * 
     * @return the result value.
     */
    public List<ApplicationInsightsComponentFeature> result() {
        return this.result;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (result() != null) {
            result().forEach(e -> e.validate());
        }
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
     * Reads an instance of ApplicationInsightsComponentAvailableFeaturesInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationInsightsComponentAvailableFeaturesInner if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationInsightsComponentAvailableFeaturesInner.
     */
    public static ApplicationInsightsComponentAvailableFeaturesInner fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationInsightsComponentAvailableFeaturesInner deserializedApplicationInsightsComponentAvailableFeaturesInner
                = new ApplicationInsightsComponentAvailableFeaturesInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("Result".equals(fieldName)) {
                    List<ApplicationInsightsComponentFeature> result
                        = reader.readArray(reader1 -> ApplicationInsightsComponentFeature.fromJson(reader1));
                    deserializedApplicationInsightsComponentAvailableFeaturesInner.result = result;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationInsightsComponentAvailableFeaturesInner;
        });
    }
}
