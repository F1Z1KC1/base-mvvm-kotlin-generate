package com.packagename.whatever.feature.detailpokemon.moves

import com.packagename.whatever.base.BaseViewModel
import com.packagename.whatever.data.DataManager
import com.packagename.whatever.model.api.detailpokemon.MovesItem
import com.google.gson.Gson
import javax.inject.Inject

class MovesViewModel
@Inject constructor(private val dataManager: DataManager) : BaseViewModel(){

    fun generateMoves(data: String): MutableList<String> {
        val result: MutableList<String> = mutableListOf()
        val moves = Gson().fromJson(data, Array<MovesItem>::class.java).asList()
        for(m in moves){
            result.add(m.move.name)
        }

        return result
    }

}