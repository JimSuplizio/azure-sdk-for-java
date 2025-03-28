// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.NetworkInterfaceIpConfigurationInner;
import com.azure.resourcemanager.resources.fluentcore.arm.models.ChildResource;
import com.azure.resourcemanager.resources.fluentcore.arm.models.HasSubnet;
import com.azure.resourcemanager.resources.fluentcore.model.HasInnerModel;

/** An IP configuration in a network interface associated with a virtual machine scale set. */
@Fluent
public interface VirtualMachineScaleSetNicIpConfiguration
    extends NicIpConfigurationBase, HasInnerModel<NetworkInterfaceIpConfigurationInner>,
    ChildResource<VirtualMachineScaleSetNetworkInterface>, HasPrivateIpAddress, HasSubnet {
}
