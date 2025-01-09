package ru.nvgsoft.workaccounting.domain.directories.workers

import ru.nvgsoft.workaccounting.domain.WorkRepository

class DeleteWorkerUseCase(
    private val repository: WorkRepository
) {
    suspend fun deleteWorker(worker: Worker){
        repository.deleteWorker(worker)
    }
}