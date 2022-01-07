package com.getrentbd.selfcoronatest.activity

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.Layout
import android.text.Spanned
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.getrentbd.selfcoronatest.R

class AboutAppActivity : AppCompatActivity() {
    private val message = "করোনায় আক্রান্ত বিশ্ব, “পৃথিবী থমকে গেছে, থেমে গেছে সভ্যতার চাকা, " +
            "করোনার ভয়াল থাবায় থেমে গেছে গোটা বিশ্ব,থেমে গেছে উৎসব,হাসি-আনন্দ, চুপসে গেছে মানবজাতি, " +
            "তারপরও আমরা মানবজাতি অসচেতনতার মোড়কে আবৃত” কথা গুলো খুব নিষ্ঠুরতম সত্যকথা, বর্তমানে " +
            "সারাবিশ্বে নভেল করোনা ভাইরাস একটি আতঙ্কের নাম। এই আতঙ্ক গ্রাস করে রেখেছে সমগ্র মানবজাতিকে।" +
            " মূলত আমাদের অসচেতনতায় নভেল করোনা ভাইরাস বা COVID-19 বিশ্বে মহামারী আকার ধারণ করেছে। " +
            "আমাদের এই সুন্দর পৃথিবী আজ থমকে গেছে,এই থমকে থাকা পৃথিবী আবার সচল করতে আপনার, আমার," +
            " আমাদের সকলের সচেতনতা সবচেয়ে বেশি জরুরী। তাই মানুষের মধ্যে সচেতনতা বৃদ্ধি করতে আমাদের " +
            "<font color='#FF0000'> <b>" + "“DO GOOD 4 OTHER'S” " + "</b></font>" +
            " এর ছোট একটি প্রচেষ্টা। এই অ্যাপ্লিকেশনটি আপনাকে সচেতনতার পাশাপাশি " +
            "আপনার জ্বর বা সর্দিকাশি হলে কতটা গুরুত্বের সাথে আপনার চিকিৎসকের শরণাপন্ন হতে হবে তা বুঝতে " +
            "সহায়তা করবে। এই অ্যাপ্লিকেশনের মাধ্যমে আমরা করোনা ভাইরাস কি? এর লক্ষন কি? কিভাবে ছড়ায় " +
            "এসব সম্পর্কে কিছু ধারনা দেয়ার চেষ্টা করেছি এবং আমরা আমাদের সাধ্যমত চেষ্টা করেছি কিছু গুরুত্বপূর্ণ " +
            "ফোন নাম্বার ও হাসপাতালের তালিকা প্রদানের মাধ্যমে আপনাদের পাশে থাকার। যাতে করে কোনো আক্রান্ত " +
            "ব্যক্তি দ্রুত চিকিৎসকের শরণাপন্ন হতে পারে। সৃষ্টিকর্তা এই সুন্দর পৃথিবীতে আমাদেরকে প্রেরণ করেছেন। " +
            "তাই এই সুন্দর পৃথিবীকে সুন্দর রাখার দায়িত্ব আমার, আপনার, আমাদের সকলের। আসুন সবাই মিলে সচেতন " +
            "হই৷ মহামারী করোনা ভাইরাসের মোকাবেলা করি।" +
            "<br> <b>ঘরে থাকুন, নিরাপদে থাকুন, সবাইকে নিরাপদে রাখুন।" +
            "<br><br> -ধন্যবাদ। </b>"


    private var tvOtherHotline: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotline)
    }


    @SuppressLint("WrongConstant")
    override fun onStart() {
        super.onStart()

//        MobileAds.initialize(this,getString(R.string.initialize_Id));
//        AdView adView=findViewById(R.id.adView);
//        AdRequest adRequest=new AdRequest.Builder().build();
//        adView.loadAd(adRequest);
        val mToolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(mToolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        mToolbar.setNavigationOnClickListener { onBackPressed() }
        tvOtherHotline = findViewById(R.id.tvOtherHotline)
        val text = Html.fromHtml(message)
        tvOtherHotline!!.text = text
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            tvOtherHotline!!.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
        }
    }
}