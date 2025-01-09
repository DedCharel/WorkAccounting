package ru.nvgsoft.workaccounting.domain.directories.workers

import ru.nvgsoft.workaccounting.domain.WorkRepository

class EditWorkerUseCase(
    private val repository: WorkRepository
) {
    suspend fun editWorker(worker: Worker){
        repository.editWorker(worker)
    }
}