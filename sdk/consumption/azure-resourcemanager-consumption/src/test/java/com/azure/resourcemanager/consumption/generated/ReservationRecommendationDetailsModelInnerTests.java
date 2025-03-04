// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.consumption.fluent.models.ReservationRecommendationDetailsModelInner;
import org.junit.jupiter.api.Assertions;

public final class ReservationRecommendationDetailsModelInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReservationRecommendationDetailsModelInner model = BinaryData.fromString(
            "{\"location\":\"wlycoduhpkxkg\",\"sku\":\"areqna\",\"properties\":{\"currency\":\"ugjhky\",\"resource\":{\"appliedScopes\":[\"ddg\",\"sofwqmzqalkrmnji\",\"pxacqqudfn\"],\"onDemandRate\":55.070568,\"product\":\"aaabjyvayff\",\"region\":\"rzrtuzqogsex\",\"reservationRate\":99.46708,\"resourceType\":\"dnw\"},\"resourceGroup\":\"mewzsyyc\",\"savings\":{\"calculatedSavings\":[{\"onDemandCost\":4.8421144,\"overageCost\":47.16871,\"quantity\":99.72802,\"reservationCost\":92.32651,\"totalReservationCost\":34.72377,\"reservedUnitCount\":98.30812,\"savings\":12.873375},{\"onDemandCost\":66.98019,\"overageCost\":24.597227,\"quantity\":41.646255,\"reservationCost\":14.048505,\"totalReservationCost\":34.1618,\"reservedUnitCount\":7.5300694,\"savings\":90.1744},{\"onDemandCost\":67.445885,\"overageCost\":0.729537,\"quantity\":82.552956,\"reservationCost\":1.5196979,\"totalReservationCost\":49.379436,\"reservedUnitCount\":27.041954,\"savings\":56.695747}],\"lookBackPeriod\":2051358572,\"recommendedQuantity\":3.7932158,\"reservationOrderTerm\":\"d\",\"savingsType\":\"axoruzfgsquy\",\"unitOfMeasure\":\"rxxle\"},\"scope\":\"ramxjezwlwnw\",\"usage\":{\"firstConsumptionDate\":\"lcvydy\",\"lastConsumptionDate\":\"tdooaoj\",\"lookBackUnitType\":\"iodkooebwnujhem\",\"usageData\":[54.469536,40.89023,64.91114],\"usageGrain\":\"rodtjinfwjlfl\"}},\"etag\":\"acjvefkd\",\"tags\":{\"owpulpq\":\"akggkfpag\",\"xkqjnsjervt\":\"lyls\",\"zkfzbeyv\":\"agxsdszuemps\"},\"id\":\"nqicvinvkjjxdxrb\",\"name\":\"ukzclewyhmlwpaz\",\"type\":\"zpof\"}")
            .toObject(ReservationRecommendationDetailsModelInner.class);
        Assertions.assertEquals("wlycoduhpkxkg", model.location());
        Assertions.assertEquals("areqna", model.sku());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReservationRecommendationDetailsModelInner model
            = new ReservationRecommendationDetailsModelInner().withLocation("wlycoduhpkxkg").withSku("areqna");
        model = BinaryData.fromObject(model).toObject(ReservationRecommendationDetailsModelInner.class);
        Assertions.assertEquals("wlycoduhpkxkg", model.location());
        Assertions.assertEquals("areqna", model.sku());
    }
}
