package com.charlezz.activitylaunchsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.charlezz.activitylaunchsample.month.NumberActivity
import com.charlezz.activitylaunchsample.picture.PictureActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        findViewById<Button>(R.id.month).setOnClickListener {
            startActivity(Intent(this, NumberActivity::class.java))
        }

        findViewById<Button>(R.id.picture).setOnClickListener {
            startActivity(Intent(this, PictureActivity::class.java))
        }

    }
}
