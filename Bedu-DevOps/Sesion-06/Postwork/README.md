# Postwork - Sesi贸n 6 

馃幆 Objetivos
* Agregar CICD a nuestros microservicios.
* Agregar pruebas manuales y automatizadas.


馃殌 Desarrollo
Probar con anterioridad, ayuda a que los errores no lleguen hasta el ambiente de producci贸n. Para esto los pipelines nos ayudan para tener etapas en las que si una falla, las subsiguientes no se ejecutan. Si falla en la etapa de construcci贸n o las pruebas, entonces una etapa de entrega a producci贸n nunca suceder铆a.
* Configura Jenkins para que tenga la informaci贸n de conexi贸n al contenedor mysql.
* Crea dos proyectos para ejecutar tus microservicios de login y de aplicaci贸n. Deber谩s construir la nueva im谩gen del contenedor y reemplazar los contenedores anteriores.
* Verifica que los proyectos se inicien al mandar cambios al repositorio.
* Crea pruebas manuales con Postman y pruebas automatizadas en el CICD.


馃挕 Consulta [en esta carpeta](./) los archivos para la soluci贸n del postwork de esta sesi贸n. Est谩n separados en tres carpetas que representan tres repositorios diferentes.