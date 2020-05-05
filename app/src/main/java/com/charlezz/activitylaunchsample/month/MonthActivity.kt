package com.charlezz.activitylaunchsample.month

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.charlezz.activitylaunchsample.R

class MonthActivity : AppCompatActivity() {

    lateinit var btn : TextView
    lateinit var month : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_month)
        btn = findViewById(R.id.btn)
        month = findViewById(R.id.month)

        month.text = when(intent.getIntExtra("input", 0)){
            1->"January"
            2->"February"
            3->"March"
            4->"April"
            5->"May"
            6->"June"
            7->"July"
            8->"August"
            9->"September"
            10->"October"
            11->"November"
            12->"December"
            else->"?"
        }

        btn.setOnClickListener {
            setResult(Activity.RESULT_OK, Intent().apply { putExtra("result", month.text.toString()) })
            finish()
        }
    }
}
