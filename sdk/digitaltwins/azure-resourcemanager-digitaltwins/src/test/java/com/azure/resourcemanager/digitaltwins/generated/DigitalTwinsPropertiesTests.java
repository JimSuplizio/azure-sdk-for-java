// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.digitaltwins.fluent.models.DigitalTwinsProperties;
import com.azure.resourcemanager.digitaltwins.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.digitaltwins.models.ConnectionProperties;
import com.azure.resourcemanager.digitaltwins.models.ConnectionPropertiesPrivateLinkServiceConnectionState;
import com.azure.resourcemanager.digitaltwins.models.PrivateEndpoint;
import com.azure.resourcemanager.digitaltwins.models.PrivateLinkServiceConnectionStatus;
import com.azure.resourcemanager.digitaltwins.models.PublicNetworkAccess;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DigitalTwinsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DigitalTwinsProperties model = BinaryData.fromString(
            "{\"createdTime\":\"2021-09-14T21:41:32Z\",\"lastUpdatedTime\":\"2021-01-05T18:43:06Z\",\"provisioningState\":\"Suspending\",\"hostName\":\"ukcdmparcryuanzw\",\"privateEndpointConnections\":[{\"properties\":{\"provisioningState\":\"Approved\",\"privateEndpoint\":{\"id\":\"yrlhmwhfpmrqobm\"},\"groupIds\":[\"knryrtihfxtij\",\"pzvgnwzsymglzufc\",\"zk\"],\"privateLinkServiceConnectionState\":{\"status\":\"Disconnected\",\"description\":\"bihanuf\",\"actionsRequired\":\"cbjy\"}},\"id\":\"git\",\"name\":\"xqhabi\",\"type\":\"pikxwczbyscnpqxu\"},{\"properties\":{\"provisioningState\":\"Pending\",\"privateEndpoint\":{\"id\":\"n\"},\"groupIds\":[\"ybrk\"],\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"umjgrtfwvuk\",\"actionsRequired\":\"audccsnhs\"}},\"id\":\"nyejhkryhtnap\",\"name\":\"zw\",\"type\":\"okjye\"},{\"properties\":{\"provisioningState\":\"Rejected\",\"privateEndpoint\":{\"id\":\"ipjoxzjnchgejs\"},\"groupIds\":[\"mailzydehojw\",\"ahuxinpm\",\"njaqwixjspro\",\"vcputegj\"],\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"fdatsc\",\"actionsRequired\":\"vpjhulsuuv\"}},\"id\":\"jozkrwfndiod\",\"name\":\"pslwejdpvw\",\"type\":\"yoqpsoaccta\"},{\"properties\":{\"provisioningState\":\"Approved\",\"privateEndpoint\":{\"id\":\"lahbcryff\"},\"groupIds\":[\"osygex\",\"aojakhmsbzjhcrz\"],\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"phlxa\",\"actionsRequired\":\"thqt\"}},\"id\":\"qjbpfzfsin\",\"name\":\"gvfcj\",\"type\":\"wzo\"}],\"publicNetworkAccess\":\"Enabled\"}")
            .toObject(DigitalTwinsProperties.class);
        Assertions.assertEquals("knryrtihfxtij",
            model.privateEndpointConnections().get(0).properties().groupIds().get(0));
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.DISCONNECTED,
            model.privateEndpointConnections().get(0).properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("bihanuf",
            model.privateEndpointConnections().get(0).properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("cbjy",
            model.privateEndpointConnections()
                .get(0)
                .properties()
                .privateLinkServiceConnectionState()
                .actionsRequired());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DigitalTwinsProperties model = new DigitalTwinsProperties().withPrivateEndpointConnections(Arrays.asList(
            new PrivateEndpointConnectionInner()
                .withProperties(new ConnectionProperties().withPrivateEndpoint(new PrivateEndpoint())
                    .withGroupIds(Arrays.asList("knryrtihfxtij", "pzvgnwzsymglzufc", "zk"))
                    .withPrivateLinkServiceConnectionState(new ConnectionPropertiesPrivateLinkServiceConnectionState()
                        .withStatus(PrivateLinkServiceConnectionStatus.DISCONNECTED)
                        .withDescription("bihanuf")
                        .withActionsRequired("cbjy"))),
            new PrivateEndpointConnectionInner()
                .withProperties(new ConnectionProperties().withPrivateEndpoint(new PrivateEndpoint())
                    .withGroupIds(Arrays.asList("ybrk"))
                    .withPrivateLinkServiceConnectionState(new ConnectionPropertiesPrivateLinkServiceConnectionState()
                        .withStatus(PrivateLinkServiceConnectionStatus.REJECTED)
                        .withDescription("umjgrtfwvuk")
                        .withActionsRequired("audccsnhs"))),
            new PrivateEndpointConnectionInner()
                .withProperties(new ConnectionProperties().withPrivateEndpoint(new PrivateEndpoint())
                    .withGroupIds(Arrays.asList("mailzydehojw", "ahuxinpm", "njaqwixjspro", "vcputegj"))
                    .withPrivateLinkServiceConnectionState(new ConnectionPropertiesPrivateLinkServiceConnectionState()
                        .withStatus(PrivateLinkServiceConnectionStatus.REJECTED)
                        .withDescription("fdatsc")
                        .withActionsRequired("vpjhulsuuv"))),
            new PrivateEndpointConnectionInner()
                .withProperties(new ConnectionProperties().withPrivateEndpoint(new PrivateEndpoint())
                    .withGroupIds(Arrays.asList("osygex", "aojakhmsbzjhcrz"))
                    .withPrivateLinkServiceConnectionState(new ConnectionPropertiesPrivateLinkServiceConnectionState()
                        .withStatus(PrivateLinkServiceConnectionStatus.REJECTED)
                        .withDescription("phlxa")
                        .withActionsRequired("thqt")))))
            .withPublicNetworkAccess(PublicNetworkAccess.ENABLED);
        model = BinaryData.fromObject(model).toObject(DigitalTwinsProperties.class);
        Assertions.assertEquals("knryrtihfxtij",
            model.privateEndpointConnections().get(0).properties().groupIds().get(0));
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.DISCONNECTED,
            model.privateEndpointConnections().get(0).properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("bihanuf",
            model.privateEndpointConnections().get(0).properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("cbjy",
            model.privateEndpointConnections()
                .get(0)
                .properties()
                .privateLinkServiceConnectionState()
                .actionsRequired());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
    }
}
