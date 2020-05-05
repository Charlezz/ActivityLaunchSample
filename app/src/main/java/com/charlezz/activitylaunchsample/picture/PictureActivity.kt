package com.charlezz.activitylaunchsample.picture

import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.os.EnvironmentCompat
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.charlezz.activitylaunchsample.R
import java.io.File
import java.util.jar.Manifest

class PictureActivity : AppCompatActivity() {

    lateinit var image: ImageView

    private val launcher =
        registerForActivityResult(ActivityResultContracts.GetContent()) { result: Uri? ->
            Glide.with(image).load(result).into(image)
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture)
        image = findViewById(R.id.image)
        findViewById<Button>(R.id.choose).setOnClickListener {
            launcher.launch("image/*")
        }
    }
}
