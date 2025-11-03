package com.example.juego_ra.ui.organismos

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.juego_ra.modelos.InformacionInteractiva

@Composable
fun InformacionInteractivaVista(informacionInteractiva: InformacionInteractiva){
    Column {
        Text("${informacionInteractiva.texto}")

        for (boton in informacionInteractiva.lista_de_botones){
            Text("Boton para ir a ${boton.texto}")
        }
    }
}