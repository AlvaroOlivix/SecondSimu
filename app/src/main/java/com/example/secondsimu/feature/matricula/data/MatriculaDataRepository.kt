package com.example.secondsimu.feature.matricula.data

import com.example.secondsimu.feature.matricula.data.local.MockDataSource
import com.example.secondsimu.feature.matricula.domain.Matricula
import com.example.secondsimu.feature.matricula.domain.MatriculaRepository

class MatriculaDataRepository(private val remoteData: MockDataSource) : MatriculaRepository {
    override fun getAllMatriculas(): List<Matricula> {
        return remoteData.getAllMatriculas()
    }

    override fun getMatriculaByCod(matCod: String): Matricula? {
        return remoteData.getMatriculaByCod(matCod)
    }

    override fun saveMatricula(matricula: Matricula) {
        TODO("Not yet implemented")
    }
}