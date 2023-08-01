package xyz.summer.bikejourneytracker.injection.provide;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import xyz.summer.bikejourneytracker.domain.repository.MainRepository;
import xyz.summer.bikejourneytracker.domain.usecase.GetStations;

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
public final class ApplicationModule_ProvideGetStationsFactory implements Factory<GetStations> {
  private final Provider<MainRepository> mainRepositoryProvider;

  public ApplicationModule_ProvideGetStationsFactory(
      Provider<MainRepository> mainRepositoryProvider) {
    this.mainRepositoryProvider = mainRepositoryProvider;
  }

  @Override
  public GetStations get() {
    return provideGetStations(mainRepositoryProvider.get());
  }

  public static ApplicationModule_ProvideGetStationsFactory create(
      Provider<MainRepository> mainRepositoryProvider) {
    return new ApplicationModule_ProvideGetStationsFactory(mainRepositoryProvider);
  }

  public static GetStations provideGetStations(MainRepository mainRepository) {
    return Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideGetStations(mainRepository));
  }
}
