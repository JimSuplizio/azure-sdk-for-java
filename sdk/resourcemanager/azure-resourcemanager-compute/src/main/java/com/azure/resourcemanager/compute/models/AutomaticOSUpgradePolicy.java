// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The configuration parameters used for performing automatic OS upgrade.
 */
@Fluent
public final class AutomaticOSUpgradePolicy implements JsonSerializable<AutomaticOSUpgradePolicy> {
    /*
     * Indicates whether OS upgrades should automatically be applied to scale set instances in a rolling fashion when a
     * newer version of the OS image becomes available. Default value is false. If this is set to true for Windows based
     * scale sets,
     * [enableAutomaticUpdates](https://docs.microsoft.com/dotnet/api/microsoft.azure.management.compute.models.
     * windowsconfiguration.enableautomaticupdates?view=azure-dotnet) is automatically set to false and cannot be set to
     * true.
     */
    private Boolean enableAutomaticOSUpgrade;

    /*
     * Whether OS image rollback feature should be disabled. Default value is false.
     */
    private Boolean disableAutomaticRollback;

    /*
     * Indicates whether rolling upgrade policy should be used during Auto OS Upgrade. Default value is false. Auto OS
     * Upgrade will fallback to the default policy if no policy is defined on the VMSS.
     */
    private Boolean useRollingUpgradePolicy;

    /*
     * Indicates whether Auto OS Upgrade should undergo deferral. Deferred OS upgrades will send advanced notifications
     * on a per-VM basis that an OS upgrade from rolling upgrades is incoming, via the IMDS tag
     * 'Platform.PendingOSUpgrade'. The upgrade then defers until the upgrade is approved via an ApproveRollingUpgrade
     * call.
     */
    private Boolean osRollingUpgradeDeferral;

    /**
     * Creates an instance of AutomaticOSUpgradePolicy class.
     */
    public AutomaticOSUpgradePolicy() {
    }

    /**
     * Get the enableAutomaticOSUpgrade property: Indicates whether OS upgrades should automatically be applied to scale
     * set instances in a rolling fashion when a newer version of the OS image becomes available. Default value is
     * false. If this is set to true for Windows based scale sets,
     * [enableAutomaticUpdates](https://docs.microsoft.com/dotnet/api/microsoft.azure.management.compute.models.windowsconfiguration.enableautomaticupdates?view=azure-dotnet)
     * is automatically set to false and cannot be set to true.
     * 
     * @return the enableAutomaticOSUpgrade value.
     */
    public Boolean enableAutomaticOSUpgrade() {
        return this.enableAutomaticOSUpgrade;
    }

    /**
     * Set the enableAutomaticOSUpgrade property: Indicates whether OS upgrades should automatically be applied to scale
     * set instances in a rolling fashion when a newer version of the OS image becomes available. Default value is
     * false. If this is set to true for Windows based scale sets,
     * [enableAutomaticUpdates](https://docs.microsoft.com/dotnet/api/microsoft.azure.management.compute.models.windowsconfiguration.enableautomaticupdates?view=azure-dotnet)
     * is automatically set to false and cannot be set to true.
     * 
     * @param enableAutomaticOSUpgrade the enableAutomaticOSUpgrade value to set.
     * @return the AutomaticOSUpgradePolicy object itself.
     */
    public AutomaticOSUpgradePolicy withEnableAutomaticOSUpgrade(Boolean enableAutomaticOSUpgrade) {
        this.enableAutomaticOSUpgrade = enableAutomaticOSUpgrade;
        return this;
    }

    /**
     * Get the disableAutomaticRollback property: Whether OS image rollback feature should be disabled. Default value is
     * false.
     * 
     * @return the disableAutomaticRollback value.
     */
    public Boolean disableAutomaticRollback() {
        return this.disableAutomaticRollback;
    }

    /**
     * Set the disableAutomaticRollback property: Whether OS image rollback feature should be disabled. Default value is
     * false.
     * 
     * @param disableAutomaticRollback the disableAutomaticRollback value to set.
     * @return the AutomaticOSUpgradePolicy object itself.
     */
    public AutomaticOSUpgradePolicy withDisableAutomaticRollback(Boolean disableAutomaticRollback) {
        this.disableAutomaticRollback = disableAutomaticRollback;
        return this;
    }

