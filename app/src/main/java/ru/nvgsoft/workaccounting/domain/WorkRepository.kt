package ru.nvgsoft.workaccounting.domain

interface WorkRepository {

    fun addWorkItem(workItem: WorkItem)

    fun editWorkItem(workItem: WorkItem)

    fun deleteWorkItem(workItem: WorkItem)

    fun getWorkItem(id: Int): WorkItem

    fun getWorkList(): List<WorkItem>
}