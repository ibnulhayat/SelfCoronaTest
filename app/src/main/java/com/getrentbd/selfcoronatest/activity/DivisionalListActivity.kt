package com.getrentbd.selfcoronatest.activity

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.getrentbd.selfcoronatest.R

class DivisionalListActivity : AppCompatActivity() {
    private lateinit var tvDhakaDivision: TextView
    private lateinit var tvChitagong: TextView
    private lateinit var tvRajshahi: TextView
    private lateinit var tvKhulna: TextView
    private lateinit var tvBorishal: TextView
    private lateinit var tvSylhet: TextView
    private lateinit var tvRangpur: TextView
    private lateinit var tvMaymansing: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_divisional_list)
    }

    override fun onStart() {
        super.onStart()
        initComponents()
        val mToolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(mToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        mToolbar.setNavigationOnClickListener { onBackPressed() }
        tvDhakaDivision.setOnClickListener {
            val intent = Intent(this@DivisionalListActivity, HospitalListActivity::class.java)
            intent.putExtra("url", "dhk")
            startActivity(intent)
        }
        tvChitagong.setOnClickListener {
            val intent = Intent(this@DivisionalListActivity, HospitalListActivity::class.java)
            intent.putExtra("url", "chi")
            startActivity(intent)
        }
        tvRajshahi.setOnClickListener {
            val intent = Intent(this@DivisionalListActivity, HospitalListActivity::class.java)
            intent.putExtra("url", "raj")
            startActivity(intent)
        }
        tvKhulna.setOnClickListener {
            val intent = Intent(this@DivisionalListActivity, HospitalListActivity::class.java)
            intent.putExtra("url", "khu")
            startActivity(intent)
        }
        tvBorishal.setOnClickListener {
            val intent = Intent(this@DivisionalListActivity, HospitalListActivity::class.java)
            intent.putExtra("url", "bor")
            startActivity(intent)
        }
        tvSylhet.setOnClickListener {
            val intent = Intent(this@DivisionalListActivity, HospitalListActivity::class.java)
            intent.putExtra("url", "syl")
            startActivity(intent)
        }
        tvRangpur.setOnClickListener {
            val intent = Intent(this@DivisionalListActivity, HospitalListActivity::class.java)
            intent.putExtra("url", "ran")
            startActivity(intent)
        }
        tvMaymansing.setOnClickListener {
            val intent = Intent(this@DivisionalListActivity, HospitalListActivity::class.java)
            intent.putExtra("url", "mym")
            startActivity(intent)
        }

    }

    private fun initComponents() {
        tvDhakaDivision = findViewById(R.id.tvDhakaDivision)
        tvChitagong = findViewById(R.id.tvChitagong)
        tvRajshahi = findViewById(R.id.tvRajshahi)
        tvKhulna = findViewById(R.id.tvKhulna)
        tvBorishal = findViewById(R.id.tvBorishal)
        tvSylhet = findViewById(R.id.tvSylhet)
        tvRangpur = findViewById(R.id.tvRangpur)
        tvMaymansing = findViewById(R.id.tvMaymansing)
    }
}