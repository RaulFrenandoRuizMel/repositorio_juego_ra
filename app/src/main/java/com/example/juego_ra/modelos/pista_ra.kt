package com.example.juego_ra.modelos

import android.location.Location

data class Pista(
    var nombre: String,
    var ubicacion: Location,
    var cuerpo:PistaGenerica
)