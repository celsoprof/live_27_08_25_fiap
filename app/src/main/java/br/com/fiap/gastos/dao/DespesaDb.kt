package br.com.fiap.gastos.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.fiap.gastos.model.Despesa

@Database(entities = [Despesa::class], version = 2)
abstract class DespesaDb: RoomDatabase() {

    abstract fun getDespesaDao(): DespesaDao

    companion object{
        private lateinit var instancia: DespesaDb

        fun getDatabase(context: Context): DespesaDb{
            if (::instancia.isInitialized){
                return instancia
            } else {
                instancia = Room
                    .databaseBuilder(
                        context,
                        DespesaDb::class.java,
                        "despesas_db"
                    )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
                return instancia
            }
        }
    }

}