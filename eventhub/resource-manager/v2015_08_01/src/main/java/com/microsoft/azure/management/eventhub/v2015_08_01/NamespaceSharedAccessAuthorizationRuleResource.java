/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2015_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.eventhub.v2015_08_01.implementation.SharedAccessAuthorizationRuleResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventhub.v2015_08_01.implementation.EventHubManager;
import java.util.List;

/**
 * Type representing NamespaceSharedAccessAuthorizationRuleResource.
 */
public interface NamespaceSharedAccessAuthorizationRuleResource extends HasInner<SharedAccessAuthorizationRuleResourceInner>, Indexable, Refreshable<NamespaceSharedAccessAuthorizationRuleResource>, Updatable<NamespaceSharedAccessAuthorizationRuleResource.Update>, HasManager<EventHubManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the rights value.
     */
    List<AccessRights> rights();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the NamespaceSharedAccessAuthorizationRuleResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNamespace, DefinitionStages.WithRights, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of NamespaceSharedAccessAuthorizationRuleResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a NamespaceSharedAccessAuthorizationRuleResource definition.
         */
        interface Blank extends WithNamespace {
        }

        /**
         * The stage of the namespacesharedaccessauthorizationruleresource definition allowing to specify Namespace.
         */
        interface WithNamespace {
           /**
            * Specifies resourceGroupName, namespaceName.
            */
            WithRights withExistingNamespace(String resourceGroupName, String namespaceName);
        }

        /**
         * The stage of the namespacesharedaccessauthorizationruleresource definition allowing to specify Rights.
         */
        interface WithRights {
           /**
            * Specifies rights.
            */
            WithCreate withRights(List<AccessRights> rights);
        }

        /**
         * The stage of the namespacesharedaccessauthorizationruleresource definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the namespacesharedaccessauthorizationruleresource definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<NamespaceSharedAccessAuthorizationRuleResource>, DefinitionStages.WithLocation, DefinitionStages.WithName {
        }
    }
    /**
     * The template for a NamespaceSharedAccessAuthorizationRuleResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<NamespaceSharedAccessAuthorizationRuleResource>, UpdateStages.WithLocation, UpdateStages.WithName {
    }

    /**
     * Grouping of NamespaceSharedAccessAuthorizationRuleResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the namespacesharedaccessauthorizationruleresource update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the namespacesharedaccessauthorizationruleresource update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            Update withName(String name);
        }

    }
}
