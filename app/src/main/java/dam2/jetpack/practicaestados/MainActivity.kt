package dam2.jetpack.practicaestados

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AutoAwesomeMosaic
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Start
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import dam2.jetpack.practicaestados.navegation.Pantallas
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App()
        }
    }
}

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App(){
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    var titulo by rememberSaveable { mutableStateOf(currentRoute) }
    Scaffold(Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(title = {
                when(titulo){
                    Pantallas.Ejercicio6.rutaComposable -> {
                        Column(Modifier.fillMaxWidth().background(Color.Gray)){
                            Text("Tarjeta evento")
                            Text("Bienvenido")
                        }
                    }
                    else -> {
                        if (titulo != null) Text("$titulo")
                    }
                }
            })
        },
        bottomBar = {
            BottomAppBar {
                NavigationBar {
                    BotonesNavegador(Pantallas.Home.rutaComposable,
                        Icons.Default.Home, navController){
                        titulo = it
                    }
                    BotonesNavegador(Pantallas.Ejercicio2.rutaComposable, Icons.Default.Add, navController) {
                        titulo = it
                    }
                    BotonesNavegador(Pantallas.Ejercicio3.rutaComposable, Icons.Default.Star, navController){
                        titulo = it
                    }
                    BotonesNavegador(Pantallas.Ejercicio4.rutaComposable, Icons.Default.Start, navController) {
                        titulo = it
                    }
                    BotonesNavegador(Pantallas.Ejercicio5.rutaComposable, Icons.Default.Create, navController) {
                        titulo = it
                    }
                    BotonesNavegador(Pantallas.Ejercicio6.rutaComposable, Icons.Default.AutoAwesomeMosaic, navController) {
                        titulo = it
                    }

                }
            }
        }) { inner ->
        NavHost(
            navController = navController,
            startDestination = Pantallas.Home.rutaComposable,
            modifier = Modifier.padding(inner)
        ){
            composable(Pantallas.Home.rutaComposable) {Producto()}
            composable(Pantallas.Ejercicio2.rutaComposable) {Barra()}
            composable (Pantallas.Ejercicio3.rutaComposable) {CuadradoColor()}
            composable (Pantallas.Ejercicio4.rutaComposable) {SumaResta()}
            composable (Pantallas.Ejercicio5.rutaComposable) { Invisibilidad() }
            composable (Pantallas.Ejercicio6.rutaComposable) {ContenidoTarjeta("Ven al Tech & Fun Fest 2025!" +
                    "Un evento donde la tecnología, la música y la creatividad se unen en un mismo lugar.\n" +
                    "Disfruta de charlas inspiradoras, talleres interactivos y zona gamer.\n" +
                    "Conoce a creadores, programadores y artistas innovadores.\n" +
                    "¡No te lo pierdas, vive la experiencia que marcará el año!")}
        }


    }
}

@Composable
fun RowScope.BotonesNavegador(rutaComposable: String, icono: ImageVector, navController: NavController, cambiarTitulo: (String) -> Unit){
    NavigationBarItem(
        selected = false,
        onClick = {
            navController.navigate(rutaComposable)
            cambiarTitulo(rutaComposable)
        },
        icon = {
            Icon(icono, rutaComposable)
        },
        label = {Text(rutaComposable)}
    )
}
