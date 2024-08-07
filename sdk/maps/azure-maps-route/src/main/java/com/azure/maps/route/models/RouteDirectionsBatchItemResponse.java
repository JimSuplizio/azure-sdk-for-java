// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.maps.route.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.maps.route.implementation.models.ErrorDetail;
import java.io.IOException;
import java.util.List;
import com.azure.core.models.ResponseError;

/**
 * The result of the query. RouteDirections if the query completed successfully, ErrorResponse otherwise.
 */
@Fluent
final class RouteDirectionsBatchItemResponse extends RouteDirections {

    /*
     * The error object.
     */
    private ErrorDetail error;

    /**
     * Creates an instance of RouteDirectionsBatchItemResponse class.
     */
    RouteDirectionsBatchItemResponse() {
    }

    /**
     * Get the error property: The error object.
     *
     * @return the error value.
     */
    public ResponseError getError() {
        return new ResponseError(this.error.getCode(), this.error.getMessage());
    }

    /**
     * Set the error property: The error object.
     *
     * @param error the error value to set.
     * @return the RouteDirectionsBatchItemResponse object itself.
     */
    public RouteDirectionsBatchItemResponse setError(ResponseError error) {
        this.error = new ErrorDetail().setCode(error.getCode()).setMessage(error.getMessage());
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteDirectionsBatchItemResponse setReport(RouteReport report) {
        super.setReport(report);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("report", getReport());
        jsonWriter.writeJsonField("error", this.error);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RouteDirectionsBatchItemResponse from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RouteDirectionsBatchItemResponse if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RouteDirectionsBatchItemResponse.
     */
    public static RouteDirectionsBatchItemResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RouteDirectionsBatchItemResponse deserializedRouteDirectionsBatchItemResponse
                = new RouteDirectionsBatchItemResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("formatVersion".equals(fieldName)) {
                    deserializedRouteDirectionsBatchItemResponse.setFormatVersion(reader.getString());
                } else if ("routes".equals(fieldName)) {
                    List<MapsSearchRoute> routes = reader.readArray(reader1 -> MapsSearchRoute.fromJson(reader1));
                    deserializedRouteDirectionsBatchItemResponse.setRoutes(routes);
                } else if ("optimizedWaypoints".equals(fieldName)) {
                    List<RouteOptimizedWaypoint> optimizedWaypoints
                        = reader.readArray(reader1 -> RouteOptimizedWaypoint.fromJson(reader1));
                    deserializedRouteDirectionsBatchItemResponse.setOptimizedWaypoints(optimizedWaypoints);
                } else if ("report".equals(fieldName)) {
                    deserializedRouteDirectionsBatchItemResponse.setReport(RouteReport.fromJson(reader));
                } else if ("error".equals(fieldName)) {
                    deserializedRouteDirectionsBatchItemResponse.error = ErrorDetail.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedRouteDirectionsBatchItemResponse;
        });
    }

    /**
     * Constructor with error.
     *
     * @param error the error object
     */
    RouteDirectionsBatchItemResponse(ErrorDetail error) {
        this.error = error;
    }
}
