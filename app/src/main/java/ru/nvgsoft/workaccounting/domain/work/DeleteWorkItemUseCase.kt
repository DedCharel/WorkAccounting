package ru.nvgsoft.workaccounting.domain.work

import ru.nvgsoft.workaccounting.domain.WorkRepository

class DeleteWorkItemUseCase(
    private val repository: WorkRepository
) {

    suspend fun deleteWorkItem(workItem: WorkItem){
        repository.deleteWorkItem(workItem)
    }

}