package ru.nvgsoft.workaccounting.data.database.model

import androidx.room.Embedded
import androidx.room.Relation

data class WorkViewDbModel(
    @Embedded val workItem: WorkItemDbModel,
    @Relation(
        parentColumn = "counterparty_id",
        entityColumn = "id"
    )
    val counterparty: CounterpartyDbModel,
    @Relation(
        parentColumn = "worker_id",
        entityColumn = "id"
    )
    val worker: WorkerDbModel
)
