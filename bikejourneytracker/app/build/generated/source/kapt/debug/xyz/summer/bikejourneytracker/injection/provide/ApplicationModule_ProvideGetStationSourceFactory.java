package xyz.summer.bikejourneytracker.injection.provide;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import xyz.summer.bikejourneytracker.data.local.journey.dao.StationDao;
import xyz.summer.bikejourneytracker.data.remote.journey.api.JourneyApi;
import xyz.summer.bikejourneytracker.data.source.GetStationSource;

@ScopeMetadata("javax.inject.Singleton")
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
public final class ApplicationModule_ProvideGetStationSourceFactory implements Factory<GetStationSource> {
  private final Provider<JourneyApi> journeyApiProvider;

  private final Provider<StationDao> journeyDaoProvider;

  public ApplicationModule_ProvideGetStationSourceFactory(Provider<JourneyApi> journeyApiProvider,
      Provider<StationDao> journeyDaoProvider) {
    this.journeyApiProvider = journeyApiProvider;
    this.journeyDaoProvider = journeyDaoProvider;
  }

  @Override
  public GetStationSource get() {
    return provideGetStationSource(journeyApiProvider.get(), journeyDaoProvider.get());
  }

  public static ApplicationModule_ProvideGetStationSourceFactory create(
      Provider<JourneyApi> journeyApiProvider, Provider<StationDao> journeyDaoProvider) {
    return new ApplicationModule_ProvideGetStationSourceFactory(journeyApiProvider, journeyDaoProvider);
  }

  public static GetStationSource provideGetStationSource(JourneyApi journeyApi,
      StationDao journeyDao) {
    return Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideGetStationSource(journeyApi, journeyDao));
  }
}
