package co.init.devtools.example.data

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CoinInfoResponse(
    @SerializedName("time") val time: Time,
    @SerializedName("disclaimer") val disclaimer: String,
    @SerializedName("chartName") val chartName: String,
    @SerializedName("bpi") val bpi: List<Currency>
) : Serializable

data class Time(
    @SerializedName("updated") val updated: String? = null,
    @SerializedName("updatedISO") val updatedISO: String? = null,
    @SerializedName("updateduk") val updatedUk: String? = null
) : Serializable

data class Currency(
    @SerializedName("code") val code: String? = null,
    @SerializedName("symbol") val symbol: String? = null,
    @SerializedName("rate") val rate: String? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("rate_float") val rateFloat: Double? = null
) : Serializable