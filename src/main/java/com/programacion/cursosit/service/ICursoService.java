package com.programacion.cursosit.service;

import com.programacion.cursosit.dto.CursoTemaDTO;
import com.programacion.cursosit.model.Curso;
import com.programacion.cursosit.model.Tema;

import java.util.List;

public interface ICursoService {

    //OBTENER TODOS LOS CURSOS
    public List<Curso> getCursos();

    //GUARDAR UN NUEVO CURSO
    public void saveCurso (Curso curso);

    //ELIMINAR UN CURSO POR ID
    public void deleteCurso (Long id_curso);

    //BUSCAR UN CURSO POR ID
    public Curso findCurso (Long id_curso);

    //EDITAR UN CURSO EXISTENTE
    public void editCurso(Curso curso);

    //BUSCAR CURSO POR NOMBRE (PALABRA CLAVE)
    public List<Curso> findCursoByName (String palabra);

    //OBTENER TEMAS DE UN CURSO POR ID
    public CursoTemaDTO temasByCurso (Long id_curso);

    //AGREGAR TEMAS A UN CURSO EXISTENTE
    public Curso addTemasInCurso (Long id_curso, List<Long> temaIds);
}
