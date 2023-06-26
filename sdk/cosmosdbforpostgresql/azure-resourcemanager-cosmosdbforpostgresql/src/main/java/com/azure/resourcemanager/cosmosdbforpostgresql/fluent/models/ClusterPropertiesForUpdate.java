// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.MaintenanceWindow;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties used to update a cluster. */
@Fluent
public final class ClusterPropertiesForUpdate {
    /*
     * The password of the administrator login. Each cluster is created with pre-defined administrative role called
     * ‘citus’.
     */
    @JsonProperty(value = "administratorLoginPassword")
    private String administratorLoginPassword;

    /*
     * The major PostgreSQL version on all cluster servers.
     */
    @JsonProperty(value = "postgresqlVersion")
    private String postgresqlVersion;

    /*
     * The Citus extension version on all cluster servers.
     */
    @JsonProperty(value = "citusVersion")
    private String citusVersion;

    /*
     * If shards on coordinator is enabled or not for the cluster.
     */
    @JsonProperty(value = "enableShardsOnCoordinator")
    private Boolean enableShardsOnCoordinator;

    /*
     * If high availability (HA) is enabled or not for the cluster.
     */
    @JsonProperty(value = "enableHa")
    private Boolean enableHa;

    /*
     * Preferred primary availability zone (AZ) for all cluster servers.
     */
    @JsonProperty(value = "preferredPrimaryZone")
    private String preferredPrimaryZone;

    /*
     * The edition of the coordinator (default: GeneralPurpose).
     */
    @JsonProperty(value = "coordinatorServerEdition")
    private String coordinatorServerEdition;

    /*
     * The storage of the coordinator in MB.
     */
    @JsonProperty(value = "coordinatorStorageQuotaInMb")
    private Integer coordinatorStorageQuotaInMb;

    /*
     * The vCores count of the coordinator (max: 96).
     */
    @JsonProperty(value = "coordinatorVCores")
    private Integer coordinatorVCores;

    /*
     * If public access is enabled on coordinator.
     */
    @JsonProperty(value = "coordinatorEnablePublicIpAccess")
    private Boolean coordinatorEnablePublicIpAccess;

    /*
     * The edition of a node (default: MemoryOptimized).
     */
    @JsonProperty(value = "nodeServerEdition")
    private String nodeServerEdition;

    /*
     * Worker node count of the cluster. When node count is 0, it represents a single node configuration with the
     * ability to create distributed tables on that node. 2 or more worker nodes represent multi-node configuration.
     * Node count value cannot be 1.
     */
    @JsonProperty(value = "nodeCount")
    private Integer nodeCount;

    /*
     * The storage in MB on each worker node.
     */
    @JsonProperty(value = "nodeStorageQuotaInMb")
    private Integer nodeStorageQuotaInMb;

    /*
     * The compute in vCores on each worker node (max: 104).
     */
    @JsonProperty(value = "nodeVCores")
    private Integer nodeVCores;

