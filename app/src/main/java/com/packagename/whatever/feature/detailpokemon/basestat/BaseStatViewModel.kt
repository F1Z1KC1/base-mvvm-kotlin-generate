package com.packagename.whatever.feature.detailpokemon.basestat

import com.packagename.whatever.base.BaseViewModel
import com.packagename.whatever.data.DataManager
import com.packagename.whatever.model.api.detailpokemon.DetailPokemonResponse
import javax.inject.Inject

class BaseStatViewModel
@Inject constructor(private val dataManager: DataManager) : BaseViewModel(){

    fun generateBaseStat(data: DetailPokemonResponse) = data.stats

}