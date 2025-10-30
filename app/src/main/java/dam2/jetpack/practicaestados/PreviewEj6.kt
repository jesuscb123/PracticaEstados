package dam2.jetpack.practicaestados

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview()
@Composable
fun Ej6Preview(){
    ContenidoTarjeta("Únete a nosotros en este evento único " +
            "lleno de aprendizaje, creatividad y conexión. " +
            "Disfruta de charlas inspiradoras, talleres prácticos y " +
            "actividades interactivas que te ayudarán a crecer personal y " +
            "profesionalmente. ¡Vive una experiencia inolvidable junto a personas " +
            "con tus mismos intereses!")
}

@Preview(showBackground = true)
@Composable
fun Ej6Preview2(){
    ContenidoTarjeta("Descripción bastante corta")
}

@Preview(showBackground = true, widthDp = 300)
@Composable
fun Ej6Preview3(){
    ContenidoTarjeta("Otra descripción distinta")
}

@Preview(showBackground = true, heightDp = 300)
@Composable
fun Ej6Preview4(){
    ContenidoTarjeta("Otra descripción distinta")
}