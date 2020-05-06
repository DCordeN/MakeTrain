package com.example.maketrain.domain.models.realm

import io.realm.RealmList
import io.realm.RealmObject

open class WorkoutRealm : RealmObject() {
    var name: String = ""
    var exerciseRealm: RealmList<ExerciseRealm?> = RealmList()
}