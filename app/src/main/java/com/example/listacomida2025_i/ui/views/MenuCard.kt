package com.example.listacomida2025_i.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.listacomida2025_i.model.Platillo

@Composable
fun MenuCard(platillo: Platillo, modifier: Modifier = Modifier) {
    Card(modifier = modifier.padding(8.dp)) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = platillo.imagen),
                contentDescription = platillo.nombre,
                modifier = Modifier
                    .fillMaxWidth() // La imagen cubre todo el ancho de la pantalla
                    .aspectRatio(16f / 9f) // Proporción 16:9 para la imagen
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Column {
                    Text(
                        text = platillo.nombre,
                        fontSize = 24.sp, // Tamaño de título para el nombre del platillo
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "$${platillo.precio}",
                        fontSize = 20.sp // Tamaño de texto normal para el precio
                    )
                    if (platillo.oferta) {
                        Text(
                            text = "Oferta!",
                            color = Color.Red, // El color de la oferta en rojo
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp // Tamaño del texto de oferta
                        )
                    }
                }
            }
        }
    }
}
