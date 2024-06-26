package co.init.devtools.hilt

import co.init.devtools.example.data.CoinService
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.Protocol
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

private const val CONNECTION_TIMEOUT_SECONDS = 30L
private const val BASE_URL = "https://api.coindesk.com/v1/bpi/"

@Module
@InstallIn(SingletonComponent::class)
object AppModules {

    @Provides
    fun provideGson(): Gson = Gson()

    @Singleton
    @Provides
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
        gson: Gson
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(okHttpClient)
            .build()
    }

    @Provides
    fun provideMasOkHttpClient(): OkHttpClient =
        OkHttpClient.Builder()
            .connectTimeout(CONNECTION_TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .addInterceptor(HttpLoggingInterceptor().apply {
                this.setLevel(HttpLoggingInterceptor.Level.BODY)
            })
            .protocols(listOf(Protocol.HTTP_1_1))
            .retryOnConnectionFailure(true)
            .build()

    @Provides
    fun provideCoinInfoService(retrofit: Retrofit): CoinService =
        retrofit.create(CoinService::class.java)
}