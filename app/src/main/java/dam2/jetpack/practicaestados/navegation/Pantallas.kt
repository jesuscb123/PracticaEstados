package dam2.jetpack.practicaestados.navegation

sealed class Pantallas(val rutaComposable: String, textoBoton: String) {
    data object Home : Pantallas ("home", "home")
    data object Ejercicio2 : Pantallas("ejercicio2", "Ejercicio 2")
    data object Ejercicio3 : Pantallas("ejercicio3", "Ejercicio 3")
    data object Ejercicio4 : Pantallas("ejercicio4", "Ejercicio 4")
    data object Ejercicio5 : Pantallas("ejercicio5", "Ejercicio 5")

    data object Ejercicio6 : Pantallas("ejercicio6", "Ejercicio 6")

}