/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The content link.
 */
public class ContentLink {
    /**
     * The content link URI.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /**
     * The content version.
     */
    @JsonProperty(value = "contentVersion")
    private String contentVersion;

    /**
     * The content size.
     */
    @JsonProperty(value = "contentSize")
    private Long contentSize;

    /**
     * The content hash.
     */
    @JsonProperty(value = "contentHash")
    private ContentHash contentHash;

    /**
     * The metadata.
     */
    @JsonProperty(value = "metadata")
    private Object metadata;

    /**
     * Get the content link URI.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the content link URI.
     *
     * @param uri the uri value to set
     * @return the ContentLink object itself.
     */
    public ContentLink withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the content version.
     *
     * @return the contentVersion value
     */
    public String contentVersion() {
        return this.contentVersion;
    }

    /**
     * Set the content version.
     *
     * @param contentVersion the contentVersion value to set
     * @return the ContentLink object itself.
     */
    public ContentLink withContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
        return this;
    }

    /**
     * Get the content size.
     *
     * @return the contentSize value
     */
    public Long contentSize() {
        return this.contentSize;
    }

    /**
     * Set the content size.
     *
     * @param contentSize the contentSize value to set
     * @return the ContentLink object itself.
     */
    public ContentLink withContentSize(Long contentSize) {
        this.contentSize = contentSize;
        return this;
    }

    /**
     * Get the content hash.
     *
     * @return the contentHash value
     */
    public ContentHash contentHash() {
        return this.contentHash;
    }

    /**
     * Set the content hash.
     *
     * @param contentHash the contentHash value to set
     * @return the ContentLink object itself.
     */
    public ContentLink withContentHash(ContentHash contentHash) {
        this.contentHash = contentHash;
        return this;
    }

    /**
     * Get the metadata.
     *
     * @return the metadata value
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata.
     *
     * @param metadata the metadata value to set
     * @return the ContentLink object itself.
     */
    public ContentLink withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

}
