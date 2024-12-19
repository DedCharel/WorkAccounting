package ru.nvgsoft.workaccounting.data.database

import ru.nvgsoft.workaccounting.data.database.model.CounterpartyDbModel
import ru.nvgsoft.workaccounting.data.database.model.WorkItemDbModel
import ru.nvgsoft.workaccounting.data.database.model.WorkViewDbModel
import ru.nvgsoft.workaccounting.data.database.model.WorkerDbModel
import ru.nvgsoft.workaccounting.domain.Counterparty
import ru.nvgsoft.workaccounting.domain.WorkItem
import ru.nvgsoft.workaccounting.domain.WorkView
import ru.nvgsoft.workaccounting.domain.Worker

class WorkItemMapper {

    fun mapWorkEntityToDbModel(workItem: WorkItem) = WorkItemDbModel(
        id = workItem.id,
        counterpartyId = workItem.counterpartyId,
        workDescription = workItem.workDescription,
        workerId = workItem.workerId,
        spendTime = workItem.spendTime
    )

    fun mapWorkDbModelToEntity(workItemDbModel: WorkItemDbModel) = WorkItem(
        id = workItemDbModel.id,
        counterpartyId = workItemDbModel.counterpartyId,
        workDescription = workItemDbModel.workDescription,
        workerId = workItemDbModel.workerId,
        spendTime = workItemDbModel.spendTime
    )

    fun mapCounterpartyDbModelToEntity(counterpartyDbModel: CounterpartyDbModel) = Counterparty(
        id = counterpartyDbModel.id,
        name = counterpartyDbModel.name,
        inn = counterpartyDbModel.inn
    )

    fun mapWorkerDbModelToEntity(workerDbModel: WorkerDbModel) = Worker(
        id = workerDbModel.id,
        name = workerDbModel.name
    )


    fun mapListDbModelToListEntity(list: List<WorkViewDbModel>) = list.map {
        WorkView(
            mapWorkDbModelToEntity(it.workItem),
            mapCounterpartyDbModelToEntity(it.counterparty),
            mapWorkerDbModelToEntity(it.worker)) }
}