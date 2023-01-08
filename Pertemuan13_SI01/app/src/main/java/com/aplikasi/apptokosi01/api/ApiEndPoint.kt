package com.aplikasi.apptokosi01.api

import com.aplikasi.apptokosi01.response.login.LoginResponse
import com.aplikasi.apptokosi01.response.produk.ProdukResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiEndPoint {
    @FormUrlEncoded
    @POST("login")
    fun login(
        @Field("email") email :String,
        @Field("password") password : String
    ):Call<LoginResponse>

    @GET("produk")
    fun getProduk(
        @Header("Authorization") token :String
    ):Call<ProdukResponse>
}