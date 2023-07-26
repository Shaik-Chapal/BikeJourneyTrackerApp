package xyz.summer.bikejourneytracker.injection.provide;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import xyz.summer.bikejourneytracker.data.local.journey.dao.JourneyDao;
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
public final class ApplicationModule_ProvideBeerDaoFactory implements Factory<JourneyDao> {
  private final Provider<JourneyDatabase> journeyDatabaseProvider;

  public ApplicationModule_ProvideBeerDaoFactory(
      Provider<JourneyDatabase> journeyDatabaseProvider) {
    this.journeyDatabaseProvider = journeyDatabaseProvider;
  }

  @Override
  public JourneyDao get() {
    return provideBeerDao(journeyDatabaseProvider.get());
  }

  public static ApplicationModule_ProvideBeerDaoFactory create(
      Provider<JourneyDatabase> journeyDatabaseProvider) {
    return new ApplicationModule_ProvideBeerDaoFactory(journeyDatabaseProvider);
  }

  public static JourneyDao provideBeerDao(JourneyDatabase journeyDatabase) {
    return Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideBeerDao(journeyDatabase));
  }
}
