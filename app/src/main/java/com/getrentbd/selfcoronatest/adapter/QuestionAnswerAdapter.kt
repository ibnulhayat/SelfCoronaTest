package com.getrentbd.selfcoronatest.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.getrentbd.selfcoronatest.R
import com.getrentbd.selfcoronatest.activity.DetaillsAboutofCoronaActivity
import com.getrentbd.selfcoronatest.activity.QuestionAnswerActivity
import com.getrentbd.selfcoronatest.modelClass.Question

class QuestionAnswerAdapter(
    private var mContext: Context,
    private val postList: List<Question>,
    result: List<String>
) : RecyclerView.Adapter<QuestionAnswerAdapter.ViewHolder?>() {
    private val correctResult = result
    private val userResult: MutableList<String> = ArrayList()
    private var sum = 0.0
    private val mark = 10.0
    private var value = 0
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        mContext = viewGroup.context
        val view: View = LayoutInflater.from(mContext).inflate(R.layout.question_view, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, @SuppressLint("RecyclerView") i: Int) {
        val list: Question = postList[i]
        val question: String = list.qusetion
        val optionA: String = list.optionA
        val optionB: String = list.optionB
        val optionC: String = list.optionC
        val optionD: String = list.optionD
        viewHolder.setView(question, optionA, optionB, optionC, optionD)

        //Item select
        viewHolder.tvOptionA.setOnClickListener {
            if (getvelue(i)) {
                userResult[value] = i.toString() + "A"
                //Toast.makeText(mContext, "replace A", Toast.LENGTH_SHORT).show();
            } else {
                userResult.add(i.toString() + "A")
                //Toast.makeText(mContext, "Add A", Toast.LENGTH_SHORT).show();
            }
            viewHolder.tvOptionA.background = getDrawable(R.drawable.select_option_view)
            viewHolder.tvOptionB.background = getDrawable(R.drawable.question_option_desing_view)
            viewHolder.tvOptionC.background = getDrawable(R.drawable.question_option_desing_view)
            viewHolder.tvOptionD.background = getDrawable(R.drawable.question_option_desing_view)
        }
        viewHolder.tvOptionB.setOnClickListener {
            if (getvelue(i)) {
                userResult[value] = i.toString() + "B"
                //Toast.makeText(mContext, "replace B", Toast.LENGTH_SHORT).show();
            } else {
                userResult.add(i.toString() + "B")
                //Toast.makeText(mContext, "Add B", Toast.LENGTH_SHORT).show();
            }
            viewHolder.tvOptionA.background = getDrawable(R.drawable.question_option_desing_view)
            viewHolder.tvOptionB.background = getDrawable(R.drawable.select_option_view)
            viewHolder.tvOptionC.background = getDrawable(R.drawable.question_option_desing_view)
            viewHolder.tvOptionD.background = getDrawable(R.drawable.question_option_desing_view)
        }
        viewHolder.tvOptionC.setOnClickListener {
            if (getvelue(i)) {
                userResult[value] = i.toString()+ "C"
                //Toast.makeText(mContext, "replace C", Toast.LENGTH_SHORT).show();
            } else {
                userResult.add(i.toString() + "C")
                //Toast.makeText(mContext, "Add C", Toast.LENGTH_SHORT).show();
            }
            viewHolder.tvOptionA.background = getDrawable(R.drawable.question_option_desing_view)
            viewHolder.tvOptionB.background = getDrawable(R.drawable.question_option_desing_view)
            viewHolder.tvOptionC.background = getDrawable(R.drawable.select_option_view)
            viewHolder.tvOptionD.background = getDrawable(R.drawable.question_option_desing_view)
        }
        viewHolder.tvOptionD.setOnClickListener {
            if (getvelue(i)) {
                userResult[value] = i.toString() + "D"
                //Toast.makeText(mContext, "replace D", Toast.LENGTH_SHORT).show();
            } else {
                userResult.add(i.toString() + "D")
                //Toast.makeText(mContext, "Add D", Toast.LENGTH_SHORT).show();
            }

            viewHolder.tvOptionA.background = getDrawable(R.drawable.question_option_desing_view)
            viewHolder.tvOptionB.background = getDrawable(R.drawable.question_option_desing_view)
            viewHolder.tvOptionC.background = getDrawable(R.drawable.question_option_desing_view)
            viewHolder.tvOptionD.background = getDrawable(R.drawable.select_option_view)
        }
        if (i == 9) {
            viewHolder.buttonResult.visibility = View.VISIBLE
        } else {
            viewHolder.buttonResult.visibility = View.GONE
        }
        viewHolder.buttonResult.setOnClickListener {
            if (userResult.size == correctResult.size) {
                for (st1 in userResult) {
                    for (st2 in correctResult) {
                        if (st1 == st2) {
                            sum += mark
                            //Log.e("SIZE", st1);
                        }
                    }
                }
                for (j in userResult.indices) {
                    when {
                        userResult[j] == "7C" -> {
                            sum += mark / 2
                            //Log.e("SIZE", userResult.get(j));
                        }
                        userResult[j] == "9A" -> {
                            sum += mark / 4
                            //Log.e("SIZE", userResult.get(j));
                        }
                        userResult[j] == "9B" -> {
                            sum += mark / 2
                            //Log.e("SIZE", userResult.get(j));
                        }
                    }
                }
                showDialog()
            } else {
                Toast.makeText(
                    mContext,
                    "অনুগ্রহ করে সবগুলো প্রশ্নের উত্তর দিন",
                    Toast.LENGTH_LONG
                ).show()
            }
            //Log.e("SIZE", sum+" == "+ userResult.size());
        }
    }

    private fun getvelue(j: Int): Boolean {
        var result = false
        value = -1
        if (userResult.size == 0) {
            result = false
        } else if (userResult.size > 0) {
            for (st in userResult) {
                when (st) {
                    j.toString() + "A" -> {
                        result = true
                    }
                    j.toString() + "B" -> {
                        result = true
                    }
                    j.toString() + "C" -> {
                        result = true
                    }
                    j.toString() + "D" -> {
                        result = true
                    }
                }
                value++
            }
        }
        return result
    }

    private fun getDrawable(drawable: Int): Drawable? {
        return ResourcesCompat.getDrawable(mContext.resources, drawable, null)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvQuestion: TextView = itemView.findViewById(R.id.tvQuestion)
        var tvOptionA: TextView = itemView.findViewById(R.id.tvOptionA)
        var tvOptionB: TextView = itemView.findViewById(R.id.tvOptionB)
        var tvOptionC: TextView = itemView.findViewById(R.id.tvOptionC)
        var tvOptionD: TextView = itemView.findViewById(R.id.tvOptionD)
        var mainView: LinearLayout = itemView.findViewById(R.id.mainView)
        var layoutSecond: LinearLayout = itemView.findViewById(R.id.layoutSecond)
        var buttonResult: Button = itemView.findViewById(R.id.buttonResult)
        fun setView(
            question: String?, optionA: String?, optionB: String?,
            optionC: String, optionD: String
        ) {
            tvQuestion.text = question
            tvOptionA.text = optionA
            tvOptionB.text = optionB
            tvOptionC.text = optionC
            tvOptionD.text = optionD
            if (optionC == "0" && optionD == "0") {
                layoutSecond.visibility = View.GONE
            } else {
                layoutSecond.visibility = View.VISIBLE
                if (optionD == "0") {
                    tvOptionD.visibility = View.GONE
                }
            }
        }

    }

    private fun showDialog() {
        val dialog = Dialog(mContext)
        dialog.setContentView(R.layout.show_result_dialog)
        dialog.window?.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
        val tvMessage: TextView = dialog.findViewById(R.id.tvMessage)
        val tvMessage2: TextView = dialog.findViewById(R.id.tvMessage2)
        val tvResult: TextView = dialog.findViewById(R.id.tvResult)
        val okButton: Button = dialog.findViewById(R.id.okButton)
        val result: String
        val advise: String
        val message: String = mContext.resources.getString(R.string.message)
        if (sum < 35) {
            result = mContext.getString(R.string.low)
            advise = mContext.getString(R.string.message_one)
            tvResult.text = Html.fromHtml(result)
            tvMessage.text = "$advise\n \n$message"
            tvMessage2.text = "*** করোনা সংক্রমণ ঠেকাতে কি কি করণীয়? নিজেও সচেতন হই অন্যকেও সচেতন করি,এই সম্পর্কে জানতে ক্লিক করুন লিখাটিতে"
            tvMessage2.setOnClickListener {
                val intent = Intent(mContext, DetaillsAboutofCoronaActivity::class.java)
                intent.putExtra("url", "file:///android_res/raw/four.html")
                mContext.startActivity(intent)
                (mContext as Activity).finish()
            }
        } else if (sum > 35 && sum < 75) {
            result = mContext.getString(R.string.normal)
            advise = mContext.getString(R.string.message_two)
            tvResult.text = Html.fromHtml(result)
            tvMessage.text = "$advise\n \n$message"
            tvMessage2.text = "*** এই অবস্থায় কি কি করণীয় জানতে ক্লিক করুন লিখাটিতে"
            tvMessage2.setOnClickListener {
                val intent = Intent(mContext, DetaillsAboutofCoronaActivity::class.java)
                intent.putExtra("url", "file:///android_res/raw/five.html")
                mContext.startActivity(intent)
                (mContext as Activity).finish()
            }
        } else {
            result = mContext.getString(R.string.high)
            advise = mContext.getString(R.string.message_three)
            tvResult.text = result
            tvMessage.text = advise
            tvMessage2.visibility = View.GONE
        }


        // dialog ok button
        okButton.setOnClickListener {
            mContext.startActivity(Intent(mContext, QuestionAnswerActivity::class.java))
            (mContext as Activity).finish()
        }
        dialog.show()
    }

}