// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.generated;

/**
 * Samples for Summaries ListByFirmware.
 */
public final class SummariesListByFirmwareSamples {
    /*
     * x-ms-original-file: 2025-04-01-preview/Summaries_ListByFirmware_MaximumSet_Gen.json
     */
    /**
     * Sample code: Summaries_ListByFirmware_MaximumSet_Gen - generated by [MaximumSet] rule.
     * 
     * @param manager Entry point to IoTFirmwareDefenseManager.
     */
    public static void summariesListByFirmwareMaximumSetGenGeneratedByMaximumSetRule(
        com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager manager) {
        manager.summaries()
            .listByFirmware("rgiotfirmwaredefense", "exampleWorkspaceName", "00000000-0000-0000-0000-000000000000",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2025-04-01-preview/Summaries_ListByFirmware_MinimumSet_Gen.json
     */
    /**
     * Sample code: Summaries_ListByFirmware_MinimumSet_Gen.
     * 
     * @param manager Entry point to IoTFirmwareDefenseManager.
     */
    public static void summariesListByFirmwareMinimumSetGen(
        com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager manager) {
        manager.summaries()
            .listByFirmware("FirmwareAnalysisRG", "default", "109a9886-50bf-85a8-9d75-000000000000",
                com.azure.core.util.Context.NONE);
    }
}
