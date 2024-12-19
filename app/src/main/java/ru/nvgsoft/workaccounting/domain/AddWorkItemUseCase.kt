package ru.nvgsoft.workaccounting.domain

class AddWorkItemUseCase(
    private val repository: WorkRepository
) {
    suspend fun addWorkItem(workItem: WorkItem) {
        repository.addWorkItem(workItem)
    }

}