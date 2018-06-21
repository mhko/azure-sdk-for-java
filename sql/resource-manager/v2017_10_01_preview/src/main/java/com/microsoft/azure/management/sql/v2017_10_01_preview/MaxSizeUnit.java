/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MaxSizeUnit.
 */
public final class MaxSizeUnit extends ExpandableStringEnum<MaxSizeUnit> {
    /** Static value Megabytes for MaxSizeUnit. */
    public static final MaxSizeUnit MEGABYTES = fromString("Megabytes");

    /** Static value Gigabytes for MaxSizeUnit. */
    public static final MaxSizeUnit GIGABYTES = fromString("Gigabytes");

    /** Static value Terabytes for MaxSizeUnit. */
    public static final MaxSizeUnit TERABYTES = fromString("Terabytes");

    /** Static value Petabytes for MaxSizeUnit. */
    public static final MaxSizeUnit PETABYTES = fromString("Petabytes");

    /**
     * Creates or finds a MaxSizeUnit from its string representation.
     * @param name a name to look for
     * @return the corresponding MaxSizeUnit
     */
    @JsonCreator
    public static MaxSizeUnit fromString(String name) {
        return fromString(name, MaxSizeUnit.class);
    }

    /**
     * @return known MaxSizeUnit values
     */
    public static Collection<MaxSizeUnit> values() {
        return values(MaxSizeUnit.class);
    }
}
