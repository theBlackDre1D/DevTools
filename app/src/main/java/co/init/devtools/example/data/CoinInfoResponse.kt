package co.init.devtools.example.data

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CoinInfoResponse(

) : Serializable

data class Time(
    @SerializedName("updated") val updated: String? = null,
    @SerializedName("updatedISO") val updatedISO: String? = null,
    @SerializedName("updateduk") val updateduk: String? = null
)

data class USD(
    @SerializedName("code") val code: String? = null,
    @SerializedName("symbol") val symbol: String? = null,
    @SerializedName("rate") val rate: String? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("rate_float") val rateFloat: Double? = null
)

data class GBP(
    @SerializedName("code") val code: String? = null,
    @SerializedName("symbol") val symbol: String? = null,
    @SerializedName("rate") val rate: String? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("rate_float") val rateFloat: Double? = null
)

