package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var appComponent: AppComponent
    @Inject
    lateinit var cat: Cat
    @Inject
    lateinit var dog: Dog
    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent = (applicationContext as App).appComponent
            appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(cat)
        println(dog)
    }
}