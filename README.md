# Backend API para Gestión de Cursos y Temas

Este proyecto es un backend para una API que permite gestionar cursos y asignarles temas. La API proporciona endpoints para crear, editar y eliminar cursos y temas, así como para asociar temas a cursos.

## Características

- **Gestión de Cursos:** Crear, editar y eliminar cursos.
- **Gestión de Temas:** Crear, editar y eliminar temas.
- **Asignación de Temas a Cursos:** Asociar uno o varios temas a un curso.

## Tecnologías Utilizadas

- **Java con Spring Boot:** Framework para el desarrollo de aplicaciones Java.
- **Spring Data JPA:** Para la gestión de la persistencia de datos.
- **MySQL:** Base de datos relacional para el almacenamiento de datos.

## Endpoints Disponibles

### Cursos

- **POST /api/cursos/crear**
  - Crea un nuevo curso.
  - **Request Body:** `Curso` (nombre, modalidad, fecha_finalizacion).

- **GET /api/cursos/traer**
  - Obtiene la lista de todos los cursos.

- **DELETE /api/cursos/eliminar/{id}**
  - Elimina un curso por su ID.

- **PUT /api/cursos/editar**
  - Edita un curso existente.
  - **Request Body:** `Curso` (id, nombre, modalidad, fecha_finalizacion).

- **GET /api/cursos/buscar/palabra**
  - Busca cursos por nombre.
  - **Request Param:** `palabra` (cadena para búsqueda).

- **GET /api/cursos/temas/{id_curso}**
  - Obtiene los temas asociados a un curso por su ID.

### Temas

- **POST /api/temas/crear**
  - Crea un nuevo tema.
  - **Request Body:** `Tema` (nombre, descripcion).

- **GET /api/temas/traer**
  - Obtiene la lista de todos los temas.

- **DELETE /api/temas/eliminar/{id}**
  - Elimina un tema por su ID.

- **PUT /api/temas/editar**
  - Edita un tema existente.
  - **Request Body:** `Tema` (id, nombre, descripcion).

## Estado del Proyecto

Este proyecto está en fase de desarrollo.
