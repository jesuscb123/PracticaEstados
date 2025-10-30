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
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

@Preview
@Composable
fun Barra(){
    Column(Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){

       Text("Barra Spread")
        Spacer(Modifier.padding(4.dp))
       BarraSpread()

        Spacer(Modifier.padding(5.dp))

        Text("Barra SpreadInside")
        Spacer(Modifier.padding(4.dp))
        BarraSpreadInside()

        Spacer(Modifier.padding(5.dp))

        Text("Barra Packed")
        Spacer(Modifier.padding(4.dp))
        BarraPacked()

    }

}

@Composable
fun BarraSpread(){
    val ctx = LocalContext.current

     ConstraintLayout(
         modifier= Modifier.fillMaxWidth().padding(16.dp)
     ){
         val (boton1, boton2, boton3) = createRefs()

         Button(onClick = {
             Toast.makeText(ctx, "Explorar", Toast.LENGTH_SHORT).show()
         },
             modifier = Modifier.constrainAs(boton1){}) { Text("Explorar") }

         Button(onClick = {
             Toast.makeText(ctx, "Explorar", Toast.LENGTH_SHORT).show()
         },
             modifier = Modifier.constrainAs(boton2){}) { Text("Favoritos") }

         Button(onClick = {
             Toast.makeText(ctx, "Explorar", Toast.LENGTH_SHORT).show()
         },
             modifier = Modifier.constrainAs(boton3){}) { Text("Perfil") }

         createHorizontalChain(boton1,boton2,boton3, chainStyle = ChainStyle.Spread)
     }
}

@Composable
fun BarraSpreadInside(){
    val ctx = LocalContext.current

    ConstraintLayout(
        modifier= Modifier.fillMaxWidth().padding(16.dp)
    ){
        val (boton1, boton2, boton3) = createRefs()

        Button(onClick = {
            Toast.makeText(ctx, "Explorar", Toast.LENGTH_SHORT).show()
        },
            modifier = Modifier.constrainAs(boton1){}) { Text("Explorar") }

        Button(onClick = {
            Toast.makeText(ctx, "Explorar", Toast.LENGTH_SHORT).show()
        },
            modifier = Modifier.constrainAs(boton2){}) { Text("Favoritos") }

        Button(onClick = {
            Toast.makeText(ctx, "Explorar", Toast.LENGTH_SHORT).show()
        },
            modifier = Modifier.constrainAs(boton3){}) { Text("Perfil") }

        createHorizontalChain(boton1,boton2,boton3, chainStyle = ChainStyle.SpreadInside)
    }
}

@Composable
fun BarraPacked(){
    val ctx = LocalContext.current

    ConstraintLayout(
        modifier= Modifier.fillMaxWidth().padding(16.dp)
    ){
        val (boton1, boton2, boton3) = createRefs()

        Button(onClick = {
            Toast.makeText(ctx, "Explorar", Toast.LENGTH_SHORT).show()
        },
            modifier = Modifier.constrainAs(boton1){}) { Text("Explorar") }

        Button(onClick = {
            Toast.makeText(ctx, "Explorar", Toast.LENGTH_SHORT).show()
        },
            modifier = Modifier.constrainAs(boton2){}) { Text("Favoritos") }

        Button(onClick = {
            Toast.makeText(ctx, "Explorar", Toast.LENGTH_SHORT).show()
        },
            modifier = Modifier.constrainAs(boton3){}) { Text("Perfil") }

        createHorizontalChain(boton1,boton2,boton3, chainStyle = ChainStyle.Packed)
    }
}