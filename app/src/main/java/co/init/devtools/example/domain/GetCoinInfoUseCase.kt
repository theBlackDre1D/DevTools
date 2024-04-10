package co.init.devtools.example.domain

import co.init.devtools.example.data.CoinRepository
import javax.inject.Inject

class GetCoinInfoUseCase @Inject constructor(
    private val repository: CoinRepository
) {

    suspend operator fun invoke() = repository.getCoinInfo()
}