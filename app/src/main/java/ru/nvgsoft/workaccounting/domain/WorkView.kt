package ru.nvgsoft.workaccounting.domain

data class WorkView(
    val workItem: WorkItem,
    val counterparty: Counterparty,
    val worker: Worker
)
