package ru.nvgsoft.workaccounting.domain.work

class DeleteWorkItemUseCase(
    private val repository: WorkRepository
) {

    suspend fun deleteWorkItem(workItem: WorkItem){
        repository.deleteWorkItem(workItem)
    }

}