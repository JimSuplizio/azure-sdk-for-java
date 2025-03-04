// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/**
 * Samples for GlobalRulestack ListAppIds.
 */
public final class GlobalRulestackListAppIdsSamples {
    /*
     * x-ms-original-file:
     * specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2023-09-01/examples/
     * GlobalRulestack_listAppIds_MaximumSet_Gen.json
     */
    /**
     * Sample code: GlobalRulestack_listAppIds_MaximumSet_Gen.
     * 
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void globalRulestackListAppIdsMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.globalRulestacks()
            .listAppIdsWithResponse("praval", "8543", "pref", "a6a321", 20, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2023-09-01/examples/
     * GlobalRulestack_listAppIds_MinimumSet_Gen.json
     */
    /**
     * Sample code: GlobalRulestack_listAppIds_MinimumSet_Gen.
     * 
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void globalRulestackListAppIdsMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.globalRulestacks()
            .listAppIdsWithResponse("praval", null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
