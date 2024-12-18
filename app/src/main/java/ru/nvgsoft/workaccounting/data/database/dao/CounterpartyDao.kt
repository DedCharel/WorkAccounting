package ru.nvgsoft.workaccounting.data.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ru.nvgsoft.workaccounting.data.database.model.CounterpartyDbModel

@Dao
interface CounterpartyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addCounterparty(counterparty: CounterpartyDbModel)

    @Query("DELETE FROM counterparties WHERE id=:counterpartyId")
    fun deleteCounterparty(counterpartyId: Int)

    @Query("SELECT * FROM counterparties WHERE id=:counterpartyId LIMIT 1")
    fun getCounterparty(counterpartyId: Int): CounterpartyDbModel

    @Query("SELECT * FROM  counterparties")
    fun getCounterpartyList(): LiveData<List<CounterpartyDbModel>>
}