package com.example.appdatabase.viewModel

import com.example.appdatabase.roomDB.Pessoa
import com.example.appdatabase.roomDB.PessoaDatabase

class Repository(private val db: PessoaDatabase) {
    suspend fun upsertPessoa(pessoa: Pessoa) {
        db.pessoaDao().upsertPessoa(pessoa)
    }

    suspend fun deletePessoa(pessoa: Pessoa) {
        db.pessoaDao().deletePessoa(pessoa)
    }

    fun getAllPessoa() = db.pessoaDao().getAllPessoa()
}