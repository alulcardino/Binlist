package com.romanmikhailenko.binlist.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.romanmikhailenko.binlist.domain.model.Bin

@Database(
    entities = [Bin::class],
    version = 3,
    exportSchema = false
)
abstract class BinListDatabase : RoomDatabase() {
    abstract val binDao: BinDao

    companion object {
        const val DATABASE_NAME = "bin_db"
    }
}