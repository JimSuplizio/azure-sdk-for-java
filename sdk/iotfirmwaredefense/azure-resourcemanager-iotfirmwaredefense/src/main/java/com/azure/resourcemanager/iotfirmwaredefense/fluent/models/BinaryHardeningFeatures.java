// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.iotfirmwaredefense.models.CanaryFlag;
import com.azure.resourcemanager.iotfirmwaredefense.models.NxFlag;
import com.azure.resourcemanager.iotfirmwaredefense.models.PieFlag;
import com.azure.resourcemanager.iotfirmwaredefense.models.RelroFlag;
import com.azure.resourcemanager.iotfirmwaredefense.models.StrippedFlag;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Binary hardening features. */
@Fluent
public final class BinaryHardeningFeatures {
    /*
     * NX flag.
     */
    @JsonProperty(value = "nx")
    private NxFlag nx;

    /*
     * PIE flag.
     */
    @JsonProperty(value = "pie")
    private PieFlag pie;

    /*
     * RELRO flag.
     */
    @JsonProperty(value = "relro")
    private RelroFlag relro;

    /*
     * Canary flag.
     */
    @JsonProperty(value = "canary")
    private CanaryFlag canary;

    /*
     * Stripped flag.
     */
    @JsonProperty(value = "stripped")
    private StrippedFlag stripped;

    /** Creates an instance of BinaryHardeningFeatures class. */
    public BinaryHardeningFeatures() {
    }

    /**
     * Get the nx property: NX flag.
     *
     * @return the nx value.
     */
    public NxFlag nx() {
        return this.nx;
    }

    /**
     * Set the nx property: NX flag.
     *
     * @param nx the nx value to set.
     * @return the BinaryHardeningFeatures object itself.
     */
    public BinaryHardeningFeatures withNx(NxFlag nx) {
        this.nx = nx;
        return this;
    }

    /**
     * Get the pie property: PIE flag.
     *
     * @return the pie value.
     */
    public PieFlag pie() {
        return this.pie;
    }

    /**
     * Set the pie property: PIE flag.
     *
     * @param pie the pie value to set.
     * @return the BinaryHardeningFeatures object itself.
     */
    public BinaryHardeningFeatures withPie(PieFlag pie) {
        this.pie = pie;
        return this;
    }

    /**
     * Get the relro property: RELRO flag.
     *
     * @return the relro value.
     */
    public RelroFlag relro() {
        return this.relro;
    }

    /**
     * Set the relro property: RELRO flag.
     *
     * @param relro the relro value to set.
     * @return the BinaryHardeningFeatures object itself.
     */
    public BinaryHardeningFeatures withRelro(RelroFlag relro) {
        this.relro = relro;
        return this;
    }

    /**
     * Get the canary property: Canary flag.
     *
     * @return the canary value.
     */
    public CanaryFlag canary() {
        return this.canary;
    }

    /**
     * Set the canary property: Canary flag.
     *
     * @param canary the canary value to set.
     * @return the BinaryHardeningFeatures object itself.
     */
    public BinaryHardeningFeatures withCanary(CanaryFlag canary) {
        this.canary = canary;
        return this;
    }

    /**
     * Get the stripped property: Stripped flag.
     *
     * @return the stripped value.
     */
    public StrippedFlag stripped() {
        return this.stripped;
    }

    /**
     * Set the stripped property: Stripped flag.
     *
     * @param stripped the stripped value to set.
     * @return the BinaryHardeningFeatures object itself.
     */
    public BinaryHardeningFeatures withStripped(StrippedFlag stripped) {
        this.stripped = stripped;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}