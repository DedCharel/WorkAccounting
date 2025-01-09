package ru.nvgsoft.workaccounting.domain.directories.workers

import ru.nvgsoft.workaccounting.domain.WorkRepository

class AddWorkerUseCase(
    private val repository: WorkRepository
) {
    suspend fun addWorker(worker: Worker){
        repository.addWorker(worker)
    }
}