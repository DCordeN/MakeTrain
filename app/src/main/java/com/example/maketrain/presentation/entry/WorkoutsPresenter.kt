package com.example.maketrain.presentation.entry

import com.arellomobile.mvp.MvpPresenter
import com.example.maketrain.presentation.WorkoutCreationActivity
import javax.inject.Inject

class WorkoutsPresenter : MvpPresenter<IWorkoutsRouter> {

    @Inject
    constructor() {}

    fun addWorkout() {
        WorkoutCreationActivity.show()
    }
}