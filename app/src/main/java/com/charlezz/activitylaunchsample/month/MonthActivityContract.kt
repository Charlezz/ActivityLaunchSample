package com.charlezz.activitylaunchsample.month

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract

class MonthActivityContract : ActivityResultContract<Int, String>() {

    override fun createIntent(context: Context, input: Int): Intent {
        val intent = Intent(context, MonthActivity::class.java)
        intent.putExtra("input", input)
        return intent
    }


    override fun parseResult(resultCode: Int, intent: Intent?): String? {
        return when (resultCode) {
            Activity.RESULT_OK -> intent?.getStringExtra("result")
            else -> null
        }
    }

}