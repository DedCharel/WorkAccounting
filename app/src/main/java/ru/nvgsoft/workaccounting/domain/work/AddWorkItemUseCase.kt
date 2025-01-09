package ru.nvgsoft.workaccounting.domain.work

import ru.nvgsoft.workaccounting.domain.WorkRepository

class AddWorkItemUseCase(
    private val repository: WorkRepository
) {
    suspend fun addWorkItem(workItem: WorkItem) {
        repository.addWorkItem(workItem)
    }

}