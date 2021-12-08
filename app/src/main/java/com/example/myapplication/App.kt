package com.example.myapplication

import android.app.Application

class App: Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().makeBuilder(this).build()
    }
}