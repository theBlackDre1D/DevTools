package co.init.devtools.example.data

import javax.inject.Inject

class CoinRepository @Inject constructor(
    private val remoteDataSource: CoinRemoteDataSource
) {

    suspend fun getCoinInfo() = remoteDataSource.getCoinInfo()
}