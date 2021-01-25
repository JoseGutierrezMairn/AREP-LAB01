# Introducción a sistemas complejos, Java, Mvn y GIT
En este laboratorio se busca escribir un programa en java que calcule la media y la derivación estandar de un grupo con  *n* números reales  
los cuales se encontrarán en un archivo de texto, se debe usar la estructura de una LinkedList sin usar la que ya está implementada en java.
### Prerrequisitos
Debemos tener los siguientes programas instalados:
~~~
* Maven
* Git
* Java
~~~
# Instalando 
Para descargar el proyecto realizaremos los siguientes pasos desde el **Simbolo del sistema** o **Command prompt**:  
1. Nos dirigimos a la ubicación donde queremos descargar el proyecto desde el simbolo del sistema.  
2. Escribimos el siguiente comando para realizar la descarga:  
`git clone https://github.com/JoseGutierrezMairn/AREP-Lab01.git`
3. Esperamos a que el simbolo de sistema nos diga que ya se realizó la descarga  
![Download completed](https://github.com/JoseGutierrezMairn/AREP-Lab01/blob/master/images/img1.PNG?raw=true)
4. El proyecto ya se encuentra en nuestros computadores y está listo para ser editado o probado.  
  
#Probando
Para probar el proyecto podemos correr las pruebas que se encuentran en la carpeta `\arep-lab01\src\test\java\edu\escuelaing\arep\app\AppTest.java`  
usando maven podemos correr las pruebas mencionadas digitando desde la linea de comandos situados dentro de la carpeta **arep-lab01**
`mvn test`
![Pruebas desde maven](https://github.com/JoseGutierrezMairn/AREP-Lab01/blob/master/images/img2.PNG?raw=true)  
Las pruebas que se encuentran en el proyecto tienen la finalidad de validar la funcionalidad de cada clase existente en el proyecto en este caso:
~~~
* Reader
* JoseLinkedList
* Calculator
* Node
* App
~~~
Para generar el javadoc ejecutamos el siguiente codigo desde la consola dentro de la carpeta **arep-lab01**: `mvn javadoc:javadoc`  
![generando javadoc](https://github.com/JoseGutierrezMairn/AREP-Lab01/blob/master/images/img3.PNG?raw=true)  
![generando javadoc2](https://github.com/JoseGutierrezMairn/AREP-Lab01/blob/master/images/img4.PNG?raw=true)  
Podemos consultar la documentación generada el archivo: `\arep-lab01\target\site\apidocs`  
*Este es un ejemplo de como se ve la documentación generada en este proyecto*
![check javadoc2](https://github.com/JoseGutierrezMairn/AREP-Lab01/blob/master/images/img5.PNG?raw=true)  
# Desarrollo  
Construido con:
* [Maven](https://maven.apache.org/)
* [Java](https://www.java.com/es/)
# Autor
* [Jose Gutierrez](https://github.com/JoseGutierrezMairn)