package ru.nvgsoft.workaccounting.data.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ru.nvgsoft.workaccounting.data.database.model.WorkItemDbModel
import ru.nvgsoft.workaccounting.data.database.model.WorkerDbModel

@Dao
interface WorkerDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addWorker(worker: WorkerDbModel)

    @Query("DELETE FROM workers WHERE id=:workerId")
    fun deleteWorker(workerId: Int)

    @Query("SELECT * FROM workers WHERE id=:workerId LIMIT 1")
    fun getWorker(workerId: Int): WorkerDbModel

    @Query("SELECT * FROM  workers")
    fun getWorkerList(): LiveData<List<WorkerDbModel>>

}