package xyz.summer.bikejourneytracker.data.remote.journey.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ%\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lxyz/summer/bikejourneytracker/data/remote/journey/api/JourneyApi;", "", "getBeers", "Lxyz/summer/bikejourneytracker/data/local/journey/entitiy/ApiResponse;", "page", "", "perPage", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDeparture", "", "Lxyz/summer/bikejourneytracker/data/top_departure/DepartureResponseItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReturn", "Lxyz/summer/bikejourneytracker/data/remote/journey/Return/ReturnResponseItem;", "getStations", "Lxyz/summer/bikejourneytracker/data/station/StationResponse;", "app_debug"})
public abstract interface JourneyApi {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "Journey/popular-departure-stations?topN=5")
    public abstract java.lang.Object getDeparture(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<xyz.summer.bikejourneytracker.data.top_departure.DepartureResponseItem>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "Journey/popular-return-stations?topN=5")
    public abstract java.lang.Object getReturn(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<xyz.summer.bikejourneytracker.data.remote.journey.Return.ReturnResponseItem>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "Journey")
    public abstract java.lang.Object getBeers(@retrofit2.http.Query(value = "pageNumber")
    int page, @retrofit2.http.Query(value = "pageSize")
    int perPage, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super xyz.summer.bikejourneytracker.data.local.journey.entitiy.ApiResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "Journey/stations")
    public abstract java.lang.Object getStations(@retrofit2.http.Query(value = "pageNumber")
    int page, @retrofit2.http.Query(value = "pageSize")
    int perPage, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super xyz.summer.bikejourneytracker.data.station.StationResponse> continuation);
}