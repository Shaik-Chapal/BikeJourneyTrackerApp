package xyz.summer.bikejourneytracker.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import xyz.summer.bikejourneytracker.data.remote.journey.api.JourneyApi;

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
public final class DepartureRepository_Factory implements Factory<DepartureRepository> {
  private final Provider<JourneyApi> apiServiceProvider;

  public DepartureRepository_Factory(Provider<JourneyApi> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public DepartureRepository get() {
    return newInstance(apiServiceProvider.get());
  }

  public static DepartureRepository_Factory create(Provider<JourneyApi> apiServiceProvider) {
    return new DepartureRepository_Factory(apiServiceProvider);
  }

  public static DepartureRepository newInstance(JourneyApi apiService) {
    return new DepartureRepository(apiService);
  }
}
