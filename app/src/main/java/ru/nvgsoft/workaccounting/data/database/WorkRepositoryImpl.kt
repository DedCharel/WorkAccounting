package ru.nvgsoft.workaccounting.data.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import ru.nvgsoft.workaccounting.data.database.dao.WorkItemsDao
import ru.nvgsoft.workaccounting.domain.work.WorkItem
import ru.nvgsoft.workaccounting.domain.work.WorkRepository
import ru.nvgsoft.workaccounting.domain.work.WorkView

class WorkRepositoryImpl(
    private val workItemsDao: WorkItemsDao,
    private val mapper: WorkItemMapper
): WorkRepository {
    override suspend fun addWorkItem(workItem: WorkItem) {
        workItemsDao.addWorkItem(mapper.mapWorkEntityToDbModel(workItem))
    }

    override suspend fun editWorkItem(workItem: WorkItem) {
        workItemsDao.addWorkItem(mapper.mapWorkEntityToDbModel(workItem))
    }

    override suspend fun deleteWorkItem(workItem: WorkItem) {
        workItemsDao.deleteWorkItem(workItem.id)
    }

    override suspend fun getWorkItem(workId: Int): WorkItem {
        return mapper.mapWorkDbModelToEntity(workItemsDao.getWorkItem(workId))
    }

    override fun getWorkList(): LiveData<List<WorkView>>  = workItemsDao.getWorkList()
        .map { mapper.mapListDbModelToListEntity(it) }
}



