package com.packagename.whatever.di.modules

import dagger.Module
import androidx.lifecycle.ViewModel
import com.packagename.whatever.di.scopes.ViewModelKey
import com.packagename.whatever.feature.listpokemon.ListPokemonViewModel
import dagger.multibindings.IntoMap
import dagger.Binds
import com.packagename.whatever.base.AppViewModelFactory
import androidx.lifecycle.ViewModelProvider
import com.packagename.whatever.feature.detailpokemon.DetailPokemonViewModel
import com.packagename.whatever.feature.detailpokemon.basestat.BaseStatViewModel
import com.packagename.whatever.feature.detailpokemon.moves.MovesViewModel

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(BaseStatViewModel::class)
    abstract fun bindBaseStatViewModel(baseStatViewModel: BaseStatViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MovesViewModel::class)
    abstract fun bindMovesViewModel(movesViewModel: MovesViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(DetailPokemonViewModel::class)
    abstract fun bindDetailPokemonViewModel(detailPokemonViewModel: DetailPokemonViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ListPokemonViewModel::class)
    abstract fun bindListPokemonViewModel(listPokemonViewModel: ListPokemonViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: AppViewModelFactory): ViewModelProvider.Factory
}