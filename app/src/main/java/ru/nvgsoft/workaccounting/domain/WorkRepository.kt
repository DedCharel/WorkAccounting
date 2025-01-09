package ru.nvgsoft.workaccounting.domain

import androidx.lifecycle.LiveData
import ru.nvgsoft.workaccounting.domain.directories.counerparty.Counterparty
import ru.nvgsoft.workaccounting.domain.directories.workers.Worker
import ru.nvgsoft.workaccounting.domain.work.WorkItem
import ru.nvgsoft.workaccounting.domain.work.WorkView

interface WorkRepository {

    //WorkList
    //********************************************************
    suspend fun addWorkItem(workItem: WorkItem)

    suspend fun editWorkItem(workItem: WorkItem)

    suspend fun deleteWorkItem(workItem: WorkItem)

    suspend fun getWorkItem(workId: Int): WorkItem

    fun getWorkList(): LiveData<List<WorkView>>


    //WorkerList
    //********************************************************
    suspend fun addWorker(worker: Worker)

    suspend fun editWorker(worker: Worker)

    suspend fun deleteWorker(worker: Worker)

    suspend fun getWorker(workerId: Int): Worker

    fun getWorkerList(): LiveData<List<Worker>>

    //CounterpartyList
    //********************************************************
    suspend fun addCounterparty(counterparty: Counterparty)

    suspend fun editCounterparty(counterparty: Counterparty)

    suspend fun deleteCounterParty(counterparty: Counterparty)

    suspend fun getCounterparty(counterpartyId: Int): Counterparty

    fun getCounterpartyList(): LiveData<List<Counterparty>>
}