    /**
     * Get the useRollingUpgradePolicy property: Indicates whether rolling upgrade policy should be used during Auto OS
     * Upgrade. Default value is false. Auto OS Upgrade will fallback to the default policy if no policy is defined on
     * the VMSS.
     * 
     * @return the useRollingUpgradePolicy value.
     */
    public Boolean useRollingUpgradePolicy() {
        return this.useRollingUpgradePolicy;
    }

    /**
     * Set the useRollingUpgradePolicy property: Indicates whether rolling upgrade policy should be used during Auto OS
     * Upgrade. Default value is false. Auto OS Upgrade will fallback to the default policy if no policy is defined on
     * the VMSS.
     * 
     * @param useRollingUpgradePolicy the useRollingUpgradePolicy value to set.
     * @return the AutomaticOSUpgradePolicy object itself.
     */
    public AutomaticOSUpgradePolicy withUseRollingUpgradePolicy(Boolean useRollingUpgradePolicy) {
        this.useRollingUpgradePolicy = useRollingUpgradePolicy;
        return this;
    }

    /**
     * Get the osRollingUpgradeDeferral property: Indicates whether Auto OS Upgrade should undergo deferral. Deferred OS
     * upgrades will send advanced notifications on a per-VM basis that an OS upgrade from rolling upgrades is incoming,
     * via the IMDS tag 'Platform.PendingOSUpgrade'. The upgrade then defers until the upgrade is approved via an
     * ApproveRollingUpgrade call.
     * 
     * @return the osRollingUpgradeDeferral value.
     */
    public Boolean osRollingUpgradeDeferral() {
        return this.osRollingUpgradeDeferral;
    }

    /**
     * Set the osRollingUpgradeDeferral property: Indicates whether Auto OS Upgrade should undergo deferral. Deferred OS
     * upgrades will send advanced notifications on a per-VM basis that an OS upgrade from rolling upgrades is incoming,
     * via the IMDS tag 'Platform.PendingOSUpgrade'. The upgrade then defers until the upgrade is approved via an
     * ApproveRollingUpgrade call.
     * 
     * @param osRollingUpgradeDeferral the osRollingUpgradeDeferral value to set.
     * @return the AutomaticOSUpgradePolicy object itself.
     */
    public AutomaticOSUpgradePolicy withOsRollingUpgradeDeferral(Boolean osRollingUpgradeDeferral) {
        this.osRollingUpgradeDeferral = osRollingUpgradeDeferral;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("enableAutomaticOSUpgrade", this.enableAutomaticOSUpgrade);
        jsonWriter.writeBooleanField("disableAutomaticRollback", this.disableAutomaticRollback);
        jsonWriter.writeBooleanField("useRollingUpgradePolicy", this.useRollingUpgradePolicy);
        jsonWriter.writeBooleanField("osRollingUpgradeDeferral", this.osRollingUpgradeDeferral);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AutomaticOSUpgradePolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AutomaticOSUpgradePolicy if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AutomaticOSUpgradePolicy.
     */
    public static AutomaticOSUpgradePolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AutomaticOSUpgradePolicy deserializedAutomaticOSUpgradePolicy = new AutomaticOSUpgradePolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enableAutomaticOSUpgrade".equals(fieldName)) {
                    deserializedAutomaticOSUpgradePolicy.enableAutomaticOSUpgrade
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("disableAutomaticRollback".equals(fieldName)) {
                    deserializedAutomaticOSUpgradePolicy.disableAutomaticRollback
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("useRollingUpgradePolicy".equals(fieldName)) {
                    deserializedAutomaticOSUpgradePolicy.useRollingUpgradePolicy
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("osRollingUpgradeDeferral".equals(fieldName)) {
                    deserializedAutomaticOSUpgradePolicy.osRollingUpgradeDeferral
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAutomaticOSUpgradePolicy;
        });
    }
}
