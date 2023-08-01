package xyz.summer.bikejourneytracker.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\nH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lxyz/summer/bikejourneytracker/data/repository/MainRepositoryImp;", "Lxyz/summer/bikejourneytracker/domain/repository/MainRepository;", "getBeersPager", "Landroidx/paging/Pager;", "", "Lxyz/summer/bikejourneytracker/data/local/journey/entitiy/JourneyEntity;", "getStationsPager", "Lxyz/summer/bikejourneytracker/data/local/journey/entitiy/StationEntity;", "(Landroidx/paging/Pager;Landroidx/paging/Pager;)V", "getBeers", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lxyz/summer/bikejourneytracker/domain/model/JourneyModel;", "getStations", "Lxyz/summer/bikejourneytracker/domain/model/StationModel;", "app_debug"})
public final class MainRepositoryImp implements xyz.summer.bikejourneytracker.domain.repository.MainRepository {
    private final androidx.paging.Pager<java.lang.Integer, xyz.summer.bikejourneytracker.data.local.journey.entitiy.JourneyEntity> getBeersPager = null;
    private final androidx.paging.Pager<java.lang.Integer, xyz.summer.bikejourneytracker.data.local.journey.entitiy.StationEntity> getStationsPager = null;
    
    public MainRepositoryImp(@org.jetbrains.annotations.NotNull
    androidx.paging.Pager<java.lang.Integer, xyz.summer.bikejourneytracker.data.local.journey.entitiy.JourneyEntity> getBeersPager, @org.jetbrains.annotations.NotNull
    androidx.paging.Pager<java.lang.Integer, xyz.summer.bikejourneytracker.data.local.journey.entitiy.StationEntity> getStationsPager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<xyz.summer.bikejourneytracker.domain.model.JourneyModel>> getBeers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<xyz.summer.bikejourneytracker.domain.model.StationModel>> getStations() {
        return null;
    }
}