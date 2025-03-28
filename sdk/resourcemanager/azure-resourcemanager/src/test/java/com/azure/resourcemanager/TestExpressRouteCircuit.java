// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager;

import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.logging.LogLevel;
import com.azure.resourcemanager.network.models.ExpressRouteCircuit;
import com.azure.resourcemanager.network.models.ExpressRouteCircuitSkuType;
import com.azure.resourcemanager.network.models.ExpressRouteCircuits;
import com.azure.resourcemanager.network.models.ExpressRoutePeeringType;
import com.azure.core.management.Region;
import com.azure.resourcemanager.resources.fluentcore.utils.ResourceManagerUtils;
import org.junit.jupiter.api.Assertions;

/** Tests Express Route Circuit. */
public class TestExpressRouteCircuit {
    private static final ClientLogger LOGGER = new ClientLogger(TestExpressRouteCircuit.class);

    private String testId = "";
    private static final Region REGION = Region.ASIA_SOUTHEAST;
    private String circuitName;

    private void initializeResourceNames(ResourceManagerUtils.InternalRuntimeContext internalContext) {
        testId = internalContext.randomResourceName("", 8);
        circuitName = "erc" + testId;
    }

    /** Test Express Route Circuit Create and Update. */
    public class Basic extends TestTemplate<ExpressRouteCircuit, ExpressRouteCircuits> {
        @Override
        public ExpressRouteCircuit createResource(ExpressRouteCircuits expressRouteCircuits) throws Exception {
            initializeResourceNames(expressRouteCircuits.manager().resourceManager().internalContext());

            // create Express Route Circuit
            ExpressRouteCircuit erc = expressRouteCircuits.define(circuitName)
                .withRegion(REGION)
                .withNewResourceGroup()
                .withServiceProvider("Microsoft ER Test")
                .withPeeringLocation("Area51")
                .withBandwidthInMbps(50)
                .withSku(ExpressRouteCircuitSkuType.STANDARD_METEREDDATA)
                .withTag("tag1", "value1")
                .create();
            return erc;
        }

        @Override
        public ExpressRouteCircuit updateResource(ExpressRouteCircuit resource) throws Exception {
            resource.update()
                .withTag("tag2", "value2")
                .withoutTag("tag1")
                .withBandwidthInMbps(200)
                .withSku(ExpressRouteCircuitSkuType.PREMIUM_UNLIMITEDDATA)
                .apply();
            resource.refresh();
            Assertions.assertTrue(resource.tags().containsKey("tag2"));
            Assertions.assertFalse(resource.tags().containsKey("tag1"));
            Assertions.assertEquals(Integer.valueOf(200), resource.serviceProviderProperties().bandwidthInMbps());
            Assertions.assertEquals(ExpressRouteCircuitSkuType.PREMIUM_UNLIMITEDDATA, resource.sku());

            //            resource.updateTags()
            //                    .withTag("tag3", "value3")
            //                    .withoutTag("tag2")
            //                    .applyTags();
            //            Assertions.assertEquals("value3", resource.tags().get("tag3"));
            //            Assertions.assertFalse(resource.tags().containsKey("tag2"));

            return resource;
        }

        @Override
        public void print(ExpressRouteCircuit resource) {
            printExpressRouteCircuit(resource);
        }
    }

    /** Test Virtual Network Gateway Create and Update. */
    public class ExpressRouteCircuitPeering extends TestTemplate<ExpressRouteCircuit, ExpressRouteCircuits> {
        @Override
        public ExpressRouteCircuit createResource(ExpressRouteCircuits expressRouteCircuits) throws Exception {
            initializeResourceNames(expressRouteCircuits.manager().resourceManager().internalContext());

            // create Express Route Circuit
            ExpressRouteCircuit erc = expressRouteCircuits.define(circuitName)
                .withRegion(REGION)
                .withNewResourceGroup()
                .withServiceProvider("Microsoft ER Test")
                .withPeeringLocation("Area51")
                .withBandwidthInMbps(50)
                .withSku(ExpressRouteCircuitSkuType.PREMIUM_METEREDDATA)
                .withTag("tag1", "value1")
                .create();
            erc.peerings()
                .defineMicrosoftPeering()
                .withAdvertisedPublicPrefixes("123.1.0.0/24")
                .withPrimaryPeerAddressPrefix("123.0.0.0/30")
                .withSecondaryPeerAddressPrefix("123.0.0.4/30")
                .withVlanId(200)
                .withPeerAsn(100)
                .create();
            Assertions.assertEquals(erc.peeringsMap().size(), 1);
            return erc;
        }

        @Override
        public ExpressRouteCircuit updateResource(ExpressRouteCircuit resource) throws Exception {
            Assertions
                .assertTrue(resource.peeringsMap().containsKey(ExpressRoutePeeringType.MICROSOFT_PEERING.toString()));
            com.azure.resourcemanager.network.models.ExpressRouteCircuitPeering peering = resource.peeringsMap()
                .get(ExpressRoutePeeringType.MICROSOFT_PEERING.toString())
                .update()
                .withVlanId(300)
                .withPeerAsn(101)
                .withSecondaryPeerAddressPrefix("123.0.0.8/30")
                .apply();
            Assertions.assertEquals(300, peering.vlanId());
            Assertions.assertEquals(101, peering.peerAsn());
            Assertions.assertEquals("123.0.0.8/30", peering.secondaryPeerAddressPrefix());
            return resource;
        }

        @Override
        public void print(ExpressRouteCircuit resource) {
            printExpressRouteCircuit(resource);
        }
    }

    private static void printExpressRouteCircuit(ExpressRouteCircuit resource) {
        LOGGER.log(LogLevel.VERBOSE,
            () -> "Express Route Circuit: " + resource.id() + "\n\tName: " + resource.name() + "\n\tResource group: "
                + resource.resourceGroupName() + "\n\tRegion: " + resource.regionName() + "\n\tTags: "
                + resource.tags());
    }
}
