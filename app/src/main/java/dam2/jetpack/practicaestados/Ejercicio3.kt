package dam2.jetpack.practicaestados

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Preview
@Composable
fun CuadradoColor() {
    Column(
        Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val colores = mutableMapOf<String, Color>(
            "Gris" to Color.Gray,
            "Verde" to Color.Green,
            "Azul" to Color.Blue,
            "Negro" to Color.Black,
            "Amarillo" to Color.Yellow
        )
        var nombreColor by rememberSaveable { mutableStateOf(colores.keys.random()) }
        var colorAsignado = devolverColor(nombreColor, colores)
        Box(modifier = Modifier.padding(40.dp).size(200.dp).background(colorAsignado))
        Spacer(Modifier.padding(5.dp))
        Text(nombreColor)
        Spacer(Modifier.padding(5.dp))
        Button(onClick = {
            nombreColor = colores.keys.random()
        }) { Text("Cambiar color") }
    }
}

fun devolverColor(claveColor: String, colores: MutableMap<String, Color>): Color{
    val color: Color? = colores.get(claveColor)

    return color ?: Color.Gray

}

