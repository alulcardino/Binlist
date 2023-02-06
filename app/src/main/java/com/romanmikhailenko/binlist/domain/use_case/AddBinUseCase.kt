package com.romanmikhailenko.binlist.domain.use_case

import com.romanmikhailenko.binlist.domain.model.Bin
import com.romanmikhailenko.binlist.domain.repository.BinRepository


class AddBinUseCase(
    private val repository: BinRepository
) {

    suspend operator fun invoke(bin: Bin) {
        repository.insertBin(bin)
    }
}