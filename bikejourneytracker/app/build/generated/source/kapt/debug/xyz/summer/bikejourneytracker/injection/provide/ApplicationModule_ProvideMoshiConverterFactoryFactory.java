package xyz.summer.bikejourneytracker.injection.provide;

import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.converter.moshi.MoshiConverterFactory;

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
public final class ApplicationModule_ProvideMoshiConverterFactoryFactory implements Factory<MoshiConverterFactory> {
  private final Provider<Moshi> moshiProvider;

  public ApplicationModule_ProvideMoshiConverterFactoryFactory(Provider<Moshi> moshiProvider) {
    this.moshiProvider = moshiProvider;
  }

  @Override
  public MoshiConverterFactory get() {
    return provideMoshiConverterFactory(moshiProvider.get());
  }

  public static ApplicationModule_ProvideMoshiConverterFactoryFactory create(
      Provider<Moshi> moshiProvider) {
    return new ApplicationModule_ProvideMoshiConverterFactoryFactory(moshiProvider);
  }

  public static MoshiConverterFactory provideMoshiConverterFactory(Moshi moshi) {
    return Preconditions.checkNotNullFromProvides(ApplicationModule.INSTANCE.provideMoshiConverterFactory(moshi));
  }
}
