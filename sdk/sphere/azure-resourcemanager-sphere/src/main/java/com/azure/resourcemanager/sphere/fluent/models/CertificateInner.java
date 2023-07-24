// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.sphere.models.CertificateStatus;
import com.azure.resourcemanager.sphere.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** An certificate resource belonging to a catalog resource. */
@Immutable
public final class CertificateInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    @JsonProperty(value = "properties")
    private CertificateProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of CertificateInner class. */
    public CertificateInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     *
     * @return the innerProperties value.
     */
    private CertificateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the certificate property: The certificate as a UTF-8 encoded base 64 string.
     *
     * @return the certificate value.
     */
    public String certificate() {
        return this.innerProperties() == null ? null : this.innerProperties().certificate();
    }

    /**
     * Get the status property: The certificate status.
     *
     * @return the status value.
     */
    public CertificateStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the subject property: The certificate subject.
     *
     * @return the subject value.
     */
    public String subject() {
        return this.innerProperties() == null ? null : this.innerProperties().subject();
    }

    /**
     * Get the thumbprint property: The certificate thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.innerProperties() == null ? null : this.innerProperties().thumbprint();
    }

    /**
     * Get the expiryUtc property: The certificate expiry date.
     *
     * @return the expiryUtc value.
     */
    public OffsetDateTime expiryUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().expiryUtc();
    }

    /**
     * Get the notBeforeUtc property: The certificate not before date.
     *
     * @return the notBeforeUtc value.
     */
    public OffsetDateTime notBeforeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().notBeforeUtc();
    }

    /**
     * Get the provisioningState property: The status of the last operation.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}