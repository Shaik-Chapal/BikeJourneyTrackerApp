package xyz.summer.bikejourneytracker.presentation.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lxyz/summer/bikejourneytracker/presentation/viewmodel/DepartureViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lxyz/summer/bikejourneytracker/data/repository/DepartureRepository;", "(Lxyz/summer/bikejourneytracker/data/repository/DepartureRepository;)V", "departureData", "Lkotlinx/coroutines/flow/Flow;", "", "Lxyz/summer/bikejourneytracker/data/top_departure/DepartureResponseItem;", "getDepartureData", "()Lkotlinx/coroutines/flow/Flow;", "app_debug"})
public final class DepartureViewModel extends androidx.lifecycle.ViewModel {
    private final xyz.summer.bikejourneytracker.data.repository.DepartureRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<xyz.summer.bikejourneytracker.data.top_departure.DepartureResponseItem>> departureData = null;
    
    @javax.inject.Inject
    public DepartureViewModel(@org.jetbrains.annotations.NotNull
    xyz.summer.bikejourneytracker.data.repository.DepartureRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<xyz.summer.bikejourneytracker.data.top_departure.DepartureResponseItem>> getDepartureData() {
        return null;
    }
}