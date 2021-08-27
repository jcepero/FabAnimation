package com.example.fabanimation

import android.content.Context
import android.media.Image
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.lifecycle.lifecycleScope
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.coroutines.launch

class MotionMenu @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : MotionLayout(context, attrs, defStyleAttr) {

    private var menuListener: MenuListener? = null
    private var fabMain: FloatingActionButton? = null
    private var fabSend: ImageView? = null
    private var fabReceive: ImageView? = null
    private var overlay: FrameLayout? = null
    private var menuIsOpen = false
    private var btnClicked = BTNCLICKED.NONE

    private val transitionListener = object : TransitionListener {
        override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
            //
        }

        override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
            //
        }

        override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
            when(btnClicked){
                BTNCLICKED.SEND -> {
                    btnClicked = BTNCLICKED.NONE
                    menuListener?.onSendClicked()
                }
                BTNCLICKED.RECEIVE -> {
                    btnClicked = BTNCLICKED.NONE
                    menuListener?.onReceiveClicked()
                }
                else -> {}
            }
        }

        override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
            //
        }

    }

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

    fun setMenuListener(menuListener: MenuListener) {
        this.menuListener = menuListener
    }

    override fun onFinishInflate() {
        fabMain = findViewById(R.id.fab)
        fabSend = findViewById(R.id.fab_1)
        fabReceive = findViewById(R.id.fab_2)
        overlay = findViewById(R.id.overlay)
        addTransitionListener(transitionListener)
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

        overlay?.setOnClickListener {
            if (menuIsOpen) {
                closeMenu()
                menuIsOpen = !menuIsOpen
            }
        }

        fabSend?.setOnClickListener {
            if (menuIsOpen) {
                btnClicked = BTNCLICKED.SEND
                closeMenu()
                menuIsOpen = !menuIsOpen
            }
        }

        fabReceive?.setOnClickListener {
            if (menuIsOpen) {
                btnClicked = BTNCLICKED.RECEIVE
                closeMenu()
                menuIsOpen = !menuIsOpen
            }
        }
    }

    private enum class BTNCLICKED {
        SEND, RECEIVE, NONE
    }

    interface MenuListener {
        fun onSendClicked()
        fun onReceiveClicked()
    }
}