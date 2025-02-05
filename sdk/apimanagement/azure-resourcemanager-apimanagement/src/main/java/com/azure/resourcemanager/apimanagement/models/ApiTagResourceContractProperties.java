// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * API contract properties for the Tag Resources.
 */
@Fluent
public final class ApiTagResourceContractProperties extends ApiEntityBaseContract {
    /*
     * API identifier in the form /apis/{apiId}.
     */
    private String id;

    /*
     * API name.
     */
    private String name;

    /*
     * Absolute URL of the backend service implementing this API.
     */
    private String serviceUrl;

    /*
     * Relative URL uniquely identifying this API and all of its resource paths within the API Management service
     * instance. It is appended to the API endpoint base URL specified during the service instance creation to form a
     * public URL for this API.
     */
    private String path;

    /*
     * Describes on which protocols the operations in this API can be invoked.
     */
    private List<Protocol> protocols;

    /*
     * Indicates if API revision is accessible via the gateway.
     */
    private Boolean isOnline;

    /**
     * Creates an instance of ApiTagResourceContractProperties class.
     */
    public ApiTagResourceContractProperties() {
    }

    /**
     * Get the id property: API identifier in the form /apis/{apiId}.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: API identifier in the form /apis/{apiId}.
     * 
     * @param id the id value to set.
     * @return the ApiTagResourceContractProperties object itself.
     */
    public ApiTagResourceContractProperties withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: API name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: API name.
     * 
     * @param name the name value to set.
     * @return the ApiTagResourceContractProperties object itself.
     */
    public ApiTagResourceContractProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the serviceUrl property: Absolute URL of the backend service implementing this API.
     * 
     * @return the serviceUrl value.
     */
    public String serviceUrl() {
        return this.serviceUrl;
    }

