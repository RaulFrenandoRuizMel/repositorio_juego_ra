package com.example.juego_ra.ui.pantallas

import android.location.Location
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.juego_ra.modelos.Informacion
import com.example.juego_ra.modelos.InformacionInteractiva
import com.example.juego_ra.modelos.TiposDePistas
import com.example.juego_ra.repositorios_estaticos.RepositorioPruebas
import com.example.juego_ra.ui.organismos.InformacionInteractivaVista
import com.example.juego_ra.ui.organismos.InformacionVista

@Composable
fun Principal(modificador: Modifier= Modifier){
    val  mi_ubicacion = Location("proveedor").apply {
        latitude= 31.741698183682715
        longitude= -106.43379483274231
    }
    Column(modificador) {
        for(pista in RepositorioPruebas.pistas){
            Text("La pista es: ${pista.nombre}")
            Text("La distancia a la pista es: ${mi_ubicacion.distanceTo(pista.ubicacion)}")
            when(pista.cuerpo.tipo){

                TiposDePistas.texto -> {
                    InformacionVista(pista.cuerpo as Informacion)
                }
                TiposDePistas.interactiva -> {
                    InformacionInteractivaVista(pista.cuerpo as InformacionInteractiva)
                }
                TiposDePistas.camara -> {
                    TODO()
                }
                TiposDePistas.agitar_telefono -> {
                    TODO()
                }
            }
            if (pista.cuerpo.tipo == TiposDePistas.texto){
                InformacionVista(pista.cuerpo as Informacion)
            }
        }
    }
}