package ru.nvgsoft.workaccounting.data.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import ru.nvgsoft.workaccounting.data.database.model.WorkItemDbModel
import ru.nvgsoft.workaccounting.data.database.model.WorkViewDbModel

@Dao
interface WorkItemsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addWorkItem(workItem: WorkItemDbModel)

    @Query("DELETE FROM work_items WHERE id=:workId")
    fun deleteWorkItem(workId: Int)

    @Query("SELECT * FROM work_items WHERE id=:workId LIMIT 1")
    fun getWorkItem(workId: Int): WorkItemDbModel

    @Transaction
    @Query("SELECT * FROM  work_items")
    fun getWorkList(): LiveData<List<WorkViewDbModel>>
}