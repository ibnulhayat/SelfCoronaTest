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
import com.getrentbd.selfcoronatest.modelClass.EmerInforList

class HospitalListAdapter(private var mContext: Context, private val postList: List<EmerInforList>) :
    RecyclerView.Adapter<HospitalListAdapter.ViewHolder?>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        mContext = viewGroup.context
        val view: View = LayoutInflater.from(mContext)
            .inflate(R.layout.corona_testing_list_view, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        val list: EmerInforList = postList[i]
        val name: String = list.name
        val location: String = list.location
        val phnNumber: String = list.phnNumber
        viewHolder.setView(name, location, phnNumber)

        //Item on Click
        viewHolder.itemView.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL)
            //callIntent.setType(ContactsContract.CommonDataKinds.Phone.NUMBER);
            callIntent.data = Uri.parse("tel:" + postList[i].phnNumber)
            mContext.startActivity(callIntent)
        }
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById<TextView>(R.id.tvName)
        var tvLocation: TextView = itemView.findViewById<TextView>(R.id.tvLocation)
        var tvContact: TextView = itemView.findViewById<TextView>(R.id.tvContact)
        fun setView(name: String?, location: String, phnNumber: String) {
            tvName.text = name
            tvLocation.visibility = View.VISIBLE
            tvLocation.text = " $location"
            tvContact.text = " $phnNumber"
            tvLocation.setCompoundDrawablesRelativeWithIntrinsicBounds(
                R.drawable.ic_location_red,
                0,
                0,
                0
            )
            tvContact.setCompoundDrawablesRelativeWithIntrinsicBounds(
                R.drawable.ic_call_red,
                0,
                0,
                0
            )
        }

    }

}