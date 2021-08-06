package com.example.fabanimation.input

import android.graphics.Typeface
import android.text.Editable
import android.text.Spannable
import android.text.SpannableString
import android.text.style.AbsoluteSizeSpan
import android.text.style.StyleSpan
import android.util.TypedValue
import android.widget.EditText
import java.text.NumberFormat

fun String?.removeCurrencyFormat() = this?.replace("\\D".toRegex(), emptyString())

fun EditText.addCurrencyMask(reduceDollarSymbol: Boolean) {
    addTextChangedListener(object : CustomTextWatcher() {
        private var current = emptyString()
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            if (s.toString() != current) {
                removeTextChangedListener(this)
                val cleanString = s.toString().removeCurrencyFormat().orEmpty()
                val parsed =
                    if (cleanString.isBlank()) Constants.ZERO_MONEY else cleanString.toDouble()
                val formatted = NumberFormat.getCurrencyInstance()
                    .format(parsed / Constants.INTEGER_DIVISOR)

                current = formatted
                setText(
                    if (reduceDollarSymbol) {
                        SpannableString(formatted).apply {
                            toSize(
                                text = Constants.DOLLAR,
                                textSize = Constants.SPAN_DOLLAR_SYMBOL_SIZE
                            )
                            toStyleBold(text = formatted)
                        }
                    } else {
                        formatted
                    }
                )
                setSelection(formatted.length)
                addTextChangedListener(this)
            }
        }
    })
}

fun EditText.addSmallHintMask(hintSize: Float?, textSize: Float) {
    addTextChangedListener(object : CustomTextWatcher() {
        override fun afterTextChanged(s: Editable?) {
            setTextSize(
                TypedValue.COMPLEX_UNIT_SP,
                if (s?.length ?: 0 > 0) {
                    textSize
                } else {
                    hintSize ?: Constants.HINT_DEFAULT_SIZE
                }
            )
        }
    })
}

fun SpannableString.toStyleBold(start: Int = Constants.ZERO, text: String) = this.apply {
    if (start < text.length) {
        setSpan(
            StyleSpan(Typeface.BOLD), start,
            text.length,
            Spannable.SPAN_INCLUSIVE_INCLUSIVE
        )
    }
}

fun SpannableString.toSize(start: Int = Constants.ZERO, text: String, textSize: Int) = this.apply {
    if (start < text.length) {
        setSpan(
            AbsoluteSizeSpan(textSize),
            start,
            text.length,
            Spannable.SPAN_INCLUSIVE_INCLUSIVE
        )
    }
}