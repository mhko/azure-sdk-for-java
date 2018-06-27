/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2017_04_01.implementation;

import com.microsoft.azure.management.eventhub.v2017_04_01.ProvisioningStateDR;
import com.microsoft.azure.management.eventhub.v2017_04_01.RoleDisasterRecovery;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Single item in List or Get Alias(Disaster Recovery configuration) operation.
 */
@JsonFlatten
public class ArmDisasterRecoveryInner extends ProxyResource {
    /**
     * Provisioning state of the Alias(Disaster Recovery configuration) -
     * possible values 'Accepted' or 'Succeeded' or 'Failed'. Possible values
     * include: 'Accepted', 'Succeeded', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningStateDR provisioningState;

    /**
     * ARM Id of the Primary/Secondary eventhub namespace name, which is part
     * of GEO DR pairning.
     */
    @JsonProperty(value = "properties.partnerNamespace")
    private String partnerNamespace;

    /**
     * Alternate name specified when alias and namespace names are same.
     */
    @JsonProperty(value = "properties.alternateName")
    private String alternateName;

    /**
     * role of namespace in GEO DR - possible values 'Primary' or
     * 'PrimaryNotReplicating' or 'Secondary'. Possible values include:
     * 'Primary', 'PrimaryNotReplicating', 'Secondary'.
     */
    @JsonProperty(value = "properties.role", access = JsonProperty.Access.WRITE_ONLY)
    private RoleDisasterRecovery role;

    /**
     * Number of entities pending to be replicated.
     */
    @JsonProperty(value = "properties.pendingReplicationOperationsCount ", access = JsonProperty.Access.WRITE_ONLY)
    private Long pendingReplicationOperationsCount;

    /**
     * Get provisioning state of the Alias(Disaster Recovery configuration) - possible values 'Accepted' or 'Succeeded' or 'Failed'. Possible values include: 'Accepted', 'Succeeded', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningStateDR provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get aRM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR pairning.
     *
     * @return the partnerNamespace value
     */
    public String partnerNamespace() {
        return this.partnerNamespace;
    }

    /**
     * Set aRM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR pairning.
     *
     * @param partnerNamespace the partnerNamespace value to set
     * @return the ArmDisasterRecoveryInner object itself.
     */
    public ArmDisasterRecoveryInner withPartnerNamespace(String partnerNamespace) {
        this.partnerNamespace = partnerNamespace;
        return this;
    }

    /**
     * Get alternate name specified when alias and namespace names are same.
     *
     * @return the alternateName value
     */
    public String alternateName() {
        return this.alternateName;
    }

    /**
     * Set alternate name specified when alias and namespace names are same.
     *
     * @param alternateName the alternateName value to set
     * @return the ArmDisasterRecoveryInner object itself.
     */
    public ArmDisasterRecoveryInner withAlternateName(String alternateName) {
        this.alternateName = alternateName;
        return this;
    }

    /**
     * Get role of namespace in GEO DR - possible values 'Primary' or 'PrimaryNotReplicating' or 'Secondary'. Possible values include: 'Primary', 'PrimaryNotReplicating', 'Secondary'.
     *
     * @return the role value
     */
    public RoleDisasterRecovery role() {
        return this.role;
    }

    /**
     * Get number of entities pending to be replicated.
     *
     * @return the pendingReplicationOperationsCount value
     */
    public Long pendingReplicationOperationsCount() {
        return this.pendingReplicationOperationsCount;
    }

}
