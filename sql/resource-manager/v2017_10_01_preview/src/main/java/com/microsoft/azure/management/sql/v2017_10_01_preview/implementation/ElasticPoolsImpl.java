/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2017_10_01_preview.ElasticPools;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.sql.v2017_10_01_preview.ElasticPool;

class ElasticPoolsImpl extends WrapperImpl<ElasticPoolsInner> implements ElasticPools {
    private final SqlManager manager;

    ElasticPoolsImpl(SqlManager manager) {
        super(manager.inner().elasticPools());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public ElasticPoolImpl define(String name) {
        return wrapModel(name);
    }

    private ElasticPoolImpl wrapModel(ElasticPoolInner inner) {
        return  new ElasticPoolImpl(inner, manager());
    }

    private ElasticPoolImpl wrapModel(String name) {
        return new ElasticPoolImpl(name, this.manager());
    }

    @Override
    public Observable<ElasticPool> listByServerAsync(final String resourceGroupName, final String serverName) {
        ElasticPoolsInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName)
        .flatMapIterable(new Func1<Page<ElasticPoolInner>, Iterable<ElasticPoolInner>>() {
            @Override
            public Iterable<ElasticPoolInner> call(Page<ElasticPoolInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ElasticPoolInner, ElasticPool>() {
            @Override
            public ElasticPool call(ElasticPoolInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ElasticPool> getAsync(String resourceGroupName, String serverName, String elasticPoolName) {
        ElasticPoolsInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, elasticPoolName)
        .map(new Func1<ElasticPoolInner, ElasticPool>() {
            @Override
            public ElasticPool call(ElasticPoolInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serverName, String elasticPoolName) {
        ElasticPoolsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serverName, elasticPoolName).toCompletable();
    }

}
