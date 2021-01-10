package com.rahul.app.weatherapp.ui.search

import com.rahul.app.weatherapp.core.BaseViewState
import com.rahul.app.weatherapp.db.entity.CitiesForSearchEntity
import com.rahul.app.weatherapp.utils.domain.Status

/**
 * Created by Furkan on 2019-10-31
 */

class SearchViewState(
    val status: Status,
    val error: String? = null,
    val data: List<CitiesForSearchEntity>? = null
) : BaseViewState(status, error) {
    fun getSearchResult() = data
}
