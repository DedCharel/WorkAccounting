package ru.nvgsoft.workaccounting.domain

class DeleteWorkItemUseCase(
    private val repository: WorkRepository
) {
    operator fun invoke(workItem: WorkItem) = repository.deleteWorkItem(workItem)
}