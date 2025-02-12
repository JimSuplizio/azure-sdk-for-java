// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * ExtendedLocation details data.
 */
@Fluent
public final class A2AFabricSpecificLocationDetails implements JsonSerializable<A2AFabricSpecificLocationDetails> {
    /*
     * The initial source zone info.
     */
    private String initialPrimaryZone;

    /*
     * The initial target zone info.
     */
    private String initialRecoveryZone;

    /*
     * The initial primary ExtendedLocation.
     */
    private ExtendedLocation initialPrimaryExtendedLocation;

    /*
     * The initial recovery ExtendedLocation.
     */
    private ExtendedLocation initialRecoveryExtendedLocation;

    /*
     * Initial primary fabric location info.
     */
    private String initialPrimaryFabricLocation;

    /*
     * The initial recovery fabric location info.
     */
    private String initialRecoveryFabricLocation;

    /*
     * Source zone info.
     */
    private String primaryZone;

    /*
     * The target zone info.
     */
    private String recoveryZone;

    /*
     * The primary ExtendedLocation.
     */
    private ExtendedLocation primaryExtendedLocation;

    /*
     * The recovery ExtendedLocation.
     */
    private ExtendedLocation recoveryExtendedLocation;

    /*
     * Primary fabric location info.
     */
    private String primaryFabricLocation;

    /*
     * The recovery fabric location info.
     */
    private String recoveryFabricLocation;

    /**
     * Creates an instance of A2AFabricSpecificLocationDetails class.
     */
    public A2AFabricSpecificLocationDetails() {
    }

    /**
     * Get the initialPrimaryZone property: The initial source zone info.
     * 
     * @return the initialPrimaryZone value.
     */
    public String initialPrimaryZone() {
        return this.initialPrimaryZone;
    }

    /**
     * Set the initialPrimaryZone property: The initial source zone info.
     * 
     * @param initialPrimaryZone the initialPrimaryZone value to set.
     * @return the A2AFabricSpecificLocationDetails object itself.
     */
    public A2AFabricSpecificLocationDetails withInitialPrimaryZone(String initialPrimaryZone) {
        this.initialPrimaryZone = initialPrimaryZone;
        return this;
    }

    /**
     * Get the initialRecoveryZone property: The initial target zone info.
     * 
     * @return the initialRecoveryZone value.
     */
    public String initialRecoveryZone() {
        return this.initialRecoveryZone;
    }

    /**
     * Set the initialRecoveryZone property: The initial target zone info.
     * 
     * @param initialRecoveryZone the initialRecoveryZone value to set.
     * @return the A2AFabricSpecificLocationDetails object itself.
     */
    public A2AFabricSpecificLocationDetails withInitialRecoveryZone(String initialRecoveryZone) {
        this.initialRecoveryZone = initialRecoveryZone;
        return this;
    }

    /**
     * Get the initialPrimaryExtendedLocation property: The initial primary ExtendedLocation.
     * 
     * @return the initialPrimaryExtendedLocation value.
     */
    public ExtendedLocation initialPrimaryExtendedLocation() {
        return this.initialPrimaryExtendedLocation;
    }

    /**
     * Set the initialPrimaryExtendedLocation property: The initial primary ExtendedLocation.
     * 
     * @param initialPrimaryExtendedLocation the initialPrimaryExtendedLocation value to set.
     * @return the A2AFabricSpecificLocationDetails object itself.
     */
    public A2AFabricSpecificLocationDetails
        withInitialPrimaryExtendedLocation(ExtendedLocation initialPrimaryExtendedLocation) {
        this.initialPrimaryExtendedLocation = initialPrimaryExtendedLocation;
        return this;
    }

    /**
     * Get the initialRecoveryExtendedLocation property: The initial recovery ExtendedLocation.
     * 
     * @return the initialRecoveryExtendedLocation value.
     */
    public ExtendedLocation initialRecoveryExtendedLocation() {
        return this.initialRecoveryExtendedLocation;
    }

    /**
     * Set the initialRecoveryExtendedLocation property: The initial recovery ExtendedLocation.
     * 
     * @param initialRecoveryExtendedLocation the initialRecoveryExtendedLocation value to set.
     * @return the A2AFabricSpecificLocationDetails object itself.
     */
    public A2AFabricSpecificLocationDetails
        withInitialRecoveryExtendedLocation(ExtendedLocation initialRecoveryExtendedLocation) {
        this.initialRecoveryExtendedLocation = initialRecoveryExtendedLocation;
        return this;
    }

    /**
     * Get the initialPrimaryFabricLocation property: Initial primary fabric location info.
     * 
     * @return the initialPrimaryFabricLocation value.
     */
    public String initialPrimaryFabricLocation() {
        return this.initialPrimaryFabricLocation;
    }

