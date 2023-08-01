package xyz.summer.bikejourneytracker.injection.provide;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import xyz.summer.bikejourneytracker.data.local.journey.dao.StationDao;
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
public final class ApplicationModule_ProvideStationDaoFactory implements Factory<StationDao> {
  private final Provider<StationDatabase> journeyDatabaseProvider;

  public ApplicationModule_ProvideStationDaoFactory(
      Provider<StationDatabase> journeyDatabaseProvider) {
    this.journeyDatabaseProvider = journeyDatabaseProvider;
  }

  @Override
  public StationDao get() {
    return provideStationDao(journeyDatabaseProvider.get());
  }

  public static ApplicationModule_ProvideStationDaoFactory create(
      Provider<StationDatabase> journeyDatabaseProvider) {
    return new ApplicationModule_ProvideStationDaoFactory(journeyDatabaseProvider);
  }

  public static StationDao provideStationDao(StationDatabase journeyDatabase) {
    return Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideStationDao(journeyDatabase));
  }
}
