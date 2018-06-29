/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2018_04_01.implementation.RouteInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_04_01.implementation.NetworkManager;

/**
 * Type representing Route.
 */
public interface Route extends HasInner<RouteInner>, Indexable, Refreshable<Route>, Updatable<Route.Update>, HasManager<NetworkManager> {
    /**
     * @return the addressPrefix value.
     */
    String addressPrefix();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nextHopIpAddress value.
     */
    String nextHopIpAddress();

    /**
     * @return the nextHopType value.
     */
    RouteNextHopType nextHopType();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * The entirety of the Route definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithRouteTable, DefinitionStages.WithNextHopType, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Route definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Route definition.
         */
        interface Blank extends WithRouteTable {
        }

        /**
         * The stage of the route definition allowing to specify RouteTable.
         */
        interface WithRouteTable {
           /**
            * Specifies resourceGroupName, routeTableName.
            */
            WithNextHopType withExistingRouteTable(String resourceGroupName, String routeTableName);
        }

        /**
         * The stage of the route definition allowing to specify NextHopType.
         */
        interface WithNextHopType {
           /**
            * Specifies nextHopType.
            */
            WithCreate withNextHopType(RouteNextHopType nextHopType);
        }

        /**
         * The stage of the route definition allowing to specify AddressPrefix.
         */
        interface WithAddressPrefix {
            /**
             * Specifies addressPrefix.
             */
            WithCreate withAddressPrefix(String addressPrefix);
        }

        /**
         * The stage of the route definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the route definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the route definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the route definition allowing to specify NextHopIpAddress.
         */
        interface WithNextHopIpAddress {
            /**
             * Specifies nextHopIpAddress.
             */
            WithCreate withNextHopIpAddress(String nextHopIpAddress);
        }

        /**
         * The stage of the route definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Route>, DefinitionStages.WithAddressPrefix, DefinitionStages.WithEtag, DefinitionStages.WithId, DefinitionStages.WithName, DefinitionStages.WithNextHopIpAddress, DefinitionStages.WithProvisioningState {
        }
    }
    /**
     * The template for a Route update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Route>, UpdateStages.WithAddressPrefix, UpdateStages.WithEtag, UpdateStages.WithId, UpdateStages.WithName, UpdateStages.WithNextHopIpAddress, UpdateStages.WithProvisioningState {
    }

    /**
     * Grouping of Route update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the route update allowing to specify AddressPrefix.
         */
        interface WithAddressPrefix {
            /**
             * Specifies addressPrefix.
             */
            Update withAddressPrefix(String addressPrefix);
        }

        /**
         * The stage of the route update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the route update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             */
            Update withId(String id);
        }

        /**
         * The stage of the route update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            Update withName(String name);
        }

        /**
         * The stage of the route update allowing to specify NextHopIpAddress.
         */
        interface WithNextHopIpAddress {
            /**
             * Specifies nextHopIpAddress.
             */
            Update withNextHopIpAddress(String nextHopIpAddress);
        }

        /**
         * The stage of the route update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            Update withProvisioningState(String provisioningState);
        }

    }
}
