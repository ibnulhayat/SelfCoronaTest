package com.getrentbd.selfcoronatest.activity

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.getrentbd.selfcoronatest.R
import com.getrentbd.selfcoronatest.adapter.HospitalListAdapter
import com.getrentbd.selfcoronatest.modelClass.CreateQuestionList
import com.getrentbd.selfcoronatest.modelClass.EmerInforList

class HospitalListActivity : AppCompatActivity() {
    private lateinit var rvHospitalList: RecyclerView
    private lateinit var hospitalListAdapter: HospitalListAdapter
    private lateinit var anyList: List<EmerInforList>
    private lateinit var devName: String
    private lateinit var textView3: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospital_list)
    }

    override fun onStart() {
        super.onStart()
        val mToolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(mToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        mToolbar.setNavigationOnClickListener { onBackPressed() }
        anyList = ArrayList()
        rvHospitalList = findViewById(R.id.rvHospitalList)
        textView3 = findViewById(R.id.textView3)
        val list = CreateQuestionList()
        devName = intent.getStringExtra("url").toString()
        val title: String = getString(R.string.coronaHospitalList)
        when (devName) {
            "dhk" -> {
                anyList = list.dhakaList
                textView3.text = "ঢাকার $title"
            }
            "chi" -> {
                anyList = list.chitagongList
                textView3.text = "চট্টগ্রামের $title"
            }
            "raj" -> {
                anyList = list.rajshahiList
                textView3.text = "রাজশাহীর $title"
            }
            "khu" -> {
                anyList = list.khulnaList
                textView3.text = "খুলনার $title"
            }
            "bor" -> {
                anyList = list.borishalList
                textView3.text = "বরিশালের $title"
            }
            "syl" -> {
                anyList = list.sylhetList
                textView3.text = "সিলেটের $title"
            }
            "ran" -> {
                anyList = list.rangpurList
                textView3.text = "রংপুরের $title"
            }
            else -> {
                anyList = list.maymansingList
                textView3.text = "ময়মনসিংহের $title"
            }
        }
        rvHospitalList.layoutManager = LinearLayoutManager(this)
        hospitalListAdapter = HospitalListAdapter(this@HospitalListActivity, anyList)
        rvHospitalList.adapter = hospitalListAdapter
        hospitalListAdapter.notifyDataSetChanged()


    }
}