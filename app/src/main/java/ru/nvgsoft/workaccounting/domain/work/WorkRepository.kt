package ru.nvgsoft.workaccounting.domain.work

import androidx.lifecycle.LiveData

interface WorkRepository {

    suspend fun addWorkItem(workItem: WorkItem)

    suspend fun editWorkItem(workItem: WorkItem)

    suspend fun deleteWorkItem(workItem: WorkItem)

    suspend fun getWorkItem(workId: Int): WorkItem

    fun getWorkList(): LiveData<List<WorkView>>
}