package ru.nvgsoft.workaccounting.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import ru.nvgsoft.workaccounting.data.database.model.CounterpartyDbModel
import ru.nvgsoft.workaccounting.data.database.model.WorkItemDbModel
import ru.nvgsoft.workaccounting.data.database.model.WorkViewDbModel
import ru.nvgsoft.workaccounting.data.database.model.WorkerDbModel

@Dao
interface WorkDao {
    //Work
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addWorkItem(workItem: WorkItemDbModel)

    @Query("DELETE FROM work_items WHERE id=:workId")
    fun deleteWorkItem(workId: Int)

    @Query("SELECT * FROM work_items WHERE id=:workId LIMIT 1")
    fun getWorkItem(workId: Int): WorkItemDbModel

    @Transaction
    @Query("SELECT * FROM  work_items")
    fun getWorkList(): LiveData<List<WorkViewDbModel>>


    //******************************************************************
    //Worker

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addWorker(worker: WorkerDbModel)

    @Query("DELETE FROM workers WHERE id=:workerId")
    fun deleteWorker(workerId: Int)

    @Query("SELECT * FROM workers WHERE id=:workerId LIMIT 1")
    fun getWorker(workerId: Int): WorkerDbModel

    @Query("SELECT * FROM  workers")
    fun getWorkerList(): LiveData<List<WorkerDbModel>>

    //******************************************************************
    //Counterparty

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addCounterparty(counterparty: CounterpartyDbModel)

    @Query("DELETE FROM counterparties WHERE id=:counterpartyId")
    fun deleteCounterparty(counterpartyId: Int)

    @Query("SELECT * FROM counterparties WHERE id=:counterpartyId LIMIT 1")
    fun getCounterparty(counterpartyId: Int): CounterpartyDbModel

    @Query("SELECT * FROM  counterparties")
    fun getCounterpartyList(): LiveData<List<CounterpartyDbModel>>
}