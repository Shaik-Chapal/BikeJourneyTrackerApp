package xyz.summer.bikejourneytracker.injection.provide

import android.app.Application
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.room.Room
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import xyz.summer.bikejourneytracker.data.local.journey.constant.JourneyDatabaseConst
import xyz.summer.bikejourneytracker.data.local.journey.dao.JourneyDao
import xyz.summer.bikejourneytracker.data.local.journey.dao.StationDao
import xyz.summer.bikejourneytracker.data.local.journey.database.JourneyDatabase
import xyz.summer.bikejourneytracker.data.local.journey.database.StationDatabase
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.JourneyEntity
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.StationEntity
import xyz.summer.bikejourneytracker.data.remote.journey.api.JourneyApi
import xyz.summer.bikejourneytracker.data.remote.journey.constant.JourneyApiConst
import xyz.summer.bikejourneytracker.data.repository.MainRepositoryImp
import xyz.summer.bikejourneytracker.data.source.GetJourneySource
import xyz.summer.bikejourneytracker.data.source.GetStationSource
import xyz.summer.bikejourneytracker.domain.repository.MainRepository
import xyz.summer.bikejourneytracker.domain.usecase.GetJourneys
import xyz.summer.bikejourneytracker.domain.usecase.GetStations
import xyz.summer.bikejourneytracker.injection.name.GetJourneyPager
import xyz.summer.bikejourneytracker.injection.name.GetJourneyPagingConfig
import xyz.summer.bikejourneytracker.injection.name.station.GetStationsPager
import xyz.summer.bikejourneytracker.injection.name.station.GetStationsPagingConfig
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @Provides
    @Singleton
    fun provideKotlinJsonAdapterFactory(): KotlinJsonAdapterFactory = KotlinJsonAdapterFactory()

    @Provides
    @Singleton
    fun provideMoshi(jsonAdapterFactory: JsonAdapter.Factory): Moshi = Moshi.Builder()
        .addLast(jsonAdapterFactory)
        .build()

    @Provides
    @Singleton
    fun provideMoshiConverterFactory(moshi: Moshi): MoshiConverterFactory = MoshiConverterFactory.create(moshi)

    @Provides
    @Singleton
    fun provideBeerApi(converterFactory: Converter.Factory): JourneyApi = Retrofit.Builder()
        .baseUrl(JourneyApiConst.BASE_URL)
        .addConverterFactory(converterFactory)
        .build()
        .create()

    @Provides
    @Singleton
    fun provideBeerDatabase(application: Application): JourneyDatabase = Room.databaseBuilder(
        context = application,
        klass = JourneyDatabase::class.java,
        name = JourneyDatabaseConst.NAME
    )
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    @Singleton
    fun provideStationDatabase(application: Application): StationDatabase = Room.databaseBuilder(
        context = application,
        klass = StationDatabase::class.java,
        name = JourneyDatabaseConst.NAME_STATION
    )
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    @Singleton
    fun provideStationDao(journeyDatabase: StationDatabase): StationDao = journeyDatabase.stationDao()

    @Provides
    @Singleton
    fun provideBeerDao(journeyDatabase: JourneyDatabase): JourneyDao = journeyDatabase.beerDao()

    @Provides
    @Singleton
    fun provideGetBeersSource(
        journeyApi: JourneyApi,
        journeyDao: JourneyDao,
    ): GetJourneySource = GetJourneySource(
        api = journeyApi,
        dao = journeyDao
    )


    @Provides
    @Singleton
    fun provideGetStationSource(
        journeyApi: JourneyApi,
        journeyDao: StationDao,
    ): GetStationSource = GetStationSource(
        api = journeyApi,
        dao = journeyDao
    )
    @Provides
    @Singleton
    @GetStationsPagingConfig
    fun provideGetStationsPagingConfig(): PagingConfig = PagingConfig(
        pageSize = JourneyApiConst.GetJourneys.LIMIT,
        enablePlaceholders = JourneyApiConst.GetJourneys.ENABLE_PLACEHOLDERS
    )

    @Provides
    @Singleton
    @GetJourneyPagingConfig
    fun provideGetBeersPagingConfig(): PagingConfig = PagingConfig(
        pageSize = JourneyApiConst.GetJourneys.LIMIT,
        enablePlaceholders = JourneyApiConst.GetJourneys.ENABLE_PLACEHOLDERS
    )

    @Provides
    @Singleton
    @GetStationsPager
    fun provideGetStationsPager(
        @GetStationsPagingConfig getStationsPagingConfig: PagingConfig,
        getJourneySource: GetStationSource,
        beersDao: StationDao,
    ): Pager<Int, StationEntity> = Pager(
        config = getStationsPagingConfig,
        remoteMediator = getJourneySource,
        pagingSourceFactory = { beersDao.getStation() }
    )
    @Provides
    @Singleton
    @GetJourneyPager
    fun provideGetBeersPager(
        @GetJourneyPagingConfig getJourneyPagingConfig: PagingConfig,
        getJourneySource: GetJourneySource,
        beersDao: JourneyDao,
    ): Pager<Int, JourneyEntity> = Pager(
        config = getJourneyPagingConfig,
        remoteMediator = getJourneySource,
        pagingSourceFactory = { beersDao.getBeers() }
    )

    @Provides
    @Singleton
    fun provideMainRepositoryImp(
        @GetJourneyPager getJourneyPager: Pager<Int, JourneyEntity>,
        @GetStationsPager getStationsyPager: Pager<Int, StationEntity>,
    ): MainRepositoryImp = MainRepositoryImp(getJourneyPager,getStationsyPager)



    @Provides
    @Singleton
    fun provideGetBeers(mainRepository: MainRepository): GetJourneys = GetJourneys(mainRepository)
    @Provides
    @Singleton
    fun provideGetStations(mainRepository: MainRepository): GetStations = GetStations(mainRepository)
}