// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.peering.models.DirectPeeringFacility;
import com.azure.resourcemanager.peering.models.DirectPeeringType;
import com.azure.resourcemanager.peering.models.PeeringBandwidthOffer;
import com.azure.resourcemanager.peering.models.PeeringLocationPropertiesDirect;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PeeringLocationPropertiesDirectTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PeeringLocationPropertiesDirect model = BinaryData.fromString(
            "{\"peeringFacilities\":[{\"address\":\"qukkfp\",\"directPeeringType\":\"Ix\",\"peeringDBFacilityId\":1737094412,\"peeringDBFacilityLink\":\"nkjzkdeslpvlop\"}],\"bandwidthOffers\":[{\"offerName\":\"ghxpkdw\",\"valueInMbps\":1170549879},{\"offerName\":\"uebbaumnyqup\",\"valueInMbps\":1687595526}]}")
            .toObject(PeeringLocationPropertiesDirect.class);
        Assertions.assertEquals("qukkfp", model.peeringFacilities().get(0).address());
        Assertions.assertEquals(DirectPeeringType.IX, model.peeringFacilities().get(0).directPeeringType());
        Assertions.assertEquals(1737094412, model.peeringFacilities().get(0).peeringDBFacilityId());
        Assertions.assertEquals("nkjzkdeslpvlop", model.peeringFacilities().get(0).peeringDBFacilityLink());
        Assertions.assertEquals("ghxpkdw", model.bandwidthOffers().get(0).offerName());
        Assertions.assertEquals(1170549879, model.bandwidthOffers().get(0).valueInMbps());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PeeringLocationPropertiesDirect model = new PeeringLocationPropertiesDirect()
            .withPeeringFacilities(Arrays.asList(new DirectPeeringFacility().withAddress("qukkfp")
                .withDirectPeeringType(DirectPeeringType.IX)
                .withPeeringDBFacilityId(1737094412)
                .withPeeringDBFacilityLink("nkjzkdeslpvlop")))
            .withBandwidthOffers(
                Arrays.asList(new PeeringBandwidthOffer().withOfferName("ghxpkdw").withValueInMbps(1170549879),
                    new PeeringBandwidthOffer().withOfferName("uebbaumnyqup").withValueInMbps(1687595526)));
        model = BinaryData.fromObject(model).toObject(PeeringLocationPropertiesDirect.class);
        Assertions.assertEquals("qukkfp", model.peeringFacilities().get(0).address());
        Assertions.assertEquals(DirectPeeringType.IX, model.peeringFacilities().get(0).directPeeringType());
        Assertions.assertEquals(1737094412, model.peeringFacilities().get(0).peeringDBFacilityId());
        Assertions.assertEquals("nkjzkdeslpvlop", model.peeringFacilities().get(0).peeringDBFacilityLink());
        Assertions.assertEquals("ghxpkdw", model.bandwidthOffers().get(0).offerName());
        Assertions.assertEquals(1170549879, model.bandwidthOffers().get(0).valueInMbps());
    }
}
