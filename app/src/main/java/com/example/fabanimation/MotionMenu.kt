package com.example.fabanimation

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.lifecycle.lifecycleScope
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.coroutines.launch

class MotionMenu @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : MotionLayout(context, attrs, defStyleAttr) {

    private var fabMain: FloatingActionButton? = null
    private var menuIsOpen = false

    init {
        inflate(context, R.layout.motion_menu, this)
    }

    private fun openMenu() {
        setTransition(R.id.set_1, R.id.set_2)
        transitionToEnd()
    }

    private fun closeMenu() {
        transitionToStart()
    }

    override fun onFinishInflate() {
        fabMain = findViewById(R.id.fab)
        enableClicks()
        super.onFinishInflate()
    }

    private fun enableClicks() {
        fabMain?.setOnClickListener {
            if (menuIsOpen) {
                closeMenu()
            } else openMenu()
            menuIsOpen = !menuIsOpen
        }
    }

}