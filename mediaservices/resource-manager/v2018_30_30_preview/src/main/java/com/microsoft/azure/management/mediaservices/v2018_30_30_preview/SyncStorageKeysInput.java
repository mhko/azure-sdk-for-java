/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The input to the sync storage keys request.
 */
public class SyncStorageKeysInput {
    /**
     * The ID of the storage account resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the ID of the storage account resource.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID of the storage account resource.
     *
     * @param id the id value to set
     * @return the SyncStorageKeysInput object itself.
     */
    public SyncStorageKeysInput withId(String id) {
        this.id = id;
        return this;
    }

}
