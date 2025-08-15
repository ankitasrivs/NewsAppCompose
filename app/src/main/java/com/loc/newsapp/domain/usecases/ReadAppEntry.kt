package com.loc.newsapp.domain.usecases

import LocationUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val locationUserManager: LocationUserManager
) {

    suspend fun invoke(): Flow<Boolean> {
        return locationUserManager.readAppEntry()
    }
}