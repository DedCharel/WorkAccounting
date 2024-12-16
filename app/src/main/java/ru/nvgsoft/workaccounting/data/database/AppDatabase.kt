package ru.nvgsoft.workaccounting.data.database

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ru.nvgsoft.workaccounting.data.database.dao.WorkListDao
import ru.nvgsoft.workaccounting.data.database.model.CounterpartyDbModel
import ru.nvgsoft.workaccounting.data.database.model.WorkItemDbModel
import ru.nvgsoft.workaccounting.data.database.model.WorkerDbModel

@Database(
    entities = [
        WorkItemDbModel::class,
        WorkerDbModel::class,
        CounterpartyDbModel::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun workDao(): WorkListDao

    companion object {
        private var INSTANCE: AppDatabase? = null
        private val LOCK = Any()
        private const val DB_NAME = "work_item.dp"

        fun getInstance(application: Application): AppDatabase {
            INSTANCE?.let {
                return it
            }
            synchronized(LOCK) {
                INSTANCE?.let {
                    return it
                }
                val db = Room.databaseBuilder(
                    application,
                    AppDatabase::class.java,
                    DB_NAME
                ).build()
                INSTANCE = db
                return db
            }
        }
    }
}