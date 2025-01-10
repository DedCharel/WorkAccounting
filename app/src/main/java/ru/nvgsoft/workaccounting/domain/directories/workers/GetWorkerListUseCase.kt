package ru.nvgsoft.workaccounting.domain.directories.workers

import androidx.lifecycle.LiveData
import ru.nvgsoft.workaccounting.domain.WorkRepository

class GetWorkerListUseCase(
    private val repository: WorkRepository
) {
    fun getWorkerList(): LiveData<List<Worker>>{
        return repository.getWorkerList()
    }
}