// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.communication.jobrouter.implementation.JsonMergePatchHelper;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * A rule providing a binding to an HTTP Triggered Azure Function.
 */
@Fluent
public final class FunctionRouterRule extends RouterRule {

    /*
     * The type discriminator describing a sub-type of RouterRule
     */
    @Generated
    private RouterRuleKind kind = RouterRuleKind.FUNCTION;

    /*
     * URL for Azure Function.
     */
    @Generated
    private String functionUri;

    /*
     * Credentials used to access Azure function rule.
     */
    @Generated
    private FunctionRouterRuleCredential credential;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    /**
     * Creates an instance of FunctionRouterRule class.
     */
    @Generated
    public FunctionRouterRule() {
    }

    /**
     * Get the kind property: The type discriminator describing a sub-type of RouterRule.
     *
     * @return the kind value.
     */
    @Generated
    @Override
    public RouterRuleKind getKind() {
        return this.kind;
    }

    /**
     * Get the functionUri property: URL for Azure Function.
     *
     * @return the functionUri value.
     */
    @Generated
    public String getFunctionUri() {
        return this.functionUri;
    }

    /**
     * Set the functionUri property: URL for Azure Function.
     * <p>Required when create the resource.</p>
     *
     * @param functionUri the functionUri value to set.
     * @return the FunctionRouterRule object itself.
     */
    @Generated
    public FunctionRouterRule setFunctionUri(String functionUri) {
        this.functionUri = functionUri;
        this.updatedProperties.add("functionUri");
        return this;
    }

    /**
     * Get the credential property: Credentials used to access Azure function rule.
     *
     * @return the credential value.
     */
    @Generated
    public FunctionRouterRuleCredential getCredential() {
        return this.credential;
    }

    /**
     * Set the credential property: Credentials used to access Azure function rule.
     *
     * @param credential the credential value to set.
     * @return the FunctionRouterRule object itself.
     */
    @Generated
    public FunctionRouterRule setCredential(FunctionRouterRuleCredential credential) {
        this.credential = credential;
        this.updatedProperties.add("credential");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (JsonMergePatchHelper.getRouterRuleAccessor().isJsonMergePatch(this)) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
            jsonWriter.writeStringField("functionUri", this.functionUri);
            jsonWriter.writeJsonField("credential", this.credential);
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind.toString());
        if (updatedProperties.contains("functionUri")) {
            if (this.functionUri == null) {
                jsonWriter.writeNullField("functionUri");
            } else {
                jsonWriter.writeStringField("functionUri", this.functionUri);
            }
        }
        if (updatedProperties.contains("credential")) {
            if (this.credential == null) {
                jsonWriter.writeNullField("credential");
            } else {
                JsonMergePatchHelper.getFunctionRouterRuleCredentialAccessor()
                    .prepareModelForJsonMergePatch(this.credential, true);
                jsonWriter.writeJsonField("credential", this.credential);
                JsonMergePatchHelper.getFunctionRouterRuleCredentialAccessor()
                    .prepareModelForJsonMergePatch(this.credential, false);
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FunctionRouterRule from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of FunctionRouterRule if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the FunctionRouterRule.
     */
    @Generated
    public static FunctionRouterRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FunctionRouterRule deserializedFunctionRouterRule = new FunctionRouterRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("kind".equals(fieldName)) {
                    deserializedFunctionRouterRule.kind = RouterRuleKind.fromString(reader.getString());
                } else if ("functionUri".equals(fieldName)) {
                    deserializedFunctionRouterRule.functionUri = reader.getString();
                } else if ("credential".equals(fieldName)) {
                    deserializedFunctionRouterRule.credential = FunctionRouterRuleCredential.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedFunctionRouterRule;
        });
    }

    /**
     * Creates an instance of FunctionRouterRule class.
     *
     * @param functionUri the functionUri value to set.
     */
    public FunctionRouterRule(String functionUri) {
        this.functionUri = functionUri;
        this.updatedProperties.add("functionUri");
    }
}
