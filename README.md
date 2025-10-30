#PRACTICA-ESTADOS
En esta práctica solo existe un activity y todos los demás ejercicios son composables, para hacer una navegación más fluida y poder visualizar todo desde la misma app.

https://github.com/jesuscb123/PracticaEstados/blob/d4f875fbe7fd376655a8b94334ffdb2120349688/app/src/main/java/dam2/jetpack/practicaestados/MainActivity.kt#L1-L142

## Ejercicio1
Diseña una tarjeta de producto con: imagen, título (longitud variable), precio y un botón “Comprar”.
  - El botón debe alinearse a la derecha de una barrera creada con el título y el precio, de forma que nunca se solape aunque el título sea largo.
    
    Primero debemos crear la barrera con el título y el precio dentro de un Constraint Layaout.
https://github.com/jesuscb123/PracticaEstados/blob/d4f875fbe7fd376655a8b94334ffdb2120349688/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio1.kt#L43-L45

    Luego al botón de comprar, le decimos que se situe a la derecha de la barrera, de esta forma, aunque el texto sea largo, nunca pisará el botón.

https://github.com/jesuscb123/PracticaEstados/blob/d4f875fbe7fd376655a8b94334ffdb2120349688/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio1.kt#L47-L56

  - Pide un margen uniforme entre el grupo de texto y el botón.

    Le añadimos un margen a los dos textos para que haya un margen.
    
    https://github.com/jesuscb123/PracticaEstados/blob/d4f875fbe7fd376655a8b94334ffdb2120349688/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio1.kt#L67-L83
  - Comprueba con títulos cortos y largos que la alineación se mantiene.

    

