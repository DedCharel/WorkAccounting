package ru.nvgsoft.workaccounting.domain.directories.workers

import ru.nvgsoft.workaccounting.domain.WorkRepository

class GetWorkerListUseCase(
    private val repository: WorkRepository
) {
    fun getWorkerList(){
        repository.getWorkList()
    }
}