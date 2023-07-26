package xyz.summer.bikejourneytracker.injection.provide;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import xyz.summer.bikejourneytracker.data.local.journey.dao.JourneyDao;
import xyz.summer.bikejourneytracker.data.remote.journey.api.JourneyApi;
import xyz.summer.bikejourneytracker.data.source.GetJourneySource;

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
public final class ApplicationModule_ProvideGetBeersSourceFactory implements Factory<GetJourneySource> {
  private final Provider<JourneyApi> journeyApiProvider;

  private final Provider<JourneyDao> journeyDaoProvider;

  public ApplicationModule_ProvideGetBeersSourceFactory(Provider<JourneyApi> journeyApiProvider,
      Provider<JourneyDao> journeyDaoProvider) {
    this.journeyApiProvider = journeyApiProvider;
    this.journeyDaoProvider = journeyDaoProvider;
  }

  @Override
  public GetJourneySource get() {
    return provideGetBeersSource(journeyApiProvider.get(), journeyDaoProvider.get());
  }

  public static ApplicationModule_ProvideGetBeersSourceFactory create(
      Provider<JourneyApi> journeyApiProvider, Provider<JourneyDao> journeyDaoProvider) {
    return new ApplicationModule_ProvideGetBeersSourceFactory(journeyApiProvider, journeyDaoProvider);
  }

  public static GetJourneySource provideGetBeersSource(JourneyApi journeyApi,
      JourneyDao journeyDao) {
    return Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideGetBeersSource(journeyApi, journeyDao));
  }
}
