package ru.nvgsoft.workaccounting.domain

class EditWorkItemUseCase(
    private val repository: WorkRepository
) {
    suspend fun editWorkItem(workItem: WorkItem){
        repository.editWorkItem(workItem)
    }
}