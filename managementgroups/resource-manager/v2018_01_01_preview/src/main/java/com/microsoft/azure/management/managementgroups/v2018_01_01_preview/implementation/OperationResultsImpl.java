/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2018_01_01_preview.implementation;

import com.microsoft.azure.management.managementgroups.v2018_01_01_preview.OperationResults;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class OperationResultsImpl extends WrapperImpl<OperationResultsInner> implements OperationResults {
    private final ManagementManager manager;
    OperationResultsImpl(OperationResultsInner inner, ManagementManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ManagementManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
