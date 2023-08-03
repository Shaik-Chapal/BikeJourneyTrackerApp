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
public final class ReturnViewModel_Factory implements Factory<ReturnViewModel> {
  private final Provider<DepartureRepository> repositoryProvider;

  public ReturnViewModel_Factory(Provider<DepartureRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ReturnViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static ReturnViewModel_Factory create(Provider<DepartureRepository> repositoryProvider) {
    return new ReturnViewModel_Factory(repositoryProvider);
  }

  public static ReturnViewModel newInstance(DepartureRepository repository) {
    return new ReturnViewModel(repository);
  }
}
