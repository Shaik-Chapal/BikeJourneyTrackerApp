package xyz.summer.bikejourneytracker.presentation.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import xyz.summer.bikejourneytracker.domain.usecase.GetJourneys;

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
public final class BeerListViewModel_Factory implements Factory<BeerListViewModel> {
  private final Provider<GetJourneys> getJourneysProvider;

  public BeerListViewModel_Factory(Provider<GetJourneys> getJourneysProvider) {
    this.getJourneysProvider = getJourneysProvider;
  }

  @Override
  public BeerListViewModel get() {
    return newInstance(getJourneysProvider.get());
  }

  public static BeerListViewModel_Factory create(Provider<GetJourneys> getJourneysProvider) {
    return new BeerListViewModel_Factory(getJourneysProvider);
  }

  public static BeerListViewModel newInstance(GetJourneys getJourneys) {
    return new BeerListViewModel(getJourneys);
  }
}
