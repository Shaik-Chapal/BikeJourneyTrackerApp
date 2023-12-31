package xyz.summer.bikejourneytracker.injection.app;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.converter.moshi.MoshiConverterFactory;
import xyz.summer.bikejourneytracker.data.local.journey.dao.JourneyDao;
import xyz.summer.bikejourneytracker.data.local.journey.dao.StationDao;
import xyz.summer.bikejourneytracker.data.local.journey.database.JourneyDatabase;
import xyz.summer.bikejourneytracker.data.local.journey.database.StationDatabase;
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.JourneyEntity;
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.StationEntity;
import xyz.summer.bikejourneytracker.data.remote.journey.api.JourneyApi;
import xyz.summer.bikejourneytracker.data.repository.DepartureRepository;
import xyz.summer.bikejourneytracker.data.repository.MainRepositoryImp;
import xyz.summer.bikejourneytracker.data.source.GetJourneySource;
import xyz.summer.bikejourneytracker.data.source.GetStationSource;
import xyz.summer.bikejourneytracker.domain.usecase.GetJourneys;
import xyz.summer.bikejourneytracker.domain.usecase.GetStations;
import xyz.summer.bikejourneytracker.injection.provide.ApplicationModule;
import xyz.summer.bikejourneytracker.injection.provide.ApplicationModule_ProvideBeerApiFactory;
import xyz.summer.bikejourneytracker.injection.provide.ApplicationModule_ProvideBeerDaoFactory;
import xyz.summer.bikejourneytracker.injection.provide.ApplicationModule_ProvideBeerDatabaseFactory;
import xyz.summer.bikejourneytracker.injection.provide.ApplicationModule_ProvideGetBeersFactory;
import xyz.summer.bikejourneytracker.injection.provide.ApplicationModule_ProvideGetBeersPagerFactory;
import xyz.summer.bikejourneytracker.injection.provide.ApplicationModule_ProvideGetBeersPagingConfigFactory;
import xyz.summer.bikejourneytracker.injection.provide.ApplicationModule_ProvideGetBeersSourceFactory;
import xyz.summer.bikejourneytracker.injection.provide.ApplicationModule_ProvideGetStationSourceFactory;
import xyz.summer.bikejourneytracker.injection.provide.ApplicationModule_ProvideGetStationsFactory;
import xyz.summer.bikejourneytracker.injection.provide.ApplicationModule_ProvideGetStationsPagerFactory;
import xyz.summer.bikejourneytracker.injection.provide.ApplicationModule_ProvideGetStationsPagingConfigFactory;
import xyz.summer.bikejourneytracker.injection.provide.ApplicationModule_ProvideKotlinJsonAdapterFactoryFactory;
import xyz.summer.bikejourneytracker.injection.provide.ApplicationModule_ProvideMainRepositoryImpFactory;
import xyz.summer.bikejourneytracker.injection.provide.ApplicationModule_ProvideMoshiConverterFactoryFactory;
import xyz.summer.bikejourneytracker.injection.provide.ApplicationModule_ProvideMoshiFactory;
import xyz.summer.bikejourneytracker.injection.provide.ApplicationModule_ProvideStationDaoFactory;
import xyz.summer.bikejourneytracker.injection.provide.ApplicationModule_ProvideStationDatabaseFactory;
import xyz.summer.bikejourneytracker.presentation.activity.MainActivity;
import xyz.summer.bikejourneytracker.presentation.screen.HomeActivity;
import xyz.summer.bikejourneytracker.presentation.screen.TopFiveActivity;
import xyz.summer.bikejourneytracker.presentation.viewmodel.BeerListViewModel;
import xyz.summer.bikejourneytracker.presentation.viewmodel.BeerListViewModel_HiltModules_KeyModule_ProvideFactory;
import xyz.summer.bikejourneytracker.presentation.viewmodel.DepartureViewModel;
import xyz.summer.bikejourneytracker.presentation.viewmodel.DepartureViewModel_HiltModules_KeyModule_ProvideFactory;
import xyz.summer.bikejourneytracker.presentation.viewmodel.ReturnViewModel;
import xyz.summer.bikejourneytracker.presentation.viewmodel.ReturnViewModel_HiltModules_KeyModule_ProvideFactory;
import xyz.summer.bikejourneytracker.presentation.viewmodel.StationListViewModel;
import xyz.summer.bikejourneytracker.presentation.viewmodel.StationListViewModel_HiltModules_KeyModule_ProvideFactory;
import xyz.summer.bikejourneytracker.util.ui.composables.tabs.LoginActivity;

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
public final class DaggerApp_HiltComponents_SingletonC {
  private DaggerApp_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder applicationModule(ApplicationModule applicationModule) {
      Preconditions.checkNotNull(applicationModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    public App_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements App_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public App_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements App_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public App_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements App_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public App_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements App_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements App_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements App_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public App_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements App_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public App_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends App_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends App_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends App_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends App_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(4).add(BeerListViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(DepartureViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ReturnViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(StationListViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
    }

    @Override
    public void injectHomeActivity(HomeActivity homeActivity) {
    }

    @Override
    public void injectTopFiveActivity(TopFiveActivity topFiveActivity) {
    }

    @Override
    public void injectLoginActivity(LoginActivity loginActivity) {
    }
  }

  private static final class ViewModelCImpl extends App_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<BeerListViewModel> beerListViewModelProvider;

    private Provider<DepartureViewModel> departureViewModelProvider;

    private Provider<ReturnViewModel> returnViewModelProvider;

    private Provider<StationListViewModel> stationListViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    private DepartureRepository departureRepository() {
      return new DepartureRepository(singletonCImpl.provideBeerApiProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.beerListViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.departureViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.returnViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.stationListViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(4).put("xyz.summer.bikejourneytracker.presentation.viewmodel.BeerListViewModel", ((Provider) beerListViewModelProvider)).put("xyz.summer.bikejourneytracker.presentation.viewmodel.DepartureViewModel", ((Provider) departureViewModelProvider)).put("xyz.summer.bikejourneytracker.presentation.viewmodel.ReturnViewModel", ((Provider) returnViewModelProvider)).put("xyz.summer.bikejourneytracker.presentation.viewmodel.StationListViewModel", ((Provider) stationListViewModelProvider)).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // xyz.summer.bikejourneytracker.presentation.viewmodel.BeerListViewModel 
          return (T) new BeerListViewModel(singletonCImpl.provideGetBeersProvider.get());

          case 1: // xyz.summer.bikejourneytracker.presentation.viewmodel.DepartureViewModel 
          return (T) new DepartureViewModel(viewModelCImpl.departureRepository());

          case 2: // xyz.summer.bikejourneytracker.presentation.viewmodel.ReturnViewModel 
          return (T) new ReturnViewModel(viewModelCImpl.departureRepository());

          case 3: // xyz.summer.bikejourneytracker.presentation.viewmodel.StationListViewModel 
          return (T) new StationListViewModel(singletonCImpl.provideGetStationsProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends App_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends App_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends App_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<PagingConfig> provideGetBeersPagingConfigProvider;

    private Provider<KotlinJsonAdapterFactory> provideKotlinJsonAdapterFactoryProvider;

    private Provider<Moshi> provideMoshiProvider;

    private Provider<MoshiConverterFactory> provideMoshiConverterFactoryProvider;

    private Provider<JourneyApi> provideBeerApiProvider;

    private Provider<JourneyDatabase> provideBeerDatabaseProvider;

    private Provider<JourneyDao> provideBeerDaoProvider;

    private Provider<GetJourneySource> provideGetBeersSourceProvider;

    private Provider<Pager<Integer, JourneyEntity>> provideGetBeersPagerProvider;

    private Provider<PagingConfig> provideGetStationsPagingConfigProvider;

    private Provider<StationDatabase> provideStationDatabaseProvider;

    private Provider<StationDao> provideStationDaoProvider;

    private Provider<GetStationSource> provideGetStationSourceProvider;

    private Provider<Pager<Integer, StationEntity>> provideGetStationsPagerProvider;

    private Provider<MainRepositoryImp> provideMainRepositoryImpProvider;

    private Provider<GetJourneys> provideGetBeersProvider;

    private Provider<GetStations> provideGetStationsProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.provideGetBeersPagingConfigProvider = DoubleCheck.provider(new SwitchingProvider<PagingConfig>(singletonCImpl, 3));
      this.provideKotlinJsonAdapterFactoryProvider = DoubleCheck.provider(new SwitchingProvider<KotlinJsonAdapterFactory>(singletonCImpl, 8));
      this.provideMoshiProvider = DoubleCheck.provider(new SwitchingProvider<Moshi>(singletonCImpl, 7));
      this.provideMoshiConverterFactoryProvider = DoubleCheck.provider(new SwitchingProvider<MoshiConverterFactory>(singletonCImpl, 6));
      this.provideBeerApiProvider = DoubleCheck.provider(new SwitchingProvider<JourneyApi>(singletonCImpl, 5));
      this.provideBeerDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<JourneyDatabase>(singletonCImpl, 10));
      this.provideBeerDaoProvider = DoubleCheck.provider(new SwitchingProvider<JourneyDao>(singletonCImpl, 9));
      this.provideGetBeersSourceProvider = DoubleCheck.provider(new SwitchingProvider<GetJourneySource>(singletonCImpl, 4));
      this.provideGetBeersPagerProvider = DoubleCheck.provider(new SwitchingProvider<Pager<Integer, JourneyEntity>>(singletonCImpl, 2));
      this.provideGetStationsPagingConfigProvider = DoubleCheck.provider(new SwitchingProvider<PagingConfig>(singletonCImpl, 12));
      this.provideStationDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<StationDatabase>(singletonCImpl, 15));
      this.provideStationDaoProvider = DoubleCheck.provider(new SwitchingProvider<StationDao>(singletonCImpl, 14));
      this.provideGetStationSourceProvider = DoubleCheck.provider(new SwitchingProvider<GetStationSource>(singletonCImpl, 13));
      this.provideGetStationsPagerProvider = DoubleCheck.provider(new SwitchingProvider<Pager<Integer, StationEntity>>(singletonCImpl, 11));
      this.provideMainRepositoryImpProvider = DoubleCheck.provider(new SwitchingProvider<MainRepositoryImp>(singletonCImpl, 1));
      this.provideGetBeersProvider = DoubleCheck.provider(new SwitchingProvider<GetJourneys>(singletonCImpl, 0));
      this.provideGetStationsProvider = DoubleCheck.provider(new SwitchingProvider<GetStations>(singletonCImpl, 16));
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    @Override
    public void injectApp(App app) {
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // xyz.summer.bikejourneytracker.domain.usecase.GetJourneys 
          return (T) ApplicationModule_ProvideGetBeersFactory.provideGetBeers(singletonCImpl.provideMainRepositoryImpProvider.get());

          case 1: // xyz.summer.bikejourneytracker.data.repository.MainRepositoryImp 
          return (T) ApplicationModule_ProvideMainRepositoryImpFactory.provideMainRepositoryImp(singletonCImpl.provideGetBeersPagerProvider.get(), singletonCImpl.provideGetStationsPagerProvider.get());

          case 2: // @xyz.summer.bikejourneytracker.injection.name.GetJourneyPager androidx.paging.Pager<java.lang.Integer,xyz.summer.bikejourneytracker.data.local.journey.entitiy.JourneyEntity> 
          return (T) ApplicationModule_ProvideGetBeersPagerFactory.provideGetBeersPager(singletonCImpl.provideGetBeersPagingConfigProvider.get(), singletonCImpl.provideGetBeersSourceProvider.get(), singletonCImpl.provideBeerDaoProvider.get());

          case 3: // @xyz.summer.bikejourneytracker.injection.name.GetJourneyPagingConfig androidx.paging.PagingConfig 
          return (T) ApplicationModule_ProvideGetBeersPagingConfigFactory.provideGetBeersPagingConfig();

          case 4: // xyz.summer.bikejourneytracker.data.source.GetJourneySource 
          return (T) ApplicationModule_ProvideGetBeersSourceFactory.provideGetBeersSource(singletonCImpl.provideBeerApiProvider.get(), singletonCImpl.provideBeerDaoProvider.get());

          case 5: // xyz.summer.bikejourneytracker.data.remote.journey.api.JourneyApi 
          return (T) ApplicationModule_ProvideBeerApiFactory.provideBeerApi(singletonCImpl.provideMoshiConverterFactoryProvider.get());

          case 6: // retrofit2.converter.moshi.MoshiConverterFactory 
          return (T) ApplicationModule_ProvideMoshiConverterFactoryFactory.provideMoshiConverterFactory(singletonCImpl.provideMoshiProvider.get());

          case 7: // com.squareup.moshi.Moshi 
          return (T) ApplicationModule_ProvideMoshiFactory.provideMoshi(singletonCImpl.provideKotlinJsonAdapterFactoryProvider.get());

          case 8: // com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory 
          return (T) ApplicationModule_ProvideKotlinJsonAdapterFactoryFactory.provideKotlinJsonAdapterFactory();

          case 9: // xyz.summer.bikejourneytracker.data.local.journey.dao.JourneyDao 
          return (T) ApplicationModule_ProvideBeerDaoFactory.provideBeerDao(singletonCImpl.provideBeerDatabaseProvider.get());

          case 10: // xyz.summer.bikejourneytracker.data.local.journey.database.JourneyDatabase 
          return (T) ApplicationModule_ProvideBeerDatabaseFactory.provideBeerDatabase(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonCImpl.applicationContextModule));

          case 11: // @xyz.summer.bikejourneytracker.injection.name.station.GetStationsPager androidx.paging.Pager<java.lang.Integer,xyz.summer.bikejourneytracker.data.local.journey.entitiy.StationEntity> 
          return (T) ApplicationModule_ProvideGetStationsPagerFactory.provideGetStationsPager(singletonCImpl.provideGetStationsPagingConfigProvider.get(), singletonCImpl.provideGetStationSourceProvider.get(), singletonCImpl.provideStationDaoProvider.get());

          case 12: // @xyz.summer.bikejourneytracker.injection.name.station.GetStationsPagingConfig androidx.paging.PagingConfig 
          return (T) ApplicationModule_ProvideGetStationsPagingConfigFactory.provideGetStationsPagingConfig();

          case 13: // xyz.summer.bikejourneytracker.data.source.GetStationSource 
          return (T) ApplicationModule_ProvideGetStationSourceFactory.provideGetStationSource(singletonCImpl.provideBeerApiProvider.get(), singletonCImpl.provideStationDaoProvider.get());

          case 14: // xyz.summer.bikejourneytracker.data.local.journey.dao.StationDao 
          return (T) ApplicationModule_ProvideStationDaoFactory.provideStationDao(singletonCImpl.provideStationDatabaseProvider.get());

          case 15: // xyz.summer.bikejourneytracker.data.local.journey.database.StationDatabase 
          return (T) ApplicationModule_ProvideStationDatabaseFactory.provideStationDatabase(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonCImpl.applicationContextModule));

          case 16: // xyz.summer.bikejourneytracker.domain.usecase.GetStations 
          return (T) ApplicationModule_ProvideGetStationsFactory.provideGetStations(singletonCImpl.provideMainRepositoryImpProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
