package com.packagename.whatever

import android.app.Application
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject
import dagger.android.AndroidInjector
import com.packagename.whatever.di.component.AppComponent
import com.packagename.whatever.di.modules.NetworkModule
import com.packagename.whatever.di.component.DaggerAppComponent
import dagger.android.HasAndroidInjector
import timber.log.Timber

class App : Application(), HasAndroidInjector {

    @Inject lateinit var androidInjector : DispatchingAndroidInjector<Any>

    private var appComponent: AppComponent? = null

    override fun onCreate() {
        super.onCreate()

        if(BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }

        appComponent = DaggerAppComponent
            .builder()
            .application(this)
            .networkModule(NetworkModule())
            .build()

        appComponent?.inject(this)
    }

    override fun androidInjector(): AndroidInjector<Any> = androidInjector
}