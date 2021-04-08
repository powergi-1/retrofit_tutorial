package com.example.retrofittutorial.retrofit

import retrofit2.Retrofit

// 싱글턴
object RetrofitClient {
    private var retrofitClient : Retrofit? = null

    fun getClient(baseurl: String): Retrofit? {
        if(retrofitClient == null) {
            retrofitClient = Retrofit.Builder()
                .baseUrl(baseurl)
                .build()
        }

        return retrofitClient
    }

}