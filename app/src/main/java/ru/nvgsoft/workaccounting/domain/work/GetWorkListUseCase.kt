package ru.nvgsoft.workaccounting.domain.work

class GetWorkListUseCase(
    private val repository: WorkRepository
) {
    operator fun invoke() = repository.getWorkList()
}