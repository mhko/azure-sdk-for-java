/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The role based access control (RBAC) authorization type.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "authorizationType")
@JsonTypeName("RBAC")
public class LinkedIntegrationRuntimeRbac extends LinkedIntegrationRuntimeProperties {
    /**
     * The resource identifier of the integration runtime to be shared.
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /**
     * Get the resource identifier of the integration runtime to be shared.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resource identifier of the integration runtime to be shared.
     *
     * @param resourceId the resourceId value to set
     * @return the LinkedIntegrationRuntimeRbac object itself.
     */
    public LinkedIntegrationRuntimeRbac withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

}
