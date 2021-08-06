package com.example.fabanimation.input

import android.text.Editable
import android.text.TextWatcher

@Suppress("EmptyFunctionBlock")
abstract class CustomTextWatcher : TextWatcher {

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }

    override fun afterTextChanged(s: Editable?) { }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) { }
}
