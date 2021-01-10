package com.rahul.app.weatherapp.di.module

import com.rahul.app.weatherapp.ui.dashboard.DashboardFragment
import com.rahul.app.weatherapp.ui.search.SearchFragment
import com.rahul.app.weatherapp.ui.splash.SplashFragment
import com.rahul.app.weatherapp.ui.weather_detail.WeatherDetailFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Furkan on 2019-10-26
 */

@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeSplashFragment(): SplashFragment

    @ContributesAndroidInjector
    abstract fun contributeDashboardFragment(): DashboardFragment

    @ContributesAndroidInjector
    abstract fun contributeWeatherDetailFragment(): WeatherDetailFragment

    @ContributesAndroidInjector
    abstract fun contributeSearchFragment(): SearchFragment
}
