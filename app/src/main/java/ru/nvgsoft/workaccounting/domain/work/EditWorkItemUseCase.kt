package ru.nvgsoft.workaccounting.domain.work

class EditWorkItemUseCase(
    private val repository: WorkRepository
) {
    suspend fun editWorkItem(workItem: WorkItem){
        repository.editWorkItem(workItem)
    }
}