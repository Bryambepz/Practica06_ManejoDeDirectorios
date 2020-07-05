# Practica06_ManejoDeDirectorios
Manejo de directorios
## Lenguaje 
- Java JDK 1.8
- ID Netbeans Apache 11.3
## Librerias
- java.io.File;
- java.io.IOException;
- java.text.SimpleDateFormat;
- java.util.ArrayList;
- java.util.Date;
- java.util.List;
- java.util.logging.Level;
- java.util.logging.Logger;
- javax.swing.DefaultListModel;
- javax.swing.JOptionPane;
# 1. Crear un repositorio en GitHub con el nombre de “Practica06_ManejoDeDirectorios”
- El repositorio que se creo se encuentra en el siguiente link de GitHub.

https://github.com/Bryambepz/Practica06_ManejoDeDirectorios

# 2. Desarrollar una aplicación para la gestión de directorios
- Creamos un proyecto en NetBeans con el nombre de “GestionarDirectorios”, con sus paquetes, controlador y vista. 
- En el paquete controlador creamos la clase “ControladorDirectorio” y en el paquete vista creamos una ventana con el nombre de “VentanaPrincipal”.

![image](https://user-images.githubusercontent.com/64825176/86539181-2ca17b00-bec0-11ea-9e52-99a3634a1e95.png)

### ControladorDirectorio
- En el controlador directorio creamos los métodos, sus atributos y su constructor para después ser llamado desde la ventana para la gestión de directorios.
Encontrar el codigo del controlador directorio.

https://github.com/Bryambepz/Practica06_ManejoDeDirectorios/blob/master/src/ec/edu/ups/controladorDirectorio/ControladorDirectorio.java

- Después de crear los atributos y constructores, creamos los métodos, para crear un directorio, para listar según el tipo de directorio, si es oculto o no. También para modificar un directorio como renombrar y eliminar, se creó un método para que al seleccionar un directorio nos visualice las características de ese archivo, como el path, tamaño en bytes, si tiene permiso de escritura y lectura y la fecha de la última modificación del archivo.
### VentanaPrincipal
- En la ventana tenemos una caja de texto para ingresar la ruta de un directorio y unos botones para mostrar los directorios ocultos o visibles según el botón que presionemos nos mostrara los directorios. 

![image](https://user-images.githubusercontent.com/64825176/86539346-5018f580-bec1-11ea-8d6b-2cf55004a894.png)

- Los directorios se visualizarán en un jList encontrados en esa ruta ingresada, en caso de no existir esa ruta nos dará un error diciendo que el directorio en esa ruta no existe.

![image](https://user-images.githubusercontent.com/64825176/86539366-85254800-bec1-11ea-9a4e-20d8f809d8e8.png)

![image](https://user-images.githubusercontent.com/64825176/86539378-9b330880-bec1-11ea-81f0-71ffae46dc90.png)

- Podemos visualizar la información de un archivo, elegimos uno y presionamos el botón mostrar información y obtendremos el path absoluto, el tamaño del archivo, si tiene acceso de escritura y lectura y la fecha de la última modificación.

- ![image](https://user-images.githubusercontent.com/64825176/86539398-b9990400-bec1-11ea-85b8-a39216051146.png)

- En la barra de menú hay la opción de “Gestionar Directorios” la presionar ahí se desplegará una lista de menús para crear, eliminar, renombrar un directorio o salir de la ventana Gestión de Directorios.

![image](https://user-images.githubusercontent.com/64825176/86539424-dd5c4a00-bec1-11ea-8414-1cd448465dd7.png)

- En el menú crear se visualizará un cuadro de texto para ingresar el nombre de un nuevo directorio que se va a crear, ingresamos el nombre y creamos el nuevo directorio, al crear verificara que se haya ingresado una ruta valida y se actualizara la lista de directorios.

![image](https://user-images.githubusercontent.com/64825176/86539445-f95feb80-bec1-11ea-99e1-bcbb8105be0f.png)

![image](https://user-images.githubusercontent.com/64825176/86539452-0381ea00-bec2-11ea-8f64-209d237b174a.png)

- El menú eliminar, ingresamos el nombre de un directorio que vamos a eliminar según la ruta que este en la caja de texto y preguntará si estamos seguros de eliminar ese archivo. 

![image](https://user-images.githubusercontent.com/64825176/86539460-1694ba00-bec2-11ea-8785-a03ef5a57c2b.png)

![image](https://user-images.githubusercontent.com/64825176/86539463-20b6b880-bec2-11ea-8552-48f47d4ef5fa.png)

![image](https://user-images.githubusercontent.com/64825176/86539465-2ad8b700-bec2-11ea-8adb-3eb3145a3aab.png)

- Si el archivo no existe se abrirá un cuadro diciendo que no existe ese archivo.

![image](https://user-images.githubusercontent.com/64825176/86539476-3f1cb400-bec2-11ea-8446-ecc99c71de15.png)

- El menú renombrar, seleccionamos un archivo del jList y al seleccionar renombrar se abrirá un cuadro para ingresar el nuevo nombre, aceptamos y se actualizará la lista con el nuevo nombre.

![image](https://user-images.githubusercontent.com/64825176/86539493-58256500-bec2-11ea-9413-0848b7e0fe17.png)

![image](https://user-images.githubusercontent.com/64825176/86539498-607da000-bec2-11ea-830d-98550c756a51.png)

# 3. Se realizo varios commits para verificar el avance del programa
- Los commits se en cuentran en el link:

https://github.com/Bryambepz/Practica06_ManejoDeDirectorios/commits/master

# RESULTADOS
- Se aplico lo visto en clases sobre la gestión de directorios, para crear y eliminar un directorio por la ruta de directorio obtenida.
# CONCLUSIONES
- Se comprendió la gestión de directorios, mediante métodos, para crear, eliminar y renombrar, y el uso de la librería swing, para la creación de ventanas y de excepciones.
# RECOMENDACIONES
- Comprender bien el uso de excepciones y la gestionar los directorios.





