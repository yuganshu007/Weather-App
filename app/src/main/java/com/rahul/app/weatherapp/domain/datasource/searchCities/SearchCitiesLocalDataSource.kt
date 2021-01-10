package com.rahul.app.weatherapp.domain.datasource.searchCities

import androidx.lifecycle.LiveData
import com.rahul.app.weatherapp.db.dao.CitiesForSearchDao
import com.rahul.app.weatherapp.db.entity.CitiesForSearchEntity
import com.rahul.app.weatherapp.domain.model.SearchResponse
import javax.inject.Inject

/**
 * Created by Furkan on 2019-10-31
 */

class SearchCitiesLocalDataSource @Inject constructor(private val citiesForSearchDao: CitiesForSearchDao) {

    fun getCityByName(cityName: String?): LiveData<List<CitiesForSearchEntity>> = citiesForSearchDao.getCityByName(cityName)

    fun insertCities(response: SearchResponse) {
        response.hits
            ?.map { CitiesForSearchEntity(it) }
            ?.let { citiesForSearchDao.insertCities(it) }
    }
}
