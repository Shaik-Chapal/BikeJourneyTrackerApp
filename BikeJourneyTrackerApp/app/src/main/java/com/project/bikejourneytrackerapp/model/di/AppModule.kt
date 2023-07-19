package com.project.bikejourneytrackerapp.model.di

import android.content.Context
import com.project.bikejourneytrackerapp.model.repository.RideRepository
import com.project.bikejourneytrackerapp.model.repository.RideRepositoryImpl
import com.project.bikejourneytrackerapp.model.service.RideService
import com.project.bikejourneytrackerapp.util.Constants.Companion.BASE_URL
import com.project.bikejourneytrackerapp.util.PostMapper
import com.project.bikejourneytrackerapp.util.TinyDB
import com.project.bikejourneytrackerapp.viewmodel.RedditViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun provideRedditService(): RideService {
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        val client = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
            .create(RideService::class.java)
    }

    @Provides
    fun provideRedditRepository(
        rideService: RideService,
        postMapper: PostMapper
    ): RideRepository {
        return RideRepositoryImpl(rideService, postMapper)
    }

    @Provides
    fun providePostMapper(): PostMapper {
        return PostMapper()
    }

    @Provides
    fun provideViewModel(rideRepository: RideRepository, tinyDB: TinyDB): RedditViewModel {
        return RedditViewModel(rideRepository = rideRepository, tinyDB = tinyDB)
    }

    @Provides
    fun provideDB(@ApplicationContext appContext: Context) : TinyDB {
        return TinyDB(appContext)
    }

}