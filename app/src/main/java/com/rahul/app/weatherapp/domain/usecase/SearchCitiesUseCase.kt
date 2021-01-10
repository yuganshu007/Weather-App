package com.rahul.app.weatherapp.domain.usecase

import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.rahul.app.weatherapp.db.entity.CitiesForSearchEntity
import com.rahul.app.weatherapp.repo.SearchCitiesRepository
import com.rahul.app.weatherapp.ui.search.SearchViewState
import com.rahul.app.weatherapp.utils.UseCaseLiveData
import com.rahul.app.weatherapp.utils.domain.Resource
import javax.inject.Inject

/**
 * Created by Furkan on 2019-10-31
 */

class SearchCitiesUseCase @Inject internal constructor(private val repository: SearchCitiesRepository) : UseCaseLiveData<SearchViewState, SearchCitiesUseCase.SearchCitiesParams, SearchCitiesRepository>() {

    override fun getRepository(): SearchCitiesRepository = repository

    override fun buildUseCaseObservable(params: SearchCitiesParams?): LiveData<SearchViewState> {
        return repository.loadCitiesByCityName(
            cityName = params?.city ?: ""
        ).map {
            onSearchResultReady(it)
        }
    }

    private fun onSearchResultReady(resource: Resource<List<CitiesForSearchEntity>>): SearchViewState {
        return SearchViewState(
            status = resource.status,
            error = resource.message,
            data = resource.data
        )
    }

    class SearchCitiesParams(
        val city: String = ""
    ) : Params()
}
