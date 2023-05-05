# moviles
Preguntas de laboratorio07
1-¿Qué ventajas tiene el utilizar LiveData?
Garantiza que la IU coincida con el estado de los datos. 
LiveData sigue el patrón del observador. 
LiveData notifica a los objetos Observer cuando cambian los datos subyacentes.

2-¿Qué patron de diseño utiliza Live Data?
Patron de diseño singleton.

3-Menciona porque se debe agregar el gradle para poder implementar DataBinding
Porque la biblioteca de vinculación de datos se incluye con el complemento de Gradle para Android.
 
4-¿Que es DataBinging? Menciona sus ventajas frente a findViewByid 
El Data Binding o enlace de datos en español es un mecanismo que enlaza los elementos de la interfaz
con la parte en la que se arma la información a mostrar. 
En pocas palabras, es el enlace entre el front y el back de nuestra web. 
VENTAJAS.
-Seguridad nula: Debido a que la vinculación de vista crea referencias directas a las vistas, 
    no hay riesgo de una excepción de puntero nulo debido a un ID de vista no válido. Además,
    cuando una vista solo está presente en algunas configuraciones de un diseño,
    el campo que contiene su referencia en la clase de vinculación se marca con Nullable.
-Seguridad de tipos: Los campos de cada clase de vinculación tienen tipos que coinciden con las 
    vistas a las que hacen referencia en el archivo XML. 
 

