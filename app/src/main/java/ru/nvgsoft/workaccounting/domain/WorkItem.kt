package ru.nvgsoft.workaccounting.domain

data class WorkItem(
    val id: Int,
    val counterpartyId: Int,
    val workDescription: String,
    val workerId: Int,
    val spendTime: Int
) {
}