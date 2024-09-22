package com.example.app.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// Definición de los colores claros
val LightPrimary = Color(0xFF6200EE)
val LightOnPrimary = Color(0xFFFFFFFF)
val LightSecondary = Color(0xFF03DAC6)
val LightOnSecondary = Color(0xFF000000)

// Definición de los colores oscuros
val DarkPrimary = Color(0xFFBB86FC)
val DarkOnPrimary = Color(0xFF000000)
val DarkSecondary = Color(0xFF03DAC6)
val DarkOnSecondary = Color(0xFF000000)

// Esquema de colores claro
val LightColors = lightColorScheme(
    primary = LightPrimary,
    onPrimary = LightOnPrimary,
    secondary = LightSecondary,
    onSecondary = LightOnSecondary,
    // Otros colores
)

// Esquema de colores oscuro
val DarkColors = darkColorScheme(
    primary = DarkPrimary,
    onPrimary = DarkOnPrimary,
    secondary = DarkSecondary,
    onSecondary = DarkOnSecondary,
    // Otros colores
)
