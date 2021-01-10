package com.rahul.app.weatherapp.domain.datasource.forecast

import com.rahul.app.weatherapp.db.dao.ForecastDao
import com.rahul.app.weatherapp.db.entity.ForecastEntity
import com.rahul.app.weatherapp.domain.model.ForecastResponse
import javax.inject.Inject

/**
 * Created by Furkan on 2019-10-21
 */

class ForecastLocalDataSource @Inject constructor(private val forecastDao: ForecastDao) {

    fun getForecast() = forecastDao.getForecast()

    fun insertForecast(forecast: ForecastResponse) = forecastDao.deleteAndInsert(ForecastEntity(forecast))
}
