/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.AppServiceManager;
import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.SiteInner;

/**
 * Type representing Sites.
 */
public interface Sites extends HasInner<SiteInner>, Resource, GroupableResourceCore<AppServiceManager, SiteInner>, HasResourceGroup, Refreshable<Sites>, Updatable<Sites.Update>, HasManager<AppServiceManager> {
    /**
     * @return the availabilityState value.
     */
    SiteAvailabilityState availabilityState();

    /**
     * @return the clientAffinityEnabled value.
     */
    Boolean clientAffinityEnabled();

    /**
     * @return the clientCertEnabled value.
     */
    Boolean clientCertEnabled();

    /**
     * @return the cloningInfo value.
     */
    CloningInfo cloningInfo();

    /**
     * @return the containerSize value.
     */
    Integer containerSize();

    /**
     * @return the dailyMemoryTimeQuota value.
     */
    Integer dailyMemoryTimeQuota();

    /**
     * @return the defaultHostName value.
     */
    String defaultHostName();

    /**
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * @return the enabledHostNames value.
     */
    List<String> enabledHostNames();

    /**
     * @return the hostingEnvironmentProfile value.
     */
    HostingEnvironmentProfile hostingEnvironmentProfile();

    /**
     * @return the hostNames value.
     */
    List<String> hostNames();

    /**
     * @return the hostNamesDisabled value.
     */
    Boolean hostNamesDisabled();

    /**
     * @return the hostNameSslStates value.
     */
    List<HostNameSslState> hostNameSslStates();

    /**
     * @return the httpsOnly value.
     */
    Boolean httpsOnly();

    /**
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * @return the isDefaultContainer value.
     */
    Boolean isDefaultContainer();

    /**
     * @return the isXenon value.
     */
    Boolean isXenon();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the lastModifiedTimeUtc value.
     */
    DateTime lastModifiedTimeUtc();

    /**
     * @return the maxNumberOfWorkers value.
     */
    Integer maxNumberOfWorkers();

    /**
     * @return the outboundIpAddresses value.
     */
    String outboundIpAddresses();

    /**
     * @return the possibleOutboundIpAddresses value.
     */
    String possibleOutboundIpAddresses();

    /**
     * @return the repositorySiteName value.
     */
    String repositorySiteName();

    /**
     * @return the reserved value.
     */
    Boolean reserved();

    /**
     * @return the resourceGroup value.
     */
    String resourceGroup();

    /**
     * @return the scmSiteAlsoStopped value.
     */
    Boolean scmSiteAlsoStopped();

    /**
     * @return the serverFarmId value.
     */
    String serverFarmId();

    /**
     * @return the siteConfig value.
     */
    SiteConfig siteConfig();

    /**
     * @return the slotSwapStatus value.
     */
    SlotSwapStatus slotSwapStatus();

    /**
     * @return the snapshotInfo value.
     */
    SnapshotRecoveryRequest snapshotInfo();

    /**
     * @return the state value.
     */
    String state();

    /**
     * @return the suspendedTill value.
     */
    DateTime suspendedTill();

    /**
     * @return the targetSwapSlot value.
     */
    String targetSwapSlot();

    /**
     * @return the trafficManagerHostNames value.
     */
    List<String> trafficManagerHostNames();

    /**
     * @return the usageState value.
     */
    UsageState usageState();

    /**
     * The entirety of the Sites definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Sites definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Sites definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Sites definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the sites update allowing to specify ClientAffinityEnabled.
         */
        interface WithClientAffinityEnabled {
            /**
             * Specifies clientAffinityEnabled.
             */
            WithCreate withClientAffinityEnabled(Boolean clientAffinityEnabled);
        }

        /**
         * The stage of the sites update allowing to specify ClientCertEnabled.
         */
        interface WithClientCertEnabled {
            /**
             * Specifies clientCertEnabled.
             */
            WithCreate withClientCertEnabled(Boolean clientCertEnabled);
        }

        /**
         * The stage of the sites update allowing to specify CloningInfo.
         */
        interface WithCloningInfo {
            /**
             * Specifies cloningInfo.
             */
            WithCreate withCloningInfo(CloningInfo cloningInfo);
        }

        /**
         * The stage of the sites update allowing to specify ContainerSize.
         */
        interface WithContainerSize {
            /**
             * Specifies containerSize.
             */
            WithCreate withContainerSize(Integer containerSize);
        }

