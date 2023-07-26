package xyz.summer.bikejourneytracker.injection.provide;

import androidx.paging.PagingConfig;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("xyz.summer.bikejourneytracker.injection.name.GetJourneyPagingConfig")
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
public final class ApplicationModule_ProvideGetBeersPagingConfigFactory implements Factory<PagingConfig> {
  @Override
  public PagingConfig get() {
    return provideGetBeersPagingConfig();
  }

  public static ApplicationModule_ProvideGetBeersPagingConfigFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PagingConfig provideGetBeersPagingConfig() {
    return Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideGetBeersPagingConfig());
  }

  private static final class InstanceHolder {
    private static final ApplicationModule_ProvideGetBeersPagingConfigFactory INSTANCE = new ApplicationModule_ProvideGetBeersPagingConfigFactory();
  }
}
