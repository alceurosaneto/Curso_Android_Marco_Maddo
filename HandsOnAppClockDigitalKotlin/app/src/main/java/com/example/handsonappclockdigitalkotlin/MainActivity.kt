package com.example.handsonappclockdigitalkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextClock
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var txtHoraAtual: TextClock? = null
    private var txtHora24PM_AM: TextClock? = null
    private var txtUpdateHoraAtual: TextView? = null
    private var btnUpdateHoraAtual: Button? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        iniciarComponentesDeLayout()
    }

    private fun iniciarComponentesDeLayout() {
        txtHoraAtual = findViewById(R.id.txtHoraAtual)
        txtHora24PM_AM = findViewById(R.id.txtHora24PM_AM)
        txtUpdateHoraAtual = findViewById(R.id.txtUpdateHoraAtual)
        btnUpdateHoraAtual = findViewById(R.id.btnUpdateHoraAtual)
    }

    fun atualizarHoraAtual(view: View) {
        txtUpdateHoraAtual!!.setText("Hora: "+txtHora24PM_AM!!.getText())
    }
}