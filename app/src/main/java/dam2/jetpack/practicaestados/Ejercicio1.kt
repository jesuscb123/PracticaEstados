package dam2.jetpack.practicaestados

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import dam2.jetpack.practicaestados.ui.theme.PracticaEstadosTheme

@Preview
@Composable
fun Producto(){
    CrearProducto("San Jacobo", "20€")
}
@Composable
fun CrearProducto(titulo: String, precio: String){
    val ctx = LocalContext.current
    Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
        Card(Modifier.padding(16.dp)){
            ConstraintLayout(Modifier.fillMaxWidth().padding(16.dp).background(Color.Gray)) {
                val (tituloRef, precioRef, boton, imgRef) = createRefs()
                val contentEndBarrier = createEndBarrier(
                    tituloRef,
                    precioRef)

                Button(onClick = {
                    Toast.makeText(ctx, "Añadido al carrito", Toast.LENGTH_SHORT).show()
                },
                    modifier = Modifier.constrainAs(boton){
                        top.linkTo(tituloRef.top)
                        start.linkTo(contentEndBarrier, margin = 2.dp)
                        end.linkTo(parent.end)
                    }){
                    Text("Comprar")
                }

                Image(
                    painterResource(R.drawable.sanjacobo),
                    "San Jacobo der Juanma",
                    Modifier.constrainAs(imgRef){
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        bottom.linkTo(parent.bottom)
                    }.size(100.dp))

                Text(titulo, Modifier.constrainAs(tituloRef){

                    top.linkTo(parent.top)
                    bottom.linkTo(imgRef.bottom)
                    start.linkTo(imgRef.end, margin = 15.dp)
                    width = Dimension.fillToConstraints
                }, textAlign = TextAlign.Center)

                Text(precio, Modifier.constrainAs(precioRef){
                    top.linkTo(tituloRef.bottom)
                    start.linkTo(imgRef.end, margin = 15.dp)
                    width = Dimension.fillToConstraints

                }, textAlign = TextAlign.Center)
            }
        }
    }

}
