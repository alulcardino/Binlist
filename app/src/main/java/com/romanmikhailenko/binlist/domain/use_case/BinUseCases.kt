package com.romanmikhailenko.binlist.domain.use_case


data class BinUseCases(
    val getBinList: GetBinListUseCase,
    val addBin: AddBinUseCase,
    val getBin: GetBinUseCase
)