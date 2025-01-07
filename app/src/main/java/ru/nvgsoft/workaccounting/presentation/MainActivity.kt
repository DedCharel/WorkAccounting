package ru.nvgsoft.workaccounting.presentation

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import ru.nvgsoft.workaccounting.R
import ru.nvgsoft.workaccounting.databinding.ActivityMainBinding
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController =findNavController(R.id.nav_host_fragment_activity_main)
//        val appBarConfiguration = AppBarConfiguration(
//            setOf(
//                R.id.navigation_works, R.id.navigation_directories, R.id.navigation_settings
//            )
//        )
        //setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

    }

//    private fun showDatePickerDialog() {
//        // Получаем текущую дату
//        val calendar = Calendar.getInstance()
//        val year = calendar.get(Calendar.YEAR)
//        val month = calendar.get(Calendar.MONTH)
//        val day = calendar.get(Calendar.DAY_OF_MONTH)
//
//        // Создаем и показываем диалог выбора даты
//        val datePickerDialog = DatePickerDialog(this, { _, selectedYear, selectedMonth, selectedDay ->
//            // Обновляем текстовое поле с выбранной датой
//            val selectedDate = "$selectedDay/${selectedMonth + 1}/$selectedYear" // Месяцы начинаются с 0
//            binding.tvData.text = selectedDate
//        }, year, month, day)
//
//        datePickerDialog.show()
//    }
}