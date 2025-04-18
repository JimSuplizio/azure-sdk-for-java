// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.HardwareInventory;

public final class HardwareInventoryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HardwareInventory model = BinaryData.fromString(
            "{\"additionalHostInformation\":\"s\",\"interfaces\":[{\"linkStatus\":\"v\",\"macAddress\":\"jrwzox\",\"name\":\"tfell\",\"networkInterfaceId\":\"fziton\"},{\"linkStatus\":\"qfpjk\",\"macAddress\":\"xofpdvhpfxxypi\",\"name\":\"nmayhuybb\",\"networkInterfaceId\":\"odepoogin\"},{\"linkStatus\":\"amiheognarxz\",\"macAddress\":\"heotusiv\",\"name\":\"v\",\"networkInterfaceId\":\"iqihn\"}],\"nics\":[{\"lldpNeighbor\":{\"portDescription\":\"wjzrnfygxgisp\",\"portName\":\"vtz\",\"systemDescription\":\"ufubl\",\"systemName\":\"fxqeof\"},\"macAddress\":\"e\",\"name\":\"hqjbasvmsmj\"},{\"lldpNeighbor\":{\"portDescription\":\"ngsntnbybk\",\"portName\":\"cwrwclxxwrljdous\",\"systemDescription\":\"qvkoc\",\"systemName\":\"jdkwtnhxbnjb\"},\"macAddress\":\"sqrglssainq\",\"name\":\"wnzlljfmppeeb\"}]}")
            .toObject(HardwareInventory.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HardwareInventory model = new HardwareInventory();
        model = BinaryData.fromObject(model).toObject(HardwareInventory.class);
    }
}
