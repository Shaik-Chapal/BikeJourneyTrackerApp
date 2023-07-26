package xyz.summer.bikejourneytracker.injection.provide;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J.\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0007J\b\u0010\u001b\u001a\u00020\u0017H\u0007J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\bH\u0007J\b\u0010\u001f\u001a\u00020 H\u0007J\u001e\u0010!\u001a\u00020\"2\u0014\b\u0001\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0007J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020%H\u0007\u00a8\u0006+"}, d2 = {"Lxyz/summer/bikejourneytracker/injection/provide/ApplicationModule;", "", "()V", "provideBeerApi", "Lxyz/summer/bikejourneytracker/data/remote/journey/api/JourneyApi;", "converterFactory", "Lretrofit2/Converter$Factory;", "provideBeerDao", "Lxyz/summer/bikejourneytracker/data/local/journey/dao/JourneyDao;", "journeyDatabase", "Lxyz/summer/bikejourneytracker/data/local/journey/database/JourneyDatabase;", "provideBeerDatabase", "application", "Landroid/app/Application;", "provideGetBeers", "Lxyz/summer/bikejourneytracker/domain/usecase/GetJourneys;", "mainRepository", "Lxyz/summer/bikejourneytracker/domain/repository/MainRepository;", "provideGetBeersPager", "Landroidx/paging/Pager;", "", "Lxyz/summer/bikejourneytracker/data/local/journey/entitiy/JourneyEntity;", "getJourneyPagingConfig", "Landroidx/paging/PagingConfig;", "getJourneySource", "Lxyz/summer/bikejourneytracker/data/source/GetJourneySource;", "beersDao", "provideGetBeersPagingConfig", "provideGetBeersSource", "journeyApi", "journeyDao", "provideKotlinJsonAdapterFactory", "Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapterFactory;", "provideMainRepositoryImp", "Lxyz/summer/bikejourneytracker/data/repository/MainRepositoryImp;", "getJourneyPager", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "jsonAdapterFactory", "Lcom/squareup/moshi/JsonAdapter$Factory;", "provideMoshiConverterFactory", "Lretrofit2/converter/moshi/MoshiConverterFactory;", "moshi", "app_debug"})
@dagger.Module
public final class ApplicationModule {
    @org.jetbrains.annotations.NotNull
    public static final xyz.summer.bikejourneytracker.injection.provide.ApplicationModule INSTANCE = null;
    
    private ApplicationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory provideKotlinJsonAdapterFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.squareup.moshi.Moshi provideMoshi(@org.jetbrains.annotations.NotNull
    com.squareup.moshi.JsonAdapter.Factory jsonAdapterFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.converter.moshi.MoshiConverterFactory provideMoshiConverterFactory(@org.jetbrains.annotations.NotNull
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final xyz.summer.bikejourneytracker.data.remote.journey.api.JourneyApi provideBeerApi(@org.jetbrains.annotations.NotNull
    retrofit2.Converter.Factory converterFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final xyz.summer.bikejourneytracker.data.local.journey.database.JourneyDatabase provideBeerDatabase(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final xyz.summer.bikejourneytracker.data.local.journey.dao.JourneyDao provideBeerDao(@org.jetbrains.annotations.NotNull
    xyz.summer.bikejourneytracker.data.local.journey.database.JourneyDatabase journeyDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final xyz.summer.bikejourneytracker.data.source.GetJourneySource provideGetBeersSource(@org.jetbrains.annotations.NotNull
    xyz.summer.bikejourneytracker.data.remote.journey.api.JourneyApi journeyApi, @org.jetbrains.annotations.NotNull
    xyz.summer.bikejourneytracker.data.local.journey.dao.JourneyDao journeyDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @xyz.summer.bikejourneytracker.injection.name.GetJourneyPagingConfig
    @javax.inject.Singleton
    @dagger.Provides
    public final androidx.paging.PagingConfig provideGetBeersPagingConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @xyz.summer.bikejourneytracker.injection.name.GetJourneyPager
    @javax.inject.Singleton
    @dagger.Provides
    public final androidx.paging.Pager<java.lang.Integer, xyz.summer.bikejourneytracker.data.local.journey.entitiy.JourneyEntity> provideGetBeersPager(@org.jetbrains.annotations.NotNull
    @xyz.summer.bikejourneytracker.injection.name.GetJourneyPagingConfig
    androidx.paging.PagingConfig getJourneyPagingConfig, @org.jetbrains.annotations.NotNull
    xyz.summer.bikejourneytracker.data.source.GetJourneySource getJourneySource, @org.jetbrains.annotations.NotNull
    xyz.summer.bikejourneytracker.data.local.journey.dao.JourneyDao beersDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final xyz.summer.bikejourneytracker.data.repository.MainRepositoryImp provideMainRepositoryImp(@org.jetbrains.annotations.NotNull
    @xyz.summer.bikejourneytracker.injection.name.GetJourneyPager
    androidx.paging.Pager<java.lang.Integer, xyz.summer.bikejourneytracker.data.local.journey.entitiy.JourneyEntity> getJourneyPager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final xyz.summer.bikejourneytracker.domain.usecase.GetJourneys provideGetBeers(@org.jetbrains.annotations.NotNull
    xyz.summer.bikejourneytracker.domain.repository.MainRepository mainRepository) {
        return null;
    }
}