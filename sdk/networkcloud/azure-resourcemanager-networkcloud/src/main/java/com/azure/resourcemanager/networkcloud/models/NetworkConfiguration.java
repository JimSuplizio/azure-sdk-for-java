// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** NetworkConfiguration specifies the Kubernetes cluster network related configuration. */
@Fluent
public final class NetworkConfiguration {
    /*
     * AttachedNetworkConfiguration represents the set of workload networks to attach to a resource.
     *
     * The configuration of networks being attached to the cluster for use by the workloads that run on this Kubernetes
     * cluster.
     */
    @JsonProperty(value = "attachedNetworkConfiguration")
    private AttachedNetworkConfiguration attachedNetworkConfiguration;

    /*
     * BgpServiceLoadBalancerConfiguration represents the configuration of a BGP service load balancer.
     *
     * The configuration of the BGP service load balancer for this Kubernetes cluster.
     */
    @JsonProperty(value = "bgpServiceLoadBalancerConfiguration")
    private BgpServiceLoadBalancerConfiguration bgpServiceLoadBalancerConfiguration;

    /*
     * The resource ID of the associated Cloud Services network.
     */
    @JsonProperty(value = "cloudServicesNetworkId", required = true)
    private String cloudServicesNetworkId;

    /*
     * The resource ID of the Layer 3 network that is used for creation of the Container Networking Interface network.
     */
    @JsonProperty(value = "cniNetworkId", required = true)
    private String cniNetworkId;

    /*
     * The IP address assigned to the Kubernetes DNS service. It must be within the Kubernetes service address range
     * specified in service CIDR.
     */
    @JsonProperty(value = "dnsServiceIp")
    private String dnsServiceIp;

    /*
     * The CIDR notation IP ranges from which to assign pod IPs. One IPv4 CIDR is expected for single-stack networking.
     * Two CIDRs, one for each IP family (IPv4/IPv6), is expected for dual-stack networking.
     */
    @JsonProperty(value = "podCidrs")
    private List<String> podCidrs;

    /*
     * The CIDR notation IP ranges from which to assign service IPs. One IPv4 CIDR is expected for single-stack
     * networking. Two CIDRs, one for each IP family (IPv4/IPv6), is expected for dual-stack networking.
     */
    @JsonProperty(value = "serviceCidrs")
    private List<String> serviceCidrs;

    /** Creates an instance of NetworkConfiguration class. */
    public NetworkConfiguration() {
    }

    /**
     * Get the attachedNetworkConfiguration property: AttachedNetworkConfiguration represents the set of workload
     * networks to attach to a resource.
     *
     * <p>The configuration of networks being attached to the cluster for use by the workloads that run on this
     * Kubernetes cluster.
     *
     * @return the attachedNetworkConfiguration value.
     */
    public AttachedNetworkConfiguration attachedNetworkConfiguration() {
        return this.attachedNetworkConfiguration;
    }

    /**
     * Set the attachedNetworkConfiguration property: AttachedNetworkConfiguration represents the set of workload
     * networks to attach to a resource.
     *
     * <p>The configuration of networks being attached to the cluster for use by the workloads that run on this
     * Kubernetes cluster.
     *
     * @param attachedNetworkConfiguration the attachedNetworkConfiguration value to set.
     * @return the NetworkConfiguration object itself.
     */
    public NetworkConfiguration withAttachedNetworkConfiguration(
        AttachedNetworkConfiguration attachedNetworkConfiguration) {
        this.attachedNetworkConfiguration = attachedNetworkConfiguration;
        return this;
    }

    /**
     * Get the bgpServiceLoadBalancerConfiguration property: BgpServiceLoadBalancerConfiguration represents the
     * configuration of a BGP service load balancer.
     *
     * <p>The configuration of the BGP service load balancer for this Kubernetes cluster.
     *
     * @return the bgpServiceLoadBalancerConfiguration value.
     */
    public BgpServiceLoadBalancerConfiguration bgpServiceLoadBalancerConfiguration() {
        return this.bgpServiceLoadBalancerConfiguration;
    }

    /**
     * Set the bgpServiceLoadBalancerConfiguration property: BgpServiceLoadBalancerConfiguration represents the
     * configuration of a BGP service load balancer.
     *
     * <p>The configuration of the BGP service load balancer for this Kubernetes cluster.
     *
     * @param bgpServiceLoadBalancerConfiguration the bgpServiceLoadBalancerConfiguration value to set.
     * @return the NetworkConfiguration object itself.
     */
    public NetworkConfiguration withBgpServiceLoadBalancerConfiguration(
        BgpServiceLoadBalancerConfiguration bgpServiceLoadBalancerConfiguration) {
        this.bgpServiceLoadBalancerConfiguration = bgpServiceLoadBalancerConfiguration;
        return this;
    }

