/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Create network mappings input properties/behaviour specific to Azure to
 * Azure Network mapping.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("AzureToAzure")
public class AzureToAzureCreateNetworkMappingInput extends FabricSpecificCreateNetworkMappingInput {
    /**
     * The primary azure vnet Id.
     */
    @JsonProperty(value = "primaryNetworkId")
    private String primaryNetworkId;

    /**
     * Get the primary azure vnet Id.
     *
     * @return the primaryNetworkId value
     */
    public String primaryNetworkId() {
        return this.primaryNetworkId;
    }

    /**
     * Set the primary azure vnet Id.
     *
     * @param primaryNetworkId the primaryNetworkId value to set
     * @return the AzureToAzureCreateNetworkMappingInput object itself.
     */
    public AzureToAzureCreateNetworkMappingInput withPrimaryNetworkId(String primaryNetworkId) {
        this.primaryNetworkId = primaryNetworkId;
        return this;
    }

}
