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
 * Describes the properties of a rectangular window applied to the input media
 * before processing it.
 */
public class Rectangle {
    /**
     * The number of pixels from the left-margin. This can be absolute pixel
     * value (e.g 100), or relative to the size of the video (For example,
     * 50%).
     */
    @JsonProperty(value = "left")
    private String left;

    /**
     * The number of pixels from the top-margin. This can be absolute pixel
     * value (e.g 100), or relative to the size of the video (For example,
     * 50%).
     */
    @JsonProperty(value = "top")
    private String top;

    /**
     * The width of the rectangular region in pixels. This can be absolute
     * pixel value (e.g 100), or relative to the size of the video (For
     * example, 50%).
     */
    @JsonProperty(value = "width")
    private String width;

    /**
     * The height of the rectangular region in pixels. This can be absolute
     * pixel value (e.g 100), or relative to the size of the video (For
     * example, 50%).
     */
    @JsonProperty(value = "height")
    private String height;

    /**
     * Get the number of pixels from the left-margin. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     *
     * @return the left value
     */
    public String left() {
        return this.left;
    }

    /**
     * Set the number of pixels from the left-margin. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     *
     * @param left the left value to set
     * @return the Rectangle object itself.
     */
    public Rectangle withLeft(String left) {
        this.left = left;
        return this;
    }

    /**
     * Get the number of pixels from the top-margin. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     *
     * @return the top value
     */
    public String top() {
        return this.top;
    }

    /**
     * Set the number of pixels from the top-margin. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     *
     * @param top the top value to set
     * @return the Rectangle object itself.
     */
    public Rectangle withTop(String top) {
        this.top = top;
        return this;
    }

    /**
     * Get the width of the rectangular region in pixels. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     *
     * @return the width value
     */
    public String width() {
        return this.width;
    }

    /**
     * Set the width of the rectangular region in pixels. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     *
     * @param width the width value to set
     * @return the Rectangle object itself.
     */
    public Rectangle withWidth(String width) {
        this.width = width;
        return this;
    }

    /**
     * Get the height of the rectangular region in pixels. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     *
     * @return the height value
     */
    public String height() {
        return this.height;
    }

    /**
     * Set the height of the rectangular region in pixels. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     *
     * @param height the height value to set
     * @return the Rectangle object itself.
     */
    public Rectangle withHeight(String height) {
        this.height = height;
        return this;
    }

}
