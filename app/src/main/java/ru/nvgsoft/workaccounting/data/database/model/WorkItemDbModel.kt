package ru.nvgsoft.workaccounting.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "work_items",
    foreignKeys = [
        ForeignKey(
            entity = CounterpartyDbModel::class,
            parentColumns = ["id"],
            childColumns = ["counterparty_id"]
        ),
        ForeignKey(
            entity = WorkerDbModel::class,
            parentColumns = ["id"],
            childColumns = ["worker_id"]
        )
    ]
)
data class WorkItemDbModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "counterparty_id") val counterpartyId: Int,
    @ColumnInfo(name = "work_description") val workDescription: String,
    @ColumnInfo(name = "worker_id") val workerId: Int,
    @ColumnInfo(name = "spend_time") val spendTime: Int
)
