package br.com.fiap.gastos.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import br.com.fiap.gastos.model.Despesa

@Dao
interface DespesaDao {

    @Insert
    fun gravar(despesa: Despesa): Long

    @Query("SELECT * FROM tbl_despesa ORDER BY nome_despesa ASC")
    fun listarTodasAsDespesas(): List<Despesa>

    @Delete
    fun excluir(despesa: Despesa): Int

}