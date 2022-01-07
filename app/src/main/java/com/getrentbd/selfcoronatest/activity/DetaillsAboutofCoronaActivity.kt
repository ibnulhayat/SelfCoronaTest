package com.getrentbd.selfcoronatest.activity

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.getrentbd.selfcoronatest.R

class DetaillsAboutofCoronaActivity : AppCompatActivity() {
    private lateinit var htmlUrl: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detaills_aboutof_corona)
        val mToolbar: Toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(mToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        mToolbar.setNavigationOnClickListener { onBackPressed() }
        val webView: WebView = findViewById<WebView>(R.id.webVIew)
        htmlUrl = intent.getStringExtra("url").toString()
        webView.loadUrl(htmlUrl)
    }
}