    /*
     * If public access is enabled on worker nodes.
     */
    @JsonProperty(value = "nodeEnablePublicIpAccess", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean nodeEnablePublicIpAccess;

    /*
     * Maintenance window of a cluster.
     */
    @JsonProperty(value = "maintenanceWindow")
    private MaintenanceWindow maintenanceWindow;

    /** Creates an instance of ClusterPropertiesForUpdate class. */
    public ClusterPropertiesForUpdate() {
    }

    /**
     * Get the administratorLoginPassword property: The password of the administrator login. Each cluster is created
     * with pre-defined administrative role called ‘citus’. .
     *
     * @return the administratorLoginPassword value.
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administratorLoginPassword property: The password of the administrator login. Each cluster is created
     * with pre-defined administrative role called ‘citus’. .
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set.
     * @return the ClusterPropertiesForUpdate object itself.
     */
    public ClusterPropertiesForUpdate withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the postgresqlVersion property: The major PostgreSQL version on all cluster servers.
     *
     * @return the postgresqlVersion value.
     */
    public String postgresqlVersion() {
        return this.postgresqlVersion;
    }

    /**
     * Set the postgresqlVersion property: The major PostgreSQL version on all cluster servers.
     *
     * @param postgresqlVersion the postgresqlVersion value to set.
     * @return the ClusterPropertiesForUpdate object itself.
     */
    public ClusterPropertiesForUpdate withPostgresqlVersion(String postgresqlVersion) {
        this.postgresqlVersion = postgresqlVersion;
        return this;
    }

    /**
     * Get the citusVersion property: The Citus extension version on all cluster servers.
     *
     * @return the citusVersion value.
     */
    public String citusVersion() {
        return this.citusVersion;
    }

    /**
     * Set the citusVersion property: The Citus extension version on all cluster servers.
     *
     * @param citusVersion the citusVersion value to set.
     * @return the ClusterPropertiesForUpdate object itself.
     */
    public ClusterPropertiesForUpdate withCitusVersion(String citusVersion) {
        this.citusVersion = citusVersion;
        return this;
    }

    /**
     * Get the enableShardsOnCoordinator property: If shards on coordinator is enabled or not for the cluster.
     *
     * @return the enableShardsOnCoordinator value.
     */
    public Boolean enableShardsOnCoordinator() {
        return this.enableShardsOnCoordinator;
    }

    /**
     * Set the enableShardsOnCoordinator property: If shards on coordinator is enabled or not for the cluster.
     *
     * @param enableShardsOnCoordinator the enableShardsOnCoordinator value to set.
     * @return the ClusterPropertiesForUpdate object itself.
     */
    public ClusterPropertiesForUpdate withEnableShardsOnCoordinator(Boolean enableShardsOnCoordinator) {
        this.enableShardsOnCoordinator = enableShardsOnCoordinator;
        return this;
    }

    /**
     * Get the enableHa property: If high availability (HA) is enabled or not for the cluster.
     *
     * @return the enableHa value.
     */
    public Boolean enableHa() {
        return this.enableHa;
    }

    /**
     * Set the enableHa property: If high availability (HA) is enabled or not for the cluster.
     *
     * @param enableHa the enableHa value to set.
     * @return the ClusterPropertiesForUpdate object itself.
     */
    public ClusterPropertiesForUpdate withEnableHa(Boolean enableHa) {
        this.enableHa = enableHa;
        return this;
    }

    /**
     * Get the preferredPrimaryZone property: Preferred primary availability zone (AZ) for all cluster servers.
     *
     * @return the preferredPrimaryZone value.
     */
    public String preferredPrimaryZone() {
        return this.preferredPrimaryZone;
    }

    /**
     * Set the preferredPrimaryZone property: Preferred primary availability zone (AZ) for all cluster servers.
     *
     * @param preferredPrimaryZone the preferredPrimaryZone value to set.
     * @return the ClusterPropertiesForUpdate object itself.
     */
    public ClusterPropertiesForUpdate withPreferredPrimaryZone(String preferredPrimaryZone) {
        this.preferredPrimaryZone = preferredPrimaryZone;
        return this;
    }

    /**
     * Get the coordinatorServerEdition property: The edition of the coordinator (default: GeneralPurpose).
     *
     * @return the coordinatorServerEdition value.
     */
    public String coordinatorServerEdition() {
        return this.coordinatorServerEdition;
    }

    /**
     * Set the coordinatorServerEdition property: The edition of the coordinator (default: GeneralPurpose).
     *
     * @param coordinatorServerEdition the coordinatorServerEdition value to set.
     * @return the ClusterPropertiesForUpdate object itself.
     */
    public ClusterPropertiesForUpdate withCoordinatorServerEdition(String coordinatorServerEdition) {
        this.coordinatorServerEdition = coordinatorServerEdition;
        return this;
    }

    /**
     * Get the coordinatorStorageQuotaInMb property: The storage of the coordinator in MB.
     *
     * @return the coordinatorStorageQuotaInMb value.
     */
    public Integer coordinatorStorageQuotaInMb() {
        return this.coordinatorStorageQuotaInMb;
    }

    /**
     * Set the coordinatorStorageQuotaInMb property: The storage of the coordinator in MB.
     *
     * @param coordinatorStorageQuotaInMb the coordinatorStorageQuotaInMb value to set.
     * @return the ClusterPropertiesForUpdate object itself.
     */
    public ClusterPropertiesForUpdate withCoordinatorStorageQuotaInMb(Integer coordinatorStorageQuotaInMb) {
        this.coordinatorStorageQuotaInMb = coordinatorStorageQuotaInMb;
        return this;
    }

    /**
     * Get the coordinatorVCores property: The vCores count of the coordinator (max: 96).
     *
     * @return the coordinatorVCores value.
     */
    public Integer coordinatorVCores() {
        return this.coordinatorVCores;
    }

    /**
     * Set the coordinatorVCores property: The vCores count of the coordinator (max: 96).
     *
     * @param coordinatorVCores the coordinatorVCores value to set.
     * @return the ClusterPropertiesForUpdate object itself.
     */
    public ClusterPropertiesForUpdate withCoordinatorVCores(Integer coordinatorVCores) {
        this.coordinatorVCores = coordinatorVCores;
        return this;
    }

    /**
     * Get the coordinatorEnablePublicIpAccess property: If public access is enabled on coordinator.
     *
     * @return the coordinatorEnablePublicIpAccess value.
     */
    public Boolean coordinatorEnablePublicIpAccess() {
        return this.coordinatorEnablePublicIpAccess;
    }

    /**
     * Set the coordinatorEnablePublicIpAccess property: If public access is enabled on coordinator.
     *
     * @param coordinatorEnablePublicIpAccess the coordinatorEnablePublicIpAccess value to set.
     * @return the ClusterPropertiesForUpdate object itself.
     */
    public ClusterPropertiesForUpdate withCoordinatorEnablePublicIpAccess(Boolean coordinatorEnablePublicIpAccess) {
        this.coordinatorEnablePublicIpAccess = coordinatorEnablePublicIpAccess;
        return this;
    }

    /**
     * Get the nodeServerEdition property: The edition of a node (default: MemoryOptimized).
     *
     * @return the nodeServerEdition value.
     */
    public String nodeServerEdition() {
        return this.nodeServerEdition;
    }

    /**
     * Set the nodeServerEdition property: The edition of a node (default: MemoryOptimized).
     *
     * @param nodeServerEdition the nodeServerEdition value to set.
     * @return the ClusterPropertiesForUpdate object itself.
     */
    public ClusterPropertiesForUpdate withNodeServerEdition(String nodeServerEdition) {
        this.nodeServerEdition = nodeServerEdition;
        return this;
    }

    /**
     * Get the nodeCount property: Worker node count of the cluster. When node count is 0, it represents a single node
     * configuration with the ability to create distributed tables on that node. 2 or more worker nodes represent
     * multi-node configuration. Node count value cannot be 1.
     *
     * @return the nodeCount value.
     */
    public Integer nodeCount() {
        return this.nodeCount;
    }

    /**
     * Set the nodeCount property: Worker node count of the cluster. When node count is 0, it represents a single node
     * configuration with the ability to create distributed tables on that node. 2 or more worker nodes represent
     * multi-node configuration. Node count value cannot be 1.
     *
     * @param nodeCount the nodeCount value to set.
     * @return the ClusterPropertiesForUpdate object itself.
     */
    public ClusterPropertiesForUpdate withNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * Get the nodeStorageQuotaInMb property: The storage in MB on each worker node.
     *
     * @return the nodeStorageQuotaInMb value.
     */
    public Integer nodeStorageQuotaInMb() {
        return this.nodeStorageQuotaInMb;
    }

    /**
     * Set the nodeStorageQuotaInMb property: The storage in MB on each worker node.
     *
     * @param nodeStorageQuotaInMb the nodeStorageQuotaInMb value to set.
     * @return the ClusterPropertiesForUpdate object itself.
     */
    public ClusterPropertiesForUpdate withNodeStorageQuotaInMb(Integer nodeStorageQuotaInMb) {
        this.nodeStorageQuotaInMb = nodeStorageQuotaInMb;
        return this;
    }

    /**
     * Get the nodeVCores property: The compute in vCores on each worker node (max: 104).
     *
     * @return the nodeVCores value.
     */
    public Integer nodeVCores() {
        return this.nodeVCores;
    }

    /**
     * Set the nodeVCores property: The compute in vCores on each worker node (max: 104).
     *
     * @param nodeVCores the nodeVCores value to set.
     * @return the ClusterPropertiesForUpdate object itself.
     */
    public ClusterPropertiesForUpdate withNodeVCores(Integer nodeVCores) {
        this.nodeVCores = nodeVCores;
        return this;
    }

    /**
     * Get the nodeEnablePublicIpAccess property: If public access is enabled on worker nodes.
     *
     * @return the nodeEnablePublicIpAccess value.
     */
    public Boolean nodeEnablePublicIpAccess() {
        return this.nodeEnablePublicIpAccess;
    }

    /**
     * Get the maintenanceWindow property: Maintenance window of a cluster.
     *
     * @return the maintenanceWindow value.
     */
    public MaintenanceWindow maintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * Set the maintenanceWindow property: Maintenance window of a cluster.
     *
     * @param maintenanceWindow the maintenanceWindow value to set.
     * @return the ClusterPropertiesForUpdate object itself.
     */
    public ClusterPropertiesForUpdate withMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (maintenanceWindow() != null) {
            maintenanceWindow().validate();
        }
    }
}