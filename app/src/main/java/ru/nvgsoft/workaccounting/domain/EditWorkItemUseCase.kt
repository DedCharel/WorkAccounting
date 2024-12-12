package ru.nvgsoft.workaccounting.domain

class EditWorkItemUseCase(
    private val repository: WorkRepository
) {
    operator fun invoke(workItem: WorkItem) = repository.editWorkItem(workItem)
}