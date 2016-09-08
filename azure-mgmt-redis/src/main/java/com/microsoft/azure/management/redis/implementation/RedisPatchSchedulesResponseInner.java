/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Response to put/get patch schedules for redis cache.
 */
@JsonFlatten
public class RedisPatchSchedulesResponseInner {
    /**
     * Resource Id.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Resource name.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Resource type.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Resource location.
     */
    private String location;

    /**
     * List of patch schedules for redis cache.
     */
    @JsonProperty(value = "properties.scheduleEntries", required = true)
    private List<ScheduleEntryInner> scheduleEntries;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     * @return the RedisPatchSchedulesResponseInner object itself.
     */
    public RedisPatchSchedulesResponseInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the scheduleEntries value.
     *
     * @return the scheduleEntries value
     */
    public List<ScheduleEntryInner> scheduleEntries() {
        return this.scheduleEntries;
    }

    /**
     * Set the scheduleEntries value.
     *
     * @param scheduleEntries the scheduleEntries value to set
     * @return the RedisPatchSchedulesResponseInner object itself.
     */
    public RedisPatchSchedulesResponseInner withScheduleEntries(List<ScheduleEntryInner> scheduleEntries) {
        this.scheduleEntries = scheduleEntries;
        return this;
    }

}