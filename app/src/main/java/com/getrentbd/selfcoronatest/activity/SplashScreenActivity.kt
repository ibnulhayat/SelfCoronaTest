package com.getrentbd.selfcoronatest.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.WindowManager
import android.widget.TextView
import com.getrentbd.selfcoronatest.R
import android.content.pm.PackageManager

import android.content.pm.PackageInfo
import android.content.pm.PackageManager.NameNotFoundException


class SplashScreenActivity : AppCompatActivity() {
    var versionName: String? = null
    private var providedBy: String? = null
    private lateinit var tvVersion: TextView
    private lateinit var tvProvidedBy: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_splash_screen)

        tvVersion = findViewById(R.id.tvVersion)
        tvProvidedBy = findViewById(R.id.tvProvidedBy)

        providedBy = "Developed By: DG4O"
        try {
            val pInfo: PackageInfo = this.packageManager.getPackageInfo(this.packageName, 0)
            versionName = pInfo.versionName
        } catch (e: NameNotFoundException) {
            e.printStackTrace()
        }
        tvVersion.text = "V-1.1.$versionName"
        tvProvidedBy.text = providedBy
        Log.d("ALLDATA", "VersionName =$versionName")

        doWork()
    }
    private fun doWork() {
        Handler().postDelayed({
            startActivity(Intent(this, HomePageActivity::class.java))
            finish()
        }, 2000)
    }
}
