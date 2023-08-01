package xyz.summer.bikejourneytracker.injection.provide;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import xyz.summer.bikejourneytracker.data.local.journey.dao.StationDao;
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.StationEntity;
import xyz.summer.bikejourneytracker.data.source.GetStationSource;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({
    "xyz.summer.bikejourneytracker.injection.name.station.GetStationsPager",
    "xyz.summer.bikejourneytracker.injection.name.station.GetStationsPagingConfig"
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
public final class ApplicationModule_ProvideGetStationsPagerFactory implements Factory<Pager<Integer, StationEntity>> {
  private final Provider<PagingConfig> getStationsPagingConfigProvider;

  private final Provider<GetStationSource> getJourneySourceProvider;

  private final Provider<StationDao> beersDaoProvider;

  public ApplicationModule_ProvideGetStationsPagerFactory(
      Provider<PagingConfig> getStationsPagingConfigProvider,
      Provider<GetStationSource> getJourneySourceProvider, Provider<StationDao> beersDaoProvider) {
    this.getStationsPagingConfigProvider = getStationsPagingConfigProvider;
    this.getJourneySourceProvider = getJourneySourceProvider;
    this.beersDaoProvider = beersDaoProvider;
  }

  @Override
  public Pager<Integer, StationEntity> get() {
    return provideGetStationsPager(getStationsPagingConfigProvider.get(), getJourneySourceProvider.get(), beersDaoProvider.get());
  }

  public static ApplicationModule_ProvideGetStationsPagerFactory create(
      Provider<PagingConfig> getStationsPagingConfigProvider,
      Provider<GetStationSource> getJourneySourceProvider, Provider<StationDao> beersDaoProvider) {
    return new ApplicationModule_ProvideGetStationsPagerFactory(getStationsPagingConfigProvider, getJourneySourceProvider, beersDaoProvider);
  }

  public static Pager<Integer, StationEntity> provideGetStationsPager(
      PagingConfig getStationsPagingConfig, GetStationSource getJourneySource,
      StationDao beersDao) {
    return Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideGetStationsPager(getStationsPagingConfig, getJourneySource, beersDao));
  }
}
