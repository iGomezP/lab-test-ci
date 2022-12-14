# Ejemplo 1. - Modelos de dise帽o de microservicios con Azure

## Objetivos 馃幆

* Analizar bloque a bloque el diagrama de arquitectura en Azure.

## Desarrollo 馃摑

<img src="../assets/azure-microservices-patterns.png">

El patr贸n [Ambassador](https://docs.microsoft.com/es-es/azure/architecture/patterns/ambassador) se puede usar para la descarga de tareas comunes de conectividad de cliente, como la supervisi贸n, el registro, el enrutamiento, la seguridad (por ejemplo, TLS) de una manera independiente del lenguaje. Los servicios de Ambassador se suelen implementar como un sidecar (consulte a continuaci贸n).

El patr贸n [Anti-Corruption Layer](https://docs.microsoft.com/es-es/azure/architecture/patterns/anti-corruption-layer) implementa una fachada entre aplicaciones nuevas y heredadas para garantizar que el dise帽o de una nueva aplicaci贸n no est谩 limitado por dependencias en sistemas heredados.

El patr贸n [Backends for Frontends](https://docs.microsoft.com/es-es/azure/architecture/patterns/backends-for-frontends) crea servicios de back-end independientes para distintos tipos de clientes, como equipos de escritorio y m贸viles. De este modo, no es necesario que un 煤nico servicio de back-end controle los requisitos conflictivos de varios tipos de cliente. Este patr贸n puede ayudar a mantener cada microservicio simple gracias a la separaci贸n de problemas espec铆ficos del cliente.

El patr贸n [Bulkhead](https://docs.microsoft.com/es-es/azure/architecture/patterns/bulkhead) a铆sla los recursos cr铆ticos, como el grupo de conexiones, la memoria y la CPU, para cada carga de trabajo o servicio. Al usar patrones Bulkhead, una sola carga de trabajo (o servicio) no puede consumir todos los recursos, lo que privar铆a a otros. Este patr贸n aumenta la resistencia del sistema al evitar los errores en cascada causados por un servicio.

[Agregaci贸n de puertas de enlace](https://docs.microsoft.com/es-es/azure/architecture/patterns/gateway-aggregation) agrega solicitudes a varios microservicios individuales en una sola solicitud, lo que reduce el intercambio de mensajes entre los consumidores y los servicios.

[Descarga con puertas de enlace](https://docs.microsoft.com/es-es/azure/architecture/patterns/gateway-offloading) permite que cada microservicio descargue la funcionalidad de servicio compartido, como el uso de certificados SSL, a una puerta de enlace de API.

[Enrutamiento de puerta de enlace](https://docs.microsoft.com/es-es/azure/architecture/patterns/gateway-routing) enruta las solicitudes a varios microservicios mediante un 煤nico punto de conexi贸n para que los consumidores no tengan que administrar muchos puntos de conexi贸n independientes.

[Sidecar](https://docs.microsoft.com/es-es/azure/architecture/patterns/sidecar) implementa componentes de una aplicaci贸n auxiliar como un proceso o contenedor independiente para proporcionar aislamiento y encapsulaci贸n.

[Strangler Fig](https://docs.microsoft.com/es-es/azure/architecture/patterns/strangler-fig) admite la refactorizaci贸n incremental de una aplicaci贸n mediante el reemplazo gradual de funciones espec铆ficas por servicios nuevos.

Para obtener el cat谩logo completo de modelos de dise帽o en la nube en el Centro de arquitectura de Azure, consulte [Modelos de dise帽o en la nube](https://docs.microsoft.com/es-es/azure/architecture/patterns/).
