package com.loc.newsapp.di


import android.app.Application
import com.loc.newsapp.domain.manager.LocationUserManager
import com.loc.newsapp.domain.manager.LocationUserManagerImpl
import com.loc.newsapp.domain.usecases.AppEntryUseCase
import com.loc.newsapp.domain.usecases.ReadAppEntry
import com.loc.newsapp.domain.usecases.SaveAppEntry
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

    @Provides
    @Singleton
    fun providesEntryUsecase(
        locationUserManager: LocationUserManager
    )  = AppEntryUseCase(
        readAppEntry = ReadAppEntry(locationUserManager),
        saveAppEntry = SaveAppEntry(locationUserManager)

    )
}