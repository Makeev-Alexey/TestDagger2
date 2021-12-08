package com.example.myapplication

import android.app.Application
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DogModule::class])
interface AppComponent {
    @Component.Builder
    interface Builder{
        @BindsInstance
        fun makeBuilder(application: Application) : Builder
        fun build(): AppComponent
    }
    fun inject(mainActivity: MainActivity)
    fun inject(blankFragment: BlankFragment)
}