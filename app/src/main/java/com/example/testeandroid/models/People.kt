package com.example.testeandroid.models

class People(var name: String, var idade: Int){

    constructor(name: String, age: Int, height: Double) : this(name, age) {
        this.idade = age
        if(age <= 0) throw IllegalArgumentException("Double kill")
    }

    fun canVote(): Boolean{
        return this.idade >= 16
    }


}
