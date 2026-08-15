package com.example.fitnestazerbaijanintern.model

data class WorkoutActivity(
    val id: Int,
    val title: String,
    val subtitle: String,
    val progress: Float,
    val iconRes: Int? = null
)

data class UserProfile(
    val name: String,
    val program: String,
    val height: String,
    val weight: String,
    val age: String
)