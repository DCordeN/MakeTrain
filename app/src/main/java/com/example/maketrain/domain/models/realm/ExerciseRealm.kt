package com.example.maketrain.domain.models.realm

import io.realm.RealmObject
import java.util.*

open class ExerciseRealm : RealmObject() {
    var name: String = ""
    var description: String? = null
    var timer: Date? = null
    var numberOfRepetitions: Int? = null
}