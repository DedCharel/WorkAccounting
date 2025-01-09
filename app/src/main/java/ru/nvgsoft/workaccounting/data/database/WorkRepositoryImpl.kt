package ru.nvgsoft.workaccounting.data.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import ru.nvgsoft.workaccounting.domain.directories.workers.Worker
import ru.nvgsoft.workaccounting.domain.work.WorkItem
import ru.nvgsoft.workaccounting.domain.WorkRepository
import ru.nvgsoft.workaccounting.domain.directories.counerparty.Counterparty
import ru.nvgsoft.workaccounting.domain.work.WorkView

class WorkRepositoryImpl(
    private val workDao: WorkDao,
    private val mapper: WorkMapper
): WorkRepository {
    override suspend fun addWorkItem(workItem: WorkItem) {
        workDao.addWorkItem(mapper.mapWorkEntityToDbModel(workItem))
    }

    override suspend fun editWorkItem(workItem: WorkItem) {
        workDao.addWorkItem(mapper.mapWorkEntityToDbModel(workItem))
    }

    override suspend fun deleteWorkItem(workItem: WorkItem) {
        workDao.deleteWorkItem(workItem.id)
    }

    override suspend fun getWorkItem(workId: Int): WorkItem {
        return mapper.mapWorkDbModelToEntity(workDao.getWorkItem(workId))
    }

    override fun getWorkList(): LiveData<List<WorkView>>  = workDao.getWorkList()
        .map { mapper.mapListDbModelToListEntity(it) }

    //WorkerList
    //********************************************************

    override suspend fun addWorker(worker: Worker) {
        TODO("Not yet implemented")
    }

    override suspend fun editWorker(worker: Worker) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteWorker(worker: Worker) {
        TODO("Not yet implemented")
    }

    override suspend fun getWorker(workerId: Int): Worker {
        TODO("Not yet implemented")
    }

    override fun getWorkerList(): LiveData<List<Worker>> {
        TODO("Not yet implemented")
    }


    //CounterpartyList
    //********************************************************
    override suspend fun addCounterparty(counterparty: Counterparty) {
        TODO("Not yet implemented")
    }

    override suspend fun editCounterparty(counterparty: Counterparty) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteCounterParty(counterparty: Counterparty) {
        TODO("Not yet implemented")
    }

    override suspend fun getCounterparty(counterpartyId: Int): Counterparty {
        TODO("Not yet implemented")
    }

    override fun getCounterpartyList(): LiveData<List<Counterparty>> {
        TODO("Not yet implemented")
    }
}



