/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import rx.Observable;
import com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10.implementation.ReplicationProtectableItemsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ReplicationProtectableItems.
 */
public interface ReplicationProtectableItems extends HasInner<ReplicationProtectableItemsInner> {
    /**
     * Gets the details of a protectable item.
     * The operation to get the details of a protectable item.
     *
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param protectableItemName Protectable item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProtectableItem> getAsync(String fabricName, String protectionContainerName, String protectableItemName);

    /**
     * Gets the list of protectable items.
     * Lists the protectable items in a protection container.
     *
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProtectableItem> listByReplicationProtectionContainersAsync(final String fabricName, final String protectionContainerName);

}
