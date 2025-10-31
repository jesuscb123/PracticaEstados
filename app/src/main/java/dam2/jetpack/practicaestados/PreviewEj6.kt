
//package dam2.jetpack.practicaestados

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dam2.jetpack.practicaestados.ContenidoTarjeta

@Preview(
    name = "Corto • Teléfono 360x640 • Claro",
    showBackground = true,
    backgroundColor = 0xFFF5F5F5,
    widthDp = 360,
    heightDp = 640
)
@Composable
fun Preview_ContenidoTarjeta_Corto() {
    ContenidoTarjeta(
        titulo = "Oferta",
        subtitulo = "Curso Kotlin",
        descripcionUsuario = "Aprende Compose desde cero.",
        masInfo = "Inicio: 10/11"
    )
}

@Preview(
    name = "Largo • Tablet 800x1280 • Oscuro",
    showBackground = true,
    backgroundColor = 0xFF121212,
    widthDp = 800,
    heightDp = 1280
)
@Composable
fun Preview_ContenidoTarjeta_Largo() {
    ContenidoTarjeta(
        titulo = "Promoción de Fin de Año en Desarrollo Android con Jetpack Compose",
        subtitulo = "Incluye Kotlin, arquitectura por capas, Room, Hilt y testing",
        descripcionUsuario = "Curso intensivo para dominar el ecosistema Android moderno: estado con Compose, navegación, accesibilidad, rendimiento y patrones de arquitectura aplicados a proyectos reales.",
        masInfo = "Plazas limitadas. Soporte en vivo, ejercicios prácticos, proyectos guiados y certificación. Requisitos: nociones básicas de programación."
    )
}
