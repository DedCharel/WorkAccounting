package ru.nvgsoft.workaccounting.presentation.ui.works

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ru.nvgsoft.workaccounting.R
import ru.nvgsoft.workaccounting.domain.WorkView

class WorkListAdapter() : ListAdapter<WorkView, WorkListAdapter.WorkViewHolder>(WorkViewDiffCallback()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.item_work, parent, false)
        return WorkViewHolder(view)
    }

    override fun onBindViewHolder(holder: WorkViewHolder, position: Int) {
        val work =getItem(position)
        with(holder){
            tvData.text = work.workItem.date
            tvCounterparty.text = work.counterparty.name
            tvWorker.text = work.worker.name
            tvTime.text = work.workItem.spendTime.toString()
        }


    }

    class WorkViewHolder(view: View): RecyclerView.ViewHolder(view){
        val tvData = view.findViewById<TextView>(R.id.tv_data)
        val tvCounterparty = view.findViewById<TextView>(R.id.tv_counterparty)
        val tvWorker = view.findViewById<TextView>(R.id.tv_worker)
        val tvTime = view.findViewById<TextView>(R.id.tv_time)
    }

}

