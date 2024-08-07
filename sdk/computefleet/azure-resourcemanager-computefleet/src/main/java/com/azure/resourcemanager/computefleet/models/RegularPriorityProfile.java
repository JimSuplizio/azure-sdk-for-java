// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Configuration Options for Regular instances in Compute Fleet.
 */
@Fluent
public final class RegularPriorityProfile implements JsonSerializable<RegularPriorityProfile> {
    /*
     * Total capacity to achieve. It is currently in terms of number of VMs.
     */
    private Integer capacity;

    /*
     * Minimum capacity to achieve which cannot be updated. If we will not be able to "guarantee" minimum capacity, we
     * will reject the request in the sync path itself.
     */
    private Integer minCapacity;

    /*
     * Allocation strategy to follow when determining the VM sizes distribution for Regular VMs.
     */
    private RegularPriorityAllocationStrategy allocationStrategy;

    /**
     * Creates an instance of RegularPriorityProfile class.
     */
    public RegularPriorityProfile() {
    }

    /**
     * Get the capacity property: Total capacity to achieve. It is currently in terms of number of VMs.
     * 
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Total capacity to achieve. It is currently in terms of number of VMs.
     * 
     * @param capacity the capacity value to set.
     * @return the RegularPriorityProfile object itself.
     */
    public RegularPriorityProfile withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the minCapacity property: Minimum capacity to achieve which cannot be updated. If we will not be able to
     * "guarantee" minimum capacity, we will reject the request in the sync path itself.
     * 
     * @return the minCapacity value.
     */
    public Integer minCapacity() {
        return this.minCapacity;
    }

    /**
     * Set the minCapacity property: Minimum capacity to achieve which cannot be updated. If we will not be able to
     * "guarantee" minimum capacity, we will reject the request in the sync path itself.
     * 
     * @param minCapacity the minCapacity value to set.
     * @return the RegularPriorityProfile object itself.
     */
    public RegularPriorityProfile withMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * Get the allocationStrategy property: Allocation strategy to follow when determining the VM sizes distribution for
     * Regular VMs.
     * 
     * @return the allocationStrategy value.
     */
    public RegularPriorityAllocationStrategy allocationStrategy() {
        return this.allocationStrategy;
    }

    /**
     * Set the allocationStrategy property: Allocation strategy to follow when determining the VM sizes distribution for
     * Regular VMs.
     * 
     * @param allocationStrategy the allocationStrategy value to set.
     * @return the RegularPriorityProfile object itself.
     */
    public RegularPriorityProfile withAllocationStrategy(RegularPriorityAllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
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
        jsonWriter.writeNumberField("capacity", this.capacity);
        jsonWriter.writeNumberField("minCapacity", this.minCapacity);
        jsonWriter.writeStringField("allocationStrategy",
            this.allocationStrategy == null ? null : this.allocationStrategy.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RegularPriorityProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RegularPriorityProfile if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RegularPriorityProfile.
     */
    public static RegularPriorityProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RegularPriorityProfile deserializedRegularPriorityProfile = new RegularPriorityProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("capacity".equals(fieldName)) {
                    deserializedRegularPriorityProfile.capacity = reader.getNullable(JsonReader::getInt);
                } else if ("minCapacity".equals(fieldName)) {
                    deserializedRegularPriorityProfile.minCapacity = reader.getNullable(JsonReader::getInt);
                } else if ("allocationStrategy".equals(fieldName)) {
                    deserializedRegularPriorityProfile.allocationStrategy
                        = RegularPriorityAllocationStrategy.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRegularPriorityProfile;
        });
    }
}
