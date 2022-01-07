package com.getrentbd.selfcoronatest.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.getrentbd.selfcoronatest.R
import com.getrentbd.selfcoronatest.adapter.QuestionAnswerAdapter
import com.getrentbd.selfcoronatest.modelClass.CreateQuestionList
import com.getrentbd.selfcoronatest.modelClass.Question

class QuestionAnswerActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var questionAnswerAdapter: QuestionAnswerAdapter
    private var questionList: List<Question> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_answer)
    }

    override fun onStart() {
        super.onStart()
        val mToolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(mToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        mToolbar.setNavigationOnClickListener { onBackPressed() }
        recyclerView = findViewById(R.id.recyclerView)
        val list = CreateQuestionList()
        questionList = list.qusetionList
        recyclerView.layoutManager = LinearLayoutManager(this)
        questionAnswerAdapter = QuestionAnswerAdapter(this, questionList, list.getResult())
        recyclerView.adapter = questionAnswerAdapter
        questionAnswerAdapter.notifyDataSetChanged()

    }
}