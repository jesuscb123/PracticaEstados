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

    He creado una variable que contiene un ChainStyle para que luego pueda ser modificado por los botones.
    En un row introduzco los diferentes botones que cuándo se pulsen, cambiará la forma en la que se muestran los textos.
        
    https://github.com/jesuscb123/PracticaEstados/blob/7d21a6223752baa3293512c6d873fe49b3646160/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio2.kt#L31-L63

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

IMAGEN DEL EJERCICIO

## Ejercicio5
Crea una pantalla con un texto y un botón que permita mostrar u ocultar ese texto. El botón debe cambiar su etiqueta según el estado actual (“Mostrar texto” /  “Ocultar texto”).

https://github.com/jesuscb123/PracticaEstados/blob/a209b1089de03b2d954b24c76437a16477985abe/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio5.kt#L17-L37

Para hacer que el texto desaparezca cuándo se pulse un botón, creamos una variable booleana para que actúe de interruptor.

https://github.com/jesuscb123/PracticaEstados/blob/a209b1089de03b2d954b24c76437a16477985abe/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio5.kt#L19

Mediante una condición, el texto aparecerá si el interruptor es true y desaparecerá si es falso.

https://github.com/jesuscb123/PracticaEstados/blob/a209b1089de03b2d954b24c76437a16477985abe/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio5.kt#L22-L26

Al pulsar el botón, hará que sea true o false dependiendo del estado actual del interruptor.

https://github.com/jesuscb123/PracticaEstados/blob/a209b1089de03b2d954b24c76437a16477985abe/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio5.kt#L28-L33

IMAGEN DEL EJERCICIO

## Ejercicio extra
Una startup cultural te pide el prototipo de una tarjeta de evento para su app. La  tarjeta debe adaptarse a textos de longitud variable, distintas anchuras de pantalla y permitir interacción sin recargar toda la app. No se entrega código de ejemplo; tú decides cómo implementarlo con Jetpack Compose. 

Primero voy a mostrar todo el código de este ejercicio y luego desglosaremos cada apartado.

https://github.com/jesuscb123/PracticaEstados/blob/a209b1089de03b2d954b24c76437a16477985abe/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio6.kt#L1-L121

 - Cabecera visual
     - Todos los ejercicios están realizados sobre composables y un solo Activity. Para la cabecera utilizo una función cabecera que recibe un título, un subtitulo y un modifier para poder utilizarlo dentro del constraint layout.
   
       https://github.com/jesuscb123/PracticaEstados/blob/7d21a6223752baa3293512c6d873fe49b3646160/app/src/main/java/dam2/jetpack/practicaestados/Cabecera.kt#L16-L21

    Luego se introduce dentro del constraint layout y le indicamos dónde irá situado dentro de la tarjeta. El título y el subtítulo nunca se solapan debido a que están introducidos en un Column.

     https://github.com/jesuscb123/PracticaEstados/blob/7d21a6223752baa3293512c6d873fe49b3646160/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio6.kt#L42-L49
   
- Cuerpo
  La descripciónestá introducida en un Box y alineado al centro. Gracias a Constraint Layout puedo colocar la descripción justo debajo de la cabecera.

  https://github.com/jesuscb123/PracticaEstados/blob/7d21a6223752baa3293512c6d873fe49b3646160/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio6.kt#L51-L55

  También dispone de otro texto más abajo para poder ampliar la descripción del evento pero puede ser ocultado si el usuario lo desea a través de un botón. El texto depende de una variable booleana, si es true se oculta y si es false aparece.

  https://github.com/jesuscb123/PracticaEstados/blob/7d21a6223752baa3293512c6d873fe49b3646160/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio6.kt#L57-L70

  https://github.com/jesuscb123/PracticaEstados/blob/7d21a6223752baa3293512c6d873fe49b3646160/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio6.kt#L72-L80

  La fila de acciones son distintos botones, si haces click en interesa, el contador de personas interesadas se incrementa, si le das a compartir aparecerá un toast igual que el botón guardar. Se ven equilibradas en horizontal ya que uso un ChainStyle.spread

  https://github.com/jesuscb123/PracticaEstados/blob/7d21a6223752baa3293512c6d873fe49b3646160/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio6.kt#L85-L123

- Pie interactivo
  Un contador con un rememberSaveable para que al rotar no se reinicie el contador.

  https://github.com/jesuscb123/PracticaEstados/blob/7d21a6223752baa3293512c6d873fe49b3646160/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio6.kt#L34

  Cuenta con un texto que define cuántas personas están interesadas que se irán incrementando conforme pulsen el botón de interesa. Junto al contador, hay un texto clickable que resta el contador si el usuario decide que no le interesa el evento.

  https://github.com/jesuscb123/PracticaEstados/blob/7d21a6223752baa3293512c6d873fe49b3646160/app/src/main/java/dam2/jetpack/practicaestados/Ejercicio6.kt#L111-L126

  IMAGEN DEL EJERCICIO

Preview: 
He definido varias preview que cuenta con cada una de las espeficiaciones: 

Primer preview:

https://github.com/jesuscb123/PracticaEstados/blob/7d21a6223752baa3293512c6d873fe49b3646160/app/src/main/java/dam2/jetpack/practicaestados/PreviewEj6.kt#L8-L23

Segundo preview: 

https://github.com/jesuscb123/PracticaEstados/blob/7d21a6223752baa3293512c6d873fe49b3646160/app/src/main/java/dam2/jetpack/practicaestados/PreviewEj6.kt#L25-L40
