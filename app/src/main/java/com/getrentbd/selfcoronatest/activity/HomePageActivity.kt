package com.getrentbd.selfcoronatest.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.getrentbd.selfcoronatest.R

class HomePageActivity : AppCompatActivity() {

    private lateinit var layoutQuestionAnswer: LinearLayout
    private lateinit var layoutHospital: LinearLayout
    private lateinit var layoutNormalVsCorona: LinearLayout
    private lateinit var layoutAboutOfCorona: LinearLayout
    private lateinit var layoutAboutApp: LinearLayout
    private lateinit var layoutOne: LinearLayout
    private lateinit var layoutTwo: LinearLayout
    private lateinit var layoutThree: LinearLayout
    private lateinit var layoutFour: LinearLayout
    private lateinit var layoutFive: LinearLayout
    private val one = "333"
    private val two = "16263"
    private val three = "10655"
    private val four = "09611677777"
    private val five = "109"

    private lateinit var layoutRating: LinearLayout
    private lateinit var tvShareApps: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
    }

    override fun onStart() {
        super.onStart()
        initComponents()
        allButtonOnClick()
        val mToolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(mToolbar)
    }

    private fun allButtonOnClick() {
        layoutQuestionAnswer.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    this,
                    QuestionAnswerActivity::class.java
                )
            )
        })
        layoutAboutOfCorona.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    this,
                    AboutOfCoronaActivity::class.java
                )
            )
        })
        layoutAboutApp.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    this,
                    AboutAppActivity::class.java
                )
            )
        })
        layoutNormalVsCorona.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    this,
                    NormalvsCoronaActivity::class.java
                )
            )
        })
        layoutHospital.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    this,
                    DivisionalListActivity::class.java
                )
            )
        })
        layoutOne.setOnClickListener(View.OnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.data = Uri.parse("tel:$one")
            startActivity(callIntent)
        })
        layoutTwo.setOnClickListener(View.OnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.data = Uri.parse("tel:$two")
            startActivity(callIntent)
        })
        layoutThree.setOnClickListener(View.OnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.data = Uri.parse("tel:$three")
            startActivity(callIntent)
        })
        layoutFour.setOnClickListener(View.OnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.data = Uri.parse("tel:$four")
            startActivity(callIntent)
        })
        layoutFive.setOnClickListener(View.OnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.data = Uri.parse("tel:$five")
            startActivity(callIntent)
        })
        layoutRating.setOnClickListener(View.OnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse("https://play.google.com/store/app/details?id=$packageName")
            startActivity(intent)
        })
        tvShareApps.setOnClickListener(View.OnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.type = "text/plain"
            val sBody = "https://play.google.com/store/app/details?id=$packageName"
            val sSubject = "App Link"
            intent.putExtra(Intent.EXTRA_SUBJECT, sSubject)
            intent.putExtra(Intent.EXTRA_TEXT, sBody)
            startActivity(Intent.createChooser(intent, "Share apk link:"))
        })
    }

    private fun initComponents() {
        layoutQuestionAnswer = findViewById(R.id.layoutQuestionAnswer)
        layoutHospital = findViewById(R.id.layoutHospital)
        layoutNormalVsCorona = findViewById(R.id.layoutNormalVsCorona)
        layoutAboutOfCorona = findViewById(R.id.layoutAboutOfCorona)
        layoutAboutApp = findViewById(R.id.layoutAboutApp)
        layoutOne = findViewById(R.id.layoutOne)
        layoutTwo = findViewById(R.id.layoutTwo)
        layoutThree = findViewById(R.id.layoutThree)
        layoutFour = findViewById(R.id.layoutFour)
        layoutFive = findViewById(R.id.layoutFive)
        layoutRating = findViewById(R.id.layoutRating)
        tvShareApps = findViewById(R.id.tvShareApps)
    }

}