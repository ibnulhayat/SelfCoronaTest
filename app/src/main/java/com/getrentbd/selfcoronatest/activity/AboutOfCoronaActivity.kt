package com.getrentbd.selfcoronatest.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.getrentbd.selfcoronatest.R

class AboutOfCoronaActivity : AppCompatActivity() {
    private lateinit var tvAboutCorona: TextView
    private lateinit var tvSymptoms: TextView
    private lateinit var tvSpreads: TextView
    private lateinit var tvCoronaInfection: TextView
    private lateinit var tvIllToDO: TextView
    private lateinit var tvRumors: TextView
    private lateinit var tvTest: TextView
    private lateinit var tvSuggestions: TextView
    private lateinit var tvGovtBD: TextView
    private lateinit var tvInformation: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_of_corona)
    }

    override fun onStart() {
        super.onStart()
        initComponents()
        textViewOnClick()
        val mToolbar: Toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(mToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        mToolbar.setNavigationOnClickListener { onBackPressed() }

    }

    private fun textViewOnClick() {
        tvAboutCorona.setOnClickListener {
            val intent =
                Intent(this, DetaillsAboutofCoronaActivity::class.java)
            intent.putExtra("url", "file:///android_res/raw/whataboutcorona.html")
            startActivity(intent)
        }
        tvSymptoms.setOnClickListener {
            val intent =
                Intent(this, DetaillsAboutofCoronaActivity::class.java)
            intent.putExtra("url", "file:///android_res/raw/symptomeofcorona.html")
            startActivity(intent)
        }
        tvSpreads.setOnClickListener {
            val intent =
                Intent(this, DetaillsAboutofCoronaActivity::class.java)
            intent.putExtra("url", "file:///android_res/raw/spreads_of_corona.html")
            startActivity(intent)
        }
        tvCoronaInfection.setOnClickListener {
            val intent =
                Intent(this, DetaillsAboutofCoronaActivity::class.java)
            intent.putExtra("url", "file:///android_res/raw/four.html")
            startActivity(intent)
        }
        tvIllToDO.setOnClickListener {
            val intent =
                Intent(this, DetaillsAboutofCoronaActivity::class.java)
            intent.putExtra("url", "file:///android_res/raw/five.html")
            startActivity(intent)
        }
        tvRumors.setOnClickListener {
            val intent =
                Intent(this, DetaillsAboutofCoronaActivity::class.java)
            intent.putExtra("url", "file:///android_res/raw/six.html")
            startActivity(intent)
        }
        tvTest.setOnClickListener {
            val intent =
                Intent(this, DetaillsAboutofCoronaActivity::class.java)
            intent.putExtra("url", "file:///android_res/raw/seven.html")
            startActivity(intent)
        }
        tvSuggestions.setOnClickListener {
            val intent =
                Intent(this, DetaillsAboutofCoronaActivity::class.java)
            intent.putExtra("url", "file:///android_res/raw/eight.html")
            startActivity(intent)
        }
        tvGovtBD.setOnClickListener {
            val intent =
                Intent(this, DetaillsAboutofCoronaActivity::class.java)
            intent.putExtra("url", "file:///android_res/raw/nine.html")
            startActivity(intent)
        }
        tvInformation.setOnClickListener {
            val intent =
                Intent(this, DetaillsAboutofCoronaActivity::class.java)
            intent.putExtra("url", "file:///android_res/raw/ten.html")
            startActivity(intent)
        }
    }

    private fun initComponents() {
        tvAboutCorona = findViewById<TextView>(R.id.tvAboutCorona)
        tvSymptoms = findViewById<TextView>(R.id.tvSymptoms)
        tvSpreads = findViewById<TextView>(R.id.tvSpreads)
        tvCoronaInfection = findViewById<TextView>(R.id.tvCoronaInfection)
        tvIllToDO = findViewById<TextView>(R.id.tvIllToDO)
        tvRumors = findViewById<TextView>(R.id.tvRumors)
        tvTest = findViewById<TextView>(R.id.tvTest)
        tvSuggestions = findViewById<TextView>(R.id.tvSuggestions)
        tvGovtBD = findViewById<TextView>(R.id.tvGovtBD)
        tvInformation = findViewById<TextView>(R.id.tvInformation)
    }
}