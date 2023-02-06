package com.romanmikhailenko.binlist.data.data_source

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.romanmikhailenko.binlist.domain.model.Bin
import kotlinx.coroutines.flow.Flow

@Dao
interface BinDao {

    @Query("SELECT * FROM bin")
    fun getBins(): Flow<List<Bin>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBin(bin: Bin)
}