package com.romanmikhailenko.binlist.network.dto

import com.google.gson.annotations.SerializedName
import javax.xml.validation.Schema

data class ResponseDto(
    @SerializedName("number")
    val numberDto: NumberDto,
    val schema: String,
    val type: String,
    val prepaid: Boolean,
    @SerializedName("country")
    val countryDto: CountryDto,
    @SerializedName("bank")
    val bankDto: BankDto
    )