    /**
     * Get the cloudServicesNetworkId property: The resource ID of the associated Cloud Services network.
     *
     * @return the cloudServicesNetworkId value.
     */
    public String cloudServicesNetworkId() {
        return this.cloudServicesNetworkId;
    }

    /**
     * Set the cloudServicesNetworkId property: The resource ID of the associated Cloud Services network.
     *
     * @param cloudServicesNetworkId the cloudServicesNetworkId value to set.
     * @return the NetworkConfiguration object itself.
     */
    public NetworkConfiguration withCloudServicesNetworkId(String cloudServicesNetworkId) {
        this.cloudServicesNetworkId = cloudServicesNetworkId;
        return this;
    }

    /**
     * Get the cniNetworkId property: The resource ID of the Layer 3 network that is used for creation of the Container
     * Networking Interface network.
     *
     * @return the cniNetworkId value.
     */
    public String cniNetworkId() {
        return this.cniNetworkId;
    }

    /**
     * Set the cniNetworkId property: The resource ID of the Layer 3 network that is used for creation of the Container
     * Networking Interface network.
     *
     * @param cniNetworkId the cniNetworkId value to set.
     * @return the NetworkConfiguration object itself.
     */
    public NetworkConfiguration withCniNetworkId(String cniNetworkId) {
        this.cniNetworkId = cniNetworkId;
        return this;
    }

    /**
     * Get the dnsServiceIp property: The IP address assigned to the Kubernetes DNS service. It must be within the
     * Kubernetes service address range specified in service CIDR.
     *
     * @return the dnsServiceIp value.
     */
    public String dnsServiceIp() {
        return this.dnsServiceIp;
    }

    /**
     * Set the dnsServiceIp property: The IP address assigned to the Kubernetes DNS service. It must be within the
     * Kubernetes service address range specified in service CIDR.
     *
     * @param dnsServiceIp the dnsServiceIp value to set.
     * @return the NetworkConfiguration object itself.
     */
    public NetworkConfiguration withDnsServiceIp(String dnsServiceIp) {
        this.dnsServiceIp = dnsServiceIp;
        return this;
    }

    /**
     * Get the podCidrs property: The CIDR notation IP ranges from which to assign pod IPs. One IPv4 CIDR is expected
     * for single-stack networking. Two CIDRs, one for each IP family (IPv4/IPv6), is expected for dual-stack
     * networking.
     *
     * @return the podCidrs value.
     */
    public List<String> podCidrs() {
        return this.podCidrs;
    }

    /**
     * Set the podCidrs property: The CIDR notation IP ranges from which to assign pod IPs. One IPv4 CIDR is expected
     * for single-stack networking. Two CIDRs, one for each IP family (IPv4/IPv6), is expected for dual-stack
     * networking.
     *
     * @param podCidrs the podCidrs value to set.
     * @return the NetworkConfiguration object itself.
     */
    public NetworkConfiguration withPodCidrs(List<String> podCidrs) {
        this.podCidrs = podCidrs;
        return this;
    }

    /**
     * Get the serviceCidrs property: The CIDR notation IP ranges from which to assign service IPs. One IPv4 CIDR is
     * expected for single-stack networking. Two CIDRs, one for each IP family (IPv4/IPv6), is expected for dual-stack
     * networking.
     *
     * @return the serviceCidrs value.
     */
    public List<String> serviceCidrs() {
        return this.serviceCidrs;
    }

    /**
     * Set the serviceCidrs property: The CIDR notation IP ranges from which to assign service IPs. One IPv4 CIDR is
     * expected for single-stack networking. Two CIDRs, one for each IP family (IPv4/IPv6), is expected for dual-stack
     * networking.
     *
     * @param serviceCidrs the serviceCidrs value to set.
     * @return the NetworkConfiguration object itself.
     */
    public NetworkConfiguration withServiceCidrs(List<String> serviceCidrs) {
        this.serviceCidrs = serviceCidrs;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (attachedNetworkConfiguration() != null) {
            attachedNetworkConfiguration().validate();
        }
        if (bgpServiceLoadBalancerConfiguration() != null) {
            bgpServiceLoadBalancerConfiguration().validate();
        }
        if (cloudServicesNetworkId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property cloudServicesNetworkId in model NetworkConfiguration"));
        }
        if (cniNetworkId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property cniNetworkId in model NetworkConfiguration"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkConfiguration.class);
}