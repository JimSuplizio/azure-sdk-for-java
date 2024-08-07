// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The connection info for the given notebook workspace.
 */
@Immutable
public final class NotebookWorkspaceConnectionInfoResultInner
    implements JsonSerializable<NotebookWorkspaceConnectionInfoResultInner> {
    /*
     * Specifies auth token used for connecting to Notebook server (uses token-based auth).
     */
    private String authToken;

    /*
     * Specifies the endpoint of Notebook server.
     */
    private String notebookServerEndpoint;

    /**
     * Creates an instance of NotebookWorkspaceConnectionInfoResultInner class.
     */
    public NotebookWorkspaceConnectionInfoResultInner() {
    }

    /**
     * Get the authToken property: Specifies auth token used for connecting to Notebook server (uses token-based auth).
     * 
     * @return the authToken value.
     */
    public String authToken() {
        return this.authToken;
    }

    /**
     * Get the notebookServerEndpoint property: Specifies the endpoint of Notebook server.
     * 
     * @return the notebookServerEndpoint value.
     */
    public String notebookServerEndpoint() {
        return this.notebookServerEndpoint;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NotebookWorkspaceConnectionInfoResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NotebookWorkspaceConnectionInfoResultInner if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NotebookWorkspaceConnectionInfoResultInner.
     */
    public static NotebookWorkspaceConnectionInfoResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NotebookWorkspaceConnectionInfoResultInner deserializedNotebookWorkspaceConnectionInfoResultInner
                = new NotebookWorkspaceConnectionInfoResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("authToken".equals(fieldName)) {
                    deserializedNotebookWorkspaceConnectionInfoResultInner.authToken = reader.getString();
                } else if ("notebookServerEndpoint".equals(fieldName)) {
                    deserializedNotebookWorkspaceConnectionInfoResultInner.notebookServerEndpoint = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNotebookWorkspaceConnectionInfoResultInner;
        });
    }
}
