package com.ags.crazyfeed.ui.base_screen

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
    }

    fun applyWindowInsets(
        view: View,
        applyLeft: Boolean = true,
        applyTop: Boolean = true,
        applyRight: Boolean = true,
        applyBottom: Boolean = true
    ) {
        ViewCompat.setOnApplyWindowInsetsListener(view) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())

            val left = if (applyLeft) systemBars.left else 0
            val top = if (applyTop) systemBars.top else 0
            val right = if (applyRight) systemBars.right else 0
            val bottom = if (applyBottom) systemBars.bottom else 0

            v.setPadding(left, top, right, bottom)
            insets
        }

        // Request apply insets in case the view is already attached
        ViewCompat.requestApplyInsets(view)
    }
}