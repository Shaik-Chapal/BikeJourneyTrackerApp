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
import xyz.summer.bikejourneytracker.data.repository.MainRepositoryImp;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("xyz.summer.bikejourneytracker.injection.name.GetJourneyPager")
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

  public ApplicationModule_ProvideMainRepositoryImpFactory(
      Provider<Pager<Integer, JourneyEntity>> getJourneyPagerProvider) {
    this.getJourneyPagerProvider = getJourneyPagerProvider;
  }

  @Override
  public MainRepositoryImp get() {
    return provideMainRepositoryImp(getJourneyPagerProvider.get());
  }

  public static ApplicationModule_ProvideMainRepositoryImpFactory create(
      Provider<Pager<Integer, JourneyEntity>> getJourneyPagerProvider) {
    return new ApplicationModule_ProvideMainRepositoryImpFactory(getJourneyPagerProvider);
  }

  public static MainRepositoryImp provideMainRepositoryImp(
      Pager<Integer, JourneyEntity> getJourneyPager) {
    return Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideMainRepositoryImp(getJourneyPager));
  }
}
