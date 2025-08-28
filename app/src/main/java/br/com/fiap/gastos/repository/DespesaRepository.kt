package br.com.fiap.gastos.repository

import android.content.Context
import br.com.fiap.gastos.dao.DespesaDb
import br.com.fiap.gastos.model.Despesa

class DespesaRepository(context: Context) {

    private val db = DespesaDb.getDatabase(context)

    fun gravar(despesa: Despesa): Long{
        return db.getDespesaDao().gravar(despesa)
    }

}