// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakeanalytics.models.ComputePolicyListResult;

public final class ComputePolicyListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ComputePolicyListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"objectId\":\"50258881-83a4-432e-8ede-a4518c38ab5d\",\"objectType\":\"User\",\"maxDegreeOfParallelismPerJob\":1979421186,\"minPriorityPerJob\":1468269047},\"name\":\"lfplp\",\"type\":\"xus\",\"id\":\"pabgyeps\"},{\"properties\":{\"objectId\":\"f378345f-bec9-427c-ac48-779521733dff\",\"objectType\":\"ServicePrincipal\",\"maxDegreeOfParallelismPerJob\":610868240,\"minPriorityPerJob\":2003590668},\"name\":\"wpmueefj\",\"type\":\"fqkquj\",\"id\":\"suyonobglaocq\"},{\"properties\":{\"objectId\":\"4aa3de16-48e1-4883-ad04-40afe653f4a4\",\"objectType\":\"User\",\"maxDegreeOfParallelismPerJob\":528280521,\"minPriorityPerJob\":1054992005},\"name\":\"ytlmoyrxvwfud\",\"type\":\"zntxhdz\",\"id\":\"rqjbhckfrl\"},{\"properties\":{\"objectId\":\"2afa3854-c6f3-412c-844a-e3d62bd65b1c\",\"objectType\":\"Group\",\"maxDegreeOfParallelismPerJob\":1085647312,\"minPriorityPerJob\":475839278},\"name\":\"ca\",\"type\":\"z\",\"id\":\"zka\"}],\"nextLink\":\"uwbc\"}")
                .toObject(ComputePolicyListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ComputePolicyListResult model = new ComputePolicyListResult();
        model = BinaryData.fromObject(model).toObject(ComputePolicyListResult.class);
    }
}
