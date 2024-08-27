package com.programacion.cursosit.service;

import com.programacion.cursosit.model.Curso;

import java.util.List;

public interface ICursoService {

    //TRAER TODOS LOS CURSOS
    public List<Curso> getCursos();

    //DAR DE ALTA UN CURSO
    public void saveCurso (Curso curso);

    //ELIMINAR UN CURSO
    public void deleteCurso (Long id_curso);

    //BUSCAR 1 SOLO CURSO
    public Curso findCurso (Long id_curso);

    //EDITAR UN CURSO
    public void editCurso(Curso curso);

    public List<Curso> findCursoForName (String palabra);
}
