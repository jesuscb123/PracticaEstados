package dam2.jetpack.practicaestados

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun Invisibilidad(){
    var interruptor by rememberSaveable { mutableStateOf(false) }

    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
        if (interruptor){
            Text("Soy un texto")
        }else{
            Text("")
        }

        Button(onClick = {
            interruptor = !interruptor
        }) {
            if (interruptor) Text("Ocultar Texto") else Text("Mostrar Texto")
        }
    }



}