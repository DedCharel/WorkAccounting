package ru.nvgsoft.workaccounting.domain

class GetWorkItemUseCase(
    private val repository: WorkRepository
) {
    operator fun invoke(id: Int) = repository.getWorkItem(id)
}