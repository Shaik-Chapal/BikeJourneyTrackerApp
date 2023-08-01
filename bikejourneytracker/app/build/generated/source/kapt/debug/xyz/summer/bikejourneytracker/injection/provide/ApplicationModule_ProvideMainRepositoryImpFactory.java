package xyz.summer.bikejourneytracker.injection.provide;

import androidx.paging.Pager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.JourneyEntity;
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.StationEntity;
import xyz.summer.bikejourneytracker.data.repository.MainRepositoryImp;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({
    "xyz.summer.bikejourneytracker.injection.name.GetJourneyPager",
    "xyz.summer.bikejourneytracker.injection.name.station.GetStationsPager"
})
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
public final class ApplicationModule_ProvideMainRepositoryImpFactory implements Factory<MainRepositoryImp> {
  private final Provider<Pager<Integer, JourneyEntity>> getJourneyPagerProvider;

  private final Provider<Pager<Integer, StationEntity>> getStationsyPagerProvider;

  public ApplicationModule_ProvideMainRepositoryImpFactory(
      Provider<Pager<Integer, JourneyEntity>> getJourneyPagerProvider,
      Provider<Pager<Integer, StationEntity>> getStationsyPagerProvider) {
    this.getJourneyPagerProvider = getJourneyPagerProvider;
    this.getStationsyPagerProvider = getStationsyPagerProvider;
  }

  @Override
  public MainRepositoryImp get() {
    return provideMainRepositoryImp(getJourneyPagerProvider.get(), getStationsyPagerProvider.get());
  }

  public static ApplicationModule_ProvideMainRepositoryImpFactory create(
      Provider<Pager<Integer, JourneyEntity>> getJourneyPagerProvider,
      Provider<Pager<Integer, StationEntity>> getStationsyPagerProvider) {
    return new ApplicationModule_ProvideMainRepositoryImpFactory(getJourneyPagerProvider, getStationsyPagerProvider);
  }

  public static MainRepositoryImp provideMainRepositoryImp(
      Pager<Integer, JourneyEntity> getJourneyPager,
      Pager<Integer, StationEntity> getStationsyPager) {
    return Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideMainRepositoryImp(getJourneyPager, getStationsyPager));
  }
}
