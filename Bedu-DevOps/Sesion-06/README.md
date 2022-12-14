## Sesi贸n 6: CI/CD con Jenkins y Groovy 馃

<img src="../images/android-kotlin.png" align="right" height="120" hspace="10">
<div style="text-align: justify;">

### 1. Objetivos :dart: 

- Mostrar c贸mo se usa Jenkins para orquestar la creaci贸n de una aplicaci贸n Java simple con Maven.
- Integraci贸n de repositorio dentro de un flujo CI/CD

### 2. Contenido :blue_book:

Se presenta la simulaci贸n de un caso en el que el desarrollador de Java que usa Maven y es nuevo en los conceptos de CI/CD, o si est谩 familiarizado con estos conceptos pero no sabe c贸mo implementar la creaci贸n de su aplicaci贸n usando Jenkins, requiere que los cambios que realice sean fluidos y no deba preocuparse por que su c贸digo funcione en cualquier equipo.

La aplicaci贸n Java simple (que obtendr谩 de un repositorio de muestra en GitHub) genera la cadena "隆Hola mundo!" y se acompa帽a de un par de pruebas unitarias para comprobar que la aplicaci贸n principal funciona como se esperaba. Los resultados de estas pruebas se guardan en una carpeta local que simularemos como nuestro Deploy.

---

<img src="images/tools.png" align="right" height="90"> 

#### <ins>Tema 1</ins>

Se detalla un escenario en el que el equipo de desarrollo y el equipo de operaciones no pueden comunicarse entre ellos, demostrando el porqu茅 surge y la importancia del flujo del equipo DevOps.

- [**`EJEMPLO 1`**](./Ejemplo-01)

---

<img src="images/structure.png" align="right" height="90"> 

#### <ins>Tema 2</ins>

Una vez que se haya comprendido una problem谩tica cotidiana en el desarrollo de TI, hay que indagar ahora en el CI/CD, cu谩l es la estructura de un flujo ideal, los stages que debe tener, as铆 como un reto verdadero reto de crear tu propio pipeline con un plugin que obtenga el c贸digo de Github.

- [**`EJEMPLO 2`**](./Ejemplo-02)
- [**`RETO 1`**](./Reto-01)
---

<img src="images/emulator.jpg" align="right" height="90"> 

#### <ins>Tema 3</ins>

Ahora que podemos definir por nuestra cuenta los jobs, debemos definir una parte importante para agilizar los cambios del desarrollador, que es automatizar al grado en el que al hacer un cambio en Github, este sea reconocido por nuestro job y se ejecute autom谩ticamente. 

<img src="images/chaomi.png" align="right" height="110"> 

#### <ins>Tema 4</ins>

Llegar a este punto hace de t铆 una persona dedicada y te has demostrado que puedes lograr nuevos retos. Eso significa que puedes ampliar el panorama del flujo de integraci贸n. Es importante conocer qu茅 herramientas se pueden agregar dentro de nuestros jobs para reforzar la integridad del c贸digo de nuestro equipo, reducir bugs, errores y que el ambiente en general sea seguro.


### 3. Postwork :memo:

Encuentra las indicaciones y consejos para reflejar los avances de tu proyecto de este m贸dulo.

- [**`POSTWORK SESI脫N 1`**](./Postwork/)

<br/>


</div>

