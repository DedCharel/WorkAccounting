package ru.nvgsoft.workaccounting.domain.work

import ru.nvgsoft.workaccounting.domain.WorkRepository

class GetWorkListUseCase(
    private val repository: WorkRepository
) {
    operator fun invoke() = repository.getWorkList()
}