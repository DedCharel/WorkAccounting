package ru.nvgsoft.workaccounting.presentation.ui.directories.workers

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import ru.nvgsoft.workaccounting.data.database.WorkRepositoryImpl
import ru.nvgsoft.workaccounting.domain.directories.workers.GetWorkerListUseCase

class WorkerListViewModel(application: Application): AndroidViewModel(application) {

    val repository = WorkRepositoryImpl(application)

    val workerList = GetWorkerListUseCase(repository).getWorkerList()

}