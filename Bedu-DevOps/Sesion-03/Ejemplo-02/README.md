# Ejemplo 2 - Proyecto Terraform

## Objetivo 馃幆

* Identificar las partes basicas que componen un m贸dulo de Terraform

## Desarrollo 馃摑

La estructura de un proyecto en Terraform (**tf**) es modular, la carpeta actual desde donde corremos tf es considerada como el m贸dulo ra铆z, y este puede ejecutar otros sub m贸dulos o m贸dulos externos.

Al interpretar el c贸digo, Terraform fusiona todos los archivos con extensi贸n ```.tf``` que se encuentran el la carpeta de trabajo (```pwd```) y los considera como un solo m贸dulo, puedes referenciar recursos de un archivo en otro archivo sin necesidad de declarar una importaci贸n ya que todos estos archivos se tratan como si fuera un solo archivo.

Terraform es un lenguaje declarativo y su sint谩xis b谩sica es:

```<bloque> <tipo> <nombre> { ... }```

Por ejemplo:

```terraform
resource "aws_iam_user" "usr_mark"  {
    name = "mark@email.com"
}
```

En este ejemplo solo necesitamos un archivo, que hemos llamado: ```main.tf``` (馃摑 El nombre no tiene una funci贸n, puede ser el que sea), y su estructura va de la siguiente forma:

* Un bloque ```terraform```, para configurar el motor de **tf**.

```terraform
terraform {
  required_providers {
    docker = {
      source = "kreuzwerker/docker"
      version = ">= 2.16.0"
    }
  }
}
```

* Un bloque ```provider```, para cofigurar el proveedor

```terraform
provider "docker" {
  host = "npipe:////.//pipe//docker_engine"
}
```
* Uno o varios bloques ```resource```, ej:

```terraform
resource "docker_image" "microservice" {
  name   = "microservice"
  build {
    path = "../microservice/."
    tag  = [
      "microservice:latest"
      ]
  }
}
```

En **tf** existen otros tipos de bloques que no estamos utilizando en este ejemplo, como ```variable```, ```data```, ```module``` etc.

>馃挕 Usuarios MacOS:
>
> En MacOS no se necesita configurar la secci贸n host del proveedor, comenta la l铆nea 11 antes de iniciar.