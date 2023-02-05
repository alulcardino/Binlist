package com.romanmikhailenko.binlist.network.api

import com.romanmikhailenko.binlist.network.dto.ResponseDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface BinListApi {

    @GET("{bin}")
    suspend fun getBin(@Path("bin") bin : String) : Response<ResponseDto>
}