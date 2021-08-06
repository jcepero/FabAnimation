package com.example.fabanimation

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.text.Spannable
import android.text.SpannableString
import android.text.TextWatcher
import android.text.style.AbsoluteSizeSpan
import android.text.style.StyleSpan
import android.util.TypedValue
import android.view.Gravity
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatEditText
import androidx.databinding.DataBindingUtil
import com.example.fabanimation.databinding.ActivityInputBinding
import com.example.fabanimation.input.OtherActivity
import com.google.android.material.progressindicator.CircularProgressIndicator
import com.google.android.material.textfield.TextInputEditText
import java.text.NumberFormat

const val ZERO_MONEY = 0.00

class InputActivity : AppCompatActivity() {

    private val dialog: AlertDialog by lazy {
        AlertDialog.Builder(this).apply {
            setView(CircularProgressIndicator(this@InputActivity).apply {
                isIndeterminate = true
            })
        }.create()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityInputBinding>(this, R.layout.activity_input)

    }

    fun showActivity(v: View) {
        startActivity(Intent(this, OtherActivity::class.java))
    }

    fun simulateLoading(v: View) {
        showHidePopup(true)
        Handler(Looper.myLooper()!!).postDelayed({
            showHidePopup(false)
        }, 2000)
    }

    private fun showHidePopup(show: Boolean) {
        if (show) dialog.show() else dialog.dismiss()
    }
}
