package com.packagename.whatever.di.modules

import android.content.Context
import androidx.room.Room
import com.packagename.whatever.App
import com.packagename.whatever.data.AppDatabase
import com.packagename.whatever.data.AppDatabase.Companion.MIGRATION_1_2
import dagger.Provides
import com.packagename.whatever.di.scopes.ApplicationContext
import dagger.Module
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
class AppModule {

    @Provides
    @ApplicationContext
    fun provideContext(application: App): Context = application.applicationContext

    @Provides
    @Singleton
    fun provideAppDatabase(application: App): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "BaseMVVMKotlin.db")
            //.addMigrations(MIGRATION_1_2) //TODO enable this to test migration from v1 to v2
            .build()
    }

}