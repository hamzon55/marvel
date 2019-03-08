package com.example.hamzajerbi.marvel.Base.NetworkLayer

import com.example.hamzajerbi.marvel.Base.Model.*

import com.example.hamzajerbi.marvel.Base.PersistentData.PersistentData
import io.reactivex.Observable
import io.reactivex.disposables.Disposable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

val apiService by lazy {
    APIService.create()
}
var disposable: Disposable? = null


interface APIService {

    companion object {
        fun create(): APIService {

            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(
                    RxJava2CallAdapterFactory.create()
                )
                .addConverterFactory(
                    GsonConverterFactory.create()
                )
                .baseUrl(PersistentData.instance.baseURL)
                .build()

            return retrofit.create(APIService::class.java)
        }
    }


    @GET("characters")
    @Headers(
        "Accept: application/json",
        "Content-type:application/json"
    )
    fun marvelList(@Query ("ts") action: String,
                   @Query("hash") format: String,
                   @Query("apikey") list: String): Observable<CharacterResponse>
}
