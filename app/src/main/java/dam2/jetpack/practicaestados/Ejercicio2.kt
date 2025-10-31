package dam2.jetpack.practicaestados

import android.widget.Button
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.material3.Button
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

@Preview
@Composable
fun Barra(){
    var tipoBarra: ChainStyle by remember { mutableStateOf(ChainStyle.Spread) }
    var texto by rememberSaveable { mutableStateOf("Spread") }
    Column(Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text(texto)
        Spacer(Modifier.padding(4.dp))
        DiferentesBarras(tipoBarra)
        Spacer(Modifier.padding(4.dp ))

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
            Button(onClick = {
                tipoBarra = ChainStyle.Spread
                texto = "Spread"

            }) { Text("Spread")}

            Button(onClick = {
                tipoBarra = ChainStyle.SpreadInside
                texto = "SpreadInside"
            }) { Text("SpreadInside")}

            Button(onClick = {
                tipoBarra = ChainStyle.Packed
                texto = "Packed"
            }) { Text("Packed")}


        }
    }

}

@Composable
fun DiferentesBarras(tipoChain: ChainStyle){
    val ctx = LocalContext.current

     ConstraintLayout(
         modifier= Modifier.fillMaxWidth().padding(16.dp)
     ){
         val (explorar, favoritos, perfil) = createRefs()

         Text("Explorar", Modifier.constrainAs(explorar){
             top.linkTo(parent.top)
             start.linkTo(parent.start)
         })

         Text("Favoritos", Modifier.constrainAs(favoritos){
             top.linkTo(parent.top)
         })

         Text("Perfil", Modifier.constrainAs(perfil){
             top.linkTo(parent.top)
             end.linkTo(parent.end)
         })

         createHorizontalChain(explorar,favoritos,perfil, chainStyle = tipoChain)
     }
}

