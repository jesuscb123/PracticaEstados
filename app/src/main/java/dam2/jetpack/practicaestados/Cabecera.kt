package dam2.jetpack.practicaestados

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Cabecera(titulo: String, subtitulo: String, modifier: Modifier = Modifier){
    Column(modifier = Modifier.fillMaxWidth().height(60.dp).background(Color.Gray), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
        Text(titulo)
        Text(subtitulo)
    }
}