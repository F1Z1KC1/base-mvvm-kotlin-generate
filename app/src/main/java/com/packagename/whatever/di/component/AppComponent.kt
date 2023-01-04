package com.packagename.whatever.di.component

import com.packagename.whatever.App
import com.packagename.whatever.di.modules.NetworkModule
import dagger.BindsInstance
import com.packagename.whatever.di.modules.BuildersModule
import com.packagename.whatever.di.modules.AppModule
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    NetworkModule::class,
    BuildersModule::class
])
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: App): Builder

        @BindsInstance
        fun networkModule(networkModule: NetworkModule): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}