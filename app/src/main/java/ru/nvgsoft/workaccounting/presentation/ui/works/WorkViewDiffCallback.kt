package ru.nvgsoft.workaccounting.presentation.ui.works

import androidx.recyclerview.widget.DiffUtil
import ru.nvgsoft.workaccounting.domain.WorkView

class WorkViewDiffCallback: DiffUtil.ItemCallback<WorkView>() {
    override fun areItemsTheSame(oldItem: WorkView, newItem: WorkView): Boolean {
        return oldItem.workItem.id == newItem.workItem.id
    }

    override fun areContentsTheSame(oldItem: WorkView, newItem: WorkView): Boolean {
        return oldItem == newItem
    }
}