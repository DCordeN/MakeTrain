package com.example.maketrain.presentation

import android.content.Intent
import android.os.Bundle
import com.example.maketrain.R
import com.arellomobile.mvp.MvpAppCompatActivity
import com.example.maketrain.App

class WorkoutCreationActivity : MvpAppCompatActivity() {

    companion object {
        fun show() {
            App.appContext.let {
                it.startActivity(Intent(it, WorkoutCreationActivity::class.java).apply {
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                })
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_workout_creation)
    }
}