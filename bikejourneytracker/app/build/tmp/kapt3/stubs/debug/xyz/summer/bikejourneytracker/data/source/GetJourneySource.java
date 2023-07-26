package xyz.summer.bikejourneytracker.data.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ-\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lxyz/summer/bikejourneytracker/data/source/GetJourneySource;", "Landroidx/paging/RemoteMediator;", "", "Lxyz/summer/bikejourneytracker/data/local/journey/entitiy/JourneyEntity;", "api", "Lxyz/summer/bikejourneytracker/data/remote/journey/api/JourneyApi;", "dao", "Lxyz/summer/bikejourneytracker/data/local/journey/dao/JourneyDao;", "(Lxyz/summer/bikejourneytracker/data/remote/journey/api/JourneyApi;Lxyz/summer/bikejourneytracker/data/local/journey/dao/JourneyDao;)V", "load", "Landroidx/paging/RemoteMediator$MediatorResult;", "loadType", "Landroidx/paging/LoadType;", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetJourneySource extends androidx.paging.RemoteMediator<java.lang.Integer, xyz.summer.bikejourneytracker.data.local.journey.entitiy.JourneyEntity> {
    private final xyz.summer.bikejourneytracker.data.remote.journey.api.JourneyApi api = null;
    private final xyz.summer.bikejourneytracker.data.local.journey.dao.JourneyDao dao = null;
    
    public GetJourneySource(@org.jetbrains.annotations.NotNull
    xyz.summer.bikejourneytracker.data.remote.journey.api.JourneyApi api, @org.jetbrains.annotations.NotNull
    xyz.summer.bikejourneytracker.data.local.journey.dao.JourneyDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object load(@org.jetbrains.annotations.NotNull
    androidx.paging.LoadType loadType, @org.jetbrains.annotations.NotNull
    androidx.paging.PagingState<java.lang.Integer, xyz.summer.bikejourneytracker.data.local.journey.entitiy.JourneyEntity> state, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.MediatorResult> continuation) {
        return null;
    }
}