package xyz.summer.bikejourneytracker.injection.provide;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import xyz.summer.bikejourneytracker.domain.repository.MainRepository;
import xyz.summer.bikejourneytracker.domain.usecase.GetJourneys;

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
public final class ApplicationModule_ProvideGetBeersFactory implements Factory<GetJourneys> {
  private final Provider<MainRepository> mainRepositoryProvider;

  public ApplicationModule_ProvideGetBeersFactory(Provider<MainRepository> mainRepositoryProvider) {
    this.mainRepositoryProvider = mainRepositoryProvider;
  }

  @Override
  public GetJourneys get() {
    return provideGetBeers(mainRepositoryProvider.get());
  }

  public static ApplicationModule_ProvideGetBeersFactory create(
      Provider<MainRepository> mainRepositoryProvider) {
    return new ApplicationModule_ProvideGetBeersFactory(mainRepositoryProvider);
  }

  public static GetJourneys provideGetBeers(MainRepository mainRepository) {
    return Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideGetBeers(mainRepository));
  }
}
