package xyz.summer.bikejourneytracker.injection.provide;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import xyz.summer.bikejourneytracker.data.local.journey.database.StationDatabase;

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
public final class ApplicationModule_ProvideStationDatabaseFactory implements Factory<StationDatabase> {
  private final Provider<Application> applicationProvider;

  public ApplicationModule_ProvideStationDatabaseFactory(
      Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public StationDatabase get() {
    return provideStationDatabase(applicationProvider.get());
  }

  public static ApplicationModule_ProvideStationDatabaseFactory create(
      Provider<Application> applicationProvider) {
    return new ApplicationModule_ProvideStationDatabaseFactory(applicationProvider);
  }

  public static StationDatabase provideStationDatabase(Application application) {
    return Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideStationDatabase(application));
  }
}
