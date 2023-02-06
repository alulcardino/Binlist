package com.romanmikhailenko.binlist.domain.use_case

import com.romanmikhailenko.binlist.domain.repository.BinRepository


class GetBinUseCase(
    private val repository: BinRepository
) {

    suspend operator fun invoke(binNumber: String) = repository.getBinsFromNetwork(binNumber)
}