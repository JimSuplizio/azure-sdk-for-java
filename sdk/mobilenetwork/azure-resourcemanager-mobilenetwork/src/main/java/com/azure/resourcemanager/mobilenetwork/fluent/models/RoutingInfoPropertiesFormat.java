// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mobilenetwork.models.Ipv4Route;
import com.azure.resourcemanager.mobilenetwork.models.UserPlaneDataRoutesItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Routing information properties.
 */
@Fluent
public final class RoutingInfoPropertiesFormat {
    /*
     * A list of IPv4 routes.
     */
    @JsonProperty(value = "controlPlaneAccessRoutes")
    private List<Ipv4Route> controlPlaneAccessRoutes;

    /*
     * A list of IPv4 routes.
     */
    @JsonProperty(value = "userPlaneAccessRoutes")
    private List<Ipv4Route> userPlaneAccessRoutes;

    /*
     * A list of attached data networks and their IPv4 routes.
     */
    @JsonProperty(value = "userPlaneDataRoutes")
    private List<UserPlaneDataRoutesItem> userPlaneDataRoutes;

    /**
     * Creates an instance of RoutingInfoPropertiesFormat class.
     */
    public RoutingInfoPropertiesFormat() {
    }

    /**
     * Get the controlPlaneAccessRoutes property: A list of IPv4 routes.
     * 
     * @return the controlPlaneAccessRoutes value.
     */
    public List<Ipv4Route> controlPlaneAccessRoutes() {
        return this.controlPlaneAccessRoutes;
    }

    /**
     * Set the controlPlaneAccessRoutes property: A list of IPv4 routes.
     * 
     * @param controlPlaneAccessRoutes the controlPlaneAccessRoutes value to set.
     * @return the RoutingInfoPropertiesFormat object itself.
     */
    public RoutingInfoPropertiesFormat withControlPlaneAccessRoutes(List<Ipv4Route> controlPlaneAccessRoutes) {
        this.controlPlaneAccessRoutes = controlPlaneAccessRoutes;
        return this;
    }

    /**
     * Get the userPlaneAccessRoutes property: A list of IPv4 routes.
     * 
     * @return the userPlaneAccessRoutes value.
     */
    public List<Ipv4Route> userPlaneAccessRoutes() {
        return this.userPlaneAccessRoutes;
    }

    /**
     * Set the userPlaneAccessRoutes property: A list of IPv4 routes.
     * 
     * @param userPlaneAccessRoutes the userPlaneAccessRoutes value to set.
     * @return the RoutingInfoPropertiesFormat object itself.
     */
    public RoutingInfoPropertiesFormat withUserPlaneAccessRoutes(List<Ipv4Route> userPlaneAccessRoutes) {
        this.userPlaneAccessRoutes = userPlaneAccessRoutes;
        return this;
    }

    /**
     * Get the userPlaneDataRoutes property: A list of attached data networks and their IPv4 routes.
     * 
     * @return the userPlaneDataRoutes value.
     */
    public List<UserPlaneDataRoutesItem> userPlaneDataRoutes() {
        return this.userPlaneDataRoutes;
    }

    /**
     * Set the userPlaneDataRoutes property: A list of attached data networks and their IPv4 routes.
     * 
     * @param userPlaneDataRoutes the userPlaneDataRoutes value to set.
     * @return the RoutingInfoPropertiesFormat object itself.
     */
    public RoutingInfoPropertiesFormat withUserPlaneDataRoutes(List<UserPlaneDataRoutesItem> userPlaneDataRoutes) {
        this.userPlaneDataRoutes = userPlaneDataRoutes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (controlPlaneAccessRoutes() != null) {
            controlPlaneAccessRoutes().forEach(e -> e.validate());
        }
        if (userPlaneAccessRoutes() != null) {
            userPlaneAccessRoutes().forEach(e -> e.validate());
        }
        if (userPlaneDataRoutes() != null) {
            userPlaneDataRoutes().forEach(e -> e.validate());
        }
    }
}
