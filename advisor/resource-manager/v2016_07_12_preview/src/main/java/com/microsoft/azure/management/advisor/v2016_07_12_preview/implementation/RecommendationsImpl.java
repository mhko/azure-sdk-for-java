/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.advisor.v2016_07_12_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.advisor.v2016_07_12_preview.Recommendations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.advisor.v2016_07_12_preview.ResourceRecommendationBase;
import com.microsoft.azure.arm.utils.PagedListConverter;
import rx.Completable;
import java.util.UUID;

class RecommendationsImpl extends WrapperImpl<RecommendationsInner> implements Recommendations {
    private PagedListConverter<ResourceRecommendationBaseInner, ResourceRecommendationBase> converter;
    private final AdvisorManager manager;

    RecommendationsImpl(AdvisorManager manager) {
        super(manager.inner().recommendations());
        this.manager = manager;
        this.converter = new PagedListConverter<ResourceRecommendationBaseInner, ResourceRecommendationBase>() {
            @Override
            public Observable<ResourceRecommendationBase> typeConvertAsync(ResourceRecommendationBaseInner inner) {
                return Observable.just((ResourceRecommendationBase) wrapModel(inner));
            }
        };
    }

    public AdvisorManager manager() {
        return this.manager;
    }

    private ResourceRecommendationBaseImpl wrapModel(ResourceRecommendationBaseInner inner) {
        return  new ResourceRecommendationBaseImpl(inner, manager());
    }

    @Override
    public Observable<ResourceRecommendationBase> getAsync(String resourceUri, String recommendationId) {
        RecommendationsInner client = this.inner();
        return client.getAsync(resourceUri, recommendationId)
        .map(new Func1<ResourceRecommendationBaseInner, ResourceRecommendationBase>() {
            @Override
            public ResourceRecommendationBase call(ResourceRecommendationBaseInner inner) {
                return new ResourceRecommendationBaseImpl(inner, manager());
            }
        });
    }

    @Override
    public PagedList<ResourceRecommendationBase> list() {
        RecommendationsInner client = this.inner();
        return converter.convert(client.list());
    }

    @Override
    public Observable<ResourceRecommendationBase> listAsync() {
        RecommendationsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ResourceRecommendationBaseInner>, Iterable<ResourceRecommendationBaseInner>>() {
            @Override
            public Iterable<ResourceRecommendationBaseInner> call(Page<ResourceRecommendationBaseInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceRecommendationBaseInner, ResourceRecommendationBase>() {
            @Override
            public ResourceRecommendationBase call(ResourceRecommendationBaseInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Completable getGenerateRecommendationsStatusAsync(UUID operationId) {
        RecommendationsInner client = this.inner();
        return client.getGenerateRecommendationsStatusAsync(operationId).toCompletable();
    }

    @Override
    public Completable generateAsync() {
        RecommendationsInner client = this.inner();
        return client.generateAsync().toCompletable();
    }

}