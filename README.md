#  Gestor de Archivos (File Manager) en Java

##  Descripción General

Este es un proyecto de utilidad desarrollado en **Java**, diseñado para interactuar con el sistema de archivos local a través de una **interfaz de consola (CLI)**. La aplicación funciona como un explorador de archivos básico, permitiendo al usuario realizar operaciones **CRUD** (Crear, Leer, Actualizar, Borrar) sobre archivos y directorios.

El objetivo principal es demostrar un manejo robusto de la API de Entrada/Salida (I/O) de Java, ya sea `java.io` o la más moderna `java.nio` (NIO.2).

---

##  Características Principales

* **Navegación de Directorios:** Permite listar el contenido (archivos y subdirectorios) de una ruta específica.
* **Creación:** Capacidad de crear nuevos archivos (`.txt`, etc.) y nuevos directorios (carpetas).
* **Lectura de Archivos:** Permite leer el contenido de archivos de texto y mostrarlo en consola.
* **Escritura de Archivos:** Permite escribir o sobrescribir contenido en archivos de texto.
* **Borrado:** Elimina archivos o directorios (incluyendo manejo de directorios no vacíos, si está implementado).
* **(Opcional) Copiar y Mover:** Lógica para duplicar o reubicar archivos y directorios en el sistema de archivos.

---

##  Arquitectura y Tecnologías

### Tecnologías Utilizadas

* **Lenguaje:** **Java** (Core)
* **APIs de I/O:** **Java `java.io`** o **`java.nio` (NIO.2)**
    * Uso de clases como `File`, `Path`, `Files`, `Paths`.
    * Manejo de flujos (Streams) como `BufferedReader`, `BufferedWriter`, `FileReader`, `FileWriter` para la manipulación de archivos.
* **Entrada:** `Scanner` o `BufferedReader(new InputStreamReader(System.in))` para leer los comandos del usuario desde la consola.

### Estructura del Proyecto

* **`GestorArchivos.java` (o `FileManager.java`):** Una clase de servicio que **encapsula** toda la lógica de I/O. Contiene métodos estáticos o de instancia para cada operación (`crearArchivo()`, `leerArchivo()`, `listarDirectorio()`, `borrar()`, etc.).
* **`Main.java`:** El punto de entrada de la aplicación. Contiene la interfaz de usuario (CLI), presenta un menú de opciones al usuario y llama a los métodos del `GestorArchivos` para ejecutar la operación solicitada.
