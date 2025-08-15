package com.loc.newsapp.domain.usecases

import com.loc.newsapp.domain.manager.LocationUserManager


class SaveAppEntry (
    private val localUserManager: LocationUserManager
) {
    suspend operator fun invoke() {
        localUserManager.saveAppEntry()
    }
}