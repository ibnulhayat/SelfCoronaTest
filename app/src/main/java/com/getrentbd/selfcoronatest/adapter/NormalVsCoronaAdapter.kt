package com.getrentbd.selfcoronatest.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.getrentbd.selfcoronatest.R
import com.getrentbd.selfcoronatest.modelClass.NormalvsCorona

class NormalVsCoronaAdapter(private var mContext: Context, postList: List<NormalvsCorona>) :
    RecyclerView.Adapter<NormalVsCoronaAdapter.ViewHolder?>() {
    private val postList = postList
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        mContext = viewGroup.context
        val view: View =
            LayoutInflater.from(mContext).inflate(R.layout.normal_vs_corona_view, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        val list: NormalvsCorona = postList[i]
        val symptom: String = list.symptom
        val corona: String = list.corona
        val fever: String = list.coldFever
        val flu: String = list.flu
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvSymptom: TextView = itemView.findViewById(R.id.tvSymptom)
        var tvCoronaSymptom: TextView = itemView.findViewById(R.id.tvCoronaSymptom)
        var tvFeverSymptom: TextView = itemView.findViewById(R.id.tvFeverSymptom)
        var tvFluSymptom: TextView = itemView.findViewById(R.id.tvFluSymptom)
        fun setView(symptom: String?, corona: String?, fever: String?, flu: String?) {
            tvSymptom.text = symptom
            tvCoronaSymptom.text = corona
            tvFeverSymptom.text = fever
            tvFluSymptom.text = flu
        }

    }

}