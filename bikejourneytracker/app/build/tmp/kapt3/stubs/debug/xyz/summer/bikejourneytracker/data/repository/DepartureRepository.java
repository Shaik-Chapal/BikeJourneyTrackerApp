package xyz.summer.bikejourneytracker.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lxyz/summer/bikejourneytracker/data/repository/DepartureRepository;", "", "apiService", "Lxyz/summer/bikejourneytracker/data/remote/journey/api/JourneyApi;", "(Lxyz/summer/bikejourneytracker/data/remote/journey/api/JourneyApi;)V", "getDeparture", "", "Lxyz/summer/bikejourneytracker/data/top_departure/DepartureResponseItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReturn", "Lxyz/summer/bikejourneytracker/data/remote/journey/Return/ReturnResponseItem;", "app_debug"})
public final class DepartureRepository {
    private final xyz.summer.bikejourneytracker.data.remote.journey.api.JourneyApi apiService = null;
    
    @javax.inject.Inject
    public DepartureRepository(@org.jetbrains.annotations.NotNull
    xyz.summer.bikejourneytracker.data.remote.journey.api.JourneyApi apiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getDeparture(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<xyz.summer.bikejourneytracker.data.top_departure.DepartureResponseItem>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getReturn(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<xyz.summer.bikejourneytracker.data.remote.journey.Return.ReturnResponseItem>> continuation) {
        return null;
    }
}