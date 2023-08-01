package xyz.summer.bikejourneytracker.presentation.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import xyz.summer.bikejourneytracker.domain.usecase.GetStations;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class StationListViewModel_Factory implements Factory<StationListViewModel> {
  private final Provider<GetStations> getJourneysProvider;

  public StationListViewModel_Factory(Provider<GetStations> getJourneysProvider) {
    this.getJourneysProvider = getJourneysProvider;
  }

  @Override
  public StationListViewModel get() {
    return newInstance(getJourneysProvider.get());
  }

  public static StationListViewModel_Factory create(Provider<GetStations> getJourneysProvider) {
    return new StationListViewModel_Factory(getJourneysProvider);
  }

  public static StationListViewModel newInstance(GetStations getJourneys) {
    return new StationListViewModel(getJourneys);
  }
}
