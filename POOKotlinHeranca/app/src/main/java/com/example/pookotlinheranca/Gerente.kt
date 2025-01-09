package com.example.pookotlinheranca

class Gerente : Funcionario() {
    private var comissao: Double? = 0.0
    private var totalFuncionarios: Int? = 0

    fun getComissao(): Double{
        return comissao!!
    }

    fun setComissao(salario:Double?){
        this.comissao = salario
    }

    fun getTotalFuncionarios(): Int?{
        return totalFuncionarios!!
    }

    fun setTotalFuncionarios(totalFuncionarios:Int?){
        this.totalFuncionarios = totalFuncionarios
    }



}