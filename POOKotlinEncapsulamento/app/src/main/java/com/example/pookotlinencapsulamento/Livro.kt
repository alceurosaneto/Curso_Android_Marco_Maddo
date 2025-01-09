package com.example.pookotlinencapsulamento

class Livro(
    private var _titulo: String,
    private var _autor: String,
    private var _editora: String,
    private var _paginas: Int,
    private var _localizacao: String
){
    var titulo: String
        get() = _titulo
        set(valor) {
            _titulo = valor
        }

    var autor: String
        get() = _autor
        set(valor) {
            _autor = valor
        }

    var editora: String
        get() = _editora
        set(valor) {
            _editora = valor
        }

    var paginas: Int
        get() = _paginas
        set(valor) {
            _paginas = valor
        }

    var localizacao: String
        get() = _localizacao
        set(valor) {
            _localizacao = valor
        }


}