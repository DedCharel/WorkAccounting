package ru.nvgsoft.workaccounting.domain.directories.workers

import ru.nvgsoft.workaccounting.domain.WorkRepository

class GetWorkerUseCase(
    private val repository: WorkRepository
) {
    operator fun invoke() = repository.getWorkerList()
}