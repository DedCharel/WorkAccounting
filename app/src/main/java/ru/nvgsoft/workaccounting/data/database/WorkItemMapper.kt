package ru.nvgsoft.workaccounting.data.database

import ru.nvgsoft.workaccounting.data.database.model.WorkItemDbModel
import ru.nvgsoft.workaccounting.domain.WorkItem

class WorkItemMapper {

    fun mapEntityToDbModel(workItem: WorkItem) = WorkItemDbModel(
        id = workItem.id,
        counterpartyId = workItem.counterpartyId,
        workDescription = workItem.workDescription,
        workerId = workItem.workerId,
        spendTime = workItem.spendTime
    )

    fun mupDbModelToEntity(workItemDbModel: WorkItemDbModel) = WorkItem(
        id = workItemDbModel.id,
        counterpartyId = workItemDbModel.counterpartyId,
        workDescription = workItemDbModel.workDescription,
        workerId = workItemDbModel.workerId,
        spendTime = workItemDbModel.spendTime
    )

    fun mapListDbModelToListEntity(list: List<WorkItemDbModel>) = list.map { mupDbModelToEntity(it) }
}