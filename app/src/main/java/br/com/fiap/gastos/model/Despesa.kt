package br.com.fiap.gastos.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_despesa")
data class Despesa(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    @ColumnInfo(name = "nome_despesa")
    val nomeDespesa: String = "",
    @ColumnInfo(defaultValue = "Sem descrição.")
    var descricao: String = "",

    val valor: Double = 0.0
)
