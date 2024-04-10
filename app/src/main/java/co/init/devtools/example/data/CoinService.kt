package co.init.devtools.example.data

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface CoinService {

    @Headers(
        "Content-Type: application/x-www-form-urlencoded",
        "Host: api.coindesk.com"
    )
    @GET("currentprice.json")
    suspend fun getCoinInfo(): Response<CoinInfoResponse>
}