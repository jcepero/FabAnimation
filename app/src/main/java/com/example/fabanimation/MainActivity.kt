package com.example.fabanimation

import android.animation.ObjectAnimator
import android.graphics.Path
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.PathInterpolator
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.fragment.app.FragmentManager
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(), MotionMenu.MenuListener {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<MotionMenu>(R.id.motion).setMenuListener(this)
    }

    override fun onSendClicked() {
        Toast.makeText(this, "Navigate to Send", Toast.LENGTH_SHORT).show()
    }

    override fun onReceiveClicked() {
        Toast.makeText(this, "Navigate to Receive", Toast.LENGTH_SHORT).show()
    }
}