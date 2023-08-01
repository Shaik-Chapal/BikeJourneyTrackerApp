package xyz.summer.bikejourneytracker.injection.provide;

import androidx.paging.PagingConfig;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("xyz.summer.bikejourneytracker.injection.name.station.GetStationsPagingConfig")
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
public final class ApplicationModule_ProvideGetStationsPagingConfigFactory implements Factory<PagingConfig> {
  @Override
  public PagingConfig get() {
    return provideGetStationsPagingConfig();
  }

  public static ApplicationModule_ProvideGetStationsPagingConfigFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PagingConfig provideGetStationsPagingConfig() {
    return Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideGetStationsPagingConfig());
  }

  private static final class InstanceHolder {
    private static final ApplicationModule_ProvideGetStationsPagingConfigFactory INSTANCE = new ApplicationModule_ProvideGetStationsPagingConfigFactory();
  }
}
