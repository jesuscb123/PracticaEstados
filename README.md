# PRACTICA-ESTADOS

En esta práctica solo existe un activity y todos los demás ejercicios son composables, para hacer una navegación más fluida y poder visualizar todo desde la misma app.

https://github.com/jesuscb123/PracticaEstados/blob/d4f875fbe7fd376655a8b94334ffdb2120349688/app/src/main/java/dam2/jetpack/practicaestados/MainActivity.kt#L1-L142

## Ejercicio1
Diseña una tarjeta de producto con: imagen, título (longitud variable), precio y un botón “Comprar”.
  - El botón debe alinearse a la derecha de una barrera creada con el título y el precio, de forma que nunca se solape aunque el título sea largo.
    
    Primero debemos crear la barrera con el título y el precio dentro de un Constraint Layout.
https://github.com/jesuscb123/PracticaEstados/blob/d4f875fbe7fd376655a8b94334ffdb2120349688/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio1.kt#L43-L45

    Luego al botón de comprar, le decimos que se situe a la derecha de la barrera, de esta forma, aunque el texto sea largo, nunca pisará el botón.

https://github.com/jesuscb123/PracticaEstados/blob/d4f875fbe7fd376655a8b94334ffdb2120349688/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio1.kt#L47-L56

  - Pide un margen uniforme entre el grupo de texto y el botón.

    Le añadimos un margen a los dos textos para que haya un margen.
    
    https://github.com/jesuscb123/PracticaEstados/blob/d4f875fbe7fd376655a8b94334ffdb2120349688/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio1.kt#L67-L83
  - Comprueba con títulos cortos y largos que la alineación se mantiene.

    Con texto corto:
    
    <img width="554" height="281" alt="image" src="https://github.com/user-attachments/assets/d9e237c2-977f-4353-84af-64110367dd01" />

    Los textos largos no colapsan al botón ya que tiene la barrera y el botón se posiciona detrás de la barrera:
    
    <img width="509" height="264" alt="image" src="https://github.com/user-attachments/assets/ec0056f7-6b37-484d-9811-26bafd8868cf" />

    ## Ejercicio2
    Crea una barra con tres acciones (solo texto, sin iconos): por ejemplo “Explorar”, “Favoritos”, “Perfil”.

      - Colócalas en una cadena horizontal y prueba tres estilos: Spread, SpreadInside y Packed.
   
        Para colocarlos en una cadena horizontal y probar estos diferentes estilos, debemos hacer uso de constraint layout.

        Barra spread:
        Utilizamos createHorizontalChain, le debemos pasar la referencia de los botones y el tipo de chain Style, en este caso, spread.
        
        https://github.com/jesuscb123/PracticaEstados/blob/8cfc113c7dff3e738ce17940c7e961e31a0a97ba/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio2.kt#L51-L77

        Barra Inside:

        https://github.com/jesuscb123/PracticaEstados/blob/8cfc113c7dff3e738ce17940c7e961e31a0a97ba/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio2.kt#L79-L105

        Barra Packed:

        https://github.com/jesuscb123/PracticaEstados/blob/8cfc113c7dff3e738ce17940c7e961e31a0a97ba/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio2.kt#L107-L133

        Todas los tipos de barras:

        <img width="351" height="361" alt="image" src="https://github.com/user-attachments/assets/47df7955-779e-4235-b639-dbf43055b82f" />

        

    - Justifica cuál elegirías para una barra de navegación inferior y por qué mejora la usabilidad.

      Elegiría spread ya que se reparten los botones de manera uniforme, no hay tanto espacio como en el inside, pero hay un poco más de margen respecto a packed.

# Ejercicio3