    /**
     * Set the initialPrimaryFabricLocation property: Initial primary fabric location info.
     * 
     * @param initialPrimaryFabricLocation the initialPrimaryFabricLocation value to set.
     * @return the A2AFabricSpecificLocationDetails object itself.
     */
    public A2AFabricSpecificLocationDetails withInitialPrimaryFabricLocation(String initialPrimaryFabricLocation) {
        this.initialPrimaryFabricLocation = initialPrimaryFabricLocation;
        return this;
    }

    /**
     * Get the initialRecoveryFabricLocation property: The initial recovery fabric location info.
     * 
     * @return the initialRecoveryFabricLocation value.
     */
    public String initialRecoveryFabricLocation() {
        return this.initialRecoveryFabricLocation;
    }

    /**
     * Set the initialRecoveryFabricLocation property: The initial recovery fabric location info.
     * 
     * @param initialRecoveryFabricLocation the initialRecoveryFabricLocation value to set.
     * @return the A2AFabricSpecificLocationDetails object itself.
     */
    public A2AFabricSpecificLocationDetails withInitialRecoveryFabricLocation(String initialRecoveryFabricLocation) {
        this.initialRecoveryFabricLocation = initialRecoveryFabricLocation;
        return this;
    }

    /**
     * Get the primaryZone property: Source zone info.
     * 
     * @return the primaryZone value.
     */
    public String primaryZone() {
        return this.primaryZone;
    }

    /**
     * Set the primaryZone property: Source zone info.
     * 
     * @param primaryZone the primaryZone value to set.
     * @return the A2AFabricSpecificLocationDetails object itself.
     */
    public A2AFabricSpecificLocationDetails withPrimaryZone(String primaryZone) {
        this.primaryZone = primaryZone;
        return this;
    }

    /**
     * Get the recoveryZone property: The target zone info.
     * 
     * @return the recoveryZone value.
     */
    public String recoveryZone() {
        return this.recoveryZone;
    }

    /**
     * Set the recoveryZone property: The target zone info.
     * 
     * @param recoveryZone the recoveryZone value to set.
     * @return the A2AFabricSpecificLocationDetails object itself.
     */
    public A2AFabricSpecificLocationDetails withRecoveryZone(String recoveryZone) {
        this.recoveryZone = recoveryZone;
        return this;
    }

    /**
     * Get the primaryExtendedLocation property: The primary ExtendedLocation.
     * 
     * @return the primaryExtendedLocation value.
     */
    public ExtendedLocation primaryExtendedLocation() {
        return this.primaryExtendedLocation;
    }

    /**
     * Set the primaryExtendedLocation property: The primary ExtendedLocation.
     * 
     * @param primaryExtendedLocation the primaryExtendedLocation value to set.
     * @return the A2AFabricSpecificLocationDetails object itself.
     */
    public A2AFabricSpecificLocationDetails withPrimaryExtendedLocation(ExtendedLocation primaryExtendedLocation) {
        this.primaryExtendedLocation = primaryExtendedLocation;
        return this;
    }

    /**
     * Get the recoveryExtendedLocation property: The recovery ExtendedLocation.
     * 
     * @return the recoveryExtendedLocation value.
     */
    public ExtendedLocation recoveryExtendedLocation() {
        return this.recoveryExtendedLocation;
    }

    /**
     * Set the recoveryExtendedLocation property: The recovery ExtendedLocation.
     * 
     * @param recoveryExtendedLocation the recoveryExtendedLocation value to set.
     * @return the A2AFabricSpecificLocationDetails object itself.
     */
    public A2AFabricSpecificLocationDetails withRecoveryExtendedLocation(ExtendedLocation recoveryExtendedLocation) {
        this.recoveryExtendedLocation = recoveryExtendedLocation;
        return this;
    }

    /**
     * Get the primaryFabricLocation property: Primary fabric location info.
     * 
     * @return the primaryFabricLocation value.
     */
    public String primaryFabricLocation() {
        return this.primaryFabricLocation;
    }

    /**
     * Set the primaryFabricLocation property: Primary fabric location info.
     * 
     * @param primaryFabricLocation the primaryFabricLocation value to set.
     * @return the A2AFabricSpecificLocationDetails object itself.
     */
    public A2AFabricSpecificLocationDetails withPrimaryFabricLocation(String primaryFabricLocation) {
        this.primaryFabricLocation = primaryFabricLocation;
        return this;
    }

    /**
     * Get the recoveryFabricLocation property: The recovery fabric location info.
     * 
     * @return the recoveryFabricLocation value.
     */
    public String recoveryFabricLocation() {
        return this.recoveryFabricLocation;
    }

