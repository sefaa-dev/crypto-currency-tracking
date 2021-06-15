package com.sefayilmaz.retrofitkotlin.service

import com.sefayilmaz.retrofitkotlin.model.CryptoModel
import io.reactivex.Observable
import io.reactivex.Observer
import retrofit2.Call
import retrofit2.http.GET
//https://api.nomics.com/v1/
interface CryptoAPI {
    @GET("prices?key=33cb08b0ceb8e1dfd616d3ca04bef60ea50f5829")
    //RxJava
    fun getData():Observable<List<CryptoModel>>
    //fun getData(): Call<List<CryptoModel>>
}