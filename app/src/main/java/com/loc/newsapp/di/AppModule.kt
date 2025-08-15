package com.loc.newsapp.di

import LocationUserManager
import android.app.Application
import com.loc.newsapp.domain.manager.LocationUserManagerImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent:: class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocationUserManager(
        application: Application
    ): LocationUserManager = LocationUserManagerImpl(application)
}