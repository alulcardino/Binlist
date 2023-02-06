package com.romanmikhailenko.binlist.data.repository

import com.romanmikhailenko.binlist.data.data_source.BinDao
import com.romanmikhailenko.binlist.data.network.api.BinListApi
import com.romanmikhailenko.binlist.domain.model.Bin
import com.romanmikhailenko.binlist.domain.repository.BinRepository
import kotlinx.coroutines.flow.Flow


class BinListRepositoryImpl(
    private val dao: BinDao,
    private val api: BinListApi
) : BinRepository {

    override fun getBinsFromRoom(): Flow<List<Bin>> {
        return dao.getBins()
    }

    override suspend fun getBinsFromNetwork(bin: String): Bin {
        val response = api.getBin(bin).body()

        return Bin(
            0,
            response?.numberDto?.length,
            response?.numberDto?.luhn ?: false,
            response?.schema,
            response?.brand,
            response?.type,
            response?.prepaid ?: false,
            response?.countryDto?.name,
            response?.countryDto?.latitude,
            response?.countryDto?.longitude,
            response?.bankDto?.name,
            response?.bankDto?.city,
            response?.bankDto?.url,
            response?.bankDto?.phone
        )

    }

    override suspend fun insertBin(bin: Bin) {
        dao.insertBin(bin)
    }
}
