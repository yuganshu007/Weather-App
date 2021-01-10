package com.rahul.app.weatherapp

import android.os.Build
import com.rahul.app.weatherapp.dao.CitiesForSearchDaoTest
import com.rahul.app.weatherapp.dao.CurrentWeatherDaoTest
import com.rahul.app.weatherapp.dao.ForecastDaoTest
import com.rahul.app.weatherapp.repo.CurrentWeatherRepositoryTest
import com.rahul.app.weatherapp.repo.ForecastRepositoryTest
import com.rahul.app.weatherapp.viewModel.DashboardViewModelTest
import com.rahul.app.weatherapp.viewModel.SearchViewModelTest
import com.rahul.app.weatherapp.viewModel.WeatherDetailViewModelTest
import com.rahul.app.weatherapp.viewState.CurrentWeatherViewStateTest
import com.rahul.app.weatherapp.viewState.ForecastViewStateTest
import com.rahul.app.weatherapp.viewState.SearchViewStateTest
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.robolectric.annotation.Config

/**
 * Created by Furkan on 2019-12-15
 */

@Config(sdk = [Build.VERSION_CODES.P])
@RunWith(Suite::class)
@Suite.SuiteClasses(
    CitiesForSearchDaoTest::class,
    CurrentWeatherDaoTest::class,
    CurrentWeatherViewStateTest::class,
    DashboardViewModelTest::class,
    ForecastDaoTest::class,
    ForecastViewStateTest::class,
    SearchViewStateTest::class,
    SearchViewModelTest::class,
    WeatherDetailViewModelTest::class,
    ForecastRepositoryTest::class,
    CurrentWeatherRepositoryTest::class
)
class TestSuite
