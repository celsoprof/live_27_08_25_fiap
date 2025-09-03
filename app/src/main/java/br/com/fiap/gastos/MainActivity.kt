package br.com.fiap.gastos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.gastos.screens.CadastroScreen
import br.com.fiap.gastos.screens.ListaGastosScreen
import br.com.fiap.gastos.ui.theme.GastosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GastosTheme {

                val navegacao = rememberNavController()
                NavHost(
                    navController = navegacao,
                    startDestination = "lista"
                ){
                    composable(route = "lista") { ListaGastosScreen(navegacao) }
                    composable(route = "cadastro") { CadastroScreen(navegacao) }
                }
            }
        }
    }
}
