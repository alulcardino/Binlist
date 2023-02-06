package com.romanmikhailenko.binlist.data.network.api

import com.romanmikhailenko.binlist.data.network.dto.ResponseDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface BinListApi {

    @GET("{bin}")
    suspend fun getBin(@Path("bin") bin : String) : Response<ResponseDto>
}