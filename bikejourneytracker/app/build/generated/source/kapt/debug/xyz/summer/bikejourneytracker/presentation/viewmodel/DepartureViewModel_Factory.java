package xyz.summer.bikejourneytracker.presentation.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import xyz.summer.bikejourneytracker.data.repository.DepartureRepository;

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
public final class DepartureViewModel_Factory implements Factory<DepartureViewModel> {
  private final Provider<DepartureRepository> repositoryProvider;

  public DepartureViewModel_Factory(Provider<DepartureRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public DepartureViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static DepartureViewModel_Factory create(
      Provider<DepartureRepository> repositoryProvider) {
    return new DepartureViewModel_Factory(repositoryProvider);
  }

  public static DepartureViewModel newInstance(DepartureRepository repository) {
    return new DepartureViewModel(repository);
  }
}
