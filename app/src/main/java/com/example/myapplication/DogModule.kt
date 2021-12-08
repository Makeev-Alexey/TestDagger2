package com.example.myapplication

import dagger.Module
import dagger.Provides

@Module
class DogModule {
    @Provides
    fun createDog() : Dog{
        return Dog()
    }
}