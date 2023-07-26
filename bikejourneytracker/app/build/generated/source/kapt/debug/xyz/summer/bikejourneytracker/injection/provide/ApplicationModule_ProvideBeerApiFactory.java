package xyz.summer.bikejourneytracker.injection.provide;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Converter;
import xyz.summer.bikejourneytracker.data.remote.journey.api.JourneyApi;

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
public final class ApplicationModule_ProvideBeerApiFactory implements Factory<JourneyApi> {
  private final Provider<Converter.Factory> converterFactoryProvider;

  public ApplicationModule_ProvideBeerApiFactory(
      Provider<Converter.Factory> converterFactoryProvider) {
    this.converterFactoryProvider = converterFactoryProvider;
  }

  @Override
  public JourneyApi get() {
    return provideBeerApi(converterFactoryProvider.get());
  }

  public static ApplicationModule_ProvideBeerApiFactory create(
      Provider<Converter.Factory> converterFactoryProvider) {
    return new ApplicationModule_ProvideBeerApiFactory(converterFactoryProvider);
  }

  public static JourneyApi provideBeerApi(Converter.Factory converterFactory) {
    return Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideBeerApi(converterFactory));
  }
}
