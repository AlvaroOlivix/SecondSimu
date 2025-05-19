package com.example.secondsimu.feature.matricula.domain

class UpdateMatriculaUseCase(private val matriculaRepository: MatriculaRepository) {

    suspend operator fun invoke(matricula: Matricula, newResolucion: String) {
        val actualizado = matricula.copy(resolucion = newResolucion)
        matriculaRepository.saveMatricula(actualizado)
    }
}