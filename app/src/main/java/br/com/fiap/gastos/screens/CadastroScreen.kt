package br.com.fiap.gastos.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.fiap.gastos.R
import br.com.fiap.gastos.model.Despesa
import br.com.fiap.gastos.repository.DespesaRepository
import br.com.fiap.gastos.ui.theme.GastosTheme

@Composable
fun CadastroScreen(navegacao: NavHostController) {

    var textGasto by remember {
        mutableStateOf("")
    }

    var textDescricao by remember {
        mutableStateOf("")
    }

    var textValor by remember {
        mutableStateOf("")
    }

    val context = LocalContext.current
    val despesaRepository = DespesaRepository(context)

    Box(
        modifier = Modifier
            .padding(top = 48.dp)
            .fillMaxSize()
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(
                R.drawable.money_background
            ),
            contentDescription = "Background",
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xDD3F51B5))
        )
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Botão voltar",
                        tint = Color.White
                    )
                }
                Text(
                    text = "Cadastro de gastos",
                    fontSize = 24.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(32.dp))
            OutlinedTextField(
                value = textGasto,
                onValueChange = {
                    textGasto = it
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color.White,
                        focusedBorderColor = Color.Yellow,
                        unfocusedLabelColor = Color.White,
                        focusedLabelColor = Color.LightGray
                    ),
                label = {
                    Text(text = "Qual o nome do gasto?")
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "",
                        tint = Color.White
                    )
                }
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = textDescricao,
                onValueChange = {
                    textDescricao = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                shape = RoundedCornerShape(8.dp),
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color.White,
                        focusedBorderColor = Color.Yellow,
                        unfocusedLabelColor = Color.White,
                        focusedLabelColor = Color.LightGray
                    ),
                label = {
                    Text(text = "Descreva o gasto...")
                },
                maxLines = 6
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = textValor,
                onValueChange = {
                    textValor = it
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color.White,
                        focusedBorderColor = Color.Yellow,
                        unfocusedLabelColor = Color.White,
                        focusedLabelColor = Color.LightGray
                    ),
                label = {
                    Text(text = "Qual o valor do gasto?")
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "",
                        tint = Color.White
                    )
                }
            )
            Spacer(modifier = Modifier.height(32.dp))
            Button(
                onClick = {
                    val despesa = Despesa(
                        nomeDespesa = textGasto,
                        descricao = textDescricao,
                        valor = textValor.toDouble()
                    )
                    despesaRepository.gravar(despesa)
                    Toast.makeText(context, "Despesa $textGasto incluída com sucesso!", Toast.LENGTH_SHORT).show()
                    navegacao.navigate("lista")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults
                    .buttonColors(
                        containerColor = Color(0xFF4CAF50)
                    )
            ) {
                Text(
                    text = "GRAVAR GASTO",
                    fontSize = 16.sp
                )
            }
        }
    }
}

@Preview
@Composable
private fun CadastroScreenPreview() {
    GastosTheme {
        //CadastroScreen(navegacao)
    }
}