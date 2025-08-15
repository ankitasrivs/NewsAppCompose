package com.loc.newsapp.domain.usecases

import LocationUserManager

class SaveAppEntry (
    private val localUserManager: LocationUserManager
) {
    suspend operator fun invoke() {
        localUserManager.saveAppEntry()
    }
}