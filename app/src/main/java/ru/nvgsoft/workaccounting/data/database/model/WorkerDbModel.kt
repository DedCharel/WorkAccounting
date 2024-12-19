package ru.nvgsoft.workaccounting.data.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "workers")
data class WorkerDbModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String
)