    /**
     * Set the serviceUrl property: Absolute URL of the backend service implementing this API.
     * 
     * @param serviceUrl the serviceUrl value to set.
     * @return the ApiTagResourceContractProperties object itself.
     */
    public ApiTagResourceContractProperties withServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
        return this;
    }

    /**
     * Get the path property: Relative URL uniquely identifying this API and all of its resource paths within the API
     * Management service instance. It is appended to the API endpoint base URL specified during the service instance
     * creation to form a public URL for this API.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Relative URL uniquely identifying this API and all of its resource paths within the API
     * Management service instance. It is appended to the API endpoint base URL specified during the service instance
     * creation to form a public URL for this API.
     * 
     * @param path the path value to set.
     * @return the ApiTagResourceContractProperties object itself.
     */
    public ApiTagResourceContractProperties withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the protocols property: Describes on which protocols the operations in this API can be invoked.
     * 
     * @return the protocols value.
     */
    public List<Protocol> protocols() {
        return this.protocols;
    }

    /**
     * Set the protocols property: Describes on which protocols the operations in this API can be invoked.
     * 
     * @param protocols the protocols value to set.
     * @return the ApiTagResourceContractProperties object itself.
     */
    public ApiTagResourceContractProperties withProtocols(List<Protocol> protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * Get the isOnline property: Indicates if API revision is accessible via the gateway.
     * 
     * @return the isOnline value.
     */
    @Override
    public Boolean isOnline() {
        return this.isOnline;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiTagResourceContractProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiTagResourceContractProperties
        withAuthenticationSettings(AuthenticationSettingsContract authenticationSettings) {
        super.withAuthenticationSettings(authenticationSettings);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiTagResourceContractProperties
        withSubscriptionKeyParameterNames(SubscriptionKeyParameterNamesContract subscriptionKeyParameterNames) {
        super.withSubscriptionKeyParameterNames(subscriptionKeyParameterNames);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiTagResourceContractProperties withApiType(ApiType apiType) {
        super.withApiType(apiType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiTagResourceContractProperties withApiRevision(String apiRevision) {
        super.withApiRevision(apiRevision);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiTagResourceContractProperties withApiVersion(String apiVersion) {
        super.withApiVersion(apiVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiTagResourceContractProperties withIsCurrent(Boolean isCurrent) {
        super.withIsCurrent(isCurrent);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiTagResourceContractProperties withApiRevisionDescription(String apiRevisionDescription) {
        super.withApiRevisionDescription(apiRevisionDescription);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiTagResourceContractProperties withApiVersionDescription(String apiVersionDescription) {
        super.withApiVersionDescription(apiVersionDescription);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiTagResourceContractProperties withApiVersionSetId(String apiVersionSetId) {
        super.withApiVersionSetId(apiVersionSetId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiTagResourceContractProperties withSubscriptionRequired(Boolean subscriptionRequired) {
        super.withSubscriptionRequired(subscriptionRequired);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiTagResourceContractProperties withTermsOfServiceUrl(String termsOfServiceUrl) {
        super.withTermsOfServiceUrl(termsOfServiceUrl);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiTagResourceContractProperties withContact(ApiContactInformation contact) {
        super.withContact(contact);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiTagResourceContractProperties withLicense(ApiLicenseInformation license) {
        super.withLicense(license);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (authenticationSettings() != null) {
            authenticationSettings().validate();
        }
        if (subscriptionKeyParameterNames() != null) {
            subscriptionKeyParameterNames().validate();
        }
        if (contact() != null) {
            contact().validate();
        }
        if (license() != null) {
            license().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeJsonField("authenticationSettings", authenticationSettings());
        jsonWriter.writeJsonField("subscriptionKeyParameterNames", subscriptionKeyParameterNames());
        jsonWriter.writeStringField("type", apiType() == null ? null : apiType().toString());
        jsonWriter.writeStringField("apiRevision", apiRevision());
        jsonWriter.writeStringField("apiVersion", apiVersion());
        jsonWriter.writeBooleanField("isCurrent", isCurrent());
        jsonWriter.writeStringField("apiRevisionDescription", apiRevisionDescription());
        jsonWriter.writeStringField("apiVersionDescription", apiVersionDescription());
        jsonWriter.writeStringField("apiVersionSetId", apiVersionSetId());
        jsonWriter.writeBooleanField("subscriptionRequired", subscriptionRequired());
        jsonWriter.writeStringField("termsOfServiceUrl", termsOfServiceUrl());
        jsonWriter.writeJsonField("contact", contact());
        jsonWriter.writeJsonField("license", license());
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("serviceUrl", this.serviceUrl);
        jsonWriter.writeStringField("path", this.path);
        jsonWriter.writeArrayField("protocols", this.protocols,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApiTagResourceContractProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApiTagResourceContractProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApiTagResourceContractProperties.
     */
    public static ApiTagResourceContractProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApiTagResourceContractProperties deserializedApiTagResourceContractProperties
                = new ApiTagResourceContractProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedApiTagResourceContractProperties.withDescription(reader.getString());
                } else if ("authenticationSettings".equals(fieldName)) {
                    deserializedApiTagResourceContractProperties
                        .withAuthenticationSettings(AuthenticationSettingsContract.fromJson(reader));
                } else if ("subscriptionKeyParameterNames".equals(fieldName)) {
                    deserializedApiTagResourceContractProperties
                        .withSubscriptionKeyParameterNames(SubscriptionKeyParameterNamesContract.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedApiTagResourceContractProperties.withApiType(ApiType.fromString(reader.getString()));
                } else if ("apiRevision".equals(fieldName)) {
                    deserializedApiTagResourceContractProperties.withApiRevision(reader.getString());
                } else if ("apiVersion".equals(fieldName)) {
                    deserializedApiTagResourceContractProperties.withApiVersion(reader.getString());
                } else if ("isCurrent".equals(fieldName)) {
                    deserializedApiTagResourceContractProperties
                        .withIsCurrent(reader.getNullable(JsonReader::getBoolean));
                } else if ("isOnline".equals(fieldName)) {
                    deserializedApiTagResourceContractProperties.isOnline = reader.getNullable(JsonReader::getBoolean);
                } else if ("apiRevisionDescription".equals(fieldName)) {
                    deserializedApiTagResourceContractProperties.withApiRevisionDescription(reader.getString());
                } else if ("apiVersionDescription".equals(fieldName)) {
                    deserializedApiTagResourceContractProperties.withApiVersionDescription(reader.getString());
                } else if ("apiVersionSetId".equals(fieldName)) {
                    deserializedApiTagResourceContractProperties.withApiVersionSetId(reader.getString());
                } else if ("subscriptionRequired".equals(fieldName)) {
                    deserializedApiTagResourceContractProperties
                        .withSubscriptionRequired(reader.getNullable(JsonReader::getBoolean));
                } else if ("termsOfServiceUrl".equals(fieldName)) {
                    deserializedApiTagResourceContractProperties.withTermsOfServiceUrl(reader.getString());
                } else if ("contact".equals(fieldName)) {
                    deserializedApiTagResourceContractProperties.withContact(ApiContactInformation.fromJson(reader));
                } else if ("license".equals(fieldName)) {
                    deserializedApiTagResourceContractProperties.withLicense(ApiLicenseInformation.fromJson(reader));
                } else if ("id".equals(fieldName)) {
                    deserializedApiTagResourceContractProperties.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedApiTagResourceContractProperties.name = reader.getString();
                } else if ("serviceUrl".equals(fieldName)) {
                    deserializedApiTagResourceContractProperties.serviceUrl = reader.getString();
                } else if ("path".equals(fieldName)) {
                    deserializedApiTagResourceContractProperties.path = reader.getString();
                } else if ("protocols".equals(fieldName)) {
                    List<Protocol> protocols = reader.readArray(reader1 -> Protocol.fromString(reader1.getString()));
                    deserializedApiTagResourceContractProperties.protocols = protocols;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApiTagResourceContractProperties;
        });
    }
}
