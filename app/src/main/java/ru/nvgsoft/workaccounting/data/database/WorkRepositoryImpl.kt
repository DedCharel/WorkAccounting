package ru.nvgsoft.workaccounting.data.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import ru.nvgsoft.workaccounting.data.database.dao.WorkItemsDao
import ru.nvgsoft.workaccounting.domain.WorkItem
import ru.nvgsoft.workaccounting.domain.WorkRepository

class WorkRepositoryImpl(
    private val workItemsDao: WorkItemsDao,
    private val mapper: WorkItemMapper
): WorkRepository {
    override suspend fun addWorkItem(workItem: WorkItem) {
        workItemsDao.addWorkItem(mapper.mapEntityToDbModel(workItem))
    }

    override suspend fun editWorkItem(workItem: WorkItem) {
        workItemsDao.addWorkItem(mapper.mapEntityToDbModel(workItem))
    }

    override suspend fun deleteWorkItem(workItem: WorkItem) {
        workItemsDao.deleteWorkItem(workItem.id)
    }

    override suspend fun getWorkItem(workId: Int): WorkItem {
        return mapper.mupDbModelToEntity(workItemsDao.getWorkItem(workId))
    }

    override fun getWorkList(): LiveData<List<WorkItem>>  = workItemsDao.getWorkList()
        .map { mapper.mapListDbModelToListEntity(it) }
}



