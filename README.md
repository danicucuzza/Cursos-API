# Backend API para Gestión de Cursos y Temas

Este proyecto es un backend para una API que permite gestionar cursos y asignarles temas. La API proporciona endpoints para crear, editar y eliminar cursos y temas, así como para asociar temas a cursos.

## Características

### Gestión de Cursos
- **Crear Curso:** Permite agregar un nuevo curso a la base de datos.
- **Editar Curso:** Permite modificar los detalles de un curso existente.
- **Eliminar Curso:** Permite eliminar un curso de la base de datos.
- **Buscar Curso por Nombre:** Permite buscar cursos que contengan una palabra clave en su nombre.
- **Consultar Temas por Curso:** Devuelve una lista de temas asociados a un curso específico.
- **Agregar Temas a un Curso:** Permite asociar uno o varios temas a un curso existente.

### Gestión de Temas
- **Crear Tema:** Permite agregar un nuevo tema a la base de datos.
- **Editar Tema:** Permite modificar los detalles de un tema existente.
- **Eliminar Tema:** Permite eliminar un tema de la base de datos.
- **Buscar Tema por Nombre:** Permite buscar temas que contengan una palabra clave en su nombre.
- **Consultar Temas por IDs:** Devuelve una lista de temas basados en una lista de identificadores.

## Tecnologías Utilizadas
- **Java con Spring Boot:** Framework para el desarrollo de aplicaciones Java.
- **Spring Data JPA:** Para la gestión de la persistencia de datos.
- **MySQL:** Base de datos relacional para el almacenamiento de datos.

## Endpoints Disponibles

### Cursos
- **POST /api/cursos/crear**
  - Crea un nuevo curso.
  - **Request Body:** Curso (nombre, modalidad, fecha_finalizacion).

- **GET /api/cursos/traer**
  - Obtiene la lista de todos los cursos.

- **DELETE /api/cursos/eliminar/{id}**
  - Elimina un curso por su ID.

- **PUT /api/cursos/editar**
  - Edita un curso existente.
  - **Request Body:** Curso (id, nombre, modalidad, fecha_finalizacion).

- **GET /api/cursos/buscar/palabra**
  - Busca cursos por nombre.
  - **Request Param:** palabra (cadena para búsqueda).

- **GET /api/cursos/temas/{id_curso}**
  - Obtiene los temas asociados a un curso por su ID.

### Temas
- **POST /api/temas/crear**
  - Crea un nuevo tema.
  - **Request Body:** Tema (nombre, descripcion).

- **GET /api/temas/traer**
  - Obtiene la lista de todos los temas.

- **DELETE /api/temas/eliminar/{id}**
  - Elimina un tema por su ID.

- **PUT /api/temas/editar**
  - Edita un tema existente.
  - **Request Body:** Tema (id, nombre, descripcion).

- **GET /api/temas/buscar/palabra**
  - Busca temas por nombre.
  - **Request Param:** palabra (cadena para búsqueda).

- **GET /api/temas/ids**
  - Obtiene una lista de temas basados en una lista de IDs.
  - **Request Param:** ids (lista de identificadores separados por comas, ej. `ids=1,2,3`)

## Implementación de Servicios

### `CursoService`
- **getCursos():** Obtiene todos los cursos disponibles.
- **saveCurso(Curso curso):** Guarda un nuevo curso o actualiza uno existente.
- **deleteCurso(Long id_curso):** Elimina un curso por su ID.
- **findCurso(Long id_curso):** Busca un curso por su ID.
- **editCurso(Curso curso):** Edita un curso existente.
- **findCursoByName(String palabra):** Busca cursos por nombre que contengan una palabra clave.
- **temasByCurso(Long id_curso):** Obtiene todos los temas asociados a un curso específico.
- **addTemasInCurso(Long id_curso, List<Long> temasIds):** Asocia uno o varios temas a un curso.

### `TemaService`
- **getTemas():** Obtiene todos los temas disponibles.
- **saveTema(Tema tema):** Guarda un nuevo tema o actualiza uno existente.
- **deleteTema(Long id_tema):** Elimina un tema por su ID.
- **findTema(Long id_tema):** Busca un tema por su ID.
- **editTema(Tema tema):** Edita un tema existente.
- **getTemasByIds(List<Long> ids):** Obtiene una lista de temas basados en una lista de IDs.
- **findTemaByName(String palabra):** Busca temas por nombre que contengan una palabra clave.

## Ejemplos de Uso

### Buscar Curso por Nombre
- **Endpoint:** `GET /api/cursos/buscar/palabra`
- **Query Parameter:** `palabra` (la palabra clave para buscar en el nombre del curso)
- **Respuesta:** Lista de cursos que contienen la palabra clave en su nombre.

### Buscar Tema por Nombre
- **Endpoint:** `GET /api/temas/buscar/palabra`
- **Query Parameter:** `palabra` (la palabra clave para buscar en el nombre del tema)
- **Respuesta:** Lista de temas que contienen la palabra clave en su nombre.

## Estado del Proyecto
Este proyecto está en fase de desarrollo.

