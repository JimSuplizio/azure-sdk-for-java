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
 * HTTPGet specifies the http request to perform.
 */
@Fluent
public final class ContainerAppProbeHttpGet implements JsonSerializable<ContainerAppProbeHttpGet> {
    /*
     * Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
     */
    private String host;

    /*
     * Custom headers to set in the request. HTTP allows repeated headers.
     */
    private List<ContainerAppProbeHttpGetHttpHeadersItem> httpHeaders;

    /*
     * Path to access on the HTTP server.
     */
    private String path;

    /*
     * Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
     * IANA_SVC_NAME.
     */
    private int port;

    /*
     * Scheme to use for connecting to the host. Defaults to HTTP.
     */
    private Scheme scheme;

    /**
     * Creates an instance of ContainerAppProbeHttpGet class.
     */
    public ContainerAppProbeHttpGet() {
    }

    /**
     * Get the host property: Host name to connect to, defaults to the pod IP. You probably want to set "Host" in
     * httpHeaders instead.
     * 
     * @return the host value.
     */
    public String host() {
        return this.host;
    }

    /**
     * Set the host property: Host name to connect to, defaults to the pod IP. You probably want to set "Host" in
     * httpHeaders instead.
     * 
     * @param host the host value to set.
     * @return the ContainerAppProbeHttpGet object itself.
     */
    public ContainerAppProbeHttpGet withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * Get the httpHeaders property: Custom headers to set in the request. HTTP allows repeated headers.
     * 
     * @return the httpHeaders value.
     */
    public List<ContainerAppProbeHttpGetHttpHeadersItem> httpHeaders() {
        return this.httpHeaders;
    }

    /**
     * Set the httpHeaders property: Custom headers to set in the request. HTTP allows repeated headers.
     * 
     * @param httpHeaders the httpHeaders value to set.
     * @return the ContainerAppProbeHttpGet object itself.
     */
    public ContainerAppProbeHttpGet withHttpHeaders(List<ContainerAppProbeHttpGetHttpHeadersItem> httpHeaders) {
        this.httpHeaders = httpHeaders;
        return this;
    }

    /**
     * Get the path property: Path to access on the HTTP server.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Path to access on the HTTP server.
     * 
     * @param path the path value to set.
     * @return the ContainerAppProbeHttpGet object itself.
     */
    public ContainerAppProbeHttpGet withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the port property: Name or number of the port to access on the container. Number must be in the range 1 to
     * 65535. Name must be an IANA_SVC_NAME.
     * 
     * @return the port value.
     */
    public int port() {
        return this.port;
    }

    /**
     * Set the port property: Name or number of the port to access on the container. Number must be in the range 1 to
     * 65535. Name must be an IANA_SVC_NAME.
     * 
     * @param port the port value to set.
     * @return the ContainerAppProbeHttpGet object itself.
     */
    public ContainerAppProbeHttpGet withPort(int port) {
        this.port = port;
        return this;
    }

    /**
     * Get the scheme property: Scheme to use for connecting to the host. Defaults to HTTP.
     * 
     * @return the scheme value.
     */
    public Scheme scheme() {
        return this.scheme;
    }

    /**
     * Set the scheme property: Scheme to use for connecting to the host. Defaults to HTTP.
     * 
     * @param scheme the scheme value to set.
     * @return the ContainerAppProbeHttpGet object itself.
     */
    public ContainerAppProbeHttpGet withScheme(Scheme scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (httpHeaders() != null) {
            httpHeaders().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("port", this.port);
        jsonWriter.writeStringField("host", this.host);
        jsonWriter.writeArrayField("httpHeaders", this.httpHeaders, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("path", this.path);
        jsonWriter.writeStringField("scheme", this.scheme == null ? null : this.scheme.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContainerAppProbeHttpGet from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContainerAppProbeHttpGet if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ContainerAppProbeHttpGet.
     */
    public static ContainerAppProbeHttpGet fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContainerAppProbeHttpGet deserializedContainerAppProbeHttpGet = new ContainerAppProbeHttpGet();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("port".equals(fieldName)) {
                    deserializedContainerAppProbeHttpGet.port = reader.getInt();
                } else if ("host".equals(fieldName)) {
                    deserializedContainerAppProbeHttpGet.host = reader.getString();
                } else if ("httpHeaders".equals(fieldName)) {
                    List<ContainerAppProbeHttpGetHttpHeadersItem> httpHeaders
                        = reader.readArray(reader1 -> ContainerAppProbeHttpGetHttpHeadersItem.fromJson(reader1));
                    deserializedContainerAppProbeHttpGet.httpHeaders = httpHeaders;
                } else if ("path".equals(fieldName)) {
                    deserializedContainerAppProbeHttpGet.path = reader.getString();
                } else if ("scheme".equals(fieldName)) {
                    deserializedContainerAppProbeHttpGet.scheme = Scheme.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContainerAppProbeHttpGet;
        });
    }
}
