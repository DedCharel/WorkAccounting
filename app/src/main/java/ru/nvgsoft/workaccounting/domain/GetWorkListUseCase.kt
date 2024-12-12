package ru.nvgsoft.workaccounting.domain

class GetWorkListUseCase(
    private val repository: WorkRepository
) {
    operator fun invoke() = repository.getWorkList()
}