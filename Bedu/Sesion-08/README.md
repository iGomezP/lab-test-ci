## Sesi贸n 8: CI/CD con Jenkins / testing 馃

### 1. Objetivos :dart: 

- Configurar Pipelines de CI/CD con Jenkins
- Configuraci贸n de herramientas de Test y Seguridad

### 2. Contenido :blue_book:

Docker te ayudar谩 a automatizar el despliegue de aplicaciones dentro de contenedores de software, proporcionando una capa adicional de abstracci贸n y automatizaci贸n de virtualizaci贸n de aplicaciones en m煤ltiples sistemas operativos. 

Por otra parte, dentro del flujo de integraci贸n es importante utilizar una plataforma para evaluar c贸digo fuente. Hay muchas de software libre y paga, y usan diversas herramientas de an谩lisis est谩tico de c贸digo fuente como Checkstyle, PMD o FindBugs para obtener m茅tricas que pueden ayudar a mejorar la calidad del c贸digo de un programa. Como DevOps es importante automatizar dichos procesos y notificar anomal铆as a las 谩reas hermanas (Desarrollo, Producci贸n y QA).

---

#### Tema 1

Se configuran Pipelines declarativos basados en SCM Git en Jenkins para automatizar las pruebas del proyecto.

- [**`EJEMPLO 1`**](./Ejemplo-01)

---

#### Tema 2

Instalamos el servicio SonarQube para hacer pruebas de an谩lisis de c贸digo est谩tico del c贸digo de tu aplicaci贸n.

- [**`EJEMPLO 2`**](./Ejemplo-02)

---

#### Tema 3

Integraremos pruebas de seguridad en el c贸digo a trav茅s de an谩lisis est谩tico. Integramos SonarQube con Jenkins para hacer los tests desde el Pipeline.

- [**`EJEMPLO 3`**](./Ejemplo-03)

---

#### Tema 4

Integramos pruebas de vulnerabildades en el c贸digo de la aplicaci贸n usando OWASP ZAP. El cual analiza las dependencias de las aplicaciones
para detectar vulnerabilidades que pongan en riesgo la aplicaci贸n.

- [**`EJEMPLO 4`**](./Ejemplo-04)

---

### 3. Postwork

Encuentra las indicaciones y consejos para reflejar los avances de tu proyecto de este m贸dulo.

- [**`POSTWORK SESI脫N 1`**](./Postwork/)