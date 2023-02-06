package com.romanmikhailenko.binlist.domain.repository

import com.romanmikhailenko.binlist.domain.model.Bin
import kotlinx.coroutines.flow.Flow

interface BinRepository {

    fun getBinsFromRoom(): Flow<List<Bin>>

    suspend fun getBinsFromNetwork(bin: String): Bin

    suspend fun insertBin(bin: Bin)
}