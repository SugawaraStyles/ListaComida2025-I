package com.example.listacomida2025_i.data

import com.example.listacomida2025_i.R
import com.example.listacomida2025_i.model.Platillo
import androidx.compose.ui.graphics.Color

object DataSource {
    val platillos = listOf(
        Platillo("Tacos", 50.0, oferta = true, imagen = R.drawable.tacos, ofertaColor = Color.Green),
        Platillo("Pizza", 120.0, oferta = false, imagen = R.drawable.pizza),
        Platillo("hamburguer", 200.0, oferta = true, imagen = R.drawable.hamburger, ofertaColor = Color.Blue)
    )
}
