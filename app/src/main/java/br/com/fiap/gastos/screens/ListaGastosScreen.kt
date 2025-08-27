package br.com.fiap.gastos.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.gastos.R
import br.com.fiap.gastos.ui.theme.GastosTheme

@Composable
fun ListaGastosScreen(modifier: Modifier = Modifier) {

    val scrollableState = rememberScrollState()

    Box(
        modifier = Modifier
            .padding(top = 48.dp, bottom = 48.dp)
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
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Suas despesas",
                fontSize = 22.sp,
                color = Color.Yellow,
            )
            Spacer(modifier = Modifier.height(10.dp))
            Column(
                modifier = Modifier
                    .verticalScroll(scrollableState)
                    .weight(1f)
                    .fillMaxSize()
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    shape = RectangleShape,
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color.Transparent
                        )
                ) {
                    Column {
                        Text(
                            text = "Nome da despesa",
                            color = Color.White,
                            fontSize = 18.sp
                        )
                        Text(
                            text = "R$ 100",
                            color = Color.White
                        )
                    }
                }
                HorizontalDivider()
                Spacer(modifier = Modifier.height(16.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    shape = RectangleShape,
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color.Transparent
                        )
                ) {
                    Column {
                        Text(
                            text = "Nome da despesa",
                            color = Color.White,
                            fontSize = 18.sp
                        )
                        Text(
                            text = "R$ 100",
                            color = Color.White
                        )
                    }
                }
                HorizontalDivider()
                Spacer(modifier = Modifier.height(32.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    shape = RectangleShape,
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color.Transparent
                        )
                ) {
                    Column {
                        Text(
                            text = "Nome da despesa",
                            color = Color.White,
                            fontSize = 18.sp
                        )
                        Text(
                            text = "R$ 100",
                            color = Color.White
                        )
                    }
                }
                HorizontalDivider()
                Spacer(modifier = Modifier.height(16.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    shape = RectangleShape,
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color.Transparent
                        )
                ) {
                    Column {
                        Text(
                            text = "Nome da despesa",
                            color = Color.White,
                            fontSize = 18.sp
                        )
                        Text(
                            text = "R$ 100",
                            color = Color.White
                        )
                    }
                }
                HorizontalDivider()
                Spacer(modifier = Modifier.height(32.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    shape = RectangleShape,
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color.Transparent
                        )
                ) {
                    Column {
                        Text(
                            text = "Nome da despesa",
                            color = Color.White,
                            fontSize = 18.sp
                        )
                        Text(
                            text = "R$ 100",
                            color = Color.White
                        )
                    }
                }
                HorizontalDivider()
                Spacer(modifier = Modifier.height(16.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    shape = RectangleShape,
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color.Transparent
                        )
                ) {
                    Column {
                        Text(
                            text = "Nome da despesa",
                            color = Color.White,
                            fontSize = 18.sp
                        )
                        Text(
                            text = "R$ 100",
                            color = Color.White
                        )
                    }
                }
                HorizontalDivider()
                Spacer(modifier = Modifier.height(32.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    shape = RectangleShape,
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color.Transparent
                        )
                ) {
                    Column {
                        Text(
                            text = "Nome da despesa",
                            color = Color.White,
                            fontSize = 18.sp
                        )
                        Text(
                            text = "R$ 100",
                            color = Color.White
                        )
                    }
                }
                HorizontalDivider()
                Spacer(modifier = Modifier.height(16.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    shape = RectangleShape,
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color.Transparent
                        )
                ) {
                    Column {
                        Text(
                            text = "Nome da despesa",
                            color = Color.White,
                            fontSize = 18.sp
                        )
                        Text(
                            text = "R$ 100",
                            color = Color.White
                        )
                    }
                }
                HorizontalDivider()
                Spacer(modifier = Modifier.height(32.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    shape = RectangleShape,
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color.Transparent
                        )
                ) {
                    Column {
                        Text(
                            text = "Nome da despesa",
                            color = Color.White,
                            fontSize = 18.sp
                        )
                        Text(
                            text = "R$ 100",
                            color = Color.White
                        )
                    }
                }
                HorizontalDivider()
            }
            Column(
                modifier = Modifier
                    .padding(top = 16.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.End
            ) {
                Row(
                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Total de Gastos",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "R$ 234.87",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Yellow
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults
                        .buttonColors(
                            containerColor = Color(0xFF4CAF50)
                        )
                ) {
                    Text(
                        text = "NOVO GASTO",
                        fontSize = 16.sp
                    )
                }
            }

        }
    }
}

@Preview
@Composable
private fun ListaGastosScreenPreview() {
    GastosTheme {
        ListaGastosScreen()
    }
}