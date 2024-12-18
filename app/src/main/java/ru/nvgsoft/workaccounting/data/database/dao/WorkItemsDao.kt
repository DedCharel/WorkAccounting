package ru.nvgsoft.workaccounting.data.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ru.nvgsoft.workaccounting.data.database.model.WorkItemDbModel

@Dao
interface WorkItemsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addWorkItem(workItem: WorkItemDbModel)

    @Query("DELETE FROM work_items WHERE id=:workId")
    fun deleteWorkItem(workId: Int)

    @Query("SELECT * FROM work_items WHERE id=:workId LIMIT 1")
    fun getWorkItem(workId: Int): WorkItemDbModel

    @Query("SELECT * FROM  work_items")
    fun getWorkList(): LiveData<List<WorkItemDbModel>>
}