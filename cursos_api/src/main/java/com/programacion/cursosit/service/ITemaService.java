package com.programacion.cursosit.service;

import com.programacion.cursosit.model.Curso;
import com.programacion.cursosit.model.Tema;

import java.util.List;

public interface ITemaService {

    //OBTENER TODOS LOS TEMAS
    public List<Tema> getTemas();

    //GUARDAR UN TEMA NUEVO
    public void saveTema (Tema tema);

    //ELIMINAR UN TEMA POR ID
    public void deleteTema (Long id_tema);

    //BUSCAR UN TEMA POR ID
    public Tema findTema (Long id_tema);

    //EDITAR UN TEMA EXISTENTE
    public void editTema (Tema tema);

    //OBTENER TEMAS POR LISTA DE IDS
    List<Tema> getTemasByIds(List<Long> ids);

    public List<Tema> findTemaByName(String palabra);
}
