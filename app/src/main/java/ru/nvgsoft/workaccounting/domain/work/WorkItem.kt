package ru.nvgsoft.workaccounting.domain.work

data class WorkItem(
    val id: Int,
    val date: String,
    val counterpartyId: Int,
    val workDescription: String,
    val workerId: Int,
    val spendTime: Int
) {
}