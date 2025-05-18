package com.example.secondsimu

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.secondsimu.feature.matricula.data.MatriculaDataRepository
import com.example.secondsimu.feature.matricula.data.local.MockDataSource
import com.example.secondsimu.feature.matricula.domain.UpdateMatriculaUseCase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        loadMatriculas()
    }

    private fun loadMatriculas() {

        val mock = MockDataSource()
        val repo = MatriculaDataRepository(mock)
        val updateCase = UpdateMatriculaUseCase(repo)

        Log.d("@dev", repo.getAllMatriculas().toString())
    }
}