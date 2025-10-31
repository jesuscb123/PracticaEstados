package dam2.jetpack.practicaestados

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun ContenidoTarjeta(titulo: String, subtitulo: String,descripcionUsuario: String, masInfo: String){
    var contador by rememberSaveable { mutableStateOf(0) }
    var ctx = LocalContext.current
    var eliminarTexto by rememberSaveable { mutableStateOf(false) }
   Column(Modifier.fillMaxSize(),
       horizontalAlignment = Alignment.CenterHorizontally,
       verticalArrangement = Arrangement.Center){
       Card( modifier = Modifier.fillMaxWidth()) {

           ConstraintLayout(Modifier.fillMaxWidth()) {
               val (cabecera, descripcion, interesa, compartir, guardar, pieRef, masInfoRef, botonInfoRef) = createRefs()

               Cabecera(titulo, subtitulo, Modifier.constrainAs(cabecera){
                   top.linkTo(parent.top)
                   start.linkTo(parent.start)
                   end.linkTo(parent.end)
               })

               Box(modifier = Modifier.fillMaxWidth().padding(50.dp).constrainAs(descripcion){
                   top.linkTo(cabecera.bottom)
               }, contentAlignment = Alignment.Center){
                   Text(descripcionUsuario)
               }

               if (!eliminarTexto){
                   Text(masInfo, Modifier.constrainAs(masInfoRef){
                       top.linkTo(descripcion.bottom)
                       start.linkTo(parent.start, 5.dp)
                       end.linkTo(parent.end, margin = 5.dp)
                   })
               }else{
                   Text("", Modifier.constrainAs(masInfoRef){
                       top.linkTo(descripcion.bottom)
                       start.linkTo(parent.start)
                       end.linkTo(parent.end)
                   })

               }

               Button(onClick = {
                   eliminarTexto = !eliminarTexto
               }, Modifier.constrainAs(botonInfoRef){
                   top.linkTo(masInfoRef.bottom)
                   start.linkTo(parent.start)
                   end.linkTo(parent.end)
               }){
                   if (eliminarTexto) Text("Mostrar más") else Text("Mostrar menos")
               }

               val descBottom = createBottomBarrier(botonInfoRef)


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

              Row(Modifier.fillMaxWidth().constrainAs(pieRef){
                  top.linkTo(interesa.bottom)
                  start.linkTo(parent.start)
                  end.linkTo(parent.end)
              }){
                  Text("Personas interesadas: $contador", modifier = Modifier.padding(5.dp))
                  Spacer(Modifier.padding(5.dp))
                  Text("No me interesa", modifier = Modifier.padding(5.dp).clickable(onClick = {
                      if (contador == 0) contador = 0 else contador--
                   }))
              }
               createHorizontalChain(interesa, compartir, guardar, chainStyle = ChainStyle.Spread)
           }
       }
   }
}

