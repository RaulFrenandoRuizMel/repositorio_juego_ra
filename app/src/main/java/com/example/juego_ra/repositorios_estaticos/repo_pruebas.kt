package com.example.juego_ra.repositorios_estaticos

import android.location.Location
import androidx.collection.objectListOf
import com.example.juego_ra.modelos.Boton
import com.example.juego_ra.modelos.Informacion
import com.example.juego_ra.modelos.InformacionInteractiva
import com.example.juego_ra.modelos.Pista

object RepositorioPruebas{
    var pistas = listOf(Pista(
        nombre = "pista1",
        ubicacion = Location("proveedor").apply {
            latitude= 31.741698183682715
            longitude= -106.43379483274231
        },
        cuerpo = Informacion(
            texto = "Prueba texto para comprobar esto pista 2",
            imagen = null
        )
    ),
        Pista(
            nombre = "pista2",
            ubicacion = Location("proveedor").apply {
                latitude= 31.754641593558237
                longitude= -106.45999792437456
            },
            cuerpo = Informacion(
                texto = "Prueba texto para comprobar esto pista 2",
                imagen = null
        )
    ),
        Pista(
            nombre = "pista3",
            ubicacion = Location("proveedor"),
            cuerpo = Informacion(
                texto = "Prueba texto para comprobar esto pista 2",
                imagen = null
        )
    ),
        Pista(
            nombre = "pista4",
            ubicacion = Location("proveedor"),
            cuerpo = InformacionInteractiva(
                texto = "Prueba texto para comprobar esto pista 2",
                lista_de_botones = listOf(Boton(
                            texto = "ir a pantalla1",
                            direccion = TODO()
                ),
                    Boton(
                        texto = "ir a pantalla 2",
                        direccion = null
                    )
                )
            )
        ),
)
}