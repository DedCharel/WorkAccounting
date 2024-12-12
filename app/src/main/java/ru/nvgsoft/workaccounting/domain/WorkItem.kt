package ru.nvgsoft.workaccounting.domain

data class WorkItem(
    val id: Int,
    val counterparty: String,
    val workDescription: String,
    val worker: String,
    val spendTime: Int
) {
}