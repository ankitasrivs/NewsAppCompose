package com.loc.newsapp.domain.usecases


import com.loc.newsapp.domain.manager.LocationUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val locationUserManager: LocationUserManager
) {

    suspend operator fun invoke(): Flow<Boolean> {
        return locationUserManager.readAppEntry()
    }
}