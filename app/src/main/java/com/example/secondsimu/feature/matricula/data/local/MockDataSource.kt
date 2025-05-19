package com.example.secondsimu.feature.matricula.data.local

import com.example.secondsimu.feature.matricula.domain.Curso
import com.example.secondsimu.feature.matricula.domain.Estudiante
import com.example.secondsimu.feature.matricula.domain.Matricula

class MockDataSource {
    private val cursos =
        listOf(
            Curso("ZA13", "Aula Ceti", "Aula de usos multiples para los cursos de informática"),
            Curso("DW65", "Aula DAM", "Aula de desarrollo de android")
        )
    private val estudiantes = listOf(
        Estudiante("39205720Y", "Lauren Cohan", "laurenH@gmail.com"),
        Estudiante("70837021B", "Álvaro Muñoz Vaquero", "alvamun@gmail.com")
    )
    private val matriculas = listOf(
        Matricula("1078", "Matriculado", "Promociona", cursos[1], estudiantes[0]),
        Matricula("1072", "Matriculado", "Promociona", cursos[1], estudiantes[0])
    )

    fun getAllMatriculas(): List<Matricula> {
        return matriculas
    }

    fun getMatriculaByCod(matCod: String): Matricula? {
        return matriculas.find { it.cod == matCod }
    }
}