// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The action of the probe. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = ProbeAction.class)
@JsonTypeName("ProbeAction")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "HTTPGetAction", value = HttpGetAction.class),
    @JsonSubTypes.Type(name = "ExecAction", value = ExecAction.class),
    @JsonSubTypes.Type(name = "TCPSocketAction", value = TcpSocketAction.class)
})
@Immutable
public class ProbeAction {
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}