package ru.nvgsoft.workaccounting.domain.work

import ru.nvgsoft.workaccounting.domain.directories.counerparty.Counterparty
import ru.nvgsoft.workaccounting.domain.directories.workers.Worker

data class WorkView(
    val workItem: WorkItem,
    val counterparty: Counterparty,
    val worker: Worker
)
