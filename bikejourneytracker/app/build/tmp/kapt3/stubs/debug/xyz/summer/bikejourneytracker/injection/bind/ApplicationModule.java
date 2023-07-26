package xyz.summer.bikejourneytracker.injection.bind;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lxyz/summer/bikejourneytracker/injection/bind/ApplicationModule;", "", "()V", "bindConverterFactory", "Lretrofit2/Converter$Factory;", "moshiConverterFactory", "Lretrofit2/converter/moshi/MoshiConverterFactory;", "bindJsonAdapterFactory", "Lcom/squareup/moshi/JsonAdapter$Factory;", "kotlinJsonAdapterFactory", "Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapterFactory;", "bindMainRepository", "Lxyz/summer/bikejourneytracker/domain/repository/MainRepository;", "mainRepositoryImp", "Lxyz/summer/bikejourneytracker/data/repository/MainRepositoryImp;", "app_debug"})
@dagger.Module
public abstract class ApplicationModule {
    
    public ApplicationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract com.squareup.moshi.JsonAdapter.Factory bindJsonAdapterFactory(@org.jetbrains.annotations.NotNull
    com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory kotlinJsonAdapterFactory);
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract retrofit2.Converter.Factory bindConverterFactory(@org.jetbrains.annotations.NotNull
    retrofit2.converter.moshi.MoshiConverterFactory moshiConverterFactory);
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract xyz.summer.bikejourneytracker.domain.repository.MainRepository bindMainRepository(@org.jetbrains.annotations.NotNull
    xyz.summer.bikejourneytracker.data.repository.MainRepositoryImp mainRepositoryImp);
}