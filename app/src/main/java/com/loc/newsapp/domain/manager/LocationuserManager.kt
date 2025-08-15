import kotlinx.coroutines.flow.Flow

interface LocationUserManager {

    suspend fun saveAppEntry()
    fun readAppEntry(): Flow<Boolean>
}