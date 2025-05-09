// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Java Component common properties.
 */
@Fluent
public class JavaComponentProperties implements JsonSerializable<JavaComponentProperties> {
    /*
     * Type of the Java Component.
     */
    private JavaComponentType componentType = JavaComponentType.fromString("JavaComponentProperties");

    /*
     * Provisioning state of the Java Component.
     */
    private JavaComponentProvisioningState provisioningState;

    /*
     * List of Java Components configuration properties
     */
    private List<JavaComponentConfigurationProperty> configurations;

    /*
     * Java component scaling configurations
     */
    private JavaComponentPropertiesScale scale;

    /*
     * List of Java Components that are bound to the Java component
     */
    private List<JavaComponentServiceBind> serviceBinds;

    /**
     * Creates an instance of JavaComponentProperties class.
     */
    public JavaComponentProperties() {
    }

    /**
     * Get the componentType property: Type of the Java Component.
     * 
     * @return the componentType value.
     */
    public JavaComponentType componentType() {
        return this.componentType;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Java Component.
     * 
     * @return the provisioningState value.
     */
    public JavaComponentProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the Java Component.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the JavaComponentProperties object itself.
     */
    JavaComponentProperties withProvisioningState(JavaComponentProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the configurations property: List of Java Components configuration properties.
     * 
     * @return the configurations value.
     */
    public List<JavaComponentConfigurationProperty> configurations() {
        return this.configurations;
    }

    /**
     * Set the configurations property: List of Java Components configuration properties.
     * 
     * @param configurations the configurations value to set.
     * @return the JavaComponentProperties object itself.
     */
    public JavaComponentProperties withConfigurations(List<JavaComponentConfigurationProperty> configurations) {
        this.configurations = configurations;
        return this;
    }

    /**
     * Get the scale property: Java component scaling configurations.
     * 
     * @return the scale value.
     */
    public JavaComponentPropertiesScale scale() {
        return this.scale;
    }

    /**
     * Set the scale property: Java component scaling configurations.
     * 
     * @param scale the scale value to set.
     * @return the JavaComponentProperties object itself.
     */
    public JavaComponentProperties withScale(JavaComponentPropertiesScale scale) {
        this.scale = scale;
        return this;
    }

    /**
     * Get the serviceBinds property: List of Java Components that are bound to the Java component.
     * 
     * @return the serviceBinds value.
     */
    public List<JavaComponentServiceBind> serviceBinds() {
        return this.serviceBinds;
    }

    /**
     * Set the serviceBinds property: List of Java Components that are bound to the Java component.
     * 
     * @param serviceBinds the serviceBinds value to set.
     * @return the JavaComponentProperties object itself.
     */
    public JavaComponentProperties withServiceBinds(List<JavaComponentServiceBind> serviceBinds) {
        this.serviceBinds = serviceBinds;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (configurations() != null) {
            configurations().forEach(e -> e.validate());
        }
        if (scale() != null) {
            scale().validate();
        }
        if (serviceBinds() != null) {
            serviceBinds().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("componentType", this.componentType == null ? null : this.componentType.toString());
        jsonWriter.writeArrayField("configurations", this.configurations,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("scale", this.scale);
        jsonWriter.writeArrayField("serviceBinds", this.serviceBinds, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JavaComponentProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JavaComponentProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the JavaComponentProperties.
     */
    public static JavaComponentProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("componentType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("SpringBootAdmin".equals(discriminatorValue)) {
                    return SpringBootAdminComponent.fromJson(readerToUse.reset());
                } else if ("SpringCloudEureka".equals(discriminatorValue)) {
                    return SpringCloudEurekaComponent.fromJson(readerToUse.reset());
                } else if ("SpringCloudConfig".equals(discriminatorValue)) {
                    return SpringCloudConfigComponent.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static JavaComponentProperties fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JavaComponentProperties deserializedJavaComponentProperties = new JavaComponentProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("componentType".equals(fieldName)) {
                    deserializedJavaComponentProperties.componentType
                        = JavaComponentType.fromString(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedJavaComponentProperties.provisioningState
                        = JavaComponentProvisioningState.fromString(reader.getString());
                } else if ("configurations".equals(fieldName)) {
                    List<JavaComponentConfigurationProperty> configurations
                        = reader.readArray(reader1 -> JavaComponentConfigurationProperty.fromJson(reader1));
                    deserializedJavaComponentProperties.configurations = configurations;
                } else if ("scale".equals(fieldName)) {
                    deserializedJavaComponentProperties.scale = JavaComponentPropertiesScale.fromJson(reader);
                } else if ("serviceBinds".equals(fieldName)) {
                    List<JavaComponentServiceBind> serviceBinds
                        = reader.readArray(reader1 -> JavaComponentServiceBind.fromJson(reader1));
                    deserializedJavaComponentProperties.serviceBinds = serviceBinds;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJavaComponentProperties;
        });
    }
}
