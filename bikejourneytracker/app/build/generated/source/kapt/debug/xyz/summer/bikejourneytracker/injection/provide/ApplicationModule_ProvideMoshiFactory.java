package xyz.summer.bikejourneytracker.injection.provide;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class ApplicationModule_ProvideMoshiFactory implements Factory<Moshi> {
  private final Provider<JsonAdapter.Factory> jsonAdapterFactoryProvider;

  public ApplicationModule_ProvideMoshiFactory(
      Provider<JsonAdapter.Factory> jsonAdapterFactoryProvider) {
    this.jsonAdapterFactoryProvider = jsonAdapterFactoryProvider;
  }

  @Override
  public Moshi get() {
    return provideMoshi(jsonAdapterFactoryProvider.get());
  }

  public static ApplicationModule_ProvideMoshiFactory create(
      Provider<JsonAdapter.Factory> jsonAdapterFactoryProvider) {
    return new ApplicationModule_ProvideMoshiFactory(jsonAdapterFactoryProvider);
  }

  public static Moshi provideMoshi(JsonAdapter.Factory jsonAdapterFactory) {
    return Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideMoshi(jsonAdapterFactory));
  }
}
