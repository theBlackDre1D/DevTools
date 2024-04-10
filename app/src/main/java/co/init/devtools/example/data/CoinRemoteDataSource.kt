package co.init.devtools.example.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class CoinRemoteDataSource @Inject constructor(
    private val coinService: CoinService
) {

    suspend fun getCoinInfo(): Flow<Result<CoinInfoResponse>> {
        return flow {
            try {
                val response = coinService.getCoinInfo()
                if (response.isSuccessful) {
                    response.body()?.let { body ->
                        emit(Result.success(body))
                    }
                } else {
                    emit(Result.failure(Throwable(response.message())))
                }
            } catch (t: Throwable) {
                emit(Result.failure(t))
            }
        }
    }
}