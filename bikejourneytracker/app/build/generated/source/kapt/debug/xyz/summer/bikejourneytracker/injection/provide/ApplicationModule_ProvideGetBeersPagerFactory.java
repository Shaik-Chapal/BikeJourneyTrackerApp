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
import xyz.summer.bikejourneytracker.data.local.journey.dao.JourneyDao;
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.JourneyEntity;
import xyz.summer.bikejourneytracker.data.source.GetJourneySource;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({
    "xyz.summer.bikejourneytracker.injection.name.GetJourneyPager",
    "xyz.summer.bikejourneytracker.injection.name.GetJourneyPagingConfig"
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
public final class ApplicationModule_ProvideGetBeersPagerFactory implements Factory<Pager<Integer, JourneyEntity>> {
  private final Provider<PagingConfig> getJourneyPagingConfigProvider;

  private final Provider<GetJourneySource> getJourneySourceProvider;

  private final Provider<JourneyDao> beersDaoProvider;

  public ApplicationModule_ProvideGetBeersPagerFactory(
      Provider<PagingConfig> getJourneyPagingConfigProvider,
      Provider<GetJourneySource> getJourneySourceProvider, Provider<JourneyDao> beersDaoProvider) {
    this.getJourneyPagingConfigProvider = getJourneyPagingConfigProvider;
    this.getJourneySourceProvider = getJourneySourceProvider;
    this.beersDaoProvider = beersDaoProvider;
  }

  @Override
  public Pager<Integer, JourneyEntity> get() {
    return provideGetBeersPager(getJourneyPagingConfigProvider.get(), getJourneySourceProvider.get(), beersDaoProvider.get());
  }

  public static ApplicationModule_ProvideGetBeersPagerFactory create(
      Provider<PagingConfig> getJourneyPagingConfigProvider,
      Provider<GetJourneySource> getJourneySourceProvider, Provider<JourneyDao> beersDaoProvider) {
    return new ApplicationModule_ProvideGetBeersPagerFactory(getJourneyPagingConfigProvider, getJourneySourceProvider, beersDaoProvider);
  }

  public static Pager<Integer, JourneyEntity> provideGetBeersPager(
      PagingConfig getJourneyPagingConfig, GetJourneySource getJourneySource, JourneyDao beersDao) {
    return Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideGetBeersPager(getJourneyPagingConfig, getJourneySource, beersDao));
  }
}
