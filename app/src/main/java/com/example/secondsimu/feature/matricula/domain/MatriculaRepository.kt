package com.example.secondsimu.feature.matricula.domain

interface MatriculaRepository {

    fun getAllMatriculas(): List<Matricula>
    fun getMatriculaByCod(matCod: String): Matricula?
    fun saveMatricula(matricula: Matricula)
}