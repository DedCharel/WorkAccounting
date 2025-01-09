package ru.nvgsoft.workaccounting.domain.work

import ru.nvgsoft.workaccounting.domain.WorkRepository

class GetWorkItemUseCase(
    private val repository: WorkRepository
) {
    suspend fun getWorkItem(workId: Int): WorkItem{
        return repository.getWorkItem(workId)
    }
}