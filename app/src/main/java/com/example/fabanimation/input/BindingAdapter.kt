package com.example.fabanimation.input

import androidx.databinding.BindingAdapter
import com.google.android.material.textfield.TextInputEditText

@BindingAdapter("setCurrencyMask", "reduceDollarSymbol", requireAll = false)
fun TextInputEditText.setCurrencyMask(boolean: Boolean, reduce: Boolean) {
    if (boolean) {
        addCurrencyMask(reduce)
    }
}

@BindingAdapter("setHintSmallMask", "hintSize", requireAll = false)
fun TextInputEditText.setHintSmallMask(textSize: Int, hintSize: Int?) {
    if (textSize > 0) {
        addSmallHintMask(hintSize?.toFloat(), textSize.toFloat())
    }
}