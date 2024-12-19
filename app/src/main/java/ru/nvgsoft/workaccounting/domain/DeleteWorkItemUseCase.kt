package ru.nvgsoft.workaccounting.domain

class DeleteWorkItemUseCase(
    private val repository: WorkRepository
) {

    suspend fun deleteWorkItem(workItem: WorkItem){
        repository.deleteWorkItem(workItem)
    }

}