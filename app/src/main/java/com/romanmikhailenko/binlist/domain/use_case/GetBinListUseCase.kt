package com.romanmikhailenko.binlist.domain.use_case

import com.romanmikhailenko.binlist.domain.repository.BinRepository


class GetBinListUseCase(
    private val repository: BinRepository
) {

    operator fun invoke() = repository.getBinsFromRoom()
}