        /**
         * The stage of the sites update allowing to specify DailyMemoryTimeQuota.
         */
        interface WithDailyMemoryTimeQuota {
            /**
             * Specifies dailyMemoryTimeQuota.
             */
            WithCreate withDailyMemoryTimeQuota(Integer dailyMemoryTimeQuota);
        }

        /**
         * The stage of the sites update allowing to specify Enabled.
         */
        interface WithEnabled {
            /**
             * Specifies enabled.
             */
            WithCreate withEnabled(Boolean enabled);
        }

        /**
         * The stage of the sites update allowing to specify HostingEnvironmentProfile.
         */
        interface WithHostingEnvironmentProfile {
            /**
             * Specifies hostingEnvironmentProfile.
             */
            WithCreate withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile);
        }

        /**
         * The stage of the sites update allowing to specify HostNamesDisabled.
         */
        interface WithHostNamesDisabled {
            /**
             * Specifies hostNamesDisabled.
             */
            WithCreate withHostNamesDisabled(Boolean hostNamesDisabled);
        }

        /**
         * The stage of the sites update allowing to specify HostNameSslStates.
         */
        interface WithHostNameSslStates {
            /**
             * Specifies hostNameSslStates.
             */
            WithCreate withHostNameSslStates(List<HostNameSslState> hostNameSslStates);
        }

        /**
         * The stage of the sites update allowing to specify HttpsOnly.
         */
        interface WithHttpsOnly {
            /**
             * Specifies httpsOnly.
             */
            WithCreate withHttpsOnly(Boolean httpsOnly);
        }

        /**
         * The stage of the sites update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }

        /**
         * The stage of the sites update allowing to specify IsXenon.
         */
        interface WithIsXenon {
            /**
             * Specifies isXenon.
             */
            WithCreate withIsXenon(Boolean isXenon);
        }

        /**
         * The stage of the sites update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the sites update allowing to specify Reserved.
         */
        interface WithReserved {
            /**
             * Specifies reserved.
             */
            WithCreate withReserved(Boolean reserved);
        }

        /**
         * The stage of the sites update allowing to specify ScmSiteAlsoStopped.
         */
        interface WithScmSiteAlsoStopped {
            /**
             * Specifies scmSiteAlsoStopped.
             */
            WithCreate withScmSiteAlsoStopped(Boolean scmSiteAlsoStopped);
        }

        /**
         * The stage of the sites update allowing to specify ServerFarmId.
         */
        interface WithServerFarmId {
            /**
             * Specifies serverFarmId.
             */
            WithCreate withServerFarmId(String serverFarmId);
        }

        /**
         * The stage of the sites update allowing to specify SiteConfig.
         */
        interface WithSiteConfig {
            /**
             * Specifies siteConfig.
             */
            WithCreate withSiteConfig(SiteConfig siteConfig);
        }

        /**
         * The stage of the sites update allowing to specify SnapshotInfo.
         */
        interface WithSnapshotInfo {
            /**
             * Specifies snapshotInfo.
             */
            WithCreate withSnapshotInfo(SnapshotRecoveryRequest snapshotInfo);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Sites>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithClientAffinityEnabled, DefinitionStages.WithClientCertEnabled, DefinitionStages.WithCloningInfo, DefinitionStages.WithContainerSize, DefinitionStages.WithDailyMemoryTimeQuota, DefinitionStages.WithEnabled, DefinitionStages.WithHostingEnvironmentProfile, DefinitionStages.WithHostNamesDisabled, DefinitionStages.WithHostNameSslStates, DefinitionStages.WithHttpsOnly, DefinitionStages.WithIdentity, DefinitionStages.WithIsXenon, DefinitionStages.WithKind, DefinitionStages.WithReserved, DefinitionStages.WithScmSiteAlsoStopped, DefinitionStages.WithServerFarmId, DefinitionStages.WithSiteConfig, DefinitionStages.WithSnapshotInfo {
        }
    }
    /**
     * The template for a Sites update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Sites>, Resource.UpdateWithTags<Update>, UpdateStages.WithClientAffinityEnabled, UpdateStages.WithClientCertEnabled, UpdateStages.WithCloningInfo, UpdateStages.WithContainerSize, UpdateStages.WithDailyMemoryTimeQuota, UpdateStages.WithEnabled, UpdateStages.WithHostingEnvironmentProfile, UpdateStages.WithHostNamesDisabled, UpdateStages.WithHostNameSslStates, UpdateStages.WithHttpsOnly, UpdateStages.WithIsXenon, UpdateStages.WithKind, UpdateStages.WithReserved, UpdateStages.WithScmSiteAlsoStopped, UpdateStages.WithServerFarmId, UpdateStages.WithSiteConfig, UpdateStages.WithSnapshotInfo {
    }

    /**
     * Grouping of Sites update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the sites {0} allowing to specify ClientAffinityEnabled.
         */
        interface WithClientAffinityEnabled {
            /**
             * Specifies clientAffinityEnabled.
             */
            Update withClientAffinityEnabled(Boolean clientAffinityEnabled);
        }

        /**
         * The stage of the sites {0} allowing to specify ClientCertEnabled.
         */
        interface WithClientCertEnabled {
            /**
             * Specifies clientCertEnabled.
             */
            Update withClientCertEnabled(Boolean clientCertEnabled);
        }

        /**
         * The stage of the sites {0} allowing to specify CloningInfo.
         */
        interface WithCloningInfo {
            /**
             * Specifies cloningInfo.
             */
            Update withCloningInfo(CloningInfo cloningInfo);
        }

        /**
         * The stage of the sites {0} allowing to specify ContainerSize.
         */
        interface WithContainerSize {
            /**
             * Specifies containerSize.
             */
            Update withContainerSize(Integer containerSize);
        }

        /**
         * The stage of the sites {0} allowing to specify DailyMemoryTimeQuota.
         */
        interface WithDailyMemoryTimeQuota {
            /**
             * Specifies dailyMemoryTimeQuota.
             */
            Update withDailyMemoryTimeQuota(Integer dailyMemoryTimeQuota);
        }

        /**
         * The stage of the sites {0} allowing to specify Enabled.
         */
        interface WithEnabled {
            /**
             * Specifies enabled.
             */
            Update withEnabled(Boolean enabled);
        }

        /**
         * The stage of the sites {0} allowing to specify HostingEnvironmentProfile.
         */
        interface WithHostingEnvironmentProfile {
            /**
             * Specifies hostingEnvironmentProfile.
             */
            Update withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile);
        }

        /**
         * The stage of the sites {0} allowing to specify HostNamesDisabled.
         */
        interface WithHostNamesDisabled {
            /**
             * Specifies hostNamesDisabled.
             */
            Update withHostNamesDisabled(Boolean hostNamesDisabled);
        }

        /**
         * The stage of the sites {0} allowing to specify HostNameSslStates.
         */
        interface WithHostNameSslStates {
            /**
             * Specifies hostNameSslStates.
             */
            Update withHostNameSslStates(List<HostNameSslState> hostNameSslStates);
        }

        /**
         * The stage of the sites {0} allowing to specify HttpsOnly.
         */
        interface WithHttpsOnly {
            /**
             * Specifies httpsOnly.
             */
            Update withHttpsOnly(Boolean httpsOnly);
        }

        /**
         * The stage of the sites {0} allowing to specify IsXenon.
         */
        interface WithIsXenon {
            /**
             * Specifies isXenon.
             */
            Update withIsXenon(Boolean isXenon);
        }

        /**
         * The stage of the sites {0} allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the sites {0} allowing to specify Reserved.
         */
        interface WithReserved {
            /**
             * Specifies reserved.
             */
            Update withReserved(Boolean reserved);
        }

        /**
         * The stage of the sites {0} allowing to specify ScmSiteAlsoStopped.
         */
        interface WithScmSiteAlsoStopped {
            /**
             * Specifies scmSiteAlsoStopped.
             */
            Update withScmSiteAlsoStopped(Boolean scmSiteAlsoStopped);
        }

        /**
         * The stage of the sites {0} allowing to specify ServerFarmId.
         */
        interface WithServerFarmId {
            /**
             * Specifies serverFarmId.
             */
            Update withServerFarmId(String serverFarmId);
        }

        /**
         * The stage of the sites {0} allowing to specify SiteConfig.
         */
        interface WithSiteConfig {
            /**
             * Specifies siteConfig.
             */
            Update withSiteConfig(SiteConfig siteConfig);
        }

        /**
         * The stage of the sites {0} allowing to specify SnapshotInfo.
         */
        interface WithSnapshotInfo {
            /**
             * Specifies snapshotInfo.
             */
            Update withSnapshotInfo(SnapshotRecoveryRequest snapshotInfo);
        }

    }
}
