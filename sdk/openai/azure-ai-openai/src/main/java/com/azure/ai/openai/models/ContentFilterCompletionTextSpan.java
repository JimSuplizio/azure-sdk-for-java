// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes a span within generated completion text. Offset 0 is the first UTF32 code point of the completion text.
 */
@Immutable
public final class ContentFilterCompletionTextSpan implements JsonSerializable<ContentFilterCompletionTextSpan> {

    /*
     * Offset of the UTF32 code point which begins the span.
     */
    @Generated
    private final int completionStartOffset;

    /*
     * Offset of the first UTF32 code point which is excluded from the span.
     * This field is always equal to completion_start_offset for empty spans.
     * This field is always larger than completion_start_offset for non-empty spans.
     */
    @Generated
    private final int completionEndOffset;

    /**
     * Creates an instance of ContentFilterCompletionTextSpan class.
     *
     * @param completionStartOffset the completionStartOffset value to set.
     * @param completionEndOffset the completionEndOffset value to set.
     */
    @Generated
    private ContentFilterCompletionTextSpan(int completionStartOffset, int completionEndOffset) {
        this.completionStartOffset = completionStartOffset;
        this.completionEndOffset = completionEndOffset;
    }

    /**
     * Get the completionStartOffset property: Offset of the UTF32 code point which begins the span.
     *
     * @return the completionStartOffset value.
     */
    @Generated
    public int getCompletionStartOffset() {
        return this.completionStartOffset;
    }

    /**
     * Get the completionEndOffset property: Offset of the first UTF32 code point which is excluded from the span.
     * This field is always equal to completion_start_offset for empty spans.
     * This field is always larger than completion_start_offset for non-empty spans.
     *
     * @return the completionEndOffset value.
     */
    @Generated
    public int getCompletionEndOffset() {
        return this.completionEndOffset;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("completion_start_offset", this.completionStartOffset);
        jsonWriter.writeIntField("completion_end_offset", this.completionEndOffset);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContentFilterCompletionTextSpan from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContentFilterCompletionTextSpan if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ContentFilterCompletionTextSpan.
     */
    @Generated
    public static ContentFilterCompletionTextSpan fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int completionStartOffset = 0;
            int completionEndOffset = 0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("completion_start_offset".equals(fieldName)) {
                    completionStartOffset = reader.getInt();
                } else if ("completion_end_offset".equals(fieldName)) {
                    completionEndOffset = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }
            return new ContentFilterCompletionTextSpan(completionStartOffset, completionEndOffset);
        });
    }
}
