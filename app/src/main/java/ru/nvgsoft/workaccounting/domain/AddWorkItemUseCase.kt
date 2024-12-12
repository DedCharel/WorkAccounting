package ru.nvgsoft.workaccounting.domain

class AddWorkItemUseCase(
    private val repository: WorkRepository
) {
operator fun invoke(workItem: WorkItem) = repository.addWorkItem(workItem)
}