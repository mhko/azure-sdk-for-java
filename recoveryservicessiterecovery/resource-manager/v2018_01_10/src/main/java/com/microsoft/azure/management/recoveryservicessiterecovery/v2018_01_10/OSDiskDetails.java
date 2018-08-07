/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the OS Disk.
 */
public class OSDiskDetails {
    /**
     * The id of the disk containing the OS.
     */
    @JsonProperty(value = "osVhdId")
    private String osVhdId;

    /**
     * The type of the OS on the VM.
     */
    @JsonProperty(value = "osType")
    private String osType;

    /**
     * The OS disk VHD name.
     */
    @JsonProperty(value = "vhdName")
    private String vhdName;

    /**
     * Get the id of the disk containing the OS.
     *
     * @return the osVhdId value
     */
    public String osVhdId() {
        return this.osVhdId;
    }

    /**
     * Set the id of the disk containing the OS.
     *
     * @param osVhdId the osVhdId value to set
     * @return the OSDiskDetails object itself.
     */
    public OSDiskDetails withOsVhdId(String osVhdId) {
        this.osVhdId = osVhdId;
        return this;
    }

    /**
     * Get the type of the OS on the VM.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the type of the OS on the VM.
     *
     * @param osType the osType value to set
     * @return the OSDiskDetails object itself.
     */
    public OSDiskDetails withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the OS disk VHD name.
     *
     * @return the vhdName value
     */
    public String vhdName() {
        return this.vhdName;
    }

    /**
     * Set the OS disk VHD name.
     *
     * @param vhdName the vhdName value to set
     * @return the OSDiskDetails object itself.
     */
    public OSDiskDetails withVhdName(String vhdName) {
        this.vhdName = vhdName;
        return this;
    }

}
