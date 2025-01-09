package com.example.pookotlinencapsulamento

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var txtTitulo : TextView
    lateinit var txtAutor : TextView
    lateinit var txtEditora : TextView
    lateinit var txtPaginas : TextView
    lateinit var txtLocalizacao : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        iniciarComponentesDoLayout()
        criarObjetos()
    }

    private fun iniciarComponentesDoLayout() {
        txtTitulo = findViewById(R.id.txtTitulo)
        txtAutor = findViewById(R.id.txtAutor)
        txtEditora = findViewById(R.id.txtEditora)
        txtPaginas = findViewById(R.id.txtPaginas)
        txtLocalizacao = findViewById(R.id.txtLocalizacao)
    }

    private fun criarObjetos() {
        var livro = Livro(
            "POO Encapsulamento",
            "Marco Maddo",
            "Mundial POO",
            150,
            "L1L1"
        )
        Log.i("POO", "Obj Livro: Titulo: " + livro.titulo)
        Log.i("POO", "Obj Livro: Autor: " + livro.autor)
        Log.i("POO", "Obj Livro: Editora: " + livro.editora)
        Log.i("POO", "Obj Livro: Paginas: " + livro.paginas.toString())
        Log.i("POO", "Obj Livro: Localização: " + livro.localizacao)

        txtTitulo.setText(livro.titulo)
        txtAutor.setText(livro.autor)
        txtEditora.setText(livro.editora)
        txtPaginas.setText(livro.paginas.toString())
        txtLocalizacao.setText(livro.localizacao)
    }
}