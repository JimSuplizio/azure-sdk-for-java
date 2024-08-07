// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Response for detect API.
 */
@Immutable
public final class FaceDetectionResult implements JsonSerializable<FaceDetectionResult> {

    /*
     * Unique faceId of the detected face, created by detection API and it will expire 24 hours after the detection
     * call. To return this, it requires 'returnFaceId' parameter to be true.
     */
    @Generated
    private String faceId;

    /*
     * The 'recognitionModel' associated with this faceId. This is only returned when 'returnRecognitionModel' is
     * explicitly set as true.
     */
    @Generated
    private FaceRecognitionModel recognitionModel;

    /*
     * A rectangle area for the face location on image.
     */
    @Generated
    private final FaceRectangle faceRectangle;

    /*
     * An array of 27-point face landmarks pointing to the important positions of face components. To return this, it
     * requires 'returnFaceLandmarks' parameter to be true.
     */
    @Generated
    private FaceLandmarks faceLandmarks;

    /*
     * Face attributes for detected face.
     */
    @Generated
    private FaceAttributes faceAttributes;

    /**
     * Creates an instance of FaceDetectionResult class.
     *
     * @param faceRectangle the faceRectangle value to set.
     */
    @Generated
    private FaceDetectionResult(FaceRectangle faceRectangle) {
        this.faceRectangle = faceRectangle;
    }

    /**
     * Get the faceId property: Unique faceId of the detected face, created by detection API and it will expire 24 hours
     * after the detection call. To return this, it requires 'returnFaceId' parameter to be true.
     *
     * @return the faceId value.
     */
    @Generated
    public String getFaceId() {
        return this.faceId;
    }

    /**
     * Get the recognitionModel property: The 'recognitionModel' associated with this faceId. This is only returned when
     * 'returnRecognitionModel' is explicitly set as true.
     *
     * @return the recognitionModel value.
     */
    @Generated
    public FaceRecognitionModel getRecognitionModel() {
        return this.recognitionModel;
    }

    /**
     * Get the faceRectangle property: A rectangle area for the face location on image.
     *
     * @return the faceRectangle value.
     */
    @Generated
    public FaceRectangle getFaceRectangle() {
        return this.faceRectangle;
    }

    /**
     * Get the faceLandmarks property: An array of 27-point face landmarks pointing to the important positions of face
     * components. To return this, it requires 'returnFaceLandmarks' parameter to be true.
     *
     * @return the faceLandmarks value.
     */
    @Generated
    public FaceLandmarks getFaceLandmarks() {
        return this.faceLandmarks;
    }

    /**
     * Get the faceAttributes property: Face attributes for detected face.
     *
     * @return the faceAttributes value.
     */
    @Generated
    public FaceAttributes getFaceAttributes() {
        return this.faceAttributes;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("faceRectangle", this.faceRectangle);
        jsonWriter.writeStringField("faceId", this.faceId);
        jsonWriter.writeStringField("recognitionModel",
            this.recognitionModel == null ? null : this.recognitionModel.toString());
        jsonWriter.writeJsonField("faceLandmarks", this.faceLandmarks);
        jsonWriter.writeJsonField("faceAttributes", this.faceAttributes);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FaceDetectionResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of FaceDetectionResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FaceDetectionResult.
     */
    @Generated
    public static FaceDetectionResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FaceRectangle faceRectangle = null;
            String faceId = null;
            FaceRecognitionModel recognitionModel = null;
            FaceLandmarks faceLandmarks = null;
            FaceAttributes faceAttributes = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("faceRectangle".equals(fieldName)) {
                    faceRectangle = FaceRectangle.fromJson(reader);
                } else if ("faceId".equals(fieldName)) {
                    faceId = reader.getString();
                } else if ("recognitionModel".equals(fieldName)) {
                    recognitionModel = FaceRecognitionModel.fromString(reader.getString());
                } else if ("faceLandmarks".equals(fieldName)) {
                    faceLandmarks = FaceLandmarks.fromJson(reader);
                } else if ("faceAttributes".equals(fieldName)) {
                    faceAttributes = FaceAttributes.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            FaceDetectionResult deserializedFaceDetectionResult = new FaceDetectionResult(faceRectangle);
            deserializedFaceDetectionResult.faceId = faceId;
            deserializedFaceDetectionResult.recognitionModel = recognitionModel;
            deserializedFaceDetectionResult.faceLandmarks = faceLandmarks;
            deserializedFaceDetectionResult.faceAttributes = faceAttributes;
            return deserializedFaceDetectionResult;
        });
    }
}
