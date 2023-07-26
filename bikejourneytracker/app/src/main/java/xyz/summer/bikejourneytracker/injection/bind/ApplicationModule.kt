package xyz.summer.bikejourneytracker.injection.bind

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Converter
import retrofit2.converter.moshi.MoshiConverterFactory
import xyz.summer.bikejourneytracker.data.repository.MainRepositoryImp
import xyz.summer.bikejourneytracker.domain.repository.MainRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ApplicationModule {

    @Binds
    @Singleton
    abstract fun bindJsonAdapterFactory(kotlinJsonAdapterFactory: KotlinJsonAdapterFactory): JsonAdapter.Factory

    @Binds
    @Singleton
    abstract fun bindConverterFactory(moshiConverterFactory: MoshiConverterFactory): Converter.Factory

    @Binds
    @Singleton
    abstract fun bindMainRepository(mainRepositoryImp: MainRepositoryImp): MainRepository
}