package com.example.listacomida2025_i.model

import androidx.compose.ui.graphics.Color

data class Platillo(
    val nombre: String,
    val precio: Double,
    val oferta: Boolean,
    val imagen: Int,
    val ofertaColor: Color = Color.Red // Color para resaltar la oferta
)
