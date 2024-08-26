
## Descripción

Es una aplicación desarrollada en Java utilizando Spring Boot. Su propósito principal es gestionar una lista de tareas, permitiendo a los usuarios crear, actualizar, listar y eliminar tareas. Cada tarea tiene un título, descripción, estado (pendiente o completada), y una fecha de creación. Este proyecto implementa principios de Inversión de Dependencias mediante el uso de interfaces, lo que facilita la escalabilidad y mantenibilidad del código.

## Características

- **Gestión de Tareas**: Crea, actualiza, lista y elimina tareas.
- **Estado de las Tareas**: Las tareas pueden estar en estado "PENDING" (pendiente) o "COMPLETED" (completada).
- **Filtro de Tareas por Estado**: Lista las tareas según su estado.
- **Persistencia de Datos**: Uso de JPA (Java Persistence API) con MySQL para la persistencia de datos.
- **Inversión de Dependencias**: Implementación de interfaces para un desacoplamiento eficiente y fácil mantenimiento del código.

## Tecnologías Utilizadas

- **Java 21**: Lenguaje de programación utilizado para desarrollar la aplicación.
- **Spring Boot**: Framework principal utilizado para la construcción de la API REST.
- **Spring Data JPA**: Utilizado para la interacción con la base de datos.
- **MySQL**: Base de datos relacional utilizada para almacenar las tareas.
- **Maven**: Herramienta de gestión de dependencias y construcción del proyecto.
