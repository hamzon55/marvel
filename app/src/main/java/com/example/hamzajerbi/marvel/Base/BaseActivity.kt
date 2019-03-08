package com.example.hamzajerbi.marvel.Base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.AlphaAnimation
import android.widget.RelativeLayout
import com.example.hamzajerbi.marvel.R

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }

    fun displayWaiting() {
        val progressBarHolder = findViewById(R.id.waiting) as? RelativeLayout
        val inAnimation = AlphaAnimation(0f, 1f)
        progressBarHolder?.animation = inAnimation
        progressBarHolder?.visibility = View.VISIBLE



    }
    fun hideWaiting() {
        val progressBarHolder = findViewById<View>(R.id.waiting) as? RelativeLayout
        val outAnimation = AlphaAnimation(1f, 0f)
        progressBarHolder?.animation = outAnimation
        progressBarHolder?.visibility = View.GONE
    }
}