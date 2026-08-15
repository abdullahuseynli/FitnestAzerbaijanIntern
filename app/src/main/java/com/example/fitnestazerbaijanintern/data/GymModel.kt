package com.example.fitnestazerbaijanintern.data

data class GymModel(
    val id: Int,
    val name: String,
    val distance: String,
    val rating: Double,
    val imageUrl: String,
    val isNew: Boolean = false,
    val description: String = "Məlumat yoxdur",
    val address: String = "Ünvan qeyd olunmayıb"
)