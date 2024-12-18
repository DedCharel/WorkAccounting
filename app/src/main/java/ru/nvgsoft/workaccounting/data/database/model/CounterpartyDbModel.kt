package ru.nvgsoft.workaccounting.data.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "counterparties")
data class CounterpartyDbModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val inn: String
)
