// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.JsonField;
import com.azure.resourcemanager.eventgrid.models.JsonFieldWithDefault;
import com.azure.resourcemanager.eventgrid.models.JsonInputSchemaMapping;
import org.junit.jupiter.api.Assertions;

public final class JsonInputSchemaMappingTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JsonInputSchemaMapping model = BinaryData.fromString(
            "{\"inputSchemaMappingType\":\"Json\",\"properties\":{\"id\":{\"sourceField\":\"bedenrexkx\"},\"topic\":{\"sourceField\":\"vucnulgmnh\"},\"eventTime\":{\"sourceField\":\"dyznfajsvks\"},\"eventType\":{\"sourceField\":\"ozzkivyhjrlii\",\"defaultValue\":\"ixlqfhefkwabsolr\"},\"subject\":{\"sourceField\":\"qlmgnlqxsjxt\",\"defaultValue\":\"exhvuqbozoolz\"},\"dataVersion\":{\"sourceField\":\"arkuzl\",\"defaultValue\":\"nndtsnxa\"}}}")
            .toObject(JsonInputSchemaMapping.class);
        Assertions.assertEquals("bedenrexkx", model.id().sourceField());
        Assertions.assertEquals("vucnulgmnh", model.topic().sourceField());
        Assertions.assertEquals("dyznfajsvks", model.eventTime().sourceField());
        Assertions.assertEquals("ozzkivyhjrlii", model.eventType().sourceField());
        Assertions.assertEquals("ixlqfhefkwabsolr", model.eventType().defaultValue());
        Assertions.assertEquals("qlmgnlqxsjxt", model.subject().sourceField());
        Assertions.assertEquals("exhvuqbozoolz", model.subject().defaultValue());
        Assertions.assertEquals("arkuzl", model.dataVersion().sourceField());
        Assertions.assertEquals("nndtsnxa", model.dataVersion().defaultValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JsonInputSchemaMapping model = new JsonInputSchemaMapping()
            .withId(new JsonField().withSourceField("bedenrexkx"))
            .withTopic(new JsonField().withSourceField("vucnulgmnh"))
            .withEventTime(new JsonField().withSourceField("dyznfajsvks"))
            .withEventType(
                new JsonFieldWithDefault().withSourceField("ozzkivyhjrlii").withDefaultValue("ixlqfhefkwabsolr"))
            .withSubject(new JsonFieldWithDefault().withSourceField("qlmgnlqxsjxt").withDefaultValue("exhvuqbozoolz"))
            .withDataVersion(new JsonFieldWithDefault().withSourceField("arkuzl").withDefaultValue("nndtsnxa"));
        model = BinaryData.fromObject(model).toObject(JsonInputSchemaMapping.class);
        Assertions.assertEquals("bedenrexkx", model.id().sourceField());
        Assertions.assertEquals("vucnulgmnh", model.topic().sourceField());
        Assertions.assertEquals("dyznfajsvks", model.eventTime().sourceField());
        Assertions.assertEquals("ozzkivyhjrlii", model.eventType().sourceField());
        Assertions.assertEquals("ixlqfhefkwabsolr", model.eventType().defaultValue());
        Assertions.assertEquals("qlmgnlqxsjxt", model.subject().sourceField());
        Assertions.assertEquals("exhvuqbozoolz", model.subject().defaultValue());
        Assertions.assertEquals("arkuzl", model.dataVersion().sourceField());
        Assertions.assertEquals("nndtsnxa", model.dataVersion().defaultValue());
    }
}
