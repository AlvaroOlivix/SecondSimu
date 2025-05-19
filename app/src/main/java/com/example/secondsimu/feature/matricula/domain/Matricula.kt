package com.example.secondsimu.feature.matricula.domain

data class Matricula(
    val cod: String,
    val resolucion: String,
    val progreso: String,
    val curso: Curso,
    val estudiante: Estudiante
)