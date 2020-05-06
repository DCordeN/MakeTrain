package com.example.maketrain.presentation.entry

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.maketrain.R
import kotlinx.android.synthetic.main.activity_list_of_workouts.*
import javax.inject.Inject

class WorkoutsActivity : MvpAppCompatActivity(),
    IWorkoutsRouter {

    @Inject
    @InjectPresenter
    lateinit var presenter: WorkoutsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_list_of_workouts)
    }

    override fun onResume() {
        super.onResume()
        btn_add_workout.setOnClickListener {
            presenter.addWorkout()
        }
    }
}
