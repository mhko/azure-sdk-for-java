/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for Update operation.
 */
public class TransformationsUpdateHeaders {
    /**
     * The current entity tag for the transformation. This is an opaque string.
     * You can use it to detect whether the resource has changed between
     * requests. You can also use it in the If-Match or If-None-Match headers
     * for write operations for optimistic concurrency.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /**
     * Get the current entity tag for the transformation. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the current entity tag for the transformation. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     *
     * @param eTag the eTag value to set
     * @return the TransformationsUpdateHeaders object itself.
     */
    public TransformationsUpdateHeaders withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

}
