package com.example.pookotlinheranca

open class Funcionario {
    private var nome:String? = null
    private var dataAdmissao:String? = null
    private var salario: Double? = 0.0

    fun getNome(): String{
        return nome!!
    }

    fun setNome(nome:String?){
        this.nome = nome
    }

    fun setDataAdmissao(): String{
        return dataAdmissao!!
    }

    fun setDataAdmissao(dataAdimissao:String?){
        this.dataAdmissao = dataAdimissao
    }

    fun getSalario(): Double{
        return salario!!
    }

    fun setSalario(salario:Double?){
        this.salario = salario
    }
}