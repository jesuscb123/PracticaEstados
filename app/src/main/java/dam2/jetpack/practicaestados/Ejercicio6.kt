package dam2.jetpack.practicaestados

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout


@Preview
@Composable
fun ContenidoTarjeta(){
    var contador by rememberSaveable { mutableStateOf(0) }
    var ctx = LocalContext.current
   Column(Modifier.fillMaxSize(),
       horizontalAlignment = Alignment.CenterHorizontally,
       verticalArrangement = Arrangement.Center){
       Card( modifier = Modifier.fillMaxWidth()) {


           ConstraintLayout(Modifier.fillMaxWidth()) {
               val (descripcion, interesa, compartir, guardar, contadorRef) = createRefs()

               Box(modifier = Modifier.fillMaxWidth().padding(50.dp).constrainAs(descripcion){
                   top.linkTo(parent.top)
               }, contentAlignment = Alignment.Center){
                   Text("Únete a nosotros en este evento único lleno de aprendizaje, creatividad y conexión. Disfruta de charlas inspiradoras, talleres prácticos y actividades interactivas que te ayudarán a crecer personal y profesionalmente. ¡Vive una experiencia inolvidable junto a personas con tus mismos intereses!")
               }

               val descBottom = createBottomBarrier(descripcion)

               Button(onClick = {
                   contador++
               },
                   Modifier.constrainAs(interesa){
                       top.linkTo(descBottom)
                   }){
                   Text("Interesa")
           }
               Button(onClick = {
                   Toast.makeText(ctx, "Compartido", Toast.LENGTH_SHORT).show()
               }, modifier = Modifier.constrainAs(compartir){
                   start.linkTo(interesa.end)
                   top.linkTo(interesa.top)
               }){
                   Text("Compartir")
               }

               Button(onClick = {
                   Toast.makeText(ctx, "Guardado", Toast.LENGTH_SHORT).show()
               }, modifier = Modifier.constrainAs(guardar){
                   start.linkTo(compartir.end)
                   top.linkTo(compartir.top)
               }){
                   Text("Guardar")
               }

               Text("Personas interesadas: $contador", modifier = Modifier.padding(5.dp).constrainAs(contadorRef){
                   top.linkTo(interesa.bottom, margin = 10.dp)
               })



               createHorizontalChain(interesa, compartir, guardar, chainStyle = ChainStyle.Spread)



           }


       }
   }
}