    /**
     * Set the recoveryFabricLocation property: The recovery fabric location info.
     * 
     * @param recoveryFabricLocation the recoveryFabricLocation value to set.
     * @return the A2AFabricSpecificLocationDetails object itself.
     */
    public A2AFabricSpecificLocationDetails withRecoveryFabricLocation(String recoveryFabricLocation) {
        this.recoveryFabricLocation = recoveryFabricLocation;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (initialPrimaryExtendedLocation() != null) {
            initialPrimaryExtendedLocation().validate();
        }
        if (initialRecoveryExtendedLocation() != null) {
            initialRecoveryExtendedLocation().validate();
        }
        if (primaryExtendedLocation() != null) {
            primaryExtendedLocation().validate();
        }
        if (recoveryExtendedLocation() != null) {
            recoveryExtendedLocation().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("initialPrimaryZone", this.initialPrimaryZone);
        jsonWriter.writeStringField("initialRecoveryZone", this.initialRecoveryZone);
        jsonWriter.writeJsonField("initialPrimaryExtendedLocation", this.initialPrimaryExtendedLocation);
        jsonWriter.writeJsonField("initialRecoveryExtendedLocation", this.initialRecoveryExtendedLocation);
        jsonWriter.writeStringField("initialPrimaryFabricLocation", this.initialPrimaryFabricLocation);
        jsonWriter.writeStringField("initialRecoveryFabricLocation", this.initialRecoveryFabricLocation);
        jsonWriter.writeStringField("primaryZone", this.primaryZone);
        jsonWriter.writeStringField("recoveryZone", this.recoveryZone);
        jsonWriter.writeJsonField("primaryExtendedLocation", this.primaryExtendedLocation);
        jsonWriter.writeJsonField("recoveryExtendedLocation", this.recoveryExtendedLocation);
        jsonWriter.writeStringField("primaryFabricLocation", this.primaryFabricLocation);
        jsonWriter.writeStringField("recoveryFabricLocation", this.recoveryFabricLocation);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of A2AFabricSpecificLocationDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of A2AFabricSpecificLocationDetails if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the A2AFabricSpecificLocationDetails.
     */
    public static A2AFabricSpecificLocationDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            A2AFabricSpecificLocationDetails deserializedA2AFabricSpecificLocationDetails
                = new A2AFabricSpecificLocationDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("initialPrimaryZone".equals(fieldName)) {
                    deserializedA2AFabricSpecificLocationDetails.initialPrimaryZone = reader.getString();
                } else if ("initialRecoveryZone".equals(fieldName)) {
                    deserializedA2AFabricSpecificLocationDetails.initialRecoveryZone = reader.getString();
                } else if ("initialPrimaryExtendedLocation".equals(fieldName)) {
                    deserializedA2AFabricSpecificLocationDetails.initialPrimaryExtendedLocation
                        = ExtendedLocation.fromJson(reader);
                } else if ("initialRecoveryExtendedLocation".equals(fieldName)) {
                    deserializedA2AFabricSpecificLocationDetails.initialRecoveryExtendedLocation
                        = ExtendedLocation.fromJson(reader);
                } else if ("initialPrimaryFabricLocation".equals(fieldName)) {
                    deserializedA2AFabricSpecificLocationDetails.initialPrimaryFabricLocation = reader.getString();
                } else if ("initialRecoveryFabricLocation".equals(fieldName)) {
                    deserializedA2AFabricSpecificLocationDetails.initialRecoveryFabricLocation = reader.getString();
                } else if ("primaryZone".equals(fieldName)) {
                    deserializedA2AFabricSpecificLocationDetails.primaryZone = reader.getString();
                } else if ("recoveryZone".equals(fieldName)) {
                    deserializedA2AFabricSpecificLocationDetails.recoveryZone = reader.getString();
                } else if ("primaryExtendedLocation".equals(fieldName)) {
                    deserializedA2AFabricSpecificLocationDetails.primaryExtendedLocation
                        = ExtendedLocation.fromJson(reader);
                } else if ("recoveryExtendedLocation".equals(fieldName)) {
                    deserializedA2AFabricSpecificLocationDetails.recoveryExtendedLocation
                        = ExtendedLocation.fromJson(reader);
                } else if ("primaryFabricLocation".equals(fieldName)) {
                    deserializedA2AFabricSpecificLocationDetails.primaryFabricLocation = reader.getString();
                } else if ("recoveryFabricLocation".equals(fieldName)) {
                    deserializedA2AFabricSpecificLocationDetails.recoveryFabricLocation = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedA2AFabricSpecificLocationDetails;
        });
    }
}
