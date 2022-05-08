package com.example.jetpackcomposestate

//data class WellnessTask(val id: Int, val label: String)
//data class WellnessTask(val id: Int, val label: String, var checked: Boolean = false)

//import androidx.compose.runtime.MutableState
//import androidx.compose.runtime.mutableStateOf
//
//data class WellnessTask(val id: Int, val label: String, val checked: MutableState<Boolean> = mutableStateOf(false))

// Change WellnessTask to be a class instead of a data class. Make WellnessTask receive an initialChecked
// variable with default value false in the constructor, then we can initialize the checked variable with the factory
// method mutableStateOf and taking initialChecked as default value.
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class WellnessTask(
    val id: Int,
    val label: String,
    initialChecked: Boolean = false
) {
    var checked by mutableStateOf(initialChecked)
}
