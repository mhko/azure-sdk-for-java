/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2018_04_01.AzureFirewall;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2018_04_01.AzureFirewallApplicationRuleCollection;
import com.microsoft.azure.management.network.v2018_04_01.AzureFirewallNetworkRuleCollection;
import com.microsoft.azure.management.network.v2018_04_01.AzureFirewallIPConfiguration;
import com.microsoft.azure.management.network.v2018_04_01.ProvisioningState;

class AzureFirewallImpl extends GroupableResourceCoreImpl<AzureFirewall, AzureFirewallInner, AzureFirewallImpl, NetworkManager> implements AzureFirewall, AzureFirewall.Definition, AzureFirewall.Update {
    AzureFirewallImpl(String name, AzureFirewallInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<AzureFirewall> createResourceAsync() {
        AzureFirewallsInner client = this.manager().inner().azureFirewalls();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<AzureFirewall> updateResourceAsync() {
        AzureFirewallsInner client = this.manager().inner().azureFirewalls();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AzureFirewallInner> getInnerAsync() {
        AzureFirewallsInner client = this.manager().inner().azureFirewalls();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<AzureFirewallApplicationRuleCollection> applicationRuleCollections() {
        return this.inner().applicationRuleCollections();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<AzureFirewallIPConfiguration> ipConfigurations() {
        return this.inner().ipConfigurations();
    }

    @Override
    public List<AzureFirewallNetworkRuleCollection> networkRuleCollections() {
        return this.inner().networkRuleCollections();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public AzureFirewallImpl withApplicationRuleCollections(List<AzureFirewallApplicationRuleCollection> applicationRuleCollections) {
        this.inner().withApplicationRuleCollections(applicationRuleCollections);
        return this;
    }

    @Override
    public AzureFirewallImpl withIpConfigurations(List<AzureFirewallIPConfiguration> ipConfigurations) {
        this.inner().withIpConfigurations(ipConfigurations);
        return this;
    }

    @Override
    public AzureFirewallImpl withNetworkRuleCollections(List<AzureFirewallNetworkRuleCollection> networkRuleCollections) {
        this.inner().withNetworkRuleCollections(networkRuleCollections);
        return this;
    }

    @Override
    public AzureFirewallImpl withProvisioningState(ProvisioningState provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

}
