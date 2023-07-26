package xyz.summer.bikejourneytracker.injection.provide;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import xyz.summer.bikejourneytracker.data.local.journey.database.JourneyDatabase;

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
public final class ApplicationModule_ProvideBeerDatabaseFactory implements Factory<JourneyDatabase> {
  private final Provider<Application> applicationProvider;

  public ApplicationModule_ProvideBeerDatabaseFactory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public JourneyDatabase get() {
    return provideBeerDatabase(applicationProvider.get());
  }

  public static ApplicationModule_ProvideBeerDatabaseFactory create(
      Provider<Application> applicationProvider) {
    return new ApplicationModule_ProvideBeerDatabaseFactory(applicationProvider);
  }

  public static JourneyDatabase provideBeerDatabase(Application application) {
    return Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideBeerDatabase(application));
  }
}
