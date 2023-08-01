package xyz.summer.bikejourneytracker.data.local.journey.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\'J\'\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\f\u001a\u00020\rH\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lxyz/summer/bikejourneytracker/data/local/journey/dao/StationDao;", "", "deleteAllStation", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStation", "Landroidx/paging/PagingSource;", "", "Lxyz/summer/bikejourneytracker/data/local/journey/entitiy/StationEntity;", "insertStations", "beers", "", "clearCache", "", "(Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsertStations", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface StationDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Transaction
    public abstract java.lang.Object insertStations(@org.jetbrains.annotations.NotNull
    java.util.List<xyz.summer.bikejourneytracker.data.local.journey.entitiy.StationEntity> beers, boolean clearCache, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Upsert
    public abstract java.lang.Object upsertStations(@org.jetbrains.annotations.NotNull
    java.util.List<xyz.summer.bikejourneytracker.data.local.journey.entitiy.StationEntity> beers, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM station_beer")
    public abstract java.lang.Object deleteAllStation(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM station_beer")
    public abstract androidx.paging.PagingSource<java.lang.Integer, xyz.summer.bikejourneytracker.data.local.journey.entitiy.StationEntity> getStation();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable
        @androidx.room.Transaction
        public static java.lang.Object insertStations(@org.jetbrains.annotations.NotNull
        xyz.summer.bikejourneytracker.data.local.journey.dao.StationDao $this, @org.jetbrains.annotations.NotNull
        java.util.List<xyz.summer.bikejourneytracker.data.local.journey.entitiy.StationEntity> beers, boolean clearCache, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> p3) {
            return null;
        }
    }
}