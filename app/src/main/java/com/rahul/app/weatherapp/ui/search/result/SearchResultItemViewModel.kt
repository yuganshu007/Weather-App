package com.rahul.app.weatherapp.ui.search.result

import androidx.databinding.ObservableField
import com.rahul.app.weatherapp.core.BaseViewModel
import com.rahul.app.weatherapp.db.entity.CitiesForSearchEntity
import javax.inject.Inject

/**
 * Created by Furkan on 2019-11-04
 */

class SearchResultItemViewModel @Inject internal constructor() : BaseViewModel() {
    var item = ObservableField<CitiesForSearchEntity>()
}
