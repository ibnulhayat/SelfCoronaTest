package com.getrentbd.selfcoronatest.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.getrentbd.selfcoronatest.R
import com.getrentbd.selfcoronatest.adapter.NormalVsCoronaAdapter
import com.getrentbd.selfcoronatest.modelClass.CreateQuestionList

class NormalvsCoronaActivity : AppCompatActivity() {
    private lateinit var rvNormalCorona: RecyclerView
    private lateinit var normalVsCoronaAdapter: NormalVsCoronaAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normalvs_corona)
    }

    override fun onStart() {
        super.onStart()
        val mToolbar: Toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(mToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        mToolbar.setNavigationOnClickListener { onBackPressed() }
        rvNormalCorona = findViewById<RecyclerView>(R.id.rvNormalCorona)
        val list = CreateQuestionList()
        rvNormalCorona.layoutManager = LinearLayoutManager(this)
        normalVsCoronaAdapter = NormalVsCoronaAdapter(this@NormalvsCoronaActivity, list.getNormalvsCoronas())
        rvNormalCorona.adapter = normalVsCoronaAdapter
        normalVsCoronaAdapter.notifyDataSetChanged()

    }
}