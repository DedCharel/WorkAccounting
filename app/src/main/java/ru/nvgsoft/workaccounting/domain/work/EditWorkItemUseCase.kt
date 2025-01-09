package ru.nvgsoft.workaccounting.domain.work

import ru.nvgsoft.workaccounting.domain.WorkRepository

class EditWorkItemUseCase(
    private val repository: WorkRepository
) {
    suspend fun editWorkItem(workItem: WorkItem){
        repository.editWorkItem(workItem)
    }
}