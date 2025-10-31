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

## Ejercicio3
Crea una pantalla con un botón y un cuadro de color (Box). 
Cada vez que pulses el botón, el color del cuadro debe cambiar aleatoriamente 
entre varios colores (por ejemplo, rojo, verde, azul o amarillo).

El ejercicio está realizado con un Column para separar en columnas el cuadrado: el texto para que aparezca el nomnbre del color y el botón que cambiará el color. Estos elementos están en el centro.

https://github.com/jesuscb123/PracticaEstados/blob/503ade479f1597fbd600e12541d1f43ed78bd49d/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio3.kt#L28-L59

He creado un diccionario de colores en el que la clave es el nombre del color (String) y la clave es el color. Para que pueda ir modificando el color de forma aleatoria cada vez que pulsamos el botón, 
he creado una variable que almacena la clave del diccionario, en este caso es un String: el nombre del color. Luego tengo otra variable que almacena el color, llamando a una función que he creado que dependiendo de la clave que tenga asignada la variable nombreColor, devolverá un color u otro.

Entonces cada vez que se pulsa el botón, se cambia la clave y el color asignado cambiará.

La variable nombreColor está almacenada con by rememberSaveable para que al rotar no cambie.

https://github.com/jesuscb123/PracticaEstados/blob/503ade479f1597fbd600e12541d1f43ed78bd49d/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio3.kt#L42-L43

https://github.com/jesuscb123/PracticaEstados/blob/503ade479f1597fbd600e12541d1f43ed78bd49d/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio3.kt#L54-L59

IMAGEN DEL EJERCICIO

## Ejercicio4
Crea una vista con dos botones: uno que sume y otro que reste un valor. El valor actual se muestra en el centro de la pantalla.

Los botones y el contador están introducidos en un column para que se separen de manera vertical y se situen en el centro de la pantalla. A su vez, los botones están en un row para separarlos horizontalmente.
https://github.com/jesuscb123/PracticaEstados/blob/d9a9342ec56642c486037c4c2eeddd920a182d02/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio4.kt#L23-L47

Para este ejercicio he creado un contador con rememberSaveable para que al rotar no se reinicie el contador. 

https://github.com/jesuscb123/PracticaEstados/blob/d9a9342ec56642c486037c4c2eeddd920a182d02/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio4.kt#L26

El botón de sumar irá aumentando el número del contador con cada click:

https://github.com/jesuscb123/PracticaEstados/blob/d9a9342ec56642c486037c4c2eeddd920a182d02/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio4.kt#L35-L37

El botón de restar disminuye el número del contador con cada click, pero cuándo el contador llega a 0, el botón deja de funcionar.

https://github.com/jesuscb123/PracticaEstados/blob/d9a9342ec56642c486037c4c2eeddd920a182d02/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio4.kt#L39-L43

