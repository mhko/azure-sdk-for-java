/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description of the App Service plan scale options.
 */
public class SkuCapacity {
    /**
     * Minimum number of workers for this App Service plan SKU.
     */
    @JsonProperty(value = "minimum")
    private Integer minimum;

    /**
     * Maximum number of workers for this App Service plan SKU.
     */
    @JsonProperty(value = "maximum")
    private Integer maximum;

    /**
     * Default number of workers for this App Service plan SKU.
     */
    @JsonProperty(value = "default")
    private Integer defaultProperty;

    /**
     * Available scale configurations for an App Service plan.
     */
    @JsonProperty(value = "scaleType")
    private String scaleType;

    /**
     * Get the minimum value.
     *
     * @return the minimum value
     */
    public Integer minimum() {
        return this.minimum;
    }

    /**
     * Set the minimum value.
     *
     * @param minimum the minimum value to set
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withMinimum(Integer minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the maximum value.
     *
     * @return the maximum value
     */
    public Integer maximum() {
        return this.maximum;
    }

    /**
     * Set the maximum value.
     *
     * @param maximum the maximum value to set
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withMaximum(Integer maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get the defaultProperty value.
     *
     * @return the defaultProperty value
     */
    public Integer defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty value.
     *
     * @param defaultProperty the defaultProperty value to set
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withDefaultProperty(Integer defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get the scaleType value.
     *
     * @return the scaleType value
     */
    public String scaleType() {
        return this.scaleType;
    }

    /**
     * Set the scaleType value.
     *
     * @param scaleType the scaleType value to set
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withScaleType(String scaleType) {
        this.scaleType = scaleType;
        return this;
    }

}