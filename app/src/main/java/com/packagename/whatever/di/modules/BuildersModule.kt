package com.packagename.whatever.di.modules

import com.packagename.whatever.feature.listpokemon.ListPokemonActivity
import com.packagename.whatever.feature.detailpokemon.DetailPokemonActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BuildersModule{
    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun bindDetailPokemonActivity(): DetailPokemonActivity

    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun bindListPokemonActivity(): ListPokemonActivity
}