package xyz.summer.bikejourneytracker.injection.provide;

import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class ApplicationModule_ProvideKotlinJsonAdapterFactoryFactory implements Factory<KotlinJsonAdapterFactory> {
  @Override
  public KotlinJsonAdapterFactory get() {
    return provideKotlinJsonAdapterFactory();
  }

  public static ApplicationModule_ProvideKotlinJsonAdapterFactoryFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static KotlinJsonAdapterFactory provideKotlinJsonAdapterFactory() {
    return Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideKotlinJsonAdapterFactory());
  }

  private static final class InstanceHolder {
    private static final ApplicationModule_ProvideKotlinJsonAdapterFactoryFactory INSTANCE = new ApplicationModule_ProvideKotlinJsonAdapterFactoryFactory();
  }
}
