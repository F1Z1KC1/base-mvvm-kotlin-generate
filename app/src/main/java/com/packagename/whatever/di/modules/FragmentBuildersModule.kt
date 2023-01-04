package com.packagename.whatever.di.modules

import com.packagename.whatever.feature.detailpokemon.basestat.BaseStatFragment
import com.packagename.whatever.feature.detailpokemon.moves.MovesFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeBaseStatFragment(): BaseStatFragment

    @ContributesAndroidInjector
    abstract fun contributeMovesFragment(): MovesFragment

}