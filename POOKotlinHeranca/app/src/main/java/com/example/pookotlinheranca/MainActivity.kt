package com.example.pookotlinheranca

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        lateinit var joao:Funcionario
        joao.setNome("Joao")
        joao.setSalario(1000.00)
        joao.setDataAdmissao("01/01/1980")

        lateinit var pedro:Gerente
        pedro.setNome("Pedro")
        pedro.setSalario(2000.00)
        pedro.setDataAdmissao("01/01/1970")
        pedro.setComissao(10000.00)
        pedro.setTotalFuncionarios(10)


